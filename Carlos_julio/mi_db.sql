USE mi_db;
CREATE TABLE branch (
    branch_id   INT PRIMARY KEY,                -- sucursal_id
    name        VARCHAR(100) NOT NULL,          -- nombre
    city        VARCHAR(80) NOT NULL            -- ciudad
);

-- ===========================
-- 2. CUSTOMER (Cliente)
-- ===========================
CREATE TABLE customer (
    customer_id  INT PRIMARY KEY,               -- cliente_id
    first_name   VARCHAR(80) NOT NULL,          -- nombre
    last_name    VARCHAR(80) NOT NULL           -- apellido
);

-- ===========================
-- 3. EMPLOYEE (Empleado)
-- ===========================
CREATE TABLE employee (
    employee_id  INT PRIMARY KEY,               -- empleado_id
    first_name   VARCHAR(80) NOT NULL,          -- nombre
    last_name    VARCHAR(80) NOT NULL           -- apellido
);

-- ===========================
-- 4. MEMBERSHIP_PLAN (Plan de membresía)
-- ===========================
CREATE TABLE membership_plan (
    plan_id       INT PRIMARY KEY,              -- plan_id
    plan_name     VARCHAR(80) NOT NULL,         -- nombre_plan
    monthly_price DECIMAL(10,2) NOT NULL        -- precio_mensual
);

-- ===========================
-- 5. GROUP_CLASS (Clase grupal)
-- ===========================
CREATE TABLE group_class (
    class_id    INT PRIMARY KEY,                -- clase_id
    class_name  VARCHAR(80) NOT NULL,           -- nombre_clase
    level       VARCHAR(30)                     -- nivel
);

-- ===========================
-- 6. CONTRACT (Contrato)
-- ===========================
CREATE TABLE membership_contract (
    contract_id  INT PRIMARY KEY,               -- contrato_id
    customer_id  INT NOT NULL,                  -- cliente_id
    plan_id      INT NOT NULL,                  -- plan_id
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (plan_id) REFERENCES membership_plan(plan_id)
);

-- ===========================
-- 7. EQUIPMENT (Equipo)
-- ===========================
CREATE TABLE equipment (
    equipment_id  INT PRIMARY KEY,              -- equipo_id
    name          VARCHAR(80) NOT NULL,         -- nombre
    status        VARCHAR(20) NOT NULL          -- estado
);

-- ===========================
-- 8. ROOM (Sala del gimnasio)
-- ===========================
CREATE TABLE room (
    room_id      INT PRIMARY KEY,               -- sala_id
    name         VARCHAR(80) NOT NULL,          -- nombre
    capacity     INT NOT NULL                   -- capacidad
);

-- ===========================
-- 9. TRAINING_SESSION (Sesión de entrenamiento)
-- ===========================
CREATE TABLE training_session (
    session_id   INT PRIMARY KEY,               -- sesion_id
    employee_id  INT NOT NULL,                  -- entrenador_id
    date         DATE NOT NULL,                 -- fecha
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

-- ===========================
-- 10. PAYMENT (Pago)
-- ===========================
CREATE TABLE payment (
    payment_id    INT PRIMARY KEY,              -- pago_id
    contract_id   INT NOT NULL,                 -- contrato_id
    amount        DECIMAL(10,2) NOT NULL,       -- monto
    FOREIGN KEY (contract_id) REFERENCES membership_contract(contract_id)
);

-- ==========================================================
-- ======== PIVOTES (SOLO 2) – 3 CAMPOS CADA UNA ============
-- ==========================================================

-- ===========================
-- PIVOTE 1: CUSTOMER – CLASS
-- ===========================
CREATE TABLE customer_class (
    customer_id      INT NOT NULL,              -- cliente_id
    class_id         INT NOT NULL,              -- clase_id
    enrollment_date  DATE NOT NULL,             -- fecha_inscripcion
    PRIMARY KEY (customer_id, class_id),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (class_id) REFERENCES group_class(class_id)
);

-- ===========================
-- PIVOTE 2: CUSTOMER – TRAINER
-- ===========================
CREATE TABLE customer_trainer (
    customer_id   INT NOT NULL,                 -- cliente_id
    employee_id   INT NOT NULL,                 -- entrenador_id
    start_date    DATE NOT NULL,                -- fecha_inicio
    PRIMARY KEY (customer_id, employee_id, start_date),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

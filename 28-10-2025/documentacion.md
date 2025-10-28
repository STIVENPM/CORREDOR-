MONGO DB

1. Descargar la imagen de MongoDB y verificar la versión de Docker
Antes de comenzar, es importante verificar que Docker esté instalado y funcionando correctamente.
Para comprobarlo, se puede usar el comando docker --version, el cual mostrará la versión instalada.
Luego, se descarga la imagen de MongoDB desde el repositorio oficial de Docker con el comando docker pull mongo.
![alt text](image-1.png)

2. Una vez descargada la imagen, procedemos a crear un contenedor basado en ella.
Para ello, utilizamos el siguiente comando que ejecuta MongoDB en segundo plano y define las credenciales de acceso:
![alt text](image-2.png)
Explicación de los parámetros:
-d: Ejecuta el contenedor en segundo plano.
--name: Asigna un nombre al contenedor (por ejemplo, mongo-container).
-p 27017:27017: Expone el puerto 27017, que es el puerto por defecto de MongoDB.
-e: Define variables de entorno, como el usuario y la contraseña del administrador.
mongo: Es la imagen base que descargamos.


3. Verificar que el contenedor esté en ejecución
Podemos comprobar si el contenedor se encuentra activo y ejecutándose con el comando docker ps.
Este comando mostrará una lista de contenedores activos junto con su estado.
Si el contenedor no aparece, se puede revisar con docker ps -a y, si está detenido, iniciarlo con docker start mongo-container.
![alt text](image-3.png)

4. Crear el usuario y contraseña dentro de MongoDB
Con el contenedor activo, ingresamos al entorno interactivo de MongoDB utilizando
 docker exec -it mongo-container mongosh -u admin -p 12345.
Dentro del entorno, se puede crear una base de datos y un usuario con privilegios específicos para dicha base.
Esto permite administrar el acceso y controlar los permisos de los usuarios que trabajen con la información.
![alt text](image-4.png)

5. Conexión de MongoDB con una aplicación
Una vez creado el usuario, es posible conectar el contenedor con una aplicación externa, ya sea una herramienta de gestión o una aplicación en desarrollo.
La conexión se realiza utilizando la cadena de conexión estándar:
![alt text](image-5.png)










UBUNTU DOCKER 

Paso 1 – Crear el contenedor de Ubuntu
![alt text](image-12.png)
En tu PowerShell de Windows, ejecuta:
![alt text](image-13.png)
Para verificar que se creó correctamente:

Entrar al Ubuntu
![alt text](image-14.png)
Verás el prompt del contenedor:
root@<id_del_contenedor>:/#

Paso 3 – Instalar Docker dentro del Ubuntu (Docker-in-Docker)

Dentro del contenedor, instala los paquetes necesarios y configura el repositorio oficial de Docker:
![alt text](image-15.png)

![alt text](image-16.png)

![alt text](image-17.png)

![alt text](image-18.png)

Paso 4 – Crear red interna y lanzar los 4 motores de base de datos

Creamos una red interna para que los contenedores puedan comunicarse entre sí:
![alt text](image-19.png)

Ahora levantamos cada base de datos con sus parámetros de acceso:
MySQL
![alt text](image-20.png)
PostgreSQL
![alt text](image-21.png)

MongoDB
![alt text](image-23.png)
SQL Server
![alt text](image-24.png)

Verifica que todos los contenedores estén corriendo:
![alt text](image-25.png)

Paso 5 – Comprobación de puertos desde Windows 
Puedes verificar si los puertos están abiertos con
![alt text](image-26.png)







# Imagen base Ubuntu
FROM ubuntu:22.04

# Evitar preguntas interactivas
ENV DEBIAN_FRONTEND=noninteractive

# Actualizamos paquetes e instalamos herramientas necesarias
RUN apt-get update && apt-get install -y \
    wget curl apt-transport-https ca-certificates gnupg lsb-release \
    software-properties-common nano sudo

# Instalamos MySQL Client, PostgreSQL Client, MongoDB Client y SQL Server tools
RUN apt-get install -y mysql-client postgresql-client

# Instalamos MongoDB Shell (mongosh)
RUN wget -qO - https://pgp.mongodb.com/server-6.0.asc | gpg --dearmor -o /usr/share/keyrings/mongodb-server-6.0.gpg && \
    echo "deb [signed-by=/usr/share/keyrings/mongodb-server-6.0.gpg] https://repo.mongodb.org/apt/ubuntu jammy/mongodb-org/6.0 multiverse" | tee /etc/apt/sources.list.d/mongodb-org-6.0.list && \
    apt-get update && \
    apt-get install -y mongodb-mongosh

# Instalamos herramientas de SQL Server (sqlcmd y bcp)
RUN curl -s https://packages.microsoft.com/keys/microsoft.asc | apt-key add - && \
    curl https://packages.microsoft.com/config/ubuntu/22.04/prod.list > /etc/apt/sources.list.d/mssql-release.list && \
    apt-get update && ACCEPT_EULA=Y apt-get install -y mssql-tools18 unixodbc-dev && \
    echo 'export PATH="$PATH:/opt/mssql-tools18/bin"' >> ~/.bashrc

# Configuramos bash como shell por defecto
CMD ["/bin/bash"]
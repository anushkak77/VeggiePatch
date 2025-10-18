# FROM openjdk:17-oracle
#
# WORKDIR /app
#
# # Install netcat so wait-for script can use it
# RUN apt-get update && apt-get install -y netcat-openbsd && rm -rf /var/lib/apt/lists/*
#
#
# # Copy JAR file
# COPY target/myshop-0.0.1-SNAPSHOT.jar myapp.jar
#
# # Copy wait-for script
# COPY wait-for-mysql.sh wait-for-mysql.sh
# RUN chmod +x wait-for-mysql.sh
#
# # Run wait-for script which then launches the app
# CMD ["./wait-for-mysql.sh"]



FROM openjdk:17-alpine

WORKDIR /app

# Install netcat for Alpine
RUN apk add --no-cache netcat-openbsd

COPY target/myshop-0.0.1-SNAPSHOT.jar myapp.jar
COPY wait-for-mysql.sh wait-for-mysql.sh
RUN chmod +x wait-for-mysql.sh

CMD ["./wait-for-mysql.sh"]





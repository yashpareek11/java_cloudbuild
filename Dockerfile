FROM openjdk:17

EXPOSE 8080

WORKDIR /app

ADD /target/javaapp.jar /app/javaapp.jar

ENTRYPOINT [ "java", "-jar", "/app/javaapp.jar" ]





FROM openjdk:17

WORKDIR /app

ADD /target/javaapp.jar /app/javaapp.jar

ENTRYPOINT [ "java", "-jar", "/app/javaapp.jar" ]





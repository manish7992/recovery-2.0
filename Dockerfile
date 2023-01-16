FROM openjdk:8
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY target/*.jar app.jar
EXPOSE 8081
CMD ["java", "-jar", "-Dspring.profiles.active=dev", "recoveryplus.jar"]
FROM maven:3.8.7 as build
COPY : .
RUN mvn -B clean package -DskipTests
FROM openjdk:22

COPY --from=build ./target/*.jar managementSystem.jar

ENTRYPOINT ["java","-jar","managementSystem.jar"]
EXPOSE PORT = 8082


FROM openjdk:23-jdk
ADD target/expense-tracker.jar expense-tracker.jar
ENTRYPOINT ["java", "-jar", "/expense-tracker.jar"]
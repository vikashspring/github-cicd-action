FROM openjdk:17
EXPOSE 8080
ADD target/vikash-github-cicd.jar vikash-github-cicd.jar
ENTRYPOINT ["java","-jar","/vikash-github-cicd.jar"]
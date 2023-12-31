#  使用java的jdk
FROM openjdk:8-jre-slim
ADD target/movie-core.jar /home/movie-core.jar

WORKDIR /home
#CMD ["java", "-jar", "/home/park-admin.jar"]
# 暴露应用程序使用的端口
EXPOSE 8080

ENTRYPOINT ["java","-Duser.timezone=Asia/Shanghai","-jar","/home/movie-core.jar"]
# 版本信息
#java：latest 为centos官方java运行环境镜像，600多M ,可以提前pull到主机本地
FROM java:8
#实际上可以配置成变量
ARG JAR_FILE
COPY target /usr/local/jar/
RUN cp /usr/local/jar/demo-1.0-SNAPSHOT.jar /usr/local/jar/app.jar
#RUN mkdir -p /usr/local/jar/config
#RUN cp /usr/local/jar/classes/logback.xml /usr/local/jar/config/logback.xml
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone
#添加进入docker容器后的目录
WORKDIR /usr/local/jar/
#启动容器执行命令
ENV JAVA_OPTS="\
-server \
-Xmx4g \
-Xms1g \
-XX:-OmitStackTraceInFastThrow"
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /usr/local/jar/app.jar --spring.profiles.active=$ENV_PROFILE
集成

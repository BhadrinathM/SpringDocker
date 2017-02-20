FROM base/javaubuntu

MAINTAINER PraveenKumar

ENV JAVA_HOME /opt/java
ENV PATH $JAVA_HOME/bin:$PATH

ADD target/*.jar /app/
CMD java -version
CMD java -jar /app/*.jar

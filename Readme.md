# Java ServiceLoader demo

## run 
```
cd api && mvn clean install &&\
cd ../lib1 && mvn clean install &&\
cd ../lib2 && mvn clean install &&\
cd ../app && mvn clean package && mvn exec:java -Dexec.mainClass=spi1.app.App
cd ../

```
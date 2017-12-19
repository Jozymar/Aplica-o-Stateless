mvn clean package
docker build -t jozimar/core .
docker build -t jozimar/web .
docker build -t jozimar/jsf .
docker run -p 8080:8080 -d --name core jozimar/core
docker run -p 8081:8080 -d --name web jozimar/web
docker run -p 8082:8080 -d --name jsf jozimar/jsf






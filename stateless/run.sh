docker build -t jozimar/core ./core
docker run -p 8080:8080 -p 3700:3700 -d --name core jozimar/core
docker build -t jozimar/web ./web
docker run -p 8081:8080 -d --name web --link core:host-core jozimar/web
docker build -t jozimar/jsf ./jsf
docker run -p 8082:8080 -d --name jsf --link core:host-core jozimar/jsf






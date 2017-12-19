docker stop core
docker kill core
docker rm core
docker stop web
docker kill web
docker rm web
docker stop jsf
docker kill jsf
docker rm jsf
docker rmi -f jozimar/core
docker rmi -f jozimar/web
docker rmi -f jozimar/jsf
mvn clean

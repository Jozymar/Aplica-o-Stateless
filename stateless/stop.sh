docker stop core
docker rm core
docker stop web
docker rm web
docker stop jsf
docker rm jsf
docker rmi -f jozimar/core
docker rmi -f jozimar/web
docker rmi -f jozimar/jsf

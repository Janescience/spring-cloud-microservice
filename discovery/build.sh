mvn clean package
docker build -t discovery-service .
docker rmi $(docker images -qa -f 'dangling=true')
docker rm -f discovery-service
docker run -d --name discovery-service -p 9001:9001 discovery-service
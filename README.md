#How to build
1. docker build -t <image_name> .
1. docker run -p <port>:<port> <image_name>
1. docker pull mongo:latest
or docker-compose --env-file "<path-to-.env-file>" build

#How to start
1. docker-compose --env-file "<path-to-.env-file>" up -d

http://localhost:8080/greetings/hello
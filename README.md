# Photo Album App Microservices

## 1 Overall Architecture

- RESTful Microservices (User Services + Album Services)
- Eureka Discovery Service
- Zuul API Gateway (with Load Balancer and Spring Security)
- Spring Cloud Config Server

![](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/overall/20-130 user and album services HTTP communication.png)

## 2 API gateway

![](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/API Gateway and security and services - from 12-84.png)

## 3 User Services

User services APIs:

1) create

2) get

3) login (authentication): JSON Web *Token* (*JWT*)

authorization (register)

## 4 Config Server

#### 1) config file hierarchy![](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/config/13-90 config server - global and local properties.png)

#### 2) Static Config

![13-100 enable the bus-refresh url](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/config/13-100 enable the bus-refresh url.png)

#### 3) Dynamic Config

Spring Cloud Bus

Rabbit MQ

![14-99 cloud bus - dynamic configuration updates frame - synchronous](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/config/14-99 cloud bus - dynamic configuration updates frame - synchronous.png)

## 5 Data Encryption

Java Cryptography Extension

## 6 Tracing and Logging

1) Distributed Tracing of HTTP requests: Spring Cloud Sleuth and Zipkin

2) Logging: aggregate log files in one place(Centralized logging)  with ELK stack (Elasticsearch, Logstash, Kibana)

## 7 Deployment

Docker + AWS EC2 instances

#### 1) Architecture

![](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/deploy/25-195 VPC - virtual private cloud.png)

#### 2) Plan and Sequence

![](/home/xuzishuo1996/eClass/Microservices/microservices-eClass-docs/整个APP框架/要用的/deploy/deployment plan and sequence.png)
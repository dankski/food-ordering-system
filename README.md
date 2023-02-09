# UDemy: Microservices: Clean Architecture, DDD, SAGA, Outbox & Kafka

This repository contains my code for the exercises.

## Starting Environment

1. Zookeeper

docker-compose -f common.yml -f zookeeper.yml up

2. Start Kafka Cluster

docker-compose -f common.yml -f kafka_cluster.yml up

3. Init Kafka Cluster

docker-compose -f common.yml -f init_kafka.yml up

4. Add Cluster

http://localhost:9000

Cluster Name: food-ordering-system-cluster

Cluster Zookeeper Hosts: zookeeper:2181

And save.

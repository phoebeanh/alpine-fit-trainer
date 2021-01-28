## CS622 - Spring 1 - Phoebe Ngo

### Introduction
This project aims to create a platform for aspiring mountaineers to keep track of and plan their fitness training schedule. The guidelines and objectives of the fitness training program will be loosely based on the information in Fit to Climb: A 16-Week Mount Rainier Fitness Training Program, by John Colver. To use the platform, a user would input when their climb is scheduled; to fully utilize the platform’s features, the user must not input a date any sooner than four months from the current date. Once that condition has been cleared, the platform will provide a calendar populated with a daily training objective. There are different types of workouts that will be used over the course of the program: Rainier Dozen, Hikes, Stair Interval Training, Strength Circuit Training, and Cross Training. These workouts can vary in lengths of time and intensity. The focus of the project is to create a visual dashboard that shows what training objective the user must meet daily, what type of training it is, and its duration and intensity, if applicable, to meet their fitness goals before their summit attempt. This platform will be called Alpine Fit Trainer.

### Developer's Corner
- To set up Azure server and database:
  - Make sure that the below variables are in your system's environment variables:
  ```yaml
    AZ_RESOURCE_GROUP=alpine-fit-trainer-rg 
    AZ_LOCATION=southcentralus
    AZ_SQL_SERVER_USERNAME=[YOUR_USERNAME_HERE]
    AZ_SQL_SERVER_PASSWORD=[YOUR_PASSWORD_HERE]
    AZ_LOCAL_IP_ADDRESS= [INSERT_YOUR_IP_ADDRESS_HERE] --> [whatismyip.akamai.com]
    AZ_DATABASE_NAME=alpine-fit-trainer-db
    AZ_SERVER_NAME=alpine-fit-trainer
  ```
  - Run `create-server.sh`
- To set up environment variables:
    - Create `.env` file in home directory
    - Define following variables in  the `.env` file:
    ```yaml
    AZ_RESOURCE_GROUP=alpine-fit-trainer-rg 
    AZ_LOCATION=southcentralus
    AZ_SQL_SERVER_USERNAME=[YOUR_USERNAME_HERE]
    AZ_SQL_SERVER_PASSWORD=[YOUR_PASSWORD_HERE]
    AZ_LOCAL_IP_ADDRESS= [INSERT_YOUR_IP_ADDRESS_HERE] --> [whatismyip.akamai.com]
    AZ_DATABASE_NAME=alpine-fit-trainer-db
    AZ_SERVER_NAME=alpine-fit-trainer
    ```
    - Export the variables to my environment:
    `export $(cat .env | xargs)`
  
    - Run command: `mvn spring-boot:run`

Prerequisites:

a) You should have Docker and Docker Compose installed on your system.

b) The project should be set up with a Dockerfile and a docker-compose.yml file.
Steps:
1)  Checkout the branch:
2) Open your terminal.
3) Navigate to the project directory.
4) checkout to branch of the desired branch.
5) Start the PostgreSQL container:
   Run the command sudo docker-compose up -d to start the PostgreSQL container in detached mode. This is necessary for the local build to succeed.
6)  Build the project:
7)   If any errors occur during the build process, go to settings>>Build,Exection,Deployment>>
     compiler>>Annottation Proccessors ,check if enabled.If not,select>>cropwise>>Enable>>Obtain Proccessors from classpath>>Apply>>Ok
8)   Build the project using Maven or Gradle.
9) Import Postman collection (optional):
  
 a)Import the attached Postman collection into the Postman application. This is optional but      can be helpful for testing the API endpoints.
   
10) Containerize the app:

a) Run sudo docker-compose up -d again to build and start the application container.
11) Verify PostgreSQL and Spring Boot containers:
    
 a) Check if the PostgreSQL and Spring Boot containers are running successfully.
12) Access the application:
    
 a)The application should now be accessible at http://localhost:<port>, where <port> is the port specified in the docker-compose.yml file.
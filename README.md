Create a crud operations using spring boot, mysql and  Data JPA ::— 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

First we will create different package in our project like entity, controller, service and repository layers. After that different package will be created different classes for each layer.

1. Requirements:
    1. Maven 
    2. Any IDE (Eclipse, IntellijIDEA, SpringToolSuite etc)
    3. JDK above 1.8
    4. Postman (for testing)

2. Project setup: 
   * Create a project boilerplate and add dependencies from spring initialiser.
   *  Select maven project and language is java also give a name to the project
   *  Adding dependencies like Spring web, mysql driver, data jpa and lombok
   *  After click on generate then project zip file will get generated , now unzip the project

3. Create the Mysql database on Mysql Workbench: 
   * Open mysql workbench and create new schema i.e 
      create database (database name)
      use (database name)

4. Configure the database into our project:
   * Open the unzipped file in any IDE
   * Adding the database configuration details to the application.properties file

5. Creating Entity Class:
   * Entities are persistence objects where an entity represents a table in a relational database and each entity corresponds to a row in that table.

6. Creating a JPA repository:
   * JPA stands for Java Persistence API. 
   * It should written in interface formate.
   * It is a specification which specifies how to access , manage and persists information or data between java objects and relational database.

7. Creating Service Class:
   * It is a layer in an application that facilitates communication between the controller and the entity layer also business logic is stored .    
   * Here we are using @Autowire annotation means it is used to inject the dependency and this annotation will directly call the necessary getter or setter and other method if needed.   
 
8. Creating Controller Class:
   * The controller method starts the web request by interacting with the service layer to complete the work that needs to be done.
   * Here we call the rest api and the necessary functions.

9. Testing the api in Postman:
   * After that testing the api through postman (Get, Put, Delete and Post) .

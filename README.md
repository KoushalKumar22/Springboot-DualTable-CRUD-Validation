NOTE : This program uses PostgreSQl database Dependency.

This is a spring boot CRUD application that handles two tables in same database and uses springboot bean validation in its, also have updating , deleting and saving that uses postgreSQL database

Some changes you have to do in the program are to run on your system are :-

<1>: go to src/main/resources/application.properties and change your databse name ( spring.datasource.url=jdbc:postgresql://localhost:5432/( Your database name )  )

<2>: in the same file change your password to your mariadb password ( spring.datasource.password= ( your password )  )

THE PROGRAM IS TESTED AND VERIFIED ON POSTMAN AND ON ANY BROWSER. DOCUMENTATION FOR THE PROGRAM IS CAN BE SEEN OR TESTED ON SWAGGER.

(.jar) is also included that can be posted on AWS.

so change the above following according to your ec2 instance's for PostgreSQL before deploying.

About 100000 REST spring test Through Jmeter.

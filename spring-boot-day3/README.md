# SpringBoot Day3
* First Lets understand the client server

*  client <--> Server <--> Database

* Here the client request to Server and server get data from database and return the response to client.

https://www.oreilly.com/library/view/access-database-design/1565926269/ch07s08.html

* Server Layer

       Client --> (Controller+Service+Repository) --> Database

https://images.app.goo.gl/BqQjiu2TWGNmq6Yp7

* @Controller 
    
    Manage  api calls request from client and response to client

* @Service 

     Business logic 

     Example : 

     addition of two numbers 2+2

* @Repository or dao (Data Access Object)

   All CURD ops from database

   * Storing data to database
   * Retrieving data from database
   * Update date in database
   
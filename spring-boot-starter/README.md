# Spring Boot Day 1 from telusko
## Spring Boot 
#### Spring uses principle of Inversion of control and implement it using dependency injection.


* Spring boot is written on top of spring framework.

* Spring uses the concept of DI and IOc principle

* Where creation and manage of objects taken care by Spring.

* In Spring --> objects are called as beans.

* Objects are stored in an IOC container.

## Ways to communicate with our Ioc container:

* @SpringBootApplication annotation helps to do intialization stuff

* SpringApplication.run() --> helps to start Ioc container,start tomcat server

* ApplicationContext.getBean() --> helps to get respective object from the Ioc container.

* @Component annotation --> helps to create object/bean in Ioc container.
* @Autowire annotation --> helps to wire the object between two classes , Here CPU object is wired using @Autowire annotation in Laptop class.
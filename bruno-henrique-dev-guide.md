# bruno-henrique-spring-boot-study

## Introduction

### Goals
* Generate the same framework structure (or greater than) Laravel's framework.
* Advanced web framework to handle advanced web necessities, which include:
    * RESTful API
    * Web content server
    * Full integration with databases
    * High and trustful security layers including Authentication and Authorization
    * Database Migrations
    * Easy theme handling with native HTML, CSS and Javascript (completely separated from backend)
    * Background services and jobs
    * Fully support for interactive dynamic web pages with backend processing
    * Fully support for CRUD web apps
    * Easy to connect with front and backend frameworks and tools
    * Automatic reload, no need to recompile the application
    * Implement a language support for the application
    * Advanced Authorization where clients can choose permissions for users during runtime
    * Much more...
    
### Understanding this documentation
* It intends to be a manual and tutorial at the same time.
* While Spring Framework is modular, this material intends to show you things while they are happening
according to your needs, it means that, if you never reach cache, for example, you don't need to enable that
on your application. But when that part is necessary for your solution, then, it will show you a complete how
to setup and use instructions also a deep approach to understand all resources that module can offers you so
you can easily master and implement that solution according to your real needs.
* Besides that we also want you to find it on the core of Spring Docs. All the content will show you the links
where we could find that information on original and official Spring documentation. Also, if we find something
really cool and interesting on Stackoverflow or similar on the internet we'll give this hint to you too.
* So, take a seat, a nice fresh cup of coffee and let's start working.
* Almost forgot: this documentation means to be productivity friendly, so you can use this as a fast research
while you are developing your solutions so it will take you to the glory as fast as possible!

### Considerations
Yes, this is a copy of Laravel's documentation because I think that doc is one of the best organized documentation
for developers I have ever found so far. Of course this is my own opinion, but I believe I can help you with
Spring with a more intuitive way and I hope this become a nice way to start studying and working with Spring.

You realized I am really in love with Laravel. It happens because from them I could learn a lot, but, unfortunately
my needs are bigger and further than Laravel can give to me because PHP's limitations.

But it doesn't mean I don't like Spring. Actually I am already in love with Spring and all the possibilities I 
can reach with this tool. I just don't like its documentation. I think it is too confusing. That's why I am 
creating my own Spring documentation based on the oficial one.

Once you learn from here you'll be able to find anything on Spring's official documentation because I'll 
show exactly where to find there and in the future you can go there by yourself.
 
So, with this doc my intention is to reduce the time of learning Spring and get independent as fast as possible.

I hope I can reach that and help you get in love with Spring the same way hundreds of developers are.

I've already said too much, let's stop this bull***t and hands on Spring!


## Getting Started

### Requirements
* Java 8
* IntelliJ Idea IDE
* MySQL
* Chrome & Firefox & IE & Edge Browsers
* Postman (Chrome Web App)
* Cmder
* GIT
* Maven

#### Dependencies
* Thymeleaf
* Flyway

### Installation
How to install the basic for a rich development framework:
* Create a Maven application using IntelliJ Idea
* Importing dependencies using Maven's pom.xml

### Configuration
How to setup a nice configuration file to use internal or external from your application:
* Internal Configuration File (application.properties)
* External Configuration File (application.properties)
* IP/Address
* Application Port
* Database connection

### Directory Structure
A suitable directory structure to have a nice, comfortable and well organized development.
Less thinking, more acting!

First, you have seen Maven has its own directory structure:

* [ProjectName] \
    * src \
        * main \
            * java \ <- your codes come here!
            * resources \
                * db \
                    * migration \ <- your migrations come here
                * static \ <- your public directory
                * templates \ <- create your Thymeleaf templeates here
                * application.properties <- your internal configuration file must be this one
        * test \
            * java \ <- your codes come here!
    * target \
    * file.yml
    * ProjectName.iml
    * pom.xml

There are two ways to place and store your personal pieces of code:

1 - Responsibility
2 - Context

Instead of explaining I'll show you the two of them:

#### Responsibility (RECOMMENDED)
* br.com.yourcompany.appname \
    * models \
    * domain \
    * repository \
    * resources \
    * services \
    * Application.java

#### Context
* br.com.yourcompany.appname \
    * models \
    * users \
        * domains \
        * repository
        * resources \
        * services \
    * products
        * domains \
        * repository
        * resources \
        * services \
    * Application.java
    
#### Directories specs

##### br.com.yourcompany.appname
* Place all your codes inside your group
* Your main classes comes here (AppNameApplication.java)

##### br.com.yourcompany.appname.panel
* Place codes related to the administration or panel. 
* This is a restricted area and it's necessary to inform username and password
to access this place on your application.
* It places frontend rules.

##### br.com.yourcompany.appname.website
* Place codes related to the public area of your system.
* This area don't usually asks for any authentication.
* It places frontend rules.

##### br.com.yourcompany.appname.api
* Place codes related to backend features like database, authentication, jobs,
notification
* It usually requires a security layer before sending information trough API endpoints

##### br.com.yourcompany.appname.jobs
* Places codes related to email and notifications (SMS, email, etc.)
* There is some frontend implementation
* Notification rules and jobs belonging to the application


##### models
Place your entity classes.
Entity classes are models which will be persisted.

##### domains
Place your non-entity classes here.
Non-entity classes are models which won't be persisted.

##### repository
Place your repository interfaces here.

##### controllers || resources
Place your controller classes here

##### exceptions
Place your Exception classes here

        
### Command Line Interface (CLI)
Commands to make your life easier while working. Be more productive!

### Updating
How to update your framework without losing your personal implementations

---

## Core Concepts

### Beans
### Dependency Injection

---

## Infrastructure

### Application Server
* Embeded Tomcat as Application Server

### Compiling
* as JAR
* as WAR
* as ZIP
* with or without dependencies

### Configuration
* More configuration syntax

---

## Database

### Migration
* Create Migrations using FlyWay

### Repositories Queries
* Select
* Update
* Delete
* Insert
* Joins
* Unions
* Where
* Ordering, Grouping, Limit, Offset

---

## Instructions
You can read this material as a GUIDE or PRO like:

### GUIDED MODE
You are not confident yet or you want a step-by-step guide to follow and empower your productivity
going on easy and consistent way to develop and implement naturally your code.

* Project
    * Define your requirements (text)
    * Define your database structure and frontend project (diagrams)
    * Try to understand the project details as much as possible and ask form confirmation from your client
    before starting implementation. After having the project approved start coding.
* Implementation
    * Models
    * Migrations
    * Repositories
    * Framework
        * Services and Exceptions
        * Tests
        * Documentation
    * User Interface (Views and APIs)
        * Services and Exceptions
        * Tests
        * Documentation
    
!!! Don't forget to commit your code using GIT and your favorite repository system. !!!

#### Best Practices
* Keep your code clean and organized
* Follow Java's coding best practice
* Write your entire code in English
* Only routes can be in your native language
* Always document your code. Keep this as part of your job. Consider the documentation time while
projecting and predicting your job.
* Always commit your code to an external repository. You never know when your computer could stop working!


### PRO MODE
Assuming that you already know this material and have a nice step-by-step dev in mind, just 
search the term you are looking for and go straight to the point you want.

---

## Backend

### Controller
Source: http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc-controller

The @Controller annotation acts as a stereotype for the annotated class, indicating its role. 
The dispatcher scans such annotated classes for mapped methods and detects @RequestMapping 
annotations (see Routes).

* Define a Web controller

@Controller
```java
@Controller
public class HelloWorldController {
    // implementation
}
```

* Define a REST controller

@RestController


* Controller Middleware
* Call a service
* Where to implement business rules and application logic?


### Routes
@RequestMapping

These are annotations to place on controller classes.
You use the @RequestMapping annotation to map URLs such as /appointments 
onto an entire class or a particular handler method. Typically the class-level 
annotation maps a specific request path (or path pattern) onto a form controller, 
with additional method-level annotations narrowing the primary mapping for a specific 
HTTP method request method ("GET", "POST", etc.) or an HTTP request parameter condition.

#### Basic route
@RequestMapping("/route-name")

##### Mapping classes
Mapping classes is like creating route groups.
```java
/**
* Routing classes
* This endpoint will be accessed like: http://localhost:8080/appointments
*/

@RequestMapping("/appointments")
public class AppointmentsController {
    // implementation
}
```

##### Mapping methods
```java
/**
* Routing methods
* This endpoint will be accessed like: http://localhost:8080/appointments/new
*/

public class AppointmentsController {
    
    @RequestMapping("/appointments/new")
        public AppointmentForm getNewForm() {
            return new AppointmentForm();
        }
}
```

##### Mapping classes and methods
```java
/**
* Routing methods
* This endpoint will be accessed like: http://localhost:8080/appointments/new
*/

@RequestMapping("/appointments")
public class AppointmentsController {
    
    @RequestMapping("/new")
        public AppointmentForm getNewForm() {
            return new AppointmentForm();
        }
}
```

#### Route Parameter
* path
* method

##### Simple Path
@RequestMapping(path = "/user")

##### Path with variable
@RequestMapping(path = "/user/{id}")

##### Path with optional variable
@RequestMapping(path = "/user/{id}")

##### Method
@RequestMapping(method = RequestMethod.GET)

##### Sub-domain Routing
//

##### Example
```java
@Controller
@RequestMapping("/appointments")
public class AppointmentsController {

    private final AppointmentBook appointmentBook;

    @Autowired
    public AppointmentsController(AppointmentBook appointmentBook) {
        this.appointmentBook = appointmentBook;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Appointment> get() {
        return appointmentBook.getAppointmentsForToday();
    }

    @RequestMapping(path = "/{day}", method = RequestMethod.GET)
    public Map<String, Appointment> getForDay(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date day, Model model) {
        return appointmentBook.getAppointmentsForDay(day);
    }

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public AppointmentForm getNewForm() {
        return new AppointmentForm();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@Valid AppointmentForm appointment, BindingResult result) {
        if (result.hasErrors()) {
            return "appointments/new";
        }
        appointmentBook.addAppointment(appointment);
        return "redirect:/appointments";
    }
}
```

### Model
Also called domain



### Middleware
* Define a Middleware
* Middleware groups
* Middleware parameters
* Terminable Middleware

### Services
* Where to place your business rules, logic and shared methods
* How to retrieve and use services correctly

### Repository
* Special service path for database manipulation

### Cache
* Configuration
* Obtaining a cache instance
* Retrieving items from the cache
* Storing items in the cache
* Removing items from the cache

### Logging
* Configuration
* Exceptions
* Personalizing log messages

### Session
#### Session Configuration
* file
* cookie
* database
* memcached/redis
#### Using the session
* Retrieving data
* Storing data
* Flash data
* Deleting data

### Request
* Retrieving the request path
* Retrieving the request url
* Retrieving the request method
* Retrieving input data
* Retrieving json values
* Retrieving old input
* Retrieving cookies from Request
* Attaching cookies to Responses
* Retrieving uploaded files
* Validating successful uploads
* Storing file to a path
* Storing file on a storage

### Response
* Creating responses
* Responses with headers
* Responses with cookies
* Json Response
* Redirect
* File Response

### File Storage
* Configuration
* Public Disk
* Retrieving files
* File URLs
* Storing files
* Deleting files

### Mail
* Configuration
* Configuring the view
* Attachments
* Sending emails
* Queueing emails

### WebSocket
* Configuration
* Implementation

---

## Security

### Authentication
* Configuration
* Set and apply
* Retrieving the authenticated user
* Protecting routes under authentication
* Check if the current user is authenticated

### Authorization
How to implement an application to support dynamic permission

### CSRF Protection
Protecting application qhen retrieving input data and files from a request

### Encrypting and Hashing (for passwords)
How to correctly persist secure hidden passwords

---

## Frontend

### Views
* Create view
* Passing data to views

### Themes
* Generating templates from HTML files

### Assets
* Placing CSS, Javascript and Images
* Retrieving assets

### Forms
* Retrieving input data
* Retrieving files
* Validating forms
* Flashing responses
* CSRF Protection

### Internationalization
How to implement an application to support multiple languages

---

## References

### Spring
* Spring framework documentation: http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/


### Thymeleaf
* Video tutorial: https://www.youtube.com/watch?v=GcqF_Kt1QBQ&list=PL-KSt1w_h7Kn15WNZ0NyI02mVLkQTeDyc&index=2
* Using Thymeleaf: http://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html
* Thymeleaf Spring: http://www.thymeleaf.org/doc/tutorials/2.1/thymeleafspring.html


# springboot-mongodb-thymeleaf

A mini-project to explore on how to use Spring Boot with Server-Side template Engine, Thymeleaf and Mongo DB as a database engine.

#### Technologies:
* Spring Boot -> to create stand-alone, production-grade Spring based Applications that you can "just run".
* Thymeleaf -> Server-side Java template engine
* MongoDB Atlas -> Database
* Postman -> Testing Controllers


#### MongoDB Setup
1. Create database in MongoDB -> **rest_tutorial**
2. Collection -> **contacts**

```
{
  "name": ,
  "number": ,
  "group": , // FRIENDS, BUSINESS and FAMILY
  "status":  // ACTIVE or BLOCKED
}
```

#### Public API
base URL: https://spring-contacts.herokuapp.com

``GET`` 
- Contact List - ```/api/contacts/list```
- Specific Contact - ```/api/contacts/{id}```
- Filter by Status - ``/api/contacts/status/{status}`` (ACTIVE or BLOCKED)
- Filter by Group - ``/api/contacts/group/{group}`` (FRIENDS, FAMILY, BUSINESS, UNKNOWN)

``POST``
- Create new Contact
```
{
    name: "your name",
    number: "0912345678",
}
```

*OR* specify GROUP and STATUS

Contact Group Options - ``{"FRIENDS", "BUSINESS", "FAMILY", "UNKNOWN}``

Contact Status Options - ``{"ACTIVE", "BLOCKED"}``

```
{
    name: "your name",
    number: "0912345678",
    contactGroup: "FRIENDS",
    contactStatus: "ACTIVE"
}
```


``PUT`` Update Contact Info ``/api/contacts/edit/{id}``

```
{
    name: "your new name",
    number: "updated 0912345678",
    contactGroup: "FAMILY",
    contactStatus: "BLOCKED"
}
```

``DELETE`` - ``/api/contacts/{id}``




Import the project and run. :tada: 
Cheers! :beers:


Coded with :heart: by **Marco Mat**

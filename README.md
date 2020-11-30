# backend-challenge-demography
---
###### This project is  a backend challenge from Demography company

## What is about?
---
I was asked to develop a REST Microservice for displaying languages used by the 100 trending public repos on GitHub. For every language , I should display:
* The list of repositories using that language
* The number of repositories using it
## Maven Dependencies project
---
* Spring Boot
* OpenFeign
* Lombok 
## Folders
```
+---main
|   +---java
|   |   \---org
|   |       \---gemography
|   |           \---backendchallenge
|   |               |   BackendChallengeApplication.java
|   |               |
|   |               +---configs
|   |               |       DateGenerator.java
|   |               |       ObjectMapperConfig.java
|   |               |       ServiceHelperConfig.java
|   |               |
|   |               +---models
|   |               |       GithubRepository.java
|   |               |       Language.java
|   |               |
|   |               \---services
|   |                       GithubService.java
|   |                       ServiceHelper.java
|   |
|   \---resources
|       |   application.properties
|       |
|       +---static
|       \---templates
\---test
    \---java
        \---org
            \---gemography
                \---backendchallenge
                        BackendChallengeApplicationTests.java

```
## Working with the project
* Clone the project
* install dependencies
* run the spring boot application
* call the endpoint http://localhost:8283/languages?date={date}
## Clarifying
You have to give the endpoint a date , and then, the endpoint will give you the 30 repositories from that date displaying the details, fro every language , the reporisoties that are using it and also the number of them.
For example, you can use today's date
http://localhost:8283/languages?date=2020-11-30




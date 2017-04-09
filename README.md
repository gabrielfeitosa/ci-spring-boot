[![Build Status](https://travis-ci.org/gabrielfeitosa/ci-spring-boot.svg?branch=master)](https://travis-ci.org/gabrielfeitosa/ci-spring-boot)
# ci-spring-boot

Example of Continuous Integration using Travis and Spring Boot.

This example is a simulation of a Task Manager.

## Technologies

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Maven](https://maven.apache.org/)
* [Spring Boot](http://projects.spring.io/spring-boot/)
* [AngularJS](https://angularjs.org/)
* [Travis CI](https://travis-ci.org/)
* [Heroku](https://www.heroku.com/)
* [Docker](http://docker.com/)

## Configuration

> You need to have installed Java and Maven

##### Spring Boot

  For the development profile you do not need to configure anything. In this profile you will use a h2 database.
  
  If you want to use a production profile, you need to change the database configurations into __application-prod.properties__. In my example I use a environment variable __${DATABASE_URL}__ to configure the database url. 

##### Heroku

Create an account and then create a new app.

Into your new app add a Add-ons Postgresql database. By default, the environment variable DATABASE_URL will be created. 

  
##### Travis CI

Create an account and put your repository to be observed by travis. 

In your new listener, you need to configure the environment variable $HEROKU_API_KEY or put directly into a __.travis.yml__ (it's not secure). 

You need to change the __deploy>app__ into __.travis.yml__ to the same name of heroku app.

## Run

##### Dev Profile

```sh
$ mvn spring-boot:run 
```

##### Production Profile

```sh
$ mvn spring-boot:run -Dspring.profiles.active=prod
```

## Run with Docker Command Line

```sh
$ mvn clean package  
```

```sh
$ docker build -t mytask .  
```

```sh
$ docker run -it -p 8080:8080 --name mytask-container mytask
```

## Run with docker-maven-plugin

```sh
$  mvn clean package docker:build --batch-mode release:update-versions  
```

```sh
$ docker run -it -p 8080:8080 --name mytask-container mytask
```



License
----

MIT

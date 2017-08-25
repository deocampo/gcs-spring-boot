
#Initial Setup

Instructions for the project are documented at:

https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot/index.html

##Base Project 

The Spring boot codebase comes from the barebones spring-boot sample downloaded from:

https://github.com/spring-guides/gs-spring-boot

This creates the Main controller mapped to ["/"](http://deocampo-barebones.appspot.com/).

## Deployed

Project is deployed into Google Cloud Platform. It may still be running at the following site:

http://deocampo-barebones.appspot.com/

It is not a permanent site since I am using a free trial versions of Google Cloud.

#Extensions

## 1. Tensorflow

Added Tensorflow code executed from the following [site](https://www.tensorflow.org/install/install_java). This is mapped to ["/tf"](http://deocampo-barebones.appspot.com/tf).

## 2. Scheduler

Added scheduled task following instructions from the following [site](https://spring.io/guides/gs/scheduling-tasks/). This is not mapped to any URI but runs in the following schedule  @Scheduled(cron = "0 0 0 25 12 ?"), every Christmas Day at midnight.

## 3. MSC (Model Service Controller) 

Added scaffolding for basic model service controller, via RESTFull calls using the following [site] (http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/). This is mapped to  ["/user/"](http://deocampo-barebones.appspot.com/users/).

## 4. REST 

Added sample REST functionality via RestController. As reference, used the following Spring.io [site](https://spring.io/guides/tutorials/bookmarks/). This is mapped to following URI ["/{userId}/bookmarks"]() where user can be any of the following : dondi, leo, josh, liza, mimie, lolo, lola, anshul.




## Initial Setup

Instructions for the initial setup of the project are documented at [Google's Developer CodeLabs](https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot/index.html).

### Base Project 

The Spring boot codebase comes from the barebones spring-boot sample downloaded from the [Spring Github Repo](https://github.com/spring-guides/gs-spring-boot). This contains the Main controller mapped to ["/"](http://deocampo-barebones.appspot.com/).

### Deployed

Project is deployed into Google Cloud Platform. It may still be running at the following [on my Google Cloud Account](http://deocampo-barebones.appspot.com/). The site is not up for long since I am using a free account.


## Extensions

### 1. Tensorflow

Added Tensorflow code executed from the following [Java reference site](https://www.tensorflow.org/install/install_java). This contains the tensorflow controller that is mapped to ["/tf"](http://deocampo-barebones.appspot.com/tf).

### 2. Scheduler

Added scheduled task following instructions from the following [Spring.io guide](https://spring.io/guides/gs/scheduling-tasks/). This contains the scheduler that is not mapped to any URI but runs in the following schedule @Scheduled(cron = "0 0 0 25 12 ?"), every Christmas Day at midnight.

### 3. MSC (Model Service Controller) 

Added scaffolding for basic model service controller, vie RESTFull calls using the following [instructional site](http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/). This creates the MSC controller that is mapped to  ["/user"](http://deocampo-barebones.appspot.com/user/).

### 4. REST 

Added sample REST functionality via RestController. As reference, used the following Spring.io [site](https://spring.io/guides/tutorials/bookmarks/). This is mapped to following URI ["/{userId}/bookmarks"]() where user can be any of the following : dondi, leo, josh, liza, mimie, lolo, lola, anshul.



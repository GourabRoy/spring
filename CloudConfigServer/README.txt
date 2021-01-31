Step 1
Create folder <PropertyPath>
cd <PropertyPath>
Create files movielens.properties, movielens-dev.properties, movielens-qa.properties, movielens-prod.properties

set this to the config on application.yml

spring:
  cloud:
    config:
      server:
        native:
          searchlocations: file:///<PropertyPath>

Step 2
Add the following to VM args
-Dspring.profiles.active=native

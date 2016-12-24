# spring-boot-wordpress

A Dockerized Spring Boot Application which can read a wordpress database and expose it as a REST API.  This allows a new front end to be built using something other than Wordpress while still maintaining the site's legacy database using the legacy Wordpress application.

This API is currently read-only and only supports a small sub-set of fields in the Wordpress tables.

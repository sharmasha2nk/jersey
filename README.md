jersey
======

Check same endpoints with all verbs.

Json response with root element.

Run using:  gradle jettyRunWar

Urls to try: 
===

POST Request: curl http://localhost:8887/JerseySample/rest/hello/world -X POST

GET Request: curl http://localhost:8887/JerseySample/rest/hello/world

---> Will result in direct match /hello/world endpoint, ignoring Get /hello/{param} one.

GET Request: curl http://localhost:8887/JerseySample/rest/hello/jersey

---> Will use Get /hello/{param} endpoint.

curl http://localhost:8887/JerseySample/rest/hello/world -X POST

--->  Will give Error 405 Method Not Allowed

curl http://localhost:8887/JerseySample/rest/json/Hello%20world!!

---> Will give json response {"message":{"data":"Hello world!!"}}, which includes root element.





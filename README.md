# mule-message-injector


Mule try-out.  Accepts GETs or POSTs to http://localhost:8081/message.  Needs an [ActiveMQ](http://activemq.apache.org/) broker available at `localhost:61616`.

* The GET results in a bit of JSON being thrown back, telling you the path and any URL parameters used.
* The POST pushes the call through a JMS request-response sub-flow, using a [ReplyTo](http://activemq.apache.org/how-should-i-implement-request-response-with-jms.html) queue, before responding with a similar bit of JSON.

The JSON is constructed using a Java transformation node.

Built in [Anypoint Studio](http://www.mulesoft.org/download-mule-esb-community-edition) 5.0.1 using [Mule Server 3.4.0 CE](https://www.mulesoft.com/platform/soa/mule-esb-open-source-esb). 

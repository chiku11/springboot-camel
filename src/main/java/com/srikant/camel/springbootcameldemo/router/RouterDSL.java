package com.srikant.camel.springbootcameldemo.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.Configuration;

import com.srikant.camel.springbootcameldemo.model.Greeting;

@Configuration
public class RouterDSL extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet").port("8080").bindingMode(RestBindingMode.json).contextPath("/camel");
		rest().description("sample API show casing Rest DSL")
		.get("hello").to("direct:hello")
		.get("spring").to("bean:controllerA?method=sayHello")
		.post("sendmsg").type(Greeting.class).to("bean:service1?method=simpleMsg");
		log.info("Response received : ${body}");
		from("direct:hello").transform().simple("Hello World! from Camel");
	}
}

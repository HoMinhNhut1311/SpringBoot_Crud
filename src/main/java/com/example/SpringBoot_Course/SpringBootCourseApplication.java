package com.example.SpringBoot_Course;

import com.example.SpringBoot_Course.Service.firstService;
import com.example.SpringBoot_Course.bean.firstBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
public class SpringBootCourseApplication {

	public static void main(String[] args) {
		var sa = new SpringApplication(SpringBootCourseApplication.class);
		sa.setDefaultProperties(Collections.singletonMap("spring.profiles.active","test"));
		var ctx = sa.run(args);
		firstService service = ctx.getBean(firstService.class);

		System.out.println(service.tellAstory());
		System.out.println(service.getNameSpring());
		System.out.println(service.getNameCustom());



	}

}

package com.example.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 스프링이 특정 어노테이션이 부텅있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에서 관리
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1>Hello spring boot</h1>";
	}
}

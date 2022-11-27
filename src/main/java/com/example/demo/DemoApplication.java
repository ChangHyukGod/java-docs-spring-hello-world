package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure!";
	
	}
	
	try{
            File file = new File("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<h2>html의 제목</h2>");
            writer.write("<div> 추가하고 싶은 내용들 ~~ </div>");
            //변수추가하기
            
            String a = "추가할 변수";
            
            writer.write("~~~" + a + "~~~");

            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }

}

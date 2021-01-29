package com.bu.aft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
	public class AlpineFitTrainerApplication {

		public static void main(String[] args) {
			SpringApplication.run(AlpineFitTrainerApplication.class, args);
		}

		@Controller
		class WebController {

			@GetMapping
			public String home(){
				return "index";
			}
		}
}

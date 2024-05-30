package com.example.springshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@SpringBootApplication
public class SpringshellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringshellApplication.class, args);
		System.out.println("MAXXX IS READY TO USE SPRING SHELL");
	}

	@ShellComponent
	public class MyShellCommand {

		@ShellMethod("testing the spring shell")
		public String testing(@ShellOption() String name){
			return "my world "+ name;
		}

	}
}

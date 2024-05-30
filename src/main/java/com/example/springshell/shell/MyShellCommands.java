package com.example.springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyShellCommands {

    @ShellMethod("testing the spring shell")
    public String testing(@ShellOption() String name){
        return "my world "+ name;
    }

}

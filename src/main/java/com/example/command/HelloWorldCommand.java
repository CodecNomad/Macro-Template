package com.example.command;

import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;
import cc.polyfrost.oneconfig.utils.commands.annotations.SubCommand;

@Command(value = "hello")
public class HelloWorldCommand {
    @Main
    public void mainCommand() {
        System.out.println("Hello!");
    }

    @SubCommand
    public void world() {
        System.out.println("Hello World!");
    }
}

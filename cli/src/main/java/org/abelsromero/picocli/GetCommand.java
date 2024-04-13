package org.abelsromero.picocli;

import picocli.CommandLine;

import java.nio.file.Path;

@CommandLine.Command(name = "get")
public class GetCommand
        extends SharedOptions
        implements Runnable {

    @CommandLine.Option(names = {"-p", "--path"},
            defaultValue = "${sys:user.dir}",
            description = "The path to the app")
    protected Path path;


    @Override
    public void run() {
        System.out.println("Getting...");

        if (fail) {
            throw new RuntimeException("Boom!");
        }
    }
}

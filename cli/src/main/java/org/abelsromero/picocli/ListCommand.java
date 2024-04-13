package org.abelsromero.picocli;

import picocli.CommandLine;

@CommandLine.Command(name = "list")
public class ListCommand
        extends SharedOptions
        implements Runnable {

    @Override
    public void run() {
        System.out.println("Listing...");
    }
}

package org.abelsromero.picocli;

import picocli.CommandLine;

public class SharedOptions {

    @CommandLine.Option(names = {"-d", "--debug"},
            description = "Enable debug")
    protected boolean debug;

    @CommandLine.Option(names = {"-f", "--fail"},
            description = "Force failure")
    protected boolean fail;
}

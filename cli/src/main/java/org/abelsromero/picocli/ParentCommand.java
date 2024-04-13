package org.abelsromero.picocli;

import picocli.CommandLine;

@CommandLine.Command(name = "app",
        subcommands = {
                ListCommand.class,
                GetCommand.class
        },
        description = "Spring Application Advisor CLI")
public class ParentCommand {
}

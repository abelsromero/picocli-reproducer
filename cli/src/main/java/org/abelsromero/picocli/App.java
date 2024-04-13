package org.abelsromero.picocli;

import picocli.CommandLine;

public class App {

    public static void main(String... args) {
        int exitCode = run(args);
        System.exit(exitCode);
    }

    /**
     * Runs CLI without explicitly calling 'System.exit'.
     * Used for testing.
     */
    static int run(String[] args) {
        return new CommandLine(new ParentCommand())
                .setCaseInsensitiveEnumValuesAllowed(true)
                .setExecutionExceptionHandler(new ExecutionExceptionHandler())
                .execute(args);
    }
}

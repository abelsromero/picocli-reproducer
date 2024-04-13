package org.abelsromero.picocli;

import picocli.CommandLine;
import picocli.CommandLine.ParseResult;

public class ExecutionExceptionHandler implements CommandLine.IExecutionExceptionHandler {

    @Override
    public int handleExecutionException(Exception e, CommandLine commandLine, ParseResult parseResult) throws Exception {
        System.out.println("[INFO] From ExecutionExceptionHandler ----");

        System.out.println("\tException: " + e);
        System.out.println("\tCommandLine: " + commandLine);

        printParseResult(parseResult, "method");
        printParseResult(commandLine.getParseResult(), "commandLine.getParseResult()");
        return 0;
    }

    private void printParseResult(ParseResult parseResult, String origin) {
        System.out.println("\tParseResult from " + origin + ": " + parseResult);
        System.out.println("\t\tmatchedArgs(): " + parseResult.matchedArgs());
        System.out.println("\t\tmatchedOptions(): " + parseResult.matchedOptions());
    }
}

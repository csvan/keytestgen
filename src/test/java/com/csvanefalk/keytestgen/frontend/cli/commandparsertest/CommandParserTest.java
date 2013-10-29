package com.csvanefalk.keytestgen.frontend.cli.commandparsertest;

import org.junit.Before;

import com.csvanefalk.keytestgen.frontend.cli.CLITest;
import com.csvanefalk.keytestgen.frontend.cli.CommandParser;

import com.beust.jcommander.JCommander;

public class CommandParserTest extends CLITest {

    protected CommandParser commandParser = null;
    protected JCommander processor = null;

    @Before
    public void setup() {
        commandParser = new CommandParser();
        processor = new JCommander(commandParser);
    }

}

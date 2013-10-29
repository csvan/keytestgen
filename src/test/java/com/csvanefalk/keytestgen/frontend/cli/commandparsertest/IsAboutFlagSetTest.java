package com.csvanefalk.keytestgen.frontend.cli.commandparsertest;

import junit.framework.Assert;

import org.junit.Test;

import com.csvanefalk.keytestgen.frontend.cli.CommandParser;

import com.beust.jcommander.JCommander;

public class IsAboutFlagSetTest extends CommandParserTest{
    
    @Test
    public void testParseAbout() {

        String[] args = { "-a" };
        processor.parse(args);
        Assert.assertTrue(commandParser.isAboutFlagSet());
    }

    @Test
    public void testParseAboutLong() {

        String[] args = { "--about" };
        processor.parse(args);
        Assert.assertTrue(commandParser.isAboutFlagSet());
    }
}

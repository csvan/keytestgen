package com.csvanefalk.keytestgen.core.codecoverage.implementation;

import java.util.Set;

import com.csvanefalk.keytestgen.core.codecoverage.executionpath.ExecutionPath;
import com.csvanefalk.keytestgen.core.codecoverage.executionpath.ExecutionPathContext;

public interface ICoverageBuilder {

    static DescendingExecutionPathComparator comparator = new DescendingExecutionPathComparator();

    Set<ExecutionPath> retrieveExecutionPaths(ExecutionPathContext context);
}
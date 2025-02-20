# Groovy Closure Syntax Error: Missing Parentheses

This repository demonstrates a common error in Groovy related to closure syntax.  The example shows how missing parentheses around a closure definition can cause unexpected behavior.

The `bug.groovy` file contains the erroneous code. The `bugSolution.groovy` file provides the corrected version.

## Error Description

In Groovy, closures are often defined using concise syntax. However, omitting the required parentheses when passing a closure as an argument can lead to compilation or runtime errors, depending on the Groovy version and the specific context. The compiler may misinterpret the code, leading to incorrect execution or a syntax error.

## Solution

The solution involves ensuring that parentheses are correctly used when defining and passing the closure as an argument to the function.
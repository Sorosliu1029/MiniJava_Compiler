#!/bin/sh
alias antlr4="java -jar /usr/local/lib/antlr-4.5.3-complete.jar"
antlr4 MiniJava.g4 -o antlr_gen -package antlr_gen && echo "generation succeed"
#!/bin/zsh
cd ../out/production/project
alias grun="java org.antlr.v4.gui.TestRig"
grun antlr_gen.MiniJava goal ../../../MiniJava_code/factorial.java

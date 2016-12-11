#!/bin/sh
alias grun="java org.antlr.v4.gui.TestRig"
cd out
grun antlr_gen.MiniJava goal -gui "../$1"
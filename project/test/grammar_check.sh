#!/bin/sh
cd ../out/production/project
alias grun="java org.antlr.v4.gui.TestRig"

for file in `ls ../../../MiniJava_code/`
do
    if [[ ${file} =~ ^.*\.java$ ]] ; then
        grun antlr_gen.MiniJava goal ../../../MiniJava_code/${file} && echo "Test on ${file} succeed" \
        || echo "Test on ${file} fail"
    fi
done
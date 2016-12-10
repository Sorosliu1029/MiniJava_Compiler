#!/bin/sh
if [ x$1 != x ]
then
    if [[ $1 =~ ^.*\.java$ ]]
    then
    cd out
    java compiler_front.MiniJavaCompiler "../"$1
    fi
    exit 0
else
    echo "Usage:\n ./run.sh <path/to/your/MiniJava/code>"
    exit 1
fi
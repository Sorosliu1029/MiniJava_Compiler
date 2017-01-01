#!/bin/sh
echo "1.Start checking ANLTR g4 grammar on MiniJava sample codes"
./grammar_check.sh
echo "2.Start generating java code from g4 file"
./gen_java_code.sh
echo "3.Start compiling all *.java code"
./compile_all_java.sh
echo "4.Start running on all test sample code"

for file in `ls MiniJava_code/`
do
    if [[ ${file} =~ ^.*\.java$ ]]
    then
        echo "Run on ${file}"
        ./run.sh "MiniJava_code/${file}"
    else
        for f in `ls MiniJava_code/${file}/`
        do
            if [[ ${f} =~ ^.*\.java$ ]]
            then
                echo "Run on ${file}/${f}"
                ./run.sh "MiniJava_code/${file}/${f}"
            fi
        done
    fi
done



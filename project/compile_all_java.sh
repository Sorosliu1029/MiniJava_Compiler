#!/bin/sh
javac -sourcepath src src/antlr_gen/MiniJava*.java \
                      src/error_handle/*.java \
                      src/compiler_front/*.java \
                      src/compiler_utils/*.java \
                      -d out
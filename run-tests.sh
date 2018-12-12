#!/bin/sh

cd ./src
javac $(find ./* | grep .java)
java jaksonkallio.sort.Main

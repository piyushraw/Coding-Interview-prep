#!/bin/bash
cd /Users/piyushrawat/Desktop/Problems
while true; do
    java HelloWorld >> output.log 2>&1
    echo "---" >> output.log
    echo "Hello World printed at $(date)"
    sleep 60
done

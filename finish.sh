#!/bin/bash
make
jar -cmvf MANIFEST.MF mess_test.jar *.class
rm *.class
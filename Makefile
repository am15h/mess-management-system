JAVAC = javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)
all: myprogram

myprogram: $(classes)

%.class : %.java
	$(JAVAC) $<

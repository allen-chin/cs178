# Name: Allen Chin
# Course: CS178 Build Automation for DevOps and QA
# CRN: 76718
# Date: 09/03/2019
# Assignment: Count3s

# Variables
CC = gcc
CCFLAGS = -Wall

runCount3s: clean Count3s
	./countThrees

Count3s: countThrees.c readInt32BitLE.o
	$(CC) $(CCFLAGS) -o countThrees countThrees.c readInt32BitLE.o

readInt32BitLE.o: readInt32BitLE.c readInt32BitLE.h
	$(CC) $(CCFLAGS) -c readInt32BitLE.c readInt32BitLE.h

clean:
	rm -f *.o countThrees
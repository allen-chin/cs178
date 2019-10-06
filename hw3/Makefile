# Name: Allen Chin
# Course: CS178 Build Automation for DevOps and QA
# CRN: 76718
# Date: 09/18/2019
# Assignment: ServerCountThrees

# Variables
CXX = gcc
CXXFLAGS = -Wall -std=c11

test: build
	mkdir -p build
	cp src/ServerCountThrees build
	cp data/threesData.bin build
	cd build && ./ServerCountThrees

build:
	cd src && $(CXX) $(CXXFLAGS) -o ServerCountThrees ServerCountThrees.c readInt32BitLE.c

clean:
	rm -f src/ServerCountThrees && rm -rf build

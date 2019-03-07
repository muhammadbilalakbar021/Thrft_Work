This is a C++ Project in Ubuntu 18.04 I built it with the help of QTcreater 


"You must add this text to Cmake file to add thrift in your library
QMAKE_CXXFLAGS += -std=c++0x -DHAVE_INTTYPES_H -DHAVE_NETINET_IN_H -Wall
              INCLUDEPATH += -l/usr/local/include/thrift
              LIBS += -L/usr/local/lib -lthrift

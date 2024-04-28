package com.example.testproject.controller;

class square {
    int x, y;
    square(int x, int y) {                  // 1
        this.x = x;
        this.y = y;
    }
    int getArea(){                          // 2
        return x * y;
    }
}

class rectangle extends square {
    int size;
    rectangle(int size){                    // 3
        super(size,size);
    }
    int getArea(){                          // 4
       return x;
    }
}

public class ex01 {
    public static void main(String[] args) {     // 5
        square sq = new rectangle(10);      // 6
        sq.getArea();                            // 7
    }
}

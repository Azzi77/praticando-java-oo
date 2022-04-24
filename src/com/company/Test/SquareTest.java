package com.company.Test;


import com.company.Rectangle;


import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void givenCalculateArea_whenMultiplySide_thenSucceed() {
        Square square = new Square(8d, 8d);
        double actual = square.calculateArea();
        assertEquals(64d, actual);

    }

    @Test
    void givenCalculatePerimeter_whenSumSides_theSucceed() {
        Square square = new Square(8d, 8d);

    double actual = square.calculatePerimeter();
    assertEquals(32d, actual);
}
}





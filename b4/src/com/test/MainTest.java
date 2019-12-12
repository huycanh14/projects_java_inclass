package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.company.Main;

class MainTest {

	@Test
	void maxOfTwoNumbers() {
		assertEquals(7, Main.maxOfTwoNumbers(7, 5));
		assertEquals(12, Main.maxOfTwoNumbers(12, 12));
        assertEquals(9, Main.maxOfTwoNumbers(1, 9));
        assertEquals(1000, Main.maxOfTwoNumbers(1000, 5));
        assertEquals(777, Main.maxOfTwoNumbers(776, 777));
	}
	
	@Test
	void minOfArray() {
		List<Integer> myList;

        myList = Arrays.asList();
        assertEquals(-1, Main.minOfArray(myList));

        myList = Arrays.asList(11, 65, 234, 6747, 532345, 143, 6);
        assertEquals(6, Main.minOfArray(myList));

        myList = Arrays.asList(11234, 23465, 232344, 6723447, 532342345, 142343);
        assertEquals(11234, Main.minOfArray(myList));

        myList = Arrays.asList(534511, 65435, 234354, 67447, 53542345, 34143, 345456);
        assertEquals(34143, Main.minOfArray(myList));

        myList = Arrays.asList(1241, 6345, 234, 6723447, 532323445, 14343, 3246);
        assertEquals(234, Main.minOfArray(myList));

        myList = Arrays.asList(1241, 6345, 234, 6723447, 532323445, 14343, 3246, 234);
        assertEquals(234, Main.minOfArray(myList));

        myList = Arrays.asList(1123132, 61231235, 212312334, 621313174, 532345, 123423443, 642342);
        assertEquals(532345, Main.minOfArray(myList));
	}
	
	@Test
	void BMI() {
        assertEquals("Bình thường", Main.BMI(57,1.59));

        assertEquals("Bình thường", Main.BMI(54,1.57));

        assertEquals("Thừa cân", Main.BMI(59,1.59));

        assertEquals("Thiếu cân", Main.BMI(35,1.56));

        assertEquals("Béo phì", Main.BMI(80,1.55));

        assertEquals("Thừa cân", Main.BMI(24.99999,1));

        assertEquals("Invalid height", Main.BMI(24.99,0));

        assertEquals("Bình thường", Main.BMI(18.5,1.0));

        assertEquals("Thiếu cân", Main.BMI(18.5,1.0001));

        assertEquals("Bình thường", Main.BMI(22.99,1.000));

        assertEquals("So special BMI!", Main.BMI(25,1.000));
    }

}

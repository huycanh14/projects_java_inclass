package com.company;

import com.questionone.apple.QuaTao;
import com.questionone.orange.CamCaoPhong;
import com.questionone.orange.CamSanh;
import com.questionone.orange.QuaCam;
import com.questiontwo.Shape;
import com.questiontwo.circle.Circle;
import com.questiontwo.rectangle.Rectangle;
import com.questiontwo.rectangle.square.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Câu 1
		 */
		CamSanh sanhOrange = new CamSanh();
        System.out.println(String.format("Cam sành có giá: %f", sanhOrange.getPrice()));

        CamCaoPhong caoPhongOrange = new CamCaoPhong();
        System.out.println(String.format("Cam Cao phong: %f", caoPhongOrange.getPrice()));

        QuaTao apple = new QuaTao();
        System.out.println(String.format("Quả táo có giá: %f", apple.getPrice()));

        QuaCam orange = new QuaCam();
        System.out.println(String.format("Quả cam có giá: %f\n", orange.getPrice()));
        
        /*
         * Câu 2
         */
        Shape shape = new Shape("black", false); // normal shape
        System.out.println(shape.toString());

        Square square = new Square(10, "blue", false); // a square
        System.out.println(square.toString());

        Rectangle rectangle = new Rectangle(12, 6, "yellow", true); // a rectangle
        System.out.println(rectangle.toString());

        Circle circle = new Circle(3); // a circle
        System.out.println(circle.toString());
	}
}

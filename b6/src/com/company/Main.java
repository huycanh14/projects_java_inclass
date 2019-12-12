package com.company;

public class Main {

	public static void main(String[] args) {
		Circle myCircle = new Circle(2,0, 0, "red");

        System.out.println(myCircle.toString());
        myCircle.moveTo(3, 4);

        System.out.println(myCircle.toString());

        myCircle.setColor("yellow");
        System.out.println(myCircle.toString());

        Triangle myTriangle = new Triangle(0, 0, 1, 0, 0, 1, "green");

        System.out.println(myTriangle.toString());

        myTriangle.moveTo(5, 5);

        System.out.println(myTriangle.toString());


        /**
         * Try Layer's deleteTriangle method
         */
        Layer myLayer = new Layer();

        myLayer.addShape(new Rectangle(2, 3, 0, 0, "red"));
        myLayer.addShape(new Circle(1,1, 1, "blue"));
        myLayer.addShape(new Triangle(0, 0, 1, 0, 0, 1, "green"));
        myLayer.addShape(new Square(2, 3, 3, "yellow"));

        System.out.println(myLayer.toString());
        System.out.println("-------------------------------------------------");

        myLayer.deleteTriangle();

        System.out.println(myLayer.toString());
        System.out.println("-------------------------------------------------");

        /**
         * Try Diagram's deleteCircle method
         */

        Layer myLayer2 = new Layer();

        myLayer2.addShape(new Rectangle(2, 3, 0, 0, "red"));
        myLayer2.addShape(new Circle(1,1, 1, "blue"));
        myLayer2.addShape(new Triangle(0, 0, 1, 0, 0, 1, "green"));
        myLayer2.addShape(new Square(2, 3, 3, "yellow"));

        Diagram myDiagram = new Diagram();
        myDiagram.addLayer(myLayer);
        myDiagram.addLayer(myLayer2);
        System.out.println(myDiagram.toString());
        System.out.println("-------------------------------------------------");

        myDiagram.deleteCircle();

        System.out.println(myDiagram.toString());
        System.out.println("-------------------------------------------------");
	}

}

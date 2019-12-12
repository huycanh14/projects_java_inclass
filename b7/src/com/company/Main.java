package com.company;

import java.util.Objects;

public class Main {

	private int x;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return x == main.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    public Main(int _x) {
        this.x = _x;
    }

    public static void test() {
        Main main1 = new Main(10);
        Main main2 = new Main(11);
        System.out.println(main1.equals(main2));
    }

    public static void main(String[] args) {
	// write your code here
        test();

        /**
         * Try shape
         */
        System.out.println("Now try moving circles");
        Circle myCircle = new Circle(2,0, 0, "red");

        System.out.println(myCircle.toString());
        myCircle.moveTo(3, 4);

        System.out.println(myCircle.toString());

        myCircle.setColor("yellow");
        System.out.println(myCircle.toString());

        System.out.println("now try triangles");
        Triangle myTriangle = new Triangle(0, 0, 1, 0, 0, 1, "green");

        System.out.println(myTriangle.toString());

        myTriangle.moveTo(5, 5);

        System.out.println(myTriangle.toString());

        System.out.println("Now delete Triangles");

        /**
         * Try Layer's deleteTriangle method
         */
        Layer myLayer = new Layer();

        myLayer.addShape(new Rectangle(2, 3,0, 2, 3, 0, "red"));
        myLayer.addShape(new Circle(1,1, 1, "blue"));
        myLayer.addShape(new Triangle(0, 0, 1, 0, 0, 1, "green"));
        myLayer.addShape(new Square(2, 0, 2, 2, 0, "yellow"));
        myLayer.addShape(new Square(2, 0, 2, 2, 0, "yellow"));

        System.out.println(myLayer.toString());
        System.out.println("-------------------------------------------------delete");

        myLayer.deleteTriangle();

        System.out.println(myLayer.toString());
        System.out.println("-------------------------------------------------");

        myLayer.deleteDuplicate();
        System.out.println(myLayer.toString());
        System.out.println("-------------------------------------------------");

        /**
         * Try Diagram's deleteCircle method
         */

        Layer myLayer2 = new Layer();

        myLayer2.addShape(new Rectangle(2, 3, 0, 2, 3, 0, "red"));
        myLayer2.addShape(new Circle(1,1, 1, "blue"));
        myLayer2.addShape(new Triangle(0, 0, 1, 0, 0, 1, "green"));
        myLayer2.addShape(new Square(2, 0, 0, 2, -2, "yellow"));
        myLayer2.addShape(new Hexagon(10.1,120, 10, 100, 1000, "purple"));

        Diagram myDiagram = new Diagram();
        myLayer.setCanBeDrawn(false); // set the layer cannot be drawn
        myDiagram.addLayer(myLayer);
        myDiagram.addLayer(myLayer2);

        System.out.println(myDiagram.toString());
        System.out.println("-------------------------------------------------delete circles");

        /**
         * delete all circles in the diagram
         */
        myDiagram.deleteCircle();

        System.out.println(myDiagram.toString());
        System.out.println("-------------------------------------------------");

        /**
         * try to separate shapes into layers
         */
        myDiagram.addShapeToLayer();

        System.out.println(myDiagram.toString());
        System.out.println("-------------------------------------------------x");
    }
}

package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        Shape s;
        switch(type){
            case Hexagon:
                s = new Hexagon();
                break;
            case Pentagon:
                s = new Pentagon();
                break;
            case Triangle:
                s = new Triangle();
                break;
            case Quadrilateral:
                s = new Quadrilateral();
                break;
            default:
                s = null;
                break;
        }
        return s;
    }
}

package assignment.shape;

public class ShapeLogic {
    String type;
    float trilength1, trilength2, trilength3;
    float rectanglelength,rectanglewidth;
    float circleradius;

    ShapeLogic(String type,float circleradius){
        this.type=type;
        this.circleradius=circleradius;
    }
    ShapeLogic(String type,float reactanglelength, float reactanglewidth){
        this.type=type;
        this.rectanglelength=reactanglelength;
        this.rectanglewidth=reactanglewidth;
    }
    ShapeLogic(String type,Float trilength1,Float trilength2,Float trilength3){
        this.type=type;
        this.trilength1=trilength1;
        this.trilength2=trilength2;
        this.trilength3=trilength3;
    }

    float perimeter(){
        float peri=0;
        if("triangle".equalsIgnoreCase(type)){
            peri =trilength1 + trilength2 + trilength3;
        }
        else if("rectangle".equalsIgnoreCase(type)){
            peri=2*(rectanglelength + rectanglewidth);
        }
        else if("circle".equalsIgnoreCase(type)){
            peri=2 * 3.14f * circleradius;

        }
        return peri;
    }

    float area(){
        float shapearea=0;
        if("triangle".equalsIgnoreCase(type)){
            shapearea =(trilength2 + trilength3) / 2;
        }
        else if("rectangle".equalsIgnoreCase(type)){
            shapearea=rectanglelength * rectanglewidth;
        }
        else if ("circle".equalsIgnoreCase(type)){
            shapearea=3.14f * circleradius * circleradius;
        }
        return shapearea;
    }
    
}
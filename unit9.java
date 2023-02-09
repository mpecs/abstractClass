public class unit9 {

    //interface, abstract class
    //abstract class and interfaces cannot have instances - have to be subclassed
    
    abstract class Object{
        //may or may not include methods
        //class must be declared abstract if it includes abstract methods
        //abstract class doesn't have to implement all of the interfaces methods if its declared abstract
        //can have static fields and methods

        abstract void moveTo();     //abstract method - declared without implementation   

    }

    abstract class GraphicObject{
        int x, y; //coordinates of the center of the object

        void moveTo(int newX, int newY){

        }

        abstract void draw();
        abstract void resize();
    }

    class Circle extends GraphicObject{

        void draw() {
            // methods have to be implemented in the subclasses of abstract classes
            
        }

        void resize() {
            // implementation not shown
        }
      
    }

    //interfaces - a way for code to interact together, when programmed by multiple people
    //considered a reference type, contains only constants, method signatures, default methods, static methods and nested type
    //interface can only be implemented by other interfaces

    public interface Graph{

        //contant declarations 

        //methods - not implemented

        int draw(double lineWidth, double lineLength);
        int erase(double lineWidth, double lineLength);
        //etc.

    }

    class drawingTablet implements Graph{ //has to implement all methods

        public int draw(double lineWidth, double lineLength){
            //implementation of method
            int result = 0;
            return result;
        }

        public int erase(double lineWidth, double lineLength){
            //implementation of method
            int result = 0;
            return result;

        }
    }



    //abstract class vs. interface
    //both cannot be instantiated, 
    //abstractclass can declare nonstatic nonfinal fields, can define public, protected, private
    //interface - all fields are public, static, final, all methods are public

    //abstract class - share code among closely related classes, have common methods or fields, require access modifiers
        //avoids independence
    //interface - unrelated classes can implement, specific behaviour of datatype, doesnt matter who uses the code
        //for future enhancement

    
    
}

package OnlineCourses.ClassExample.NestedClasses;

public class Main {
    public static void main(String[] args) {

        Outer.Static objStatic=new Outer.Static();
        objStatic.print();
        Outer.Static.print2();

        Outer objOuter=new Outer();
        Outer.NonStatic objNonStatic=objOuter.new NonStatic();
        objNonStatic.print();

        objOuter.metodInstance();
        Outer.metodStatic();

        objOuter.objAnonym.print();
    }
}

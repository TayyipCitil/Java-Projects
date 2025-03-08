package OnlineCourses.ClassExample.NestedClasses;

public class Outer{
    static class Static{
        void print(){
            System.out.println("static sınıfın instance motodu");
        }
        static void print2(){
            System.out.println("static sınıfın static metodu");
        }
    }

    class NonStatic extends Static{
        void print(){
            System.out.println("non-static/instance sınıfın instance metodu");
        }
    }

    void metodInstance(){
        class Local{
            void print(){
                System.out.println("instance metoddaki local sınıfının instance metodu");
            }
        }
        Local objLocal=new Local();
        objLocal.print();
    }
    static void metodStatic(){
        class Local{
            void print(){
                System.out.println("static metoddaki local sınıfının instance metodu ");
            }
        }
        Local objLocal=new Local();
        objLocal.print();
    }

    InterfaceOfAnonim objAnonym=new InterfaceOfAnonim(){
        @Override
        public void print(){
            System.out.println("anonim sınıfın override metodu");
        }
    };
}

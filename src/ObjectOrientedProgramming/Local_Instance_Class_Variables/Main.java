package ObjectOrientedProgramming.Local_Instance_Class_Variables;

public class Main {
    public static void main(String[] args) {
        System.out.println(Yardimci.classVariable);
        Yardimci nesne=new Yardimci();
        System.out.println(nesne.instanceVariable);
        //System.out.println(nesne.localVariable);
    }
}

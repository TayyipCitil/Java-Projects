package ObjectOrientedProgramming.Referans_ObjectClass;

public class Main {
    static Character character=new Character("Ali");
    static Character character2;
    static Object obj=5;

    public static void main(String[] args) {
        character2=character;
        character2.name="Ahmet";
        System.out.println(character.name);

        obj=1.5;
        obj="A";
        obj=true;
    }

}

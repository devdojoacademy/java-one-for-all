package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "William";
        String name2 = "William";
        name = name.concat(" Suane"); // name += " Suane"
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("William2");
        String name4 = "William2";
        System.out.println(name3.intern() == name4); // 1 creating reference variable, 2 a String object, 3 Create in the pool of strings

    }
}

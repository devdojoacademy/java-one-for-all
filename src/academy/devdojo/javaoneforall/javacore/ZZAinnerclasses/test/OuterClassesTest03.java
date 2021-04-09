package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest03 {
    protected String name = "William";
    static class Inner {
        public void printOuterClassAttribute() {
            System.out.println(new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}

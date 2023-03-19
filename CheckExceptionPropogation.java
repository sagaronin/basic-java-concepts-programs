public class CheckExceptionPropogation {

    public void first() {
        System.out.println("inside first");
        throw new java.io.FileNotFoundException(); //compile time error
        // this will throw Checked exception(Compile time)
    }
    public void second() {
        System.out.println("inside second");
        first();
    }
    public void third() {
        System.out.println("inside third");
        second();
    }

    public static void main(String[] args) {
        UncheckedExceptionPropogation ep= new UncheckedExceptionPropogation();
        try {
            //Note: "By default", Checked Exceptions are not forwarded in calling chain (propagated).
            ep.third();
        } catch (Exception e) {
            System.out.println("inside catch");
            System.out.println(e);  
        }
    }
}

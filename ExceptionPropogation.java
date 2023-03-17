class UncheckedExceptionPropogation {

    public void first() {
        System.out.println("inside first");
        int first=50/0; 
        // this will throw Unchecked exception(Arithmetic exception- divide by zero)
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
            //Note: By default Unchecked Exceptions are forwarded in calling chain (propagated).
            ep.third();
        } catch (Exception e) {
            System.out.println("inside catch");
            System.out.println(e);
        }
    }
    
}

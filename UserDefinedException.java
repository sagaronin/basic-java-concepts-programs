class MyException extends Exception{
    public MyException(String str) {
        //calling parent ctor
        super(str);
    }
}

class Test{
    public static void main(String[] args) {
        try{
            //throw custom exception
            throw new MyException("Custom exception");
        }
        catch(MyException m){
            System.out.println("Inside catch");
            // Print the message from custom exception object m
            System.out.println(m.getMessage());
        }
    }
}
// This programs shows us various ways in which main method signature can be written
//note: uncomment each method and test yourself

class MainMethodSignature{

// Placements of any data type(here string) array brackets
//public static void main(String[] args){}  
//public static void main(String []args){}  
//public static void main(String args[]){}

//Placement and sequence of the access modifiers(Public), method prototype
//static public void main(String args[]){}
//public static void main(String args[]){}

//Invalid signatures of main method

//missing static keywork compile successful but program will not run since it will still be looking for main method
//public void main(String[] args){System.out.println("Hello World- missing static");}  
//Missing access modifier compile successful but program will not run since it will still be looking for main method
//static void main(String[] args){System.out.println("Hello World- missing public");}  
//complie issue invalid method declaration; return type required
//public void static main(String[] args){System.out.println("Hello World- compile issue");}  
//compile issue
//abstract public static void main(String[] args){System.out.println("Hello World- main cannot be abstract");}  

}
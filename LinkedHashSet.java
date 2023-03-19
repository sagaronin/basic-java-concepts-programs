import java.util.*;
class TestJavaCollection8{  
    public static void main(String args[]){  
        LinkedHashSet<String> set=new LinkedHashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        set.add(null);  
        set.add(null);
        Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        ArrayList
        String str ="Sagar";
        if(str.startsWith(""))
            System.out.println("Yes");
        else
            System.out.println("No");
    }  
} 
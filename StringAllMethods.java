public class StringAllMethods{

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("s1.charAt(0):  "+s1.charAt(0));// returns character at specified 
        //index, in this case H
    
        System.out.println("s1.compareTo(s2):  "+s1.compareTo(s2)); // lexicographic comparison of 
        //two strings,returns -15
        /*
        //if s1 > s2, it returns positive number  
        //if s1 < s2, it returns negative number  
        //if s1 == s2, it returns 0 
        */

        System.out.println("s1.concat(s2):  "+s1.concat(s2));
        // This method concatenates two strings s1 and s2 and retruns
        //new string which needs to be stored if you want to use it further.
        // The string s1 does not get changed, even though it is invoking the method      
        // concat(), as it is immutable. Therefore, the explicit assignment is required here.

        System.out.println("s1.contains(\"Hel\"):  "+s1.contains("Hel"));
        //returns true if charsequence(String) in present in s1 string.(Case sensitive comparison)
        //Only pass charsequence and not char, it will result in error
        //s1.contains('Hel'); This results in error.

        System.out.println("s1.endsWith(\"o\"):  "+s1.endsWith("o")); //returns true
        System.out.println("s2.startsWith(\"W\"):  "+s2.startsWith("W"));//returns true
        if(s1.startsWith(""))   
            System.out.println("s1.startsWith(\"\"): The string starts with the empty string.");    
        else 
            System.out.println("The string does not start with the empty string.");     
         
        // these two methods takes in string as input parameter and returns boolean value if the
        //given string matches. Both methods treats inputs as case sensitive
        //two variations of startsWith()
        //public boolean startsWith(String prefix)  
        //public boolean startsWith(String prefix, int offset) 

        System.out.println("s1.equals(s2):  "+s1.equals(s2));//false because content is not same
        //boolean equals(Object) method compares the content of the objects returns true if it 
        //matches
        //Comparison is case sensative

        System.out.println("s1.equalsIgnoreCase(s2):  "+s1.equalsIgnoreCase(s2));//false
        //It returns true if characters of both strings are equal, ignoring case otherwise false.

        String sf1=String.format("name is %s",s1);  
        String sf2=String.format("value is %f",32.33434);  
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char 
        //fractional part filling with 0  
        System.out.println(sf1);  
        System.out.println(sf2);  
        System.out.println(sf3);
        //The java string format() method returns the formatted string by given locale, 
        //format and arguments.

        byte[] barr=s1.getBytes();  
        for(int i=0;i<barr.length;i++){  
            System.out.println(s1.charAt(i)+ ":"+barr[i]);  
        } 
        //The Java String class getBytes() method does the encoding of string into the 
        //sequence of bytes and keeps it in an array of bytes
        //Parameters
        //(charset / charsetName)-The name of a charset the method supports.e.g. str.getBytes("UTF-16"); 
        //Returns
        //Sequence of bytes.


        System.out.println("s1.indexOf(\"lo\"):  "+s1.indexOf("lo"));
        //returns the index of substring "lo" from Hello String
        //4 versions of indexOf method
        /*
         *  1	int indexOf(int ch)	It returns the index position for the given char value
            2	int indexOf(int ch, int fromIndex)	It returns the index position for the given char value and from index
            3	int indexOf(String substring)	It returns the index position for the given substring
            4	int indexOf(String substring, int fromIndex)	It returns the index position for the given substring and from index
         * 
         */

        System.out.println("s1.isEmpty():  "+s1.isEmpty()); 
        //returns false as string s1 is not empty
        //The Java String class isEmpty() method checks if the input string is empty or not. 
        //Note that here empty means the number of characters contained in a string is zero.

        String s3 = String.join("-", "eat","sleep","code","repeat");  
        System.out.println(s3);  
        //The Java String class join() method returns a string joined with a given delimiter. 
        //In the String join() method, the delimiter is copied for each element. 

        System.out.println("s3.lastIndexOf(\"e\"):  "+s3.lastIndexOf("e"));//returns 18
        //The Java String class lastIndexOf() method returns the last index of the given character
        // value or substring. If it is not found, it returns -1. The index counter starts from zero.
        /*
         * 
         *  1	int lastIndexOf(int ch)	It returns last index position for the given char value
            2	int lastIndexOf(int ch, int fromIndex)	It returns last index position for the given char value and from index
            3	int lastIndexOf(String substring)	It returns last index position for the given substring
            4	int lastIndexOf(String substring, int fromIndex)	It returns last index position for the given substring and from index
         * 
         */


        System.out.println("s3.length():  "+s3.length());
        //returns length of given string, if the string is 
        //null it will throw java.lang.NullPointerException

        System.out.println("s1.replace(\"H\", \"h\"):  "+s1.replace("l", "L"));;
        //The Java String class replace() method returns a string replacing all the old char 
        //or CharSequence to new char or CharSequence.
        //Two types of replace methods
        //public String replace(char oldChar, char newChar)    
        //public String replace(CharSequence target, CharSequence replacement)  


        System.out.println("s3.replaceAll(\"-\", \"~\"):  "
                +  s3.replaceAll("-", "~"));
        //The Java String class replaceAll() method returns a string replacing all the sequence 
        //of characters matching regex and replacement string.


        System.out.println("s3.split(\"-\"): ");
        String temp[]=s3.split("-");
        for (String tokens : temp) {
            System.out.println(tokens);
        }
        //The java string split() method splits this string against given regular expression 
        //and returns a char array
        //There are two variations of this method
        //1. public String split(String regex)  
        //2. public String split(String regex, int limit)  
        //limit decides how many splits we want in given string, if given 0 it will return all
        // elements in string.
        
        System.out.println("s1.substring(1,4):  "+s1.substring(1,4));
        //
        //Two variations of substring()
        //public String substring(int startIndex)     
        //public String substring(int startIndex, int endIndex) 
        //remember all endIndexes in Java are exclusive, means they will not be considered.

        char[] ch=s1.toCharArray(); 
        System.out.println("s1.toCharArray():  "); 
        for(int i=0;i<ch.length;i++){  
            System.out.print("\t"+ch[i]);  
        } 
        //This method converts this string into character array.
        

        System.out.println("s1.toLowerCase():  "+s1.toLowerCase());
        System.out.println("s1.toUpperCase():  "+s1.toUpperCase());
        //these methods returns the string in lowercase and upper case letters resp.

        s1= " Hello ";
        System.out.println("s1.trim():  "+s1.trim());
        //The Java String class trim() method eliminates leading and trailing spaces. 
        //The Unicode value of space character is '\u0020'.

        int a = 3;
        System.out.println("String.valueOf(a): "+String.valueOf(a));
        // it is a static method in String class.
        //basically it returns whatever we pass to it as String representation of it.
        //we can pass int, boolean, char, char[], long, flaot, double, and Object

    }
}
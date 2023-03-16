public class ArrayIndexOutOfBound {
    //Java Program to demonstrate the case of   
    //ArrayIndexOutOfBoundsException in a Java Array.  
    public static void main(String args[]){  
        int arr[]={50,60,70,80};  
        //Notice in for loop conditional statement, condition is coint i less than "equal to" length
        //of the array which will be one more than the index to access the array. Hence we will get 
        //ArrayIndexOutOfBound.main(ArrayIndexOutOfBound.java:10)
        for(int i=0;i<arr.length;i++){  
            
            System.out.println(arr[i]);  
        }  
    }
    
}

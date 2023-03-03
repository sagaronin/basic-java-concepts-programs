class ForLoopVariation{

    public ForLoopVariation() {
    }

    @Override
    public String toString() {
        return "ForLoopVariation []";
    }

    public static void main(String args[]){
        //normal for loop consists of three parameters
        // for (initialization; 
        //     termination;
        //     increment/Decrement) {
        //     //your code goes here 
        // }
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        //below is the signature of the infinite for loop.
        //Which clearly shows that all the parameteres in for loop are optional
        // infinite loop
        // for ( ; ; ) {
        // // your code goes here
        // }

        //Enhanced for loop - for each loop
        //It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
        int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }

    }
}

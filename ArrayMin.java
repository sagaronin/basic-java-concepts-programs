class FindMinValue{
    FindMinValue(){
        System.out.println("Inside ctor");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int min=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
        }
        System.out.println("Min is - "+min);
    }
}
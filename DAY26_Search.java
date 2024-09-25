public class DAY26_Search{

    public static int linearsearch(int[] arr, int value_to_find){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value_to_find){
                return i ;
            }
        }
        return -1;
    }

    public static int binarysearch(int[] arr, int value){
        int start = 0;
        int end = arr.length -1;

        int middle = (start+end)/2;
        System.out.println(start +" "+ middle+" "+ end);
        while(arr[middle] != value && start<end){
            if(arr[middle]<value){
                start=middle+1;
            }
            else{
                end =middle-1;
            }
            middle=(start+end)/2;
            System.out.println(start +" "+ middle+" "+ end);
        }
        if(arr[middle]==value){
            return middle;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,6,8,9,10};
        // DAY26_LinearSearch search1 = new DAY26_LinearSearch();
        int found=DAY26_Search.linearsearch(arr1, 6);
        if(found!=-1){
            System.out.println("Element found at index : "+found);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

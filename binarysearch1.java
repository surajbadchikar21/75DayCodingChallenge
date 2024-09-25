public class binarysearch1 {
    public static void main(String arg[]){
        int[] arr = {7,8,913,14,18,19,20};
        int found = DAY26_Search.binarysearch(arr, 7);

        if(found==-1){
            System.out.println("Value not found");
        }
        else{
            System.out.println("Value found at index " +found);
        }
    }
}

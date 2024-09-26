public class day27BubbleSort{
    void bubblesort(int[] arr){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
    }

    void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
}
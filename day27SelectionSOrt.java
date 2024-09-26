public class day27SelectionSOrt {
    public void selectionsort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j; 
                }
            }
            if(minIndex !=i){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex] = temp;
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

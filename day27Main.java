public class day27Main {
    public static void main(String[] args) {
        int[] arr = {2,4,3,8,10,98,76,54,34,23};
        day27BubbleSort b1 = new day27BubbleSort();
        b1.bubblesort(arr);
        b1.printArray(arr);

        System.out.println("selection Sort");

        day27SelectionSOrt s1 = new day27SelectionSOrt();
        s1.selectionsort(arr);
        s1.printArray(arr);

    }
    
}

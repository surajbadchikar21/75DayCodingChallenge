public class Day1_Arrays {
    int[] arr=null;

    // Code for initialization of array to min value
    Day1_Arrays(int sizeofArray){
        arr = new int[sizeofArray];
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    //Insertion in Array 

    public void Insertion(int location, int valueToInsert)
    {
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]= valueToInsert;
                System.out.println("Succesfully Inserted");
            }
            else{
                System.out.println("Position Already filled");
            }
        }
        catch(Exception e){
            // e.printStackTrace();
            System.out.println("Index out of bound ");
        }
      
    }

    //Access
    public void access(int location){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                System.out.println("No value");
            }
            else{
                System.out.println(arr[location]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of Index");
        }
    }

    //traversal 
    public void traverse(){
        try{ 
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    catch(Exception e ){
        System.out.println(e);
    }
        

    }
    public void search(int value) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index " + i);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Value " + value + " not found");
        }
    }

    public void delete(int valueToDelete)
    { boolean found= false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==valueToDelete){
                arr[i]=Integer.MIN_VALUE;
                System.out.println("Element Deleted");
                found=true;
                return;
            }
        }
        if(found==false){
            System.out.println("value not found");
        }
    }
    

    public static void main(String[] args) {
        Day1_Arrays arrays = new Day1_Arrays(5);
        arrays.Insertion(0,10);
        arrays.Insertion(1,12);
        arrays.Insertion(2,11);
        arrays.access(0);
        arrays.traverse();
        arrays.search(12);  
        arrays.delete(12);
        arrays.traverse();
    }
}


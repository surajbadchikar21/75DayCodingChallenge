import java.util.Arrays;

public class Day1_2DArrays {
        int arr[][]=null;
        Day1_2DArrays(int row,int column){
            this.arr=new int[row][column];
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=Integer.MIN_VALUE;
                }
            }
        }

public void insertValue(int row,int col , int value){
 try{
    if(arr[row][col]==Integer.MIN_VALUE){
        arr[row][col]=value;
        System.out.println("Value Inserted");
    }
    else{
        System.out.println("value already exists");
    }
 }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Index out of bounds");

 }
}

public void accessValue(int row,int col){
    System.out.println("Accessing row : "+row+" and column : "+col);
    try{
        if(arr[row][col]==Integer.MIN_VALUE){
            System.out.println("No value at that Index");
        }
        else{
            System.out.println("Value is "+arr[row][col]);
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of Array Bounds ");
    }
}

public void traverse(){
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[0].length;col++){
            System.out.print(" "+ arr[row][col]);
        }
    }
}

public void search(int valueToSearch){
    boolean found=false;
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[0].length;col++){
            if(arr[row][col]==valueToSearch){
                System.out.println(" Value found at Index : "+row+ " "+ col);
                found=true;
                return;
            }
        }
    }
    if(found==false){
        System.out.println(" "+valueToSearch+" Not found in the 2D Array");
    }
}

public void delete(int row,int col){
    try{
        System.out.println("\n Succesfully deleted Value");
        arr[row][col]=Integer.MIN_VALUE;

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of Bounds");
    }
}


        public static void main(String[] args) {
            Day1_2DArrays arrays=new Day1_2DArrays(2, 2);
            System.out.println(Arrays.deepToString(arrays.arr));

            arrays.insertValue(0, 0, 1);
            arrays.insertValue(0, 1, 2);
            System.out.println("After insertion" + Arrays.deepToString(arrays.arr));
            arrays.accessValue(0, 1);

            arrays.search(1);
            arrays.delete(0, 0);
            System.out.println("After Deletion");
            arrays.traverse();
        }
}

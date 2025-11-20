package tree;

public class TreeByArray {
    Integer[] arr;

    public TreeByArray(int size){
        arr = new Integer[size];
    }

    public void addNodeAtIndex(int index, int data){
        int parentIndex = (index - 1) / 2;
        if(arr[parentIndex] == null){
            throw new RuntimeException("Parent is empty");
        }
        if(index > arr.length)
            throw new RuntimeException("Out of range");
        arr[index] = data;
    }
}

public class QuickSortExample {
    public int[] a = {7, 6, 10, 5, 9, 2, 1, 15, 7};
    
    public void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public int partition(int lb, int ub) {
        int pivot = a[lb];   
        int start = lb;
        int end = ub;
        
        while (start < end) {
            while (start <= ub && a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(start, end);
            }
        }
        
        swap(lb, end); 
        return end;    
    }
    
    public void quickSort(int lb, int ub) {
        if (lb < ub) {
            int loc = partition(lb, ub);  
            quickSort(lb, loc - 1);       
            quickSort(loc + 1, ub);       
        }
    }
  
    public void printArray() {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        QuickSortExample q = new QuickSortExample();
        
        System.out.println("Original array:");
        q.printArray();
        
        q.quickSort(0, q.a.length - 1);
        
        System.out.println("Sorted array:");
        q.printArray();
    }
}

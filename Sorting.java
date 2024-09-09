import java.util.*;

public class Sorting {
    public static void SelSor(int arr[] , int n ){
        
        for(int i =0;i<=n-2;i++){
            int mini = i ;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini =  j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i] ;
            arr[i] = temp ;
        }
    }
    public static void BubSor(int arr[], int n){
        int didswap = 0 ;
        for(int i = n-1 ;i>=0;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1] ;
                    arr[j+1] = arr[j] ;
                    arr[j] = temp ;
                    didswap = 1 ;
                }
            }
            if(didswap == 0){
                break;
            }
        }
    }
    public static void InsSor(int arr[]  , int n){
        for(int i = 0;i<=n-1;i++){
            int j = i ;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j] ;
                arr[j]= temp ;
                j--;
            }
        }
    }
    public static void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;
    
        int L[] = new int[n1];
        int M[] = new int[n2];
    
        for (int i = 0; i < n1; i++)
          L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
          M[j] = array[q + 1 + j];
    
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
            array[k] = L[i];
            i++;
          } else {
            array[k] = M[j];
            j++;
          }
          k++;
        }
            while (i < n1) {
          array[k] = L[i];
          i++;
          k++;
        }
        while (j < n2) {
          array[k] = M[j];
          j++;
          k++;
        }
    }
    public static void mergeSo(int arr[], int left, int right) {
        if (left < right) {
    
          int mid = (left + right) / 2;
          mergeSo(arr, left, mid);
          mergeSo(arr, mid + 1, right);
          merge(arr, left, mid, right);
        }
    }
    public static void QuickSor(int arr[] , int low , int high){
        if(low<high){
            int pivotIndex = Partition(arr,low,high);

            QuickSor(arr, low, pivotIndex-1);
            QuickSor(arr, pivotIndex+1, high);
        }
    }
    public static int Partition(int arr[] , int low , int high){
        int pivot = arr[low];
        int i = low+1 ;
        int j = high ;
        while(i<=j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j ;
        
    }
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        //SelSor(arr,n);
        //BubSor(arr , n);
        //InsSor(arr , n );
        //mergeSo(arr,0,n-1);
        QuickSor(arr, 0, n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

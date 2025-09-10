import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // int min=arr[n-1]-arr[0];

        while(k-->0){
            int minInd =0,maxInd =0;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[minInd])
                    minInd =i;
                if(arr[i]>arr[maxInd])
                    maxInd=i;
            }
            if(arr[minInd] == arr[maxInd])
                break;
            arr[minInd]++;
            arr[maxInd]--;
        }
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println(max-min);
    }
}
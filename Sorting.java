import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []a={6,8,9,0,4};
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         int temp =0;
        //         if (a[i]>a[j]) {
        //             temp = a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }else{
        //             break;
        //         }
        //     }
        //     System.out.println(a[i]+" ");
        // }
        Arrays.sort(a);

        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(a));
    }
    
}

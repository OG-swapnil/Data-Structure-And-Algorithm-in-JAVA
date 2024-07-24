// import java.util.Scanner;

public class Merge {
    public static void Conquer(int a[],int si,int mid,int ei){
        int merger[] = new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(a[idx1]<=a[idx2]){
                merger[x++]=a[idx1++];
            }else{
                merger[x++]=a[idx2++];
            }
        }

        while(idx1<=mid){
            merger[x++]=a[idx1++];
        }

        while(idx2<=ei){
            merger[x++]=a[idx2++];
        }
        for(int i=0,j=si;i<merger.length;i++,j++){
            a[j]=merger[i];

        }


    }

    public static void Divide(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        Divide(a,si,mid);
        Divide(a,mid+1,ei);
        Conquer(a,si,mid,ei);
        
    }
    public static void main(String[] args) {
        int a[]={6, 3, 9, 5, 2, 8};
        int n=a.length;
        Divide(a,0,n-1);
    }
    
}

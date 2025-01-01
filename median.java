package array;

import java.util.Arrays;

class median {
    public static void main(String[] args) {
        int[]op1={5,10,3};
        int[]op2={2,4,1};

        System.out.println("median is : "+f(op1,op2));


    }
    public static double f(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n= nums2.length;

        int total=m+n;

        int[]op=new int[total];

        int c=0;
        for(int i=0;i<m;i++)
        {
            op[c]=nums1[i];
            c++;
        }
        for(int i=0;i<n;i++)
        {
            op[c]=nums2[i];
            c++;
        }

        Arrays.sort(op);
        System.out.println(Arrays.toString(op));
        int o=total/2;

        System.out.println(total);
        if(total%2==0)
        {
            double num = op[o]+op[o-1];
            return num/2;
        }
        else
        {
            return op[o];
        }
    }
}
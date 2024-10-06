package Advanced;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod=998244353;
        int n = sc.nextInt();
        long []a = new long [n];
        for (int i = 0; i < n; i++) {
            long a1= sc.nextLong();
            a[i]=a1*(i+1)*(n-i);
        }
        Integer[] b = new Integer[n];
        for (int i = 0; i <n ; i++) {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        long ans=0;
        for (int i = 0; i < n; i++) {
         ans=ans+(a[i]%mod)*b[i];
         ans=ans%mod;
        }
        System.out.println((int) ans);
    }
}

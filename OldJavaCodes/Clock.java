package college.CAP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter hour : ");
//        double h=sc.nextDouble();
//        System.out.print("Enter minute : ");
//        double m=sc.nextDouble();
//
//        double dOfHour = ((h*30)+(m/2));
//                double dOfMinute = m*6;
//
//                double diff = dOfMinute-dOfHour;
//
//                if(diff<0)
//                {
//                    diff+=360;
//                }
//
        int co=1;
        double h=0.0,m=0.0,s=0.0;
        while(h<12)
        {
            m=0;
            while(m<=59)
            {
                s=0;
                while(s<=59)
                {
                    double dOfHour = ((h*30)+(m/2));
                    double dOfMinute = ((m*6)+(s*0.1));

                    double diff = dOfMinute-dOfHour;

                    if(diff<0)
                    {
                        diff+=360;
                    }

                    if(diff==90||diff==270)
                    {
                    System.out.println(co+") "+h+":"+m+":"+s+"  :: digrre : "+diff);
                    co++;
                    }
                    s++;
                }


                m++;
            }
            h++;
            System.out.println();

        }

//        System.out.println("Degree is : "+diff);

    }


}

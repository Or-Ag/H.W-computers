1.   int a=3,b=2,c=1;
        double x=1.3,y=2.5,z=8.5;
        a=y+2;    //ללא שינוי//              
2.   int a=3,b=2,c=1;
       Double x=1.3,y=2.5,z=8.5;
       a=y+2;         //doesn't work. A = int, Y = double | //

3.   int a=3,b=2,c=1;
       double x=1.3,y=2.5,z=8.5;
       a=a-2; //עובד תקין//

4.   int a=3,b=2,c=1;
       double x=1.3,y=2.5,z=8.5;
       a\b=z; //a,b = int. z = double//

5.   int a=3,b=2,c=1;
       double x=1.3,y=2.5,z=8.5;
       y=c-5; //עובד תקין//

6.   int a=3,b=2,c=1;
       double x=1.3,y=2.5,z=8.5;
       b=c/2; //עובד תקין//

7.    int a=3,b=2,c=1;
        double x=1.3,y=2.5,z=8.5;
        c=a*b; //עובד תקין//


8.     int a=3,b=2,c=1;
         double x=1.3,y=2.5,z=8.5;
         b=z*c; //b,c = int. z = double//

9.     int a=3,b=2,c=1;
         double x=1.3,y=2.5,z=8.5;
         c=x%y; //c = int, x,y = double//
//
//
//
//
//
//
//

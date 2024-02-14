class test{
    public static void main(String[] args)
    {
        int a,b,c;
        a=16;
        b=13;
        c=14;
       // The code is checking if the value of variable `a` is greater than or equal to both `b` and
       // `c`. If this condition is true, it means that `a` is the biggest number among the three
       // variables. If the condition is true, it will print the message "a is the biggest number is"
       // followed by the value of `a`.
        if(a>=b && a>=c)
        {
            System.out.println(" a is the biggest number is " +a );
        }
       // The `else if(b>=a && b>=c)` block is checking if the value of variable `b` is greater than or
       // equal to both `a` and `c`. If this condition is true, it means that `b` is the biggest number
       // among the three variables. If the condition is true, it will print the message "b is the
       // biggest number is" followed by the value of `b`.
        else if(b>=a && b>=c)
        {
            System.out.println(" b isthe biggest number is " +b);

        }
  // The `else` block is executed when none of the previous conditions (`a>=b && a>=c` and `b>=a &&
  // b>=c`) are true. This means that the value of variable `c` is the largest among the three
  // variables `a`, `b`, and `c`. The code inside the `else` block will print the message "c is the
  // biggest number is" followed by the value of `c`.
  else{
    System.out.println(" c is the biggest number is " +c);

        }
    }
}

public class PrimeNo{
    public static void main(String[] args){
        int l,u,n,i;
        System.out.println("Display the number of prime numbers");
        DataInputStream y=new DataInputStream(System.in);
        System.out.println("Enter lower and upper limit");
        l=Integer.parseInt(y.readLine());
        u=Integer.parseInt(y.readLine());
        if(l<2)l=2;
        System.out.println("The prime numbers between "+l+"and"+u+"are");
        for(n=l;n<=u;n++)
        {
            byte flag=1;
            for(i=2;i<=(int)n/2;n++)
            {
                if(n%1==0)
                {
                    flag=0;
                    break;
                }
            }
        }
            if(flag==1)
            System.out.println(n);
                }
            }


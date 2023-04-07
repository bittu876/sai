class amstrong{
  public static void main(String x[]){
      int num,rev,sum,n;
       num=153;
       n=num;
sum=0;
    while(n>0){
rev=n%10;
 sum=sum+rev*rev*rev;    
n=n/10;
       
      }
  if(num==sum)
   System.out.println("num is a amstrong");
  else
    System.out.println("num is not amstrong");

}
}
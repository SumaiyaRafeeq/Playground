#include<stdio.h>
int main()
{
  long int n,sum=0,rem,i=1;
  scanf("%ld",&n);
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem*i;
    i=i*2;
    n=n/10;
  }
  printf("%lo",sum);
  return 0;
}
  


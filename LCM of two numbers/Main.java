#include<stdio.h>
int main()
{
  int n1,n2,min,fact,lcm,hcf;
  scanf("%d%d",&n1,&n2);
  (min=n1<n2?n1:n2);
  for(fact=1;fact<=min;fact++)
  {
    if(n1%fact==0&&n2%fact==0)
    {
      hcf=fact;
      lcm=(n1*n2)/hcf;
    }
  }
  printf("%d",lcm);
  return 0;
}
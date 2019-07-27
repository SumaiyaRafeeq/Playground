// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,min,fact,hcf;
  scanf("%d%d",&n1,&n2);
  (min=n1<n2?n1:n2);
  for(fact=1;fact<=min;fact++)
  {
    if(n1%fact==0&&n2%fact==0)
    {
      hcf=fact;
    }
  }
  printf("%d",hcf);
  return 0;
}
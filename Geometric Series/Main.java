#include<stdio.h>
#include<math.h>
int main()
{
  int a,r,ts1,ts2,n;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1;r=2;
    ts1=(n+1)/2;
    n = a* pow(r,ts1-1);
    printf("%d",n);
  }
  else
  {
        a=1;r=3;
    ts2=n/2;
    n = a* pow(r,ts2-1);
    printf("%d",n);
  }
  return 0;
}
  
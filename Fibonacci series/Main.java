#include<stdio.h>
int main()
{
  int n,a=0,b=1,temp,c;
  scanf("%d",&n);
  for(c=0;c<n;c++)
  {
    if(c<=1)
      temp=c;
    else
    {
    temp=a+b;
    a=b;
    b=temp;
  }
  printf("%d ",temp);
  }
  return 0;
}
  
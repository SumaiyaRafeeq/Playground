#include<stdio.h>

int main()
{
  int a,b,c,d,small;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  small=(a<b)?(a<c)?(a<d)?a:d:(c<d)?c:d:(b<c)?(b<d)?b:d:(c<d)?c:d;
  printf("%d",small);
}
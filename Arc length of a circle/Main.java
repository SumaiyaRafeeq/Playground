#include<stdio.h>
int main()
{
  float c,r,d;
  scanf("%f%f",&d,&r);
  c=3.14*2*r*(d/360);
  printf("%.2f",c);
  return 0;
}
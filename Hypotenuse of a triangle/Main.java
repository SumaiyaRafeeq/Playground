#include<stdio.h>
int main()
{
  float a,b;
  double c;
  scanf("%f%f",&a,&b) ;
  c=sqrt((a*a) +(b*b)) ;
  printf("%.2lf",c);
  return 0;
}
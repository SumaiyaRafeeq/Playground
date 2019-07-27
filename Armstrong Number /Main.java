#include <stdio.h>
int main() {
	int t,n,sum=0,r;
    scanf("%d",&n);
     t=n;
  while(n>0){
    r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
  }
  if(t==sum){
    printf("Armstrong Number");
  }
  else{
    printf("Not an Armstrong Number");
  }
	return 0;
}
#include<stdio.h>

int main()
{
  char a[100];
  int i,word=0;
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
  return 0;
         
  
}
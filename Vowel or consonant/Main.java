#include<stdio.h>
int main()
{
  char s;
  scanf("%c",&s);
  if((s=='a'||s=='e'||s=='i'||s=='o'||s=='u')||(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'))
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}
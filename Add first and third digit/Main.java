#include<stdio.h>
int main()
{
  int num,sum,digits,firstdigit,lastdigit;
  sum=0;
  scanf("%d",&num);
  lastdigit=num%10;
  digits=(int)log10(num);
  firstdigit=(int)(num/pow(10,digits));
  sum=firstdigit+lastdigit;
  printf("%d",sum);
  return 0;
}
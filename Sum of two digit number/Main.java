#include<stdio.h>
int main()
{
  int a,b,sum=0,rem;
  scanf("%d",&a);
  b=a;
  while(b!=0)
  {
    rem=b%10;
    sum=rem+sum;
    b=b/10;
  }
    printf("%d",sum);
  return 0;
}
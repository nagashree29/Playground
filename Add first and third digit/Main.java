#include<stdio.h>
int main()
{
  int sum=0,f,l,num;
  scanf("%d", &num);
  f=num/100;
  l=num%10;
  sum=f+l;
  printf("%d",sum);
  //Type your code here
  return 0;
}
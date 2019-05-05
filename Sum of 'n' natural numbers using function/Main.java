#include<stdio.h>
int sumof(int n)
{
  int sum = 0;
  int i;
  for(i = 0; i <= n; i++)
  {
    sum = sum + i;
  }
  return sum;
}

int main()
{
  int num, s;
  scanf("%d", &num);
  s = sumof(num);
  printf("%d", s);
  	return 0;
}
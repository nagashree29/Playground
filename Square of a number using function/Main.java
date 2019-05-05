#include<stdio.h>
int square(int num)
{
  int squares;
  squares = num*num;
  return squares;
}
int main() 
{
  int n, s;
  scanf("%d", &n);
  s = square(n);
  printf("%d", s);
   return 0;
}
#include <stdio.h>
int main() 
{
  int n, second;
  scanf("%d", &n);
  while( n >= 100)
  {
    n /= 10;
  }
  second = n % 10;
  printf("%d", second);
	return 0;
}
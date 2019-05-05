#include <stdio.h>
int main()
{
  int i, n, factors = 0;
  scanf("%d", &n);
  for( i = 1; i <= n; i++)
  {
    factors = n % i;
    if( factors == 0 )
      printf("%d\n", i);
  }
	return 0;
}



#include <stdio.h>
int main() 
{
  int n, m = 3, count;
  scanf("%d", &n);
  for(count = 1; count <= n; count ++)
  {
    printf("%d", count);
    if((count % m == 0) && (count != n))
    {
      printf(",");
    }
  }
	return 0;
}
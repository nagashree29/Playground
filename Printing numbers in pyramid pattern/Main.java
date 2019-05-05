#include <stdio.h>
int main() 
{
  int n, row, col, space, count = 1;
  scanf("%d", &n);
  for(row = 1; row <= n; row ++)
  {
    for(space = 1; space <= (n-row); space ++)
    {
      printf(" ");
    }
    for(col = 1; col <= row; col ++)
    {
      printf("%d ", count);
      count ++;
    }
    printf("\n");
  }
	return 0;
}
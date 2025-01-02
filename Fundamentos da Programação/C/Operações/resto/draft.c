#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d %d", &a, &b);
    int quociente = a / b;
    int resto = a % b;
    printf("%d %d\n", quociente, resto);
    return 0;
}


#include <stdio.h>

    int mmc(int n, int m) {
        int a = n, b = m, resto = 100;
        
        while(resto > 0) {
            resto = a % b;
            a = b; 
            b = resto;
        }
        
        return (n * m) / a;
    }
    
    int main() {
        int n, m;
        scanf("%d %d", &n, &m);
        printf("%d\n", mmc(n, m));
    }
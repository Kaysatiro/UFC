#include <stdio.h>
    int main() {
        int n, ajuste = 0;
        scanf("%d", &n);
        int vetor[n];
        
        for(int i = 0; i < n; i++) {
            scanf("%d", &vetor[i]);
        }
        
        for(int i = 1; i < n; i++) {
            if(vetor[i-1] > vetor[i]) {
                ajuste++;
            }
        }
        
        if(ajuste > 0) {
            printf("precisa de ajuste\n");
        }
        else {
            printf("ok\n");
        }
    }
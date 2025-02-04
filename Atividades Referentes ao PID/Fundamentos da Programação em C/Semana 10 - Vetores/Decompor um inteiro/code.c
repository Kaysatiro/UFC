#include <stdio.h>
    int main() {
        int valor, i = 0, vetor[8];
        scanf("%d", &valor);
        
        while(valor > 0) {
            vetor[i] = valor % 10;
            valor = valor / 10;
            i++;
        }
        
        for(int k = i-1; k > 0; k--) {
            printf("%d ", vetor[k]);
        }
        
        printf("%d", vetor[0]);
        printf("\n");
    }
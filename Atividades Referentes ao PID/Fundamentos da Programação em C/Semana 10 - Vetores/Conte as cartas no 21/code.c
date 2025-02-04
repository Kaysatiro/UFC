#include <stdio.h>
    int main() {
        int q, soma = 0, as = 0;
        scanf("%d", &q);
        int vetor[q];
        
        for(int i = 0; i < q; i++) {
            scanf("%d", &vetor[i]);
            
            
            if(vetor[i] == 11 || vetor[i] == 12 || vetor[i] == 13) {
                soma += 10;
            }
            else if(vetor[i] == 1) {
                soma += 11;
                as++;
            }
            else {
                soma += vetor[i];
            }
            
            if(soma > 21 && as > 0) {
                soma -= 10;
                as--;
            }
        }
        
        printf("%d\n", soma);
    }
#include <stdio.h>
    int main() {
        int qtd;
        scanf("%d", &qtd);
        
        for(int i = 0; i< qtd; i++) {
            int vet, grito;
            scanf("%d %d", &vet, &grito);
            int vetor[vet];
            
            for(int k = 0; k < vet; k++) {
                scanf("%d", &vetor[k]);
            }
            
            for(int j = 0; j < vet; j++) {
                if(vetor[j] == grito) {
                    if(j > 0 && j < vet-1) {
                    vetor[j-1] *= -1;
                    vetor[j+1] *= -1;
                    }
                    else if(j == 0) {
                        vetor[j+1] *= -1;
                    }
                    else if(j == vet-1) {
                        vetor[j-1] *= -1;
                    }
                }
            }
            
            printf("[");
            for(int o = 0; o < vet; o++) {
                if(o == vet-1) {
                    printf("%d", vetor[o]);
                }
                else {
                printf("%d ", vetor[o]);
                }
            }
            printf("]\n");
        }
    }
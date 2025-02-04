#include <stdio.h>

    double media(double vet[], int q) {
        double soma = 0;
        for(int i = 0; i < q; i++) {
            soma += vet[i];
        }
        return soma/q;
    }
    
    int main() {
        int q;
        scanf("%d", &q);
        double vetor[q];
        
        for(int i = 0; i < q; i++) {
            scanf("%lf", &vetor[i]);
        }
        
        printf("%.2lf\n", media(vetor, q));
        
        for(int i = 0; i < q-1; i++) {
            if(vetor[i] > media(vetor, q)) {
                printf("G ");
            }
            else if(vetor[i] < media(vetor, q)) {
                printf("P ");
            }
            else {
                printf("M ");
            }
        }
        
        if(vetor[q-1] > media(vetor, q)) {
                printf("G\n");
            }
            else if(vetor[q-1] < media(vetor, q)) {
                printf("P\n");
            }
            else {
                printf("M\n");
            }
    }
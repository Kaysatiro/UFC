#include <stdio.h>
    int main() {
        int n, li, ls, cont = 0;
        scanf("%d %d %d", &n, &li, &ls);
        int vetor[n];
        
        for(int i = 0; i < n; i++) {
            scanf("%d", &vetor[i]);
            
            for(int k = li; k <= ls; k++) {
                if(vetor[i] == k) {
                    cont++;
                }
            }
        }
        
        printf("%d\n", cont);
    }
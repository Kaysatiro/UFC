#include <stdio.h>

    int main() {
        int t, sith = 0, jedi = 0;
        scanf("%d", &t);
        int vetor[t];
        
        for(int i = 0; i < t; i++) {
            scanf("%d", &vetor[i]);
        }
        
        for(int i = 0; i < t; i++) {
            if(i < t/2) {
                jedi += vetor[i];
            }
            else {
                sith += vetor[i];
            }
        }
        
        if(jedi == sith) {
            printf("Empate\n");
        }
        else if(jedi < sith) {
            printf("Sith\n");
        }
        else {
            printf("Jedi\n");
        }
    }
#include <stdio.h>

int busca_indice(int v[], int n, int alvo){
    for(int i = 0; i < n; i++) {
	if(v[i]==alvo) {
		return i;
	}
    }
	return -1;
}

// Nao altere o codigo abaixo
int main(){
    int v[100], n, x;
    scanf("%d %d", &n, &x);
    
    for(int i = 0; i < n; i++){
        scanf("%d", &v[i]);
    }
    
    printf("%d\n", busca_indice(v, n, x));
}
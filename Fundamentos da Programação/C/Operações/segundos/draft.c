#include <stdio.h>

int main() {
    int segundos;
    scanf("%d", &segundos);

    int horas, min, resto;
    horas = segundos / 3600;
    resto = segundos % 3600;
    min = resto / 60;
    resto = resto % 60;
    segundos = resto;

    printf("%d:%d:%d\n", horas, min, segundos);
    return 0;
}


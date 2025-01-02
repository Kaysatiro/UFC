#include <stdio.h>

int main() {
    int q1, q2, q3;
    float v1, v2, v3;
    float dinheiro;

    scanf("%d %d %d %f %f %f %f", &q1, &q2, &q3, &v1, &v2, &v3, &dinheiro);
    float total = (dinheiro - ((q1 * v1) + (q2 * v2) + (q3 * v3)));

    printf("%.2f\n", total);
    return 0;
}


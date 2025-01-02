#include <stdio.h>

int main() {
    double celcius;
    scanf("%lf", &celcius);

    double f = 1.8 * celcius + 32;
    printf("%lf\n", f);
    return 0;
}


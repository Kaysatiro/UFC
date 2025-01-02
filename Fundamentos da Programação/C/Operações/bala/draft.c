#include <stdio.h>
#include <math.h>

int main() {
    double xa, xb, ya, yb;
    scanf("%lf %lf %lf %lf", &xa, &ya, &xb, &yb);

    double d = sqrt((pow(xb - xa, 2)) + (pow(yb - ya, 2)));

    printf("%.2lf\n", d);
    return 0;
}

//-4 - 1 = -5
//12 - 8.2 = 3.8
//-5,2 = 25
//3.8,2 = 14.44
//25 + 14.44 = 39.44
//6,28

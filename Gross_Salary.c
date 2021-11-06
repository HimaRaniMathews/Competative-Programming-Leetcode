#include <stdio.h>

int main(void){
    int T;
    scanf("%d",&T);
    while(T--){
        int sal;
        scanf("%d", &sal);
        if(sal < 1500){
            float HRA = (sal * (10.0))/100;
            float DA = (sal * (90.0))/100;
            printf("%.2f\n", sal + HRA + DA);
        }
        else{
            if(sal >= 1500){
                float HRA = 500;
                float DA = (sal * 98.0)/100;
                printf("%.2f\n", sal + HRA + DA);
            }
        }
    }
return 0;
}


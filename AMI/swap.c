#include<stdio.h>

int main(){

    int a,b;
    printf("Please enter first and second number\n");
    scanf("%d %d",&a,&b);
    printf("Before swap a=%d and b=%d",a,b);
    printf("\n");
   /* a=a^b;
    b=a^b;
    a=a^b;
*/
a=a+b;
b=a-b;
a=a-b;
 printf("After swap a=%d and b=%d",a,b);

}
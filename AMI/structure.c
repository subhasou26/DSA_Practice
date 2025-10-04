#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct car{
    char *engine;
    char *fuel_type;
    int fuel_tank;
    int seeting;
    float milage;
} ;
int main(){
    //  car c;
    // c.engine="toyota";
    // c.fuel_type="Petrol";
    // c.fuel_tank=0;
    // printf("%s\n",c.engine);
    // car c1={.engine="yoyota",.fuel_tank=10,.milage=20};
    // printf("%s",c1.engine);
    // char *str="subhadip";
    // char str1[]="subhadip";
    // //str[1]='i';
    // str1[1]='p';
    // printf("%c\n",str[1]);
    // printf("%c",str1[1]);
struct car c1[2];
for(int i=0;i<2;i++){
    printf("Please enter the size of engine name for car %d: ", i);
    int size;
    scanf("%d", &size);
    
    // Allocate memory for engine based on the input size
    c1[i].engine = (char*)malloc((size + 1) * sizeof(char)); // +1 for null terminator
    
    if(c1[i].engine == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }
    
    printf("Please enter the car %d engine name: ", i);
    scanf("%s", c1[i].engine);
}

// Print the engines
for(int i=0;i<2;i++){
    printf("Car %d engine: %s\n", i, c1[i].engine);
}

// Free allocated memory
for(int i=0;i<2;i++){
    free(c1[i].engine);
}
    return 0;
}
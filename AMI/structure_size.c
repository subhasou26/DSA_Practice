#include<stdio.h>
#include<string.h>
struct student{
    int rollNo;
    char name[10];
    char class[5];
};

union employee{
    int rollNo;
    char name[10];
    char class[10];
};

int main(){

    struct student s1={10,"Subhadip","CSE"};
    union employee e1;
    strcpy(e1.name,"subhadip");
    printf("%d eno\n",e1.rollNo);
    printf("%s name\n",e1.name);
    printf("%d size of the union\n",sizeof(e1));
    s1.rollNo=20;
    strcpy(s1.name,"Saheli");
    
    printf("%s\n",s1.name);
    printf("%d\n",s1.rollNo);
    struct student s2;
   
    struct student *s3=NULL;
    s3++;
    int n=(char*)s3-(char*)NULL;
    printf("%d",n);

    return 0;
}
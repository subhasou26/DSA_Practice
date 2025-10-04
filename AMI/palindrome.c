#include <stdio.h>
#include <string.h>
int isPalindrome(char str[]){
    int n=0;
   // int n=strlen(str);
    while(str[n]!='\0'){
        n++;
    }
    printf("%d size of string \n",n);
    int s=0,e=n-1;
    while(s<=e){
        if(str[s]!=str[e]){
            return 0;
        }
        s++;e--;
    }
    return 1;
}

int main(){
    char str[20];
    printf("Please input your string to check palindrome\n");
    scanf("%[^\n]",&str);
    if(isPalindrome(str)==1){
        printf("Your %s string is palindrome\n",str);
    }
    else{
        printf("Your %s is not palindrome\n",str);
    }
   // printf("%s",str[60]);
   int res=strcmp("hello","elloh");
   printf("%d",res);
    return 0;
}
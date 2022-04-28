#include<iostream>
#include<stdio.h>

int main(){
    int x, y, z;

    std::cin>>x>>y>>z;
    int d1 = y-x;
    int d2 = z-y;
    int a = d2-1;
    int b = d1-1;
    
    if(d1 < d2){
         std::cout<<a;
    } else {
         std::cout<<b;
    }
    return 0;  
}
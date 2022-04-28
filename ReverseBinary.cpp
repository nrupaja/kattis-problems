#include <iostream>
#include <stdio.h>

int main()
{
    int a, b = 0;
    std::cin>>a;
    while(a){
        b = (b << 1) | (a & 1);
        a >>= 1;
    }
    std::cout<<b;
    return 0;
}
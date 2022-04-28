#include <iostream>
#include <stdio.h>
#include <map>

int main(){
    int n;
    for(int i = 1; std::cin >> n; ++i){
        long min = 1000001, max = -1000001;
        for(int i = 0; i < n; ++i){
            long a;
            std::cin >> a;
            min = a < min ? a : min;
            max = a > max ? a : max;
        }
        int difference = max - min;
        std::cout<<"Case "<<i<<": "<<min<<" "<<max<<" "<<difference<<"\n";
    }

    return 0;
}
#include <iostream>

int main(){

  int bobAge, bobRetAge, bobSave, aliceAge, aliceSave, aliceRetAge, aliceTotal;
  int aliceC = 0;

  std::cin >> bobAge >> bobRetAge>> bobSave >> aliceAge >> aliceSave;

  int bobAgeDiff = bobRetAge - bobAge;
  int bobTotal = bobAgeDiff * bobSave;

  while(aliceTotal <= bobTotal){
    aliceTotal += aliceSave;
    aliceC++;
  }

  std::cout<< aliceC + aliceAge;

  return 0;
}

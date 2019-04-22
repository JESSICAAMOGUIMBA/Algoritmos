#include <iostream>
using namespace std;

int main() {
  float sueldo;
  cout<<"\n Ingrese su Sueldo mensual: ";
  cin>>sueldo;
  if(sueldo>0 && sueldo<=200){
    cout<<"\n Su categoria es : 4";
    cout<<"\n Su sueldo aumentara en un 7%";
    sueldo=sueldo+(sueldo*0.07);
    cout<<"\n Su nuevo sueldo es: $"<<sueldo;
  }else if(sueldo>200 && sueldo<=400){
    cout<<"\n Su categoria es : 3";
    cout<<"\n Su sueldo aumentara en un 8%";
    sueldo=sueldo+(sueldo*0.08);
    cout<<"\n Su nuevo sueldo es: $"<<sueldo;
  }else if(sueldo>400 && sueldo<=600){
    cout<<"\n Su categoria es : 2";
    cout<<"\n Su sueldo aumentara en un 10%";
    sueldo=sueldo+(sueldo*0.10);
    cout<<"\n Su nuevo sueldo es: $"<<sueldo;
    }else if(sueldo>600 ){
    cout<<"\n Su categoria es : 1";
    cout<<"\n Su sueldo aumentara en un 15%";
    sueldo=sueldo+(sueldo*0.15);
    cout<<"\n Su nuevo sueldo es: $"<<sueldo;
    }
    cout<<"\n\n Fin del programa";
}

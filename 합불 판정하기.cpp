#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int a, b, c;
    

    cin >> a >> b ;
    cout << "필기점수 :" << a<<endl;
    cout << "실기점수 :" << b<<endl;
    cout << "평균 :" << (a+b)/2<<endl ;

    if ((a + b) / 2 >= 80)
    {
        if (a >= 70 && b >= 70)
        {
            cout << "판정: 합격" << endl;

        }
        else
        {
            cout << "판정: 과락" << endl;
        }
    }
    else
    {
        cout << "판정: 불합격" << endl;
    }


}
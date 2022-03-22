#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int x1, x2, x3;
    cin >> x1 >> x2 >> x3;

    cout << "x1:" <<x1<< endl;
    cout << "x2:" << x2 << endl;
    cout << "x3:" << x3 << endl;
    
    if (x1 > x2)
    {
        if (x1 > x3)
        {
            cout << "The maximum is " << x1 << endl;
        }
        else {
            cout << "The maximum is " << x3 << endl;
        }
    }
    else if(x2>x3)
    {
        cout << "The maximum is " << x2 << endl;
    }
    else
        cout << "The maximum is " << x3 << endl;
      


          
}
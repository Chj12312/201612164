#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    
    int x;
    int y;
    cin >> x >> y;

    if (x > 0 && y > 0)
    {
        cout << "(" <<x<<","<<y << ")는 1사분면" << endl;
    }
    


    else  if (x < 0 && y > 0)
    {
        cout << "(" << x << "," << y << ")는 2사분면" << endl;
    }

    else  if (x < 0 && y < 0)
    {
        cout << "(" << x << "," << y << ")는 3사분면" << endl;
    }
    else  if (x > 0 && y < 0)
    {
        cout << "(" << x << "," << y << ")는 4사분면" << endl;
    }


    else { cout << "(" << x << "," << y << ")는 축에 있습니다." << endl; }

}
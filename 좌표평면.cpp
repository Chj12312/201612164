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
        cout << "(" <<x<<","<<y << ")�� 1��и�" << endl;
    }
    


    else  if (x < 0 && y > 0)
    {
        cout << "(" << x << "," << y << ")�� 2��и�" << endl;
    }

    else  if (x < 0 && y < 0)
    {
        cout << "(" << x << "," << y << ")�� 3��и�" << endl;
    }
    else  if (x > 0 && y < 0)
    {
        cout << "(" << x << "," << y << ")�� 4��и�" << endl;
    }


    else { cout << "(" << x << "," << y << ")�� �࿡ �ֽ��ϴ�." << endl; }

}
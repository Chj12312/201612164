#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int a, b, c;
    

    cin >> a >> b ;
    cout << "�ʱ����� :" << a<<endl;
    cout << "�Ǳ����� :" << b<<endl;
    cout << "��� :" << (a+b)/2<<endl ;

    if ((a + b) / 2 >= 80)
    {
        if (a >= 70 && b >= 70)
        {
            cout << "����: �հ�" << endl;

        }
        else
        {
            cout << "����: ����" << endl;
        }
    }
    else
    {
        cout << "����: ���հ�" << endl;
    }


}
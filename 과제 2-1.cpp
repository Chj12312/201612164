#include <iostream>
#include <math.h>
using namespace std;


int gcd(int a, int b) {

	int tmp;
	tmp = a % b;
	if (tmp == 0)
		return b;
	else
		gcd(b, tmp);

}	



int main()
{
	int x,y;
	int r = 0;

	cin >> x >> y;
	cout << "2���� ������ �Է��ϼ���." << endl;
	cout << "n1 : " << x << "\n";
	cout << "n2 : " << y << "\n";

	
	if (x > y)
		r = gcd(x, y);


	else
		r = gcd(y, x);

	

	cout << x << "(��)�� " << y << "�� �ִ������� " << r << "�Դϴ�.";
















}

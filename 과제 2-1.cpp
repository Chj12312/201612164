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
	cout << "2개의 정수를 입력하세요." << endl;
	cout << "n1 : " << x << "\n";
	cout << "n2 : " << y << "\n";

	
	if (x > y)
		r = gcd(x, y);


	else
		r = gcd(y, x);

	

	cout << x << "(와)과 " << y << "의 최대공약수는 " << r << "입니다.";
















}

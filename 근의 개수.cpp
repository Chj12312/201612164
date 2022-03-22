#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int a, b, c,d ;
	cin >> a >> b >> c;

	if (a == 0) {

		d = 1;
		if (a == 0 && b == 0) { d = 0; }



	}
	
	
	else if (b * b - 4 * a * c < 0) { d = 0; }
	else if (b * b - 4 * a * c == 0) { d = 1; }
	else if (b * b - 4 * a * c > 0) { d = 2; }
	else d = 0
		;











	cout << a << "*x2 + " << b << "*x + " << c << " = 0 방정식의 근의 개수는 " << d << " 개다." << endl;

   
}
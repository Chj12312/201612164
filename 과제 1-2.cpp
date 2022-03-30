#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int a, b,c ;
	int answer = 0;

	cin >> a >> b;
	cout << "정수1 : " << a << endl;
	cout << "정수2 : " << b << endl;
	cout << "***************" << endl;
	
	
	
	
	
	
	cout << a << "**" << b << " = " << pow(a,b) << "\n";

	c = pow(a, b);
	while (c >= 1)
	{
		answer = answer + c % 10;
		c = c / 10;



		

	}



	cout << "자릿수 합 : " << answer;
	








}

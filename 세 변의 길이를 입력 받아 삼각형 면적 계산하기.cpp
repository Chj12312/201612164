#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int a, b, c;
	double  s;
	cin >> a >> b >> c; 
	cout << "1st side length :" <<a<<endl;
	cout << "2nd side length :" << b << endl;
	cout << "3rd side length :" << c << endl;

	s = (a + b + c) / 2;

	

	cout << "Area of triangle:" << sqrt(s*(s-a)*(s-b)*(s-c)) << endl;





}
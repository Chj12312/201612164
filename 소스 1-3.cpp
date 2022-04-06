#include <iostream>
#include<cmath>
using namespace std;



int main() {

	int size[9][2] = {3,1,6,3,4,4,7,6,2,7,0,5,2,3,1,2};

	double a=0;
	
	for (int i = 0; i < 9;i++) {


		double s =
			sqrt(pow(size[i + 1][i] - size[i][i], 2) +
				pow(size[i + 1][i + 1] - size[i][i + 1], 2));



		a += s;

	}


	

	cout << "ตัทน : " << a << endl;










}


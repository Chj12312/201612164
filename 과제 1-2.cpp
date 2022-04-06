#include <iostream>

using namespace std;



int main() {



	int size[6][2] = { 1,2,-4,2,-2,8,5,3,11,0,5,-3 };

	int i, j, k;

	double mid1 = 0;

	double sum1 = 0;

	double mid2 = 0;

	double sum2 = 0;





	for (int i = 0;i < 6;i++) {

		sum1 += size[i][0];

		mid1 = sum1 / 6;

	}

	for (int j = 0;j < 6;j++) {

		sum2 += size[j][1];

		mid2 = sum2 / 6;

	}

	cout << "중점은(" << mid1 << ", " << mid2 << ") 이다." << endl;


}


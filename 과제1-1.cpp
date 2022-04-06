#include <iostream>
using namespace std;

int main() {

	int list[100];
	int i, max;
	for (i = 0;i < 100;i++)
		list[i] = rand() % 100 + 1;
	max = list[0];

	


	for (i = 1;i < 100;i++) {
		if (list[i] > max)
			max = list[i];
	}

	cout << "최댓값은 " << max << " 이다." << endl;


}

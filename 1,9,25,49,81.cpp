#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	for (int i = 1; i < 10; i += 2) {

		for (int j = 0; j < i; j++) {
			cout << setw(3) << i*(j+1) << " ";


		}
		cout << endl;

	}

}
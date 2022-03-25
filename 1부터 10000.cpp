#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int n = 1, sum = 0;
	while (true) {
		sum += n;
		if (sum > 10000) break;
		n++;

	}
	cout << "n=" << n << "sum=" << sum << endl;


}












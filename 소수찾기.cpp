#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int x, y, cnt;
	bool isPrime;
	cnt = 0;

	for (x = 2;x <= 50;x++) {

		isPrime = true;

		for (int y = 2;y < x;y++) {
			if (x % y == 0) {
				isPrime = false;

				break;

			}



		}
		if (!isPrime) continue;



			cnt++;
		cout << x << " ";
	}
			cout << endl;
			cout << "총 소수 개수: " << cnt << "개" << endl;



		

	}








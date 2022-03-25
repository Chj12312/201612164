#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int answer = 53;
	int guess, tries = 0;


	cout << "*** 50과 60사이의 정수입니다.***\n\n";

	do {
		cout << "정답을 추측해 보새요>> ";
		cin >> guess;
		tries++;

		if (guess > answer) {
			cout << guess << "보다 더 작은 수 입니다.";
		}

		else if (guess < answer)

		{
			cout << guess << "보다 더 큰 수입니다.";
		}
		else
			cout << "축하합니다. 정답입니다. \n" << tries << "번 시도만에 맞추었습니다.\n";






	} while (guess != answer);

}












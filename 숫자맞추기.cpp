#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int answer = 53;
	int guess, tries = 0;


	cout << "*** 50�� 60������ �����Դϴ�.***\n\n";

	do {
		cout << "������ ������ ������>> ";
		cin >> guess;
		tries++;

		if (guess > answer) {
			cout << guess << "���� �� ���� �� �Դϴ�.";
		}

		else if (guess < answer)

		{
			cout << guess << "���� �� ū ���Դϴ�.";
		}
		else
			cout << "�����մϴ�. �����Դϴ�. \n" << tries << "�� �õ����� ���߾����ϴ�.\n";






	} while (guess != answer);

}












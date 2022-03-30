#include <iostream>
#include <string>

using namespace std;

int rev(int n) {
	string s = to_string(n);
	reverse(s.begin(), s.end());
	return atoi(s.c_str());
}

int main() {
	int n;
	cin >> n;
	cout << rev(n) << endl;
}
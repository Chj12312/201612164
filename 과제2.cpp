#include <iostream>
#include <cmath>
using namespace std;


bool posTriangle(int q, int w, int e) {
    if ((q + w > e) && (w + e > q) && (e + q > w))


        return 1;





}

int main() {
    bool ispos;


    int a = 0, b = 0, c = 0;

    cout << "a : ";
    cin >> a;
    cout << "b : ";
    cin >> b;
    cout << "c : ";
    cin >> c;
    ispos = posTriangle(a, b, c);

    if (ispos == 1)
        cout << a << ", " << b << ", " << c << "로 삼각형이 만들어 집니다.";
    else
        cout << a << ", " << b << ", " << c << "로 삼각형이 만들어지지 않습니다.";





}



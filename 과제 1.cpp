#include <iostream>
#include <cmath>
using namespace std;

struct Point {
    int x, y;
};


double Distance(const Point& p1, const Point& p2);

double Distance(const Point& p1, const Point& p2) {

    double distance;


    distance = sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));

    return distance;
}

double circleArea(double p) {

    double circleArea;


    circleArea = 3.14 * pow(p, 2);


    return circleArea;
}
void display(double q, double t) {
    cout << "반지름 : " << q<<endl;
    cout << "원면적 : " << t<<endl;

    return;


}



int main() {
    int x1=0,y1=0,x2=0,y2=0;
    double r = 0;
    double p = 0;


    cout << "x1: ";
    cin >> x1;
    cout << "y1: " ;
    cin >> y1;
    cout << "x2: " ;
    cin >> x2;
    cout << "y2: " ;

    cin >> y2 ;

   
  
    Point a = { x1, y1 };
    Point b = { x2, y2 };


    double dist_a_b = Distance(a, b);

    cout << "******************" << endl;
    r= Distance(a, b);

    double Area_a_b  =  circleArea(r);
    display(Distance(a, b), circleArea(r));

   

    

}


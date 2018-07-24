#include<iostream>
#include<iomanip>
#include<cmath>
#include<sstream>
#include<string>

using namespace std;

const double PiApx = 16 * atan(1.0 / 5.0) - 4 * atan(1.0 / 239.0);

string getNDigitPi(int n = 100) {
  stringstream stream;
  stream << fixed << setprecision(n > 100? 100: n) << PiApx;
  return stream.str();
}

int main() {
  int digit;
  cin >> digit;
  cout << getNDigitPi(digit) << endl;
  return 0;
}

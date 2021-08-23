#include <bits/stdc++.h>

using namespace std;
string s;
stack<double> stk;

int main() {
    while (cin >> s) {
        if (isdigit(s[0])) {
            stk.push(stod(s));
        } else {
            double op2 = stk.top();
            stk.pop();
            double op1 = stk.top();
            stk.pop();
            if (s == "+") stk.push(op1 + op2);
            if (s == "-") stk.push(op1 - op2);
            if (s == "*") stk.push(op1 * op2);
            if (s == "/") stk.push(op1 / op2);
            if (s == "%") stk.push(fmod(op1, op2));
            if (s == "^") stk.push(pow(op1, op2));
        }
    }
    cout << stk.top() << endl;
}
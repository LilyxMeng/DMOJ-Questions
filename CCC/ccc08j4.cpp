#include <bits/stdc++.h>

using namespace std;

string s;

int main()
{
    while (true)
    {
        getline(cin, s);
        if (s[0] == '0')
            break;
        stack<string> stk;
        for (int i = s.size() - 1; i >= 0; i--)
        {
            if (s[i] == ' ')
                continue;
            if (s[i] == '+' || s[i] == '-')
            { //operator
                string op1 = stk.top();
                stk.pop();
                string op2 = stk.top();
                stk.pop();
                stk.push(op1 + " " + op2 + " " + s[i]);
            }
            else
            { //operand
                stk.push(s.substr(i, 1));
            }
        }
        cout << stk.top() << endl;
    }
}
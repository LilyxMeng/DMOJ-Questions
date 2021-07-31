#include <bits/stdc++.h>

using namespace std;

string alph = "abcdefghijklmnopqrstuvwxyz";
string S;

int main()
{
    cin >> S;
    for (char C : alph)
    {
        if (S.find(C) > S.length())
        {
            cout << C;
            break;
        }
    }
}
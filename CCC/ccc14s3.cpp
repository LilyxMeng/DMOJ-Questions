#include <bits/stdc++.h>

using namespace std;
int T, n, car[100000];

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    for (cin >> T; T > 0; T--)
    {
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> car[i];
        }
        stack<int> stk;
        int expect = 1;
        for (int i = n - 1; i >= 0; i--)
        {
            stk.push(car[i]);
            while (!stk.empty() && stk.top() == expect)
            {
                stk.pop();
                expect++;
            }
        }
        if (expect > n)
            cout << "Y\n";
        else
            cout << "N\n";
    }
}
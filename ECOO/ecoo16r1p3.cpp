#include <bits/stdc++.h>

using namespace std;

int T, n;

int main()
{
    for (int t = 1; t <= 10; t++)
    {
        cin >> n;
        int cost = 0;
        vector<int> a;
        for (int i = 1, x; i <= n; i++)
        {
            cin >> x;
            a.push_back(x);
        }
        for (int i = n - 1; i >= 1; i--)
        {
            auto cur = find(a.begin(), a.end(), i), nxt = find(a.begin(), a.end(), i + 1);
            if (cur > nxt)
            {
                cost += cur - a.begin();
                a.erase(cur);
                a.insert(a.begin(), i);
            }
        }
        cout << cost << "\n";
    }
}
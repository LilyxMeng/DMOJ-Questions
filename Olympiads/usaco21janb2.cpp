#include <bits/stdc++.h>

using namespace std;

int n, odd, even, ans;

int main()
{
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> n;
    for (int i = 1, x; i <= n; i++)
    {
        cin >> x;
        if (x & 1)
            odd++;
    }
    even = n - odd;
    if (odd < even)
        cout << 2 * odd + 1 << endl;
    else if (odd == even)
        cout << n << endl;
    else
    {
        odd -= even;
        if (odd % 3 == 0)
            cout << 2 * even + odd / 3 * 2 << endl;
        else if (odd % 3 == 1)
            cout << 2 * even + odd / 3 * 2 - 1 << endl;
        else
            cout << 2 * even + odd / 3 * 2 + 1 << endl;
    }
}
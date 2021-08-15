#include <bits/stdc++.h>

using namespace std;

typedef long long ll;
int T;
ll A, B;
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    for (cin >> T; T--;)
    {
        cin >> A >> B;
        B /= __gcd(A, B);
        int c2 = 0, c5 = 0;
        while (B % 2 == 0)
        {
            c2++;
            B /= 2;
        }
        while (B % 5 == 0)
        {
            c5++;
            B /= 5;
        }
        if (B != 1)
            cout << -1 << "\n";
        else
            cout << max(c2, c5) << "\n";
    }
}
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll ans, mi = 1e10, x, n, neg;
int main()
{
    scanf("%lld", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%lld", &x);
        neg += (x < 0);
        mi = min(mi, abs(x));
        ans += abs(x);
    }
    if (neg % 2)
        ans -= 2 * mi;
    printf("%lld\n", ans);
}
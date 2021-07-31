#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
const int MM = 2e5;
int N, Q;
ll dis[MM], r;

int main()
{
    cin >> N >> Q;
    for (int i = 0, x, y; i < N; i++)
    {
        cin >> x >> y;
        dis[i] = 1LL * x * x + (ll)y * y;
    }
    sort(dis, dis + N);
    for (int i = 0; i < Q; i++)
    {
        cin >> r;
        cout << upper_bound(dis, dis + N, r * r) - dis << "\n";
    }
}
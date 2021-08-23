#include <bits/stdc++.h>

using namespace std;

int N, m, Q, cur = 0, a, b;
vector<int> psa;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> m;
        psa.push_back(m + cur);
        cur += m;
    }

    cin >> Q;

    for (int i = 0; i < Q; i++)
    {
        cin >> a >> b;
        cout << psa[b] - ((a != 0) ? psa[a - 1] : 0) << endl;
    }
}
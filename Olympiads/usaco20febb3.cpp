#include "bits/stdc++.h"
using namespace std;
#define INF 0x3f3f3f3f
#define LINF 0x3f3f3f3f3f3f3f3f
#define endl "\n"
#define pb push_back
#define set(a, b) memset(a, b, sizeof(a));
#define TRACE(x) cerr << #x << " = " << x << endl
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef pair<double, double> pdd;
typedef pair<int, pair<int, int> > ppi;

bool OJ = true;
int cases = -1; //-1: No input cases. 0: Read cases.
const int maxN = 101, mod = 1e9 + 7;
bool visited[maxN];
int ans[maxN];
vector<vector<int> > vc;
void solve(int caseNum)
{
    int n, k;
    cin >> n >> k;
    int a1, a2, b1, b2;
    cin >> a1 >> a2 >> b1 >> b2;
    vector<int> v;
    v.pb(-INF);
    for (int i = 1; i <= n; i++)
    {
        v.pb(i);
    }
    reverse(v.begin() + a1, v.begin() + a2 + 1);
    reverse(v.begin() + b1, v.begin() + b2 + 1);

    for (int i = 1; i <= n; i++)
    {
        if (visited[i])
            continue;
        visited[i] = true;
        vector<int> nv;
        nv.pb(i);
        int cur = i;
        while (!visited[v[cur]])
        {
            visited[v[cur]] = true;
            nv.pb(v[cur]);
            cur = v[cur];
        }
        nv.pb(i);
        reverse(nv.begin(), nv.end());
        nv.pop_back();
        int rot = k % nv.size();
        for (int j = 0; j < nv.size(); j++)
        {
            int eq = j + rot;
            eq %= nv.size();
            ans[nv[eq]] = nv[j];
        }
    }
    for (int i = 1; i <= n; i++)
    {
        cout << ans[i] << endl;
    }
}

int32_t main(void)
{
    cin.tie(0)->sync_with_stdio(0);
    if (!OJ)
    {
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout);
    }
    if (cases == -1)
    {
        solve(-1);
        return 0;
    }
    if (cases == 0)
        cin >> cases;
    for (int t = 1; t <= cases; t++)
        solve(t);
}
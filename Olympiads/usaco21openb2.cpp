#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
#define lc (rt << 1)
#define rc (rt << 1 | 1)
#define pb push_back
#define cl(a, b) memset(a, b, sizeof(a))
#define mp(a, b) make_pair((a), (b))
#define all(x) x.begin(), x.end()
typedef long long ll;
typedef pair<int, int> pi;
typedef pair<ll, ll> pl;
typedef pair<pi, int> pii;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<pi> vii;
typedef vector<pl> vll;
typedef vector<pii> viii;
const int inf = 0x3F3F3F3F;
const ll infl = 0x3F3F3F3F3F3F3F3FLL;
const int mod = 1e9 + 7, MM = 100;
int N, K;
unordered_map<string, int> mp;
char g[MM][MM];
string s, a[MM];
int main()
{
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> K >> N;
    memset(g, '?', sizeof(g));
    for (int i = 0; i < N; i++)
    {
        cin >> s;
        mp[s] = i;
        g[i][i] = 'B';
    }
    for (int i = 0; i < K; i++)
    {
        for (int j = 0; j < N; j++)
            cin >> a[j];
        for (int j = 1; j < N; j++)
        {
            if (a[j - 1] > a[j])
            {
                for (int p = 0; p < j; p++)
                {
                    for (int q = j; q < N; q++)
                    {
                        int xp = mp[a[p]], xq = mp[a[q]];
                        g[xp][xq] = '0';
                        g[xq][xp] = '1';
                    }
                }
            }
        }
    }
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            printf("%c", g[i][j]);
        }
        printf("\n");
    }
}
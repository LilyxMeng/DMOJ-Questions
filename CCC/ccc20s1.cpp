#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    vector<pair<int, int> > vec;
    cin >> n;
    for (int i = 0, t, p; i < n; i++)
    {
        cin >> t >> p;
        vec.push_back({t, p});
    }
    sort(vec.begin(), vec.end());
    double ans = 0;
    for (int i = 1; i < vec.size(); i++)
    {
        ans = max(ans, (double)abs(vec[i].second - vec[i - 1].second) / (vec[i].first - vec[i - 1].first));
    }
    cout << fixed << setprecision(9) << ans << endl;
}
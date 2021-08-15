#include <iostream>
#include <set>

using namespace std;

typedef pair<int, int> pi;
int N, ans, x[2002], y[2002];
set<pi> st;

int ac19p4()
{
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        scanf("%d %d", &x[i], &y[i]);
        st.insert({x[i], y[i]});
    }
    for (int i = 0; i < N; i++)
    {
        for (int j = i + 1; j < N; j++)
        {
            if (st.count({x[i], y[j]}) && st.count({x[j], y[i]}))
                ans = max(ans, abs(x[i] - x[j]) * abs(y[i] - y[j]));
        }
    }
    printf("%d\n", ans);
}
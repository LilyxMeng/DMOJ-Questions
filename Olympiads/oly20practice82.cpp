#include <bits/stdc++.h>

using namespace std;
int N, Q, n, L, R;

int main()
{
    cin >> N >> Q;
    int stops[N];
    for (int i = 0; i < N; i++)
    {
        cin >> stops[i];
    }
    sort(stops, stops + N);

    for (int i = 0; i < Q; i++)
    {
        cin >> L >> R;
        int count = 0;
        int l = lower_bound(stops, stops + N, L) - stops;
        int r = upper_bound(stops, stops + N, R) - stops;
        for (int j = l; j < r; j++)
        {
            count++;
        }
        cout << count << endl;
    }
}
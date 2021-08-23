#include <bits/stdc++.h>

using namespace std;
int N, m;
string s;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> m >> s;
    for (int i = 0; i < N; i++)
    {
        if (s[i] == 'x')
        {
            if (m > 0)
            {
                m -= 1;
            }
        }
        else
        {
            m += 1;
        }
    }

    if (m < 0)
    {
        cout << m;
    }
    else
    {
        cout << m;
    }
}
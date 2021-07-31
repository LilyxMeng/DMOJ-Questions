#include <bits/stdc++.h>

using namespace std;

int main()
{
    for (int i = 0; i < 5; i++)
    {
        int n;
        cin >> n;
        int count = 0;
        bool check = false;
        for (int j = 2; j <= n / 2; j++)
        {
            if (n % j == 0)
            {
                check = true;
            }
        }
        while (check)
        {
            if (n % 2 == 0)
            {
                n /= 2;
                count++;
            }
            else if (n % 3 == 0)
            {
                n /= 3;
                count++;
            }
            else if (n % 5 == 0)
            {
                n /= 5;
                count++;
            }
            else if (n % 7 == 0)
            {
                n /= 7;
                count++;
            }
            else
            {
                check = false;
            }
        }
        cout << count << endl;
    }
}
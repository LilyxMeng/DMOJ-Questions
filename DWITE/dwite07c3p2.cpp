#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    for (int t = 1; t <= 5; t++)
    {
        string s;
        getline(cin, s);
        string ans;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] == '"')
            {
                int nxt = s.find("\"", i + 1);
                ans += " " + s.substr(i + 1, nxt - i - 1);
                i = nxt;
            }
            else if (s[i] == '\'')
            {
                int nxt = s.find("\'", i + 1);
                ans += " " + s.substr(i + 1, nxt - i - 1);
                i = nxt;
            }
            else if (s[i] == '/' && i + 1 < s.length() && s[i + 1] == '*')
            {
                int nxt = s.find("*/", i + 2);
                ans += " " + s.substr(i + 2, nxt - i - 2);
                i = nxt;
            }
            else if (s[i] == '/' && i + 1 < s.length() && s[i + 1] == '/')
            {
                ans += " " + s.substr(i + 2);
                i = s.length();
            }
        }
        cout << ans.substr(1) << endl;
    }
}
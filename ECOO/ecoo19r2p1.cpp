#include <bits/stdc++.h>
#include <unordered_set>

using namespace std;
string s;

int main()
{
    for (int t = 1; t <= 10; t++)
    {
        unordered_set<string> dic;
        int n;
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            cin >> s;
            for (int i = 0; i < s.size(); i++)
            {
                s[i] = tolower(s[i]);
            }
            int pos = s.find("@");
            string pre = s.substr(0, pos), suf = s.substr(pos + 1);
            pre.erase(remove(pre.begin(), pre.end(), '.'), pre.end());
            pos = pre.find("+");
            if (pos != -1)
                pre = pre.substr(0, pos);
            dic.insert(pre + "@" + suf);
        }
        cout << dic.size() << endl;
    }
}
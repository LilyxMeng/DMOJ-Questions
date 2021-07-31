#include <iostream>

using namespace std;
int N, cnt; string s;
int main () {
    cin >> N >> s; cnt = 1;
    for (int i = 1; i < N; i++) {
        if(s[i] != s[i - 1]) cnt++;
    }
    if (s[N - 1] == '0') cnt--;
    cout << cnt << endl;
}
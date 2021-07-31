#include <bits/stdc++.h>

using namespace std;
int N, n;


int main() {
      cin >> N;
    vector<int> nums;

    for (int i = 0; i < N; i++) {
        if (i % 2) {
            cin >> n;
            nums.push_back(n);
        } else {
            cin >> n;
            nums.push_back(n);
        }
    }

    sort(nums.begin(), nums.end());
    if (N % 2) {
        for (int i = 0; i < N; i++) {
            if (i % 2) {
                cout << nums[N / 2 + 1 + i / 2];
                if (i != N - 1) {
                    cout << " ";
                }
            } else {
                cout << nums[N / 2 - i / 2];
                if (i != N - 1) {
                    cout << " ";
                }
            }
        }
    } else {
        for (int i = 0; i < N; i++) {
            if (i % 2) {
                cout << nums[N / 2 + i / 2];
                if (i != N - 1) {
                    cout << " ";
                }
            } else {
                cout << nums[N / 2 - 1 - i / 2];
                if (i != N - 1) {
                    cout << " ";
                }
            }
        }
    }
    
}
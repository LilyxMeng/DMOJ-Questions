days = int(input())

aCount = 0
bCount = 0

n = 0

a = input().split()
b = input().split()

for i in range(days):
    aCount += int(a[i])
    bCount += int(b[i])
    if aCount == bCount:
        n = i + 1

print(n)
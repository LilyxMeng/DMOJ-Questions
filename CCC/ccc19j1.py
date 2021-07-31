b = 0
a = 0

for x in range(3, 0, -1):
    a += int(input()) * x

for x in range(3, 0, -1):
    b += int(input()) * x

if b > a:
    print("B")
elif a > b:
    print("A")
else:
    print("T")
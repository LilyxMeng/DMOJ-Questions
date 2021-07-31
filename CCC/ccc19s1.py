arr = ["1", "2", "3", "4"]
s = input()

for i in range(len(s)):
    if s[i] == "H":
        arr = arr[2] + arr[3] + arr[0] + arr[1]
    else:
        arr = arr[1] + arr[0] + arr[3] + arr[2]

print(arr[0] + " " + arr[1])
print(arr[2] + " " + arr[3])
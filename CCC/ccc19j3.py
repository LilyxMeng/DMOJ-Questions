m = int(input())

for x in range(m):
    word = input() + " "
    times = []
    sym = []
    times = 1
    s = ""
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            times += 1
        else:
            s += str(times) + " " + word[i] + " "
            times = 1
    print(s[:-1])
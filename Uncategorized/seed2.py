import sys

done = False
i = 0
j = 2 * 10 ** 9

while not done:
    m = int((i + j) / 2)
    print(m)
    sys.stdout.flush()
    s = input()
    if s == "FLOATS":
        j = m
    elif s == "SINKS":
        i = m
    else:
        done = True

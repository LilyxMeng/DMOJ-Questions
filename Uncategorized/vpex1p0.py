slices, friends = map(int, input().split())

shared = slices // friends
left = slices % friends

print(shared, left)
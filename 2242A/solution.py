import sys

input = sys.stdin.readline

t = int(input())
for _ in range(t):
    k = int(input())
    c = list(map(int, input().split()))

    if any(x >= 3 for x in c):
        print("YES")
    elif sum(x == 2 for x in c) >= 2:
        print("YES")
    else:
        print("NO")
import sys
input = sys.stdin.readline

t = int(input())
res = []
for _ in range(t):
    x = input().strip()
    k = len(x)
    y = 10**k + 1
    res.append(str(y))
print("\n".join(res))
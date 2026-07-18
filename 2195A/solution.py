x = int(input())
for _ in range(x):
    n = int(input())
    a = list(map(int, input().split()))
    if 67 in a:
        print("YES")
    else:
        print("NO")
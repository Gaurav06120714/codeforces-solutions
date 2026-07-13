t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    prefA = [0] * n
    prefB = [0] * n

    A = 0
    B = 0

    for i in range(n):
        if a[i] == 1:
            A += 1
            B += 1
        elif a[i] == 2:
            A -= 1
            B += 1
        else:
            A -= 1
            B -= 1

        prefA[i] = A
        prefB[i] = B

    suf = [float("-inf")] * n
    suf[n - 2] = prefB[n - 2]

    for i in range(n - 3, -1, -1):
        suf[i] = max(prefB[i], suf[i + 1])

    ans = "NO"

    for i in range(n - 2):
        if prefA[i] >= 0 and suf[i + 1] >= prefB[i]:
            ans = "YES"
            break

    print(ans)
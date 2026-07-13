def hep():
    n = int(input())
    a = list(map(int, input().split()))
    arr = a[:]
    c = True
    while c:
        c = False
        for i in range(n // 2):
                if 2 * i + 1 < n:
                    if 2 * i + 1 < n and arr[i] > arr[2 * i + 1]:
                        arr[i],arr[2*i+1] = arr[2*i+1],arr[i]
                        c = True
    if arr == sorted(a):
        print("YES")
    else:
        print("NO")
t = int(input())
for _ in range(t):
    hep()
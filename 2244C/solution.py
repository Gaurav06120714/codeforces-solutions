def get_gcd(a, b):
    while b:
        a, b = b, a % b
    return a

t = int(input())
for _ in range(t):
    n, x, y = map(int, input().split())
    p = list(map(int, input().split()))
    
    g = get_gcd(x, y)
    possible = True
    
    for i in range(n):
        if abs((p[i] - 1) - i) % g != 0:
            possible = False
            break
            
    if possible:
        print("YES")
    else:
        print("NO")
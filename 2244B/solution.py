t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    
    prefix_sum = 0
    possible = True
    
    for i in range(n):
        prefix_sum += a[i]
        
        required_sum = ((i + 1) * (i + 2)) // 2
        
        if prefix_sum < required_sum:
            possible = False
            break
            
    if possible:
        print("YES")
    else:
        print("NO")
def solve():
    data = open(0).read().split()
    if not data:
        return
    
    t = int(data[0])
    idx = 1
    
    out = []
    for _ in range(t):
        n = int(data[idx])
        m = int(data[idx+1])
        idx += 2
        
        a = [int(x) for x in data[idx : idx+n]]
        idx += n
        
        b = [int(x) for x in data[idx : idx+m]]
        idx += m
        
        b.sort()
        
        total_sum = 0
        prev = 0
        
        for p in b:
            total_sum += abs(sum(a[prev:p]))
            prev = p
            
        if prev < n:
            total_sum += sum(a[prev:])
            
        out.append(str(total_sum))
        
    print('\n'.join(out))

solve()
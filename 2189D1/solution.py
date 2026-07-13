# Enter your code here. Read input from STDIN. Print output to STDOUT.

import sys

def solve():
    data = sys.stdin.read().split()
    it = iter(data)
    
    try:
        t = int(next(it))
    except StopIteration:
        return
    
    MOD = 10**9 + 7
    out = []
    
    for _ in range(t):
        n = int(next(it))
        c = int(next(it))
        s = next(it)
        
        if s[n-1] == '0':
            out.append("-1")
            continue
        
        ans_mod = 1
        ans_check = 1
        
        for k in range(1, n):
            if s[k-1] == '1':
                mul = 2
            else:
                mul = k - 1
            
            ans_mod = (ans_mod * mul) % MOD
            ans_check = (ans_check * mul) % c
        
        if ans_check == 0:
            out.append("-1")
        else:
            out.append(str(ans_mod))
    
    print("\n".join(out))

solve()
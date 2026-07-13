import sys
def solve():
    ip = sys.stdin.read().split()
    if not ip:
        return
    itr = iter(ip)
    t = int(next(itr))
    result = []
    for _ in range(t):
        n = int(next(itr))
        p = [0] * n
        cur = 0
        for i in range(1,n):
            if i % 2 != 0:
                cur +=i
            else:
                cur -= i
            p[i] = cur
        minval = min(p)
        ans = [str (x-minval + 1) for x in p]
        result.append(" ".join(ans))
    print('\n'.join(result))
if __name__ == '__main__':
    solve()
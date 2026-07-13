import sys

def main():
    input = sys.stdin.read
    data = input().split()
    iterator = iter(data)
    t = int(next(iterator))
    res = []
    
    for _ in range(t):
        n = int(next(iterator))
        ans = [0] * n
        ans[0] = n if n % 2 == 0 else n - 1
        ans[n - 1] = 1
        ans[1:n - 1] = [i ^ 1 for i in range(2, n)]
        res.append(" ".join(map(str, ans)))
        
    sys.stdout.write('\n'.join(res))

if __name__ == '__main__':
    main()
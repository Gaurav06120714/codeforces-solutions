import sys

def solve():
    try:
        line = sys.stdin.readline()
        if not line:
            return
        t = int(line.strip())
    except ValueError:
        return

    for _ in range(t):
        try:
            line1 = sys.stdin.readline()
            while line1 and not line1.strip(): 
                line1 = sys.stdin.readline()
            if not line1:
                break
            n, s, x = map(int, line1.split())
            
            a = list(map(int, sys.stdin.readline().split()))
        except ValueError:
            break

        current_sum = sum(a)

        if current_sum <= s and (s - current_sum) % x == 0:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    solve()
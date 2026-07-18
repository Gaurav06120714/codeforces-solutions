import sys

def solve():
    input_data = sys.stdin.read().split()
    if not input_data:
        return

    iterator = iter(input_data)
    try:
        t = int(next(iterator))
    except StopIteration:
        return

    result_output = []

    for _ in range(t):
        try:
            n = int(next(iterator))
            p = [int(next(iterator)) for _ in range(n)]
        except StopIteration:
            break

        pos = [0] * (n + 1)
        for idx, val in enumerate(p):
            pos[val] = idx

        curr = 0
        for val in range(n, 0, -1):
            idx = pos[val]
            if idx == curr:
                curr += 1
            else:
                segment = p[curr:idx+1]
                segment.reverse()
                new_p = p[:curr] + segment + p[idx+1:]
                result_output.append(" ".join(map(str, new_p)))
                break
        else:
            result_output.append(" ".join(map(str, p)))

    sys.stdout.write('\n'.join(result_output) + '\n')

if __name__ == "__main__":
    solve()
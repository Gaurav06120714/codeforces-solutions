import sys

sys.setrecursionlimit(2000)

def main():
    input_data = sys.stdin.read().split()
    
    if not input_data:
        return

    iterator = iter(input_data)
    
    try:
        num_test_cases = int(next(iterator))
    except StopIteration:
        return

    results = []

    for _ in range(num_test_cases):
        try:
            n = int(next(iterator))
            x = int(next(iterator))
        except StopIteration:
            break
        
        base_distance = 0
        max_cycle_gain = -float('inf')
        
        for _ in range(n):
            a = int(next(iterator))
            b = int(next(iterator))
            c = int(next(iterator))
            
           
            base_distance += (b - 1) * a
            

            gain = (a * b) - c
            
            if gain > max_cycle_gain:
                max_cycle_gain = gain
        
        if base_distance >= x:
            results.append("0")
        else:
            if max_cycle_gain <= 0:
                results.append("-1")
            else:
                remaining_dist = x - base_distance
                rollbacks_needed = (remaining_dist + max_cycle_gain - 1) // max_cycle_gain
                results.append(str(rollbacks_needed))
                
    sys.stdout.write('\n'.join(results) + '\n')

if __name__ == "__main__":
    main()
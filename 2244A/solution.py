x = int(input())
for _ in range(x):
    n = int(input())
    s = input()
    
    seg = s.split('*')
    mx = max(len(segm) for segm in seg)
    mx_t = (mx + 1) // 2
    print(mx_t)
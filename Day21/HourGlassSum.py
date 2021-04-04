def hourglassSum(arr):
    rows=len(arr)
    
    cols=len(arr[0])
    
    hr = []
    for i in range(1, rows - 1, 1):
        a = []
        for j in range(1, cols - 1, 1):
            a.append(arr[i][j] + arr[i + 1][j] + arr[i - 1][j] + arr[i - 1][j - 1] + arr[i - 1][j + 1] + arr[i + 1][j - 1] +arr[i + 1][j + 1])

        hr.append(a)
        
    return(max(max(x) for x in hr))

if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)
    print(result)

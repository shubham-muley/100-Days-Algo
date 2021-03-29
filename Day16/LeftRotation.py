def rotateLeft(d, arr):
    dup = []

    for j in range(len(arr)):
        dup.append(arr[(d + j) % len(arr)])

    return dup


if __name__ == '__main__':

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    d = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    result = rotateLeft(d, arr)

    print(result)
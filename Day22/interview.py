def missingnumber(arr):
    return int((len(arr)+1)*(len(arr)+2)/2)-sum(arr)

def binary_sort(b_arr):
    c=Counter(b_arr)
    s = [0]*c[0]
    for i in range(c[1]):
        s.append(1)
    return s

def insertion_sort(arr):
    for i in range(1,len(arr)):
        for j in range(i):
            if arr[j] > arr[i]:
                arr[j], arr[i] = arr[i], arr[j]
    return arr

if __name__ == '__main__':
    a=[1,2,3,4,5,6,7,8,10]
    print(missingnumber(a))

    b=[1,0,1,1,1,0,0,0]
    print(binary_sort(b))

    s=[7,5,2,1,5,8,9]
    print(insertion_sort(s))

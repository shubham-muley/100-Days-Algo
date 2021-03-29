def matchingStrings(strings, queries):
    counts = []
    for i in range(len(queries)):
        count = 0
        for j in range(len(strings)):
            if queries[i].strip() == strings[j].strip():
                count += 1
        counts.append(count)
    return counts

if __name__ == '__main__':

    strings_count = int(input())

    strings = []

    for _ in range(strings_count):
        strings_item = input()
        strings.append(strings_item)

    queries_count = int(input())

    queries = []

    for _ in range(queries_count):
        queries_item = input()
        queries.append(queries_item)

    res = matchingStrings(strings, queries)
    print('\n'.join(map(str, res)))

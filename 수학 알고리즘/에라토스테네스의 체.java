private static void eratosthenes() {
    // 10까지의 소수 배열로 저장(2, 3, 5, 7)
    // 인덱스 2부터 시작하여 활용
    int n = 10;

    int[] arr = new int[n + 1];

    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i * i <= n; i++)
        if (arr[i] == 0)
            for (int j = i * i; j <= n; j += i)
                arr[j] = 1;
}

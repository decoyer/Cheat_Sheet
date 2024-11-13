// 입력 크기에 따라 자료형 변경(long, BigInteger)
private static int factorial(int n) {
    if (n <= 1)
        return 1;

    return n * factorial(n - 1);
}

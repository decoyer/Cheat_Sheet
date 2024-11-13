// 최대공약수(GCD)
private static int gcd(int a, int b) {
    if (b == 0)
        return a;

    return gcd(b, a % b);
}

// 최소공배수(LCM)
a * b / gcd(a, b);

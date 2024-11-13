private static void string() {
    StringBuilder sb = new StringBuilder();

    String str = "ABCDE";

    // 소문자로 변경(abcde)
    str = str.toLowerCase();

    // 대문자로 변경(ABCDE)
    str = str.toUpperCase();

    // 0번째 글자부터 2글자만 자르기(AB)
    str = str.substring(0, 2);

    // 0번째 글자 반환(A)
    str.charAt(0);

    // 한글자씩 배열 요소로 저장[A, B, C, D, E]
    String[] arr = str.split("");

    // 문자열 뒤집기(StringBuilder 활용)
    sb.append(str);
    str = sb.reverse().toString();

    // 문자열 치환(aBCDE)
    str = str.replaceAll("A", "a");

    // 소수점 둘째자리까지 출력(3.14)
    String.format("%.2f", 3.14);
}

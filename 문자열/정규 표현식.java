private static void regex() {
    // [] : 선택
    // () : 그룹
    // - : 범위
    // + : 1개 이상
    // * : 0개 이상
    // ? : 0, 1
    // ^ : ~로 시작
    // $ : ~로 끝
    // . : 임의의 문자
    // [0-9a-zA-Z] : \w
    // [0-9] : \d
    // [^] : 제외

    String s1 = "010-1234-5678";
    String r1 = "([01]{3})-(\\d{3,4})-(\\d{4})";

    String s2 = "abcd@naver.com";
    String r2 = "(\\w+)@(\\w+\\.\\w+)";

    // 문자열이 정규 표현식과 일치하는지 확인
    s1.matches(r1);
    s2.matches(r2);
}

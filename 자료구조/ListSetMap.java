private static void listsetmap() {
    // List 컬렉션
    // 객체 저장 간 순서(index) 있음
    // 객체 간 중복 허용
    ArrayList<Integer> list = new ArrayList<>();

    // Set 컬렉션
    // 객체 저장 간 순서(index) 없음
    // 객체 간 중복 불가
    Set<Integer> hashset = new HashSet<>();
    Set<Integer> treeset = new TreeSet<>();

    // Map 컬렉션
    // 키(Set)와 값의 쌍으로 구성된 객체 저장
    // 객체 간 중복 불가
    Map<Integer, String> hashmap = new HashMap<>();
    Map<Integer, String> treemap = new TreeMap<>();

    // add(), get(), set(), put()
    // isEmpty(), contains(), size(), keySet() 등 메서드 활용
}

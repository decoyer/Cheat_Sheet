public static void custom_sort() {
        Set<String> set = Set.of("apple", "banana", "kiwi", "orange", "watermelon", "grape");

        ArrayList<String> list = new ArrayList<>(set);

        // 오름차순: e1 - e2, 내림차순: e2 - e1;
        Collections.sort(list, (e1, e2) -> {
            // 길이가 같으면 사전 순으로 정렬
            if (e1.length() == e2.length())
                return e1.compareTo(e2);

            // 단어 길이 순으로 정렬
            else
                return e1.length() - e2.length();
        });
}

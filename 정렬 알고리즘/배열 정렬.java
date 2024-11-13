public static void sort() {
    int[] arr = { 1, 3, 2, 5, 4 };

    // 오름차순 정렬
    Arrays.sort(arr);
  
    ArrayList<Integer> list = new ArrayList<>();

    for (int i : arr)
        list.add(i);

    // 내림차순 정렬
    Collections.sort(list, Collections.reverseOrder());
}

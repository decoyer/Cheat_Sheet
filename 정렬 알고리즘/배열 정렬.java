public static void sort() {
    int[] arr = { 1, 3, 2, 5, 4 };

    // 오름차순 정렬
    Arrays.sort(arr);

    Integer[] tmp = new Integer[arr.length];

    for (int i = 0; i < tmp.length; i++)
        tmp[i] = arr[i];

    // 내림차순 정렬
    Arrays.sort(tmp, Collections.reverseOrder());

    // 내림차순 정렬(ArrayList 활용)
    ArrayList<Integer> list = new ArrayList<>();

    for (int i : arr)
        list.add(i);

    Collections.sort(list, Collections.reverseOrder());
}

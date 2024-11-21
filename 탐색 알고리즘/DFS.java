private static void bfs(int index) {
    visited[index] = true;

    Queue<Integer> q = new LinkedList<>();
    q.add(index);

    while (!q.isEmpty()) {
        int node = q.poll();
        sb.append(node).append(" ");

        for (int i : graph[node]) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;
            }
        }
    }
}

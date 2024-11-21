private static void dfs(int index) {
    visited[index] = true;
    sb.append(index).append(" ");

    for (int i : graph[index])
        if (!visited[i])
            dfs(i);
}

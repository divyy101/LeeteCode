import java.util.*;

class Solution {

    class Edge {
        int v, w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

      
        for (int[] t : times) {
            int u = t[0];
            int v = t[1];
            int w = t[2];

            graph.get(u).add(new Edge(v, w));
        }

        PriorityQueue<Edge> pq =
                new PriorityQueue<>((a, b) -> a.w - b.w);

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;
        pq.offer(new Edge(k, 0));

        while (!pq.isEmpty()) {

            Edge curr = pq.poll();

            if (curr.w > dist[curr.v]) {
                continue;
            }

            for (Edge nei : graph.get(curr.v)) {

                if (dist[curr.v] + nei.w < dist[nei.v]) {

                    dist[nei.v] = dist[curr.v] + nei.w;

                    pq.offer(new Edge(nei.v, dist[nei.v]));
                }
            }
        }

        int maxTime = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }
}
#include <iostream>
#include <vector>
#include <queue>
#include <limits>
using namespace std;

constexpr long long INF = numeric_limits<long long>::max();

vector<long long> dijkstra(const vector<vector<int>>& g, int s) {
    int n = g.size();
    vector<long long> d(n, INF);
    d[s] = 0;

    using P = pair<long long, int>;
    priority_queue<P, vector<P>, greater<P>> pq;
    pq.emplace(0, s);

    while (!pq.empty()) {
        auto [dist, u] = pq.top();
        pq.pop();

        if (dist > d[u]) continue;

        for (int v : g[u]) {
            if (dist + 1 < d[v]) {
                d[v] = dist + 1;
                pq.emplace(d[v], v);
            }
        }
    }

    return d;
}

int minimumWeight(int n, const vector<int>& e, int s1, int s2) {
    vector<vector<int>> g(n);
    for (int u = 0; u < n; ++u) {
        if (e[u] != -1) g[u].push_back(e[u]);
    }

    auto d1 = dijkstra(g, s1);
    auto d2 = dijkstra(g, s2);

    int res = -1;
    long long best = INF;

    for (int i = 0; i < n; ++i) {
        if (d1[i] == INF || d2[i] == INF) continue;

        if (d1[i] + d2[i] < best) {
            best = d1[i] + d2[i];
            res = i;
        }
    }

    return res;
}

int main() {
    int n;
    cin >> n;

    vector<int> e(n);
    for (int& x : e) cin >> x;

    int s1, s2;
    cin >> s1 >> s2;

    cout << minimumWeight(n, e, s1, s2) << endl;
    return 0;
}

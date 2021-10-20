from queue import PriorityQueue


class Graph:
    """
    Dijkstra's Shortest path algorithm

    >>> g = Graph(7)
        g.add_edge(0, 1, 10)

    >>> D = g.dijkstra_algo(2)

    >>> print(D)
        {0: 19, 1: 9, 2: 0, 3: 6, 4: 16, 5: 11, 6: 26}
    """

    def __init__(self, vertices_num) -> None:
        self.v = vertices_num
        self.visited = []
        self.edges = [[-1 for i in range(vertices_num)] for j in range(vertices_num)]

    def add_edge(self, x, y, weight):
        self.edges[x][y] = weight
        self.edges[y][x] = weight

    def dijkstra_algo(self, initial_node):
        D = {v: float("infinity") for v in range(self.v)}
        D[initial_node] = 0

        pq = PriorityQueue()
        pq.put((0, initial_node))

        while not pq.empty():
            (dist, current_vertex) = pq.get()
            self.visited.append(current_vertex)

            for n in range(self.v):
                if self.edges[current_vertex][n] != -1:
                    distance = self.edges[current_vertex][n]
                    if n not in self.visited:
                        old_cost = D[n]
                        new_cost = D[current_vertex] + distance
                        if new_cost < old_cost:
                            pq.put((new_cost, n))
                            D[n] = new_cost
        return D


g = Graph(7)
g.add_edge(0, 1, 10)
g.add_edge(0, 6, 7)
g.add_edge(1, 6, 30)
g.add_edge(1, 2, 9)
g.add_edge(2, 3, 6)
g.add_edge(2, 4, 40)
g.add_edge(3, 4, 10)
g.add_edge(3, 5, 5)
g.add_edge(4, 5, 35)


D = g.dijkstra_algo(2)


for node in range(len(D)):
    print("distance from node 0 to node", node, "is", D[node])

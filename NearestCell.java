import java.util.*;
public class NearestCell {
    public static int[] dixtra(List<List<Integer>> adj,int start){
        int n=adj.size();
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,start});
        while(!pq.isEmpty()){
            int top[]=pq.poll();
            int d=top[0];
            int node=top[1];

            if(d>dist[node]) continue;

            for(int v:adj.get(node)){
                int nd=dist[node]+1;
                if(nd<dist[v]){
                    dist[v]=nd;
                    pq.add(new int[]{nd,v});
                }
            }
        }
        return dist;
    }
    public static int f(int n,int []edge,int c1,int c2){
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            if(edge[i]!=-1){
                graph.get(i).add(edge[i]);
            }
        }
        int arr1[]=dixtra(graph, c1);
        int arr2[]=dixtra(graph, c2);
      
        int minDist=Integer.MAX_VALUE;
        int minNode=-1;
        for(int i=0;i<n;i++){
            if(arr1[i]!=Integer.MAX_VALUE && arr2[i]!=Integer.MAX_VALUE){
                int max=Math.max(arr1[i],arr2[i]);
                if(max<minDist){
                    minDist=max;
                    minNode=i;
                }
            }
        }
        return minNode;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int edges[]=new int[n];
        for(int i=0;i<n;i++){
            edges[i]=sc.nextInt();
        }
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println(f(n, edges, c1, c2));
        sc.close();
    }
}

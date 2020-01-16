package multipledatasources.lianbiao;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by zhangmingyu on 2019/11/15.
 */
public class Graph {
    private int v;//无向图顶点个数
    private java.util.LinkedList<Integer> adj[];

    public Graph(int n) {
        this.v=v;
        adj=new java.util.LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adj[i]=new LinkedList<>();
        }

    }
    public void add(int s,int t){
        adj[s].add(t);
        adj[t].add(s);

    }
  /*  public void bsf(int  s,int t){
        if(s==t){
            return;
        }
        boolean[] visited=new boolean[v];
        visited[s]=true;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(s);
        int[]perv=new int[v];
        for (int i = 0; i <v ; i++) {
            perv[i]=-1;

        }
        while (queue.size()!=0){
            int w=queue.poll();
            for (int i = 0; i <adj[w].size() ; i++) {
                int q=adj[w].get(i);
                if (!visited[q]){
                    perv[q]=w;
                    if (q==t){
                        print(perv,s,t);
                        return;
                    }
                    visited[q]=true;
                    queue.add(q);

                }


            }
        }

    }*/
  public void bsf(int  s,int t){
      if(s==t){
          return;
      }
      boolean[] bool=new boolean[v];
      bool[s]=true;
      Queue<Integer>queue=new LinkedList<>();
      queue.add(s);
      int[] perv=new int[v];
      for (int i = 0; i <v ; i++) {
        perv[i]=-1;
      }
      while (queue.size()>0){
          int w=queue.poll();
          for (int i = 0; i <adj[w].size() ; i++) {
              int p=adj[w].get(i);
              if (!bool[p]){
                  perv[p]=w;

                  if (p==t){
                      print(perv,s,t);
                      return;
                  }
                  bool[p]=true;
                  queue.add(p);
              }
          }
      }
  }
    public void print(int[] perv,int s,int t){
        if (perv[t]!=-1&&t!=s){
            print(perv,s,perv[t]);
        }
        System.out.println(t+"");
    }
}

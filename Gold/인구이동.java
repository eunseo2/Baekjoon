package Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 인구이동 {
  static int[][] arr;
  static int[] dx = { -1, 0, 1, 0 };
  static int[] dy = { 0, -1, 0, 1 };
  static int N, L, R;
  static int cnt;
  static Queue<Area> tmpq;
  static boolean[][] visited;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    L = in.nextInt();
    R = in.nextInt();

    arr = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    while (true) {
      boolean isBfs = false;

      visited = new boolean[N][N];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (!visited[i][j]) {

            if (bfs(i, j)) {
              isBfs = true;
            }
          }

        }
      }

      if (!isBfs) {
        break;
      } else {
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  public static boolean bfs(
    int i,
    int j
  ) {
    int sum = 0;

    Queue<Area> q = new LinkedList<>();
    tmpq = new LinkedList<>();

    q.offer(new Area(i, j));
    tmpq.offer(new Area(i, j));

    sum += arr[i][j];
    visited[i][j] = true;

    while (!q.isEmpty()) {
      Area now = q.poll();

      for (int d = 0; d < 4; d++) {
        int nx = now.i + dx[d];
        int ny = now.j + dy[d];

        if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
          continue;
        }

        if (visited[nx][ny]) {
          continue;
        }

        int abs = Math.abs(arr[now.i][now.j] - arr[nx][ny]);

        if (L <= abs && abs <= R) {
          q.offer(new Area(nx, ny));
          tmpq.offer(new Area(nx, ny));
          sum += arr[nx][ny];
          visited[nx][ny] = true;
        }
      }
    }

    if (tmpq.size() > 1) {
      int union = sum / tmpq.size();
      while (!tmpq.isEmpty()) {
        Area now = tmpq.poll();
        arr[now.i][now.j] = union;
      }
    } else {
      return false;
    }
    return true;
  }

  private static class Area {
    int i;
    int j;

    public Area(
      int i,
      int j
    ) {
      this.i = i;
      this.j = j;
    }
  }
}

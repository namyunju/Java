import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class SWEA_2001_파리퇴치 {
    public static int solve(int N, int M, int[][] map) {
        int ans = 0;
        int cnt = 0;

        for (int i=0; i<=N-M; i++) {
            for (int j=0; j<=N-M; j++) {
                cnt = 0;
                for (int r=i; r<i+M; r++) {
                    for (int c=j; c<j+M; c++) {
                        cnt += map[r][c];
                    }
                }
                if (cnt > ans) {
                    ans = cnt;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] map = new int[N][N];
            
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int result = solve(N,M,map);
            System.out.println("#" + tc + " " + result);
        }
    }
}
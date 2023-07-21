import java.io.*;
class Group{
public static void main(String [] args){
int fact(int n);
{
int fact = 1;
for (int i = 2; i <= n; i++)
fact *= i;
return fact;
}
int ncr(int n, int r);
{
int ncr = fact(n)/(fact(r) * fact(n - r));
return ncr;
}
int ways(int m, int w, int n, int k);
{
int ans = 0;
while (m >= k) {
ans += ncr(m, k) * ncr(w, n - k);
k += 1;
}
return ans;
}
}

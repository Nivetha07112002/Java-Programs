  import java.util.*;
public class anagram{
int getminimumanagramdifference(String str1, String str2);
int minAnagramDiff = 0;
int n = str1.length();
char str1Array[] = str1.toCharArray();
char str2Array[] = str2.toCharArray();
int i;
for (i = 0; i < n; i++) {
int j;
for (j = 0; j < n; j++) {
if (str1Array[i] == str2Array[j]) {
str2Array[j] = '#';
break;
}
}
if (j == n) {
minAnagramDiff++;
}
}
return minAnagramDiff;
}
}
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//_CRT_SECURE_NO_WARNINGS;

int main() {
    int how;
    scanf("%d\\n", &how);
    for (int i = 0; i < how; i++) {
        int x = 0;
        int y = 0;
        int dis = 0;
        int count = 0;
        int max = 1;//최대속도
        scanf("%d %d", &x, &y); 
        dis = y - x;
        while (dis / 2 >= max) {
            dis -= max * 2;
            count += 2;
            max++;
        }
        /*printf("%d",1<=dis&&dis<=max ? ++count: max<dis? count+=2:count );*/
        if (1 <= dis && dis <= max)
            count++;
        else if (max < dis)
            count += 2;
        printf("%d\n", count);
    }
    return 0;
}
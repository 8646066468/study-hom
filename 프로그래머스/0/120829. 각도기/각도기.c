#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    if (angle > 0 && angle < 90) {
        return 1; 
    } else if (angle == 90) {
        return 2; 
    } else if (angle > 90 && angle < 180) {
        return 3;
    } else if (angle == 180) {
        return 4; 
    }else{
        return printf("잘못된 각도입니다.");
    }
    
}
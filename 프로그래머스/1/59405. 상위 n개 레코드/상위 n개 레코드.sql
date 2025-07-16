-- 코드를 입력하세요
SELECT NAME
from ANIMAL_INS 
where DATETIME = (SELECT MIN(DATETIME)
                 FROM ANIMAL_INS)

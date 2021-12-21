SELECT nama
FROM table1
INNER JOIN table2
ON table1.NIM = table2.NIM
WHERE table1.tanggal = '2020-06-15' AND '2020-06-17';
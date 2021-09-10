#SELECT noOfCopies FROM ( (tbl_book NATURAL JOIN tbl_book_copies ) NATURAL JOIN tbl_library_branch) WHERE title='The Lost Tribe' AND branchName='Sharpstown';
#SELECT noOfCopies, branchName FROM ( (tbl_book NATURAL JOIN tbl_book_copies ) NATURAL JOIN tbl_library_branch) WHERE title='The Lost Tribe';
#SELECT name FROM tbl_borrower B WHERE cardNo NOT IN ( SELECT cardNo FROM tbl_book_loans L WHERE(B.cardNo = L.cardNo)) ;
#SELECT title,name,address FROM (( (tbl_borrower NATURAL JOIN tbl_book_loans ) NATURAL JOIN tbl_library_branch) NATURAL JOIN tbl_book) WHERE  branchName='Sharpstown' AND DATE(dueDate)='2018-04-01' ;
#SELECT branchName,Count(*) FROM tbl_book_loans B,tbl_library_branch L WHERE  B.branchID = L.branchId GROUP BY L.branchName;
#SELECT name,address,Count(*) FROM tbl_book_loans NATURAL JOIN tbl_borrower GROUP BY cardNo HAVING count(*)> 5;
#SELECT * FROM ( ( (tbl_book B INNER JOIN tbl_author A ON B.authId = A.authorId ) NATURAL JOIN tbl_book_copies ) NATURAL JOIN tbl_library_branch) WHERE authorName = "Stephen King" AND branchName='Central';

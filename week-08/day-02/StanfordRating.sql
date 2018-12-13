

Q6

'For all cases where the same reviewer rated the same movie twice and gave it 
a higher rating the second time, return the reviewers name and the title of the movie.'


SELECT Rating.mID 
FROM Rating AS Rating1, Rating as Rating2 
WHERE Rating1.mID=Rating2.mID && 
Rating1.rID=Rating2.rID && 
Rating1.ratingDate>Rating2.ratingDate && 
Rating1.stars>Rating2.stars;

SELECT Reviewer.name, Movie.title 
FROM (SELECT Rating1.rID, Rating1.mID
FROM Rating AS Rating1, Rating as Rating2 
WHERE Rating1.mID=Rating2.mID && 
Rating1.rID=Rating2.rID && 
Rating1.ratingDate>Rating2.ratingDate && 
Rating1.stars>Rating2.stars) AS Result
JOIN Movie
ON Result.mID=Movie.mID
JOIN Reviewer
ON Result.rID=Reviewer.rID;





Q7

'For each movie that has at least one rating, find the highest number of stars that
 movie received. Return the movie title and number of stars. Sort by movie title. '

SELECT MAX(stars), mID
FROM Rating
GROUP BY mID;

SELECT stars, mID
FROM Rating
ORDER BY mID, stars DESC;

SELECT Movie.title, Result.maxstar
FROM (SELECT MAX(stars) AS maxstar, mID
FROM Rating
GROUP BY mID) AS Result
JOIN Movie
ON Result.mID=Movie.mID
ORDER BY Movie.title;



Q8

'For each movie, return the title and the 'rating spread', that is, the difference 
between highest and lowest ratings given to that movie. Sort by rating spread from 
highest to lowest, then by movie title. '

SELECT mID, MAX(Stars) AS maxstar, MIN(Stars) AS minstar
FROM Rating
GROUP BY mID;

SELECT Movie.title, Result.maxstar-Result.minstar AS rateSpread
FROM    (SELECT mID, MAX(stars) AS maxstar, MIN(stars) AS minstar
        FROM Rating
        GROUP BY mID) as Result
RIGHT JOIN Movie
ON Movie.mID=Result.mID
ORDER BY rateSpread DESC, Movie.title ASC;



Q9

'Find the difference between the average rating of movies released before 1980 and the 
average rating of movies released after 1980. (Make sure to calculate the average
rating for each movie, then the average of those averages for movies before 1980 and
movies after. Dont just calculate the overall average rating before and after 1980.'

SELECT Movie.mID, AVG(stars)
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
GROUP BY Movie.mID;

SELECT Movie.mID, AVG(stars)
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year < 1980
GROUP BY Movie.mID;

SELECT AVG(result.avgStar) 
FROM
(SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year < 1980
GROUP BY Movie.mID) AS result;

SELECT AVG(bef1980.avgStar), AVG(aft1980.avgStar)
FROM
((SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year < 1980
GROUP BY Movie.mID) AS bef1980
JOIN
(SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year > 1980
GROUP BY Movie.mID) AS aft1980
ON bef1980.mID=aft1980.mID);

SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year < 1980
GROUP BY Movie.mID) AS bef1980
JOIN
(SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year > 1980
GROUP BY Movie.mID) AS aft1980
ON bef1980.mID=aft1980.mID);


SELECT (SELECT AVG(result.avgStar)
FROM
(SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year < 1980
GROUP BY Movie.mID) AS result)
-
(SELECT AVG(result.avgStar)
FROM
(SELECT Movie.mID, AVG(stars) AS avgStar
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.year > 1980
GROUP BY Movie.mID) AS result);




Rating Extras

Q1

'Find the names of all reviewers who rated Gone with the Wind.'

SELECT DISTINCT Reviewer.name
FROM 
(SELECT rID 
    FROM Rating
    WHERE mID=101) AS filteredRating
LEFT JOIN
Reviewer
ON filteredRating.rID=Reviewer.rID;



Q2

'For any rating where the reviewer is the same as the director of the movie,
return the reviewer name, movie title, and number of stars.'

SELECT Reviewer.name, title, stars
FROM Reviewer 
JOIN Rating ON Reviewer.rID=Rating.rID
JOIN Movie ON Rating.mID=Movie.mID
WHERE director LIKE Reviewer.name;



Q3

'Return all reviewer names and movie names together in a single list, alphabetized.
(Sorting by the first name of the reviewer and first word in the title is fine;
no need for special processing on last names or removing "The".)'

SELECT DISTINCT Movie.title, Reviewer.name
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
JOIN Reviewer
ON Reviewer.rID=Rating.rID;

SELECT namesAndTitles
FROM
(SELECT Reviewer.name AS namesAndTitles, Movie.title AS namesAndTitles
FROM Reviewer
JOIN Rating
ON Rating.rID=Reviewer.rID
JOIN Movie
ON Rating.mID=Movie.mID) AS Result;

ERROR 1060 (42S21): Duplicate column name 'namesAndTitles'


SELECT Movie.title AS namesAndTitles
FROM Movie
UNION
SELECT Reviewer.name AS namesAndTitles
FROM Reviewer
ORDER BY namesAndTitles ASC;




Q4

'Find the titles of all movies not reviewed by Chris Jackson.'

SELECT DISTINCT Movie.title
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
JOIN Reviewer
ON Reviewer.rID=Rating.rID
WHERE Reviewer.name NOT LIKE "Chris Jackson";

SELECT *
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
JOIN Reviewer
ON Reviewer.rID=Rating.rID

SELECT DISTINCT Movie.title
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Rating.rID != 205;

SELECT 
(SELECT DISTINCT Movie.title
FROM movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Rating.rID != 205)
-
(SELECT DISTINCT Movie.title
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Rating.rID=205);

'ERROR 1242 (21000): Subquery returns more than 1 row'

SELECT Movie.title
FROM movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
EXCEPT
SELECT Movie.title
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
WHERE Rating.rID=205;

'above query works in SQLite, but not in mySQL (no EXCEPT keyword in mySQL)'

SELECT DISTINCT Movie.title, Movie.mID
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
WHERE Rating.mID
NOT IN 
(SELECT Rating.mID
FROM Rating
WHERE Rating.rID=205);

'fails to give back the movies that werent reviewed at all'
'because WHERE condition is on Rating.mID and not Movie.mID'

SELECT DISTINCT Movie.title
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
WHERE Movie.mID
NOT IN 
(SELECT Rating.mID
FROM Rating
WHERE Rating.rID=205);

'this works but its supposed to be inefficient'

SELECT DISTINCT Movie.title
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
WHERE rID IS NULL
OR 
rID!=205;

SELECT DISTINCT Movie.title, Movie.mID
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
WHERE rID IS NULL;

SELECT Movie.title, rID
FROM Movie
JOIN Rating
ON Movie.mID=Rating.mID
ORDER BY Movie.title ASC;

SELECT *
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
ORDER BY Movie.title ASC;

SELECT Movie.title, rID
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
GROUP BY Movie.mID
HAVING rID=205
ORDER BY Movie.title ASC;

SELECT Movie.title,
GROUP_CONCAT(rID)
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
GROUP BY Movie.mID;

SELECT title
FROM 
(SELECT Movie.title,
GROUP_CONCAT(rID) AS concat
FROM Movie
LEFT JOIN Rating
ON Movie.mID=Rating.mID
GROUP BY Movie.mID) as unFiltered
WHERE concat NOT LIKE "%205%"
OR concat IS NULL;

'this last one is working and does not use NOT IN,
but *does* use NOT LIKE and GROUP_CONCAT, sooo...'



Q5

'For all pairs of reviewers such that both reviewers 
gave a rating to the same movie, return the names of
both reviewers. Eliminate duplicates, dont pair reviewers
with themselves, and include each pair only once. For each
pair, return the names in the pair in alphabetical order'




Q6

'For each rating that is the lowest (fewest stars) 
currently in the database, return the reviewer name,
movie title, and number of stars.'


SELECT Reviewer.name, title, stars
FROM Rating
LEFT JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
On Rating.mID=Movie.mID;

SELECT name, title, stars
FROM Rating
LEFT JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
On Rating.mID=Movie.mID
GROUP BY Movie.mID
HAVING stars=MIN(stars);

'completely misunderstood the task, data should be returned
for the movies having the lowest star rating in the database altogether,
not per movie'

SELECT name, title, MIN(stars) as stars
FROM Rating
JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
ON Rating.mID=Movie.mID
GROUP BY Movie.mID
HAVING stars= (SELECT MIN(stars) FROM Rating);

'the above DOES work in mySQL, but fails in SQLite, returns completely different results'

SELECT name, title, stars
FROM Rating
JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
ON Rating.mID=Movie.mID
ORDER BY stars;

SELECT name, title, stars
FROM Rating
JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
ON Rating.mID=Movie.mID
ORDER BY stars
LIMIT COUNT(SELECT mID FROM Rating WHERE );

SELECT name, title, stars
FROM Rating
JOIN Reviewer
ON Rating.rID=Reviewer.rID
JOIN Movie
ON Rating.mID=Movie.mID
WHERE stars = (SELECT MIN(stars) FROM Rating);

'this last one works as expected both in SQLite and mySQL'
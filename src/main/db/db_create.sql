/* Database Schema */

CREATE TABLE news (
  id              INT PRIMARY KEY,
  name            TEXT NOT NULL,
  content            TEXT NOT NULL,
  author TEXT NOT NULL
);


CREATE TABLE categories (
  id              INT PRIMARY KEY,
  name            TEXT NOT NULL
);

CREATE TABLE news_categories(
  post_id         INT REFERENCES news (id) ON UPDATE CASCADE ON DELETE CASCADE,
  category_id    INT REFERENCES categories (id) ON UPDATE CASCADE,
  CONSTRAINT post_category_pkey PRIMARY KEY (post_id, category_id)
);


/*CATEGORIES*/
INSERT INTO categories (id, name) VALUES (0, 'Sport');
INSERT INTO categories (id, name) VALUES (1, 'Rest');
INSERT INTO categories (id, name) VALUES (2, 'Social');


/* NEWS*/
INSERT INTO news (id, name, content, author) VALUES (0, 'Robbery', 'Someathing about todays robbery', 'Misha Kharkov');
INSERT INTO news (id, name, content, author) VALUES (1, 'Funerals', 'Someathing about todays funerals', 'Vasya Kurochkin');
INSERT INTO news (id, name, content, author) VALUES (2, 'Concert', 'Someathing about todays concert', 'John Korch');
INSERT INTO news (id, name, content, author) VALUES (3, 'Festival', 'Someathing about todays festival', 'jim Kirk');
INSERT INTO news (id, name, content, author) VALUES (4, 'Comicon', 'Someathing about comicon', 'jim Kirk');
INSERT INTO news (id, name, content, author) VALUES (5, 'Football match', 'Someathing about todays match', 'John Smit');
INSERT INTO news (id, name, content, author) VALUES (6, 'Murder', 'Someathing about todays murder', 'Spock');
INSERT INTO news (id, name, content, author) VALUES (7, 'FoodFest', 'Someathing about food festival', 'McCoy');
INSERT INTO news (id, name, content, author) VALUES (8, 'MovieFest', 'Someathing about movie festival', 'Sheldon Cooper');
INSERT INTO news (id, name, content, author) VALUES (9, 'Presentation', 'Someathing about todays presentation', 'Forest Bondurant');
INSERT INTO news (id, name, content, author) VALUES (10, 'School opening', 'Someathing about school opening', 'NoName');

/* MANY TO MANY*/

INSERT INTO news_categories (post_id, category_id) VALUES (5,0);
INSERT INTO news_categories (post_id, category_id) VALUES (3,0);
INSERT INTO news_categories (post_id, category_id) VALUES (4,0);
INSERT INTO news_categories (post_id, category_id) VALUES (2,1);
INSERT INTO news_categories (post_id, category_id) VALUES (3,1);
INSERT INTO news_categories (post_id, category_id) VALUES (4,1);
INSERT INTO news_categories (post_id, category_id) VALUES (7,1);
INSERT INTO news_categories (post_id, category_id) VALUES (8,1);
INSERT INTO news_categories (post_id, category_id) VALUES (0,2);
INSERT INTO news_categories (post_id, category_id) VALUES (1,2);
INSERT INTO news_categories (post_id, category_id) VALUES (2,2);
INSERT INTO news_categories (post_id, category_id) VALUES (5,2);
INSERT INTO news_categories (post_id, category_id) VALUES (1,2);
INSERT INTO news_categories (post_id, category_id) VALUES (9,2);
INSERT INTO news_categories (post_id, category_id) VALUES (6,2);


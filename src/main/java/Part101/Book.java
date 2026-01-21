package Part101;

import java.text.MessageFormat;


    public class Book{

        private String author;
        private String title;
        private int year;
        private int pages;

        public Book(String author, String title, int pages, int year ){
            this.author = author;
            this.title = title;
            this.pages = pages;
            this.year = year;
        }


        public String toString(){
            return MessageFormat.format("{0}, {1}, {2}, {3}",this.author,this.title,this.pages,this.year);
        }
    }


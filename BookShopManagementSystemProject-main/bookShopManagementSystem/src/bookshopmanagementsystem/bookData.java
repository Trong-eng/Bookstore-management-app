/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @Author     : MarcoMan
    Support and Subscribe our channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 */
public class bookData {
    
    private Integer bookId;
    private String title;
    private String author;
    private String genre;
    private Date date;
    private Double price;
    private String image;
    // MAKE SURE YOU FOLLOWED THE PARAMETERS THAT I PUT
    public bookData(Integer bookId, String title, String author, String genre
            , Date date, Double price, String image){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.date = date;
        this.price = price;
        this.image = image;
    }
    public Integer getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public Date getDate(){
        return date;
    }
    public Double getPrice(){
        return price;
    }
    public String getImage(){
        return image;
    }
    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    // Convert String input in DD/MM/YYYY format to java.sql.Date for database
    public static Date parseDateFromDDMMYYYY(String dateStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date parsedDate = sdf.parse(dateStr);
        return new java.sql.Date(parsedDate.getTime());
    
    }
}
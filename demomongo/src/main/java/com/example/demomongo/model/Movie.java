package com.example.demomongo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
public class Movie {
    @Id
    private String id;
    private String title;
    private String year;


    private List<String> directors;

    public Movie() {}


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", year=" + year + "]";
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getDirectors() {
        return directors;
    }


    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

}

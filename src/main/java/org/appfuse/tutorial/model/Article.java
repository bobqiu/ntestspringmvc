
package org.appfuse.tutorial.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "article")
@Indexed
@XmlRootElement
public class Article {

    private Long id;

    private String title;
    private String content;
    private Set<Category> categorys = new HashSet<Category>();
    private Date pubDate;
    private String digest;
    private String keyword;
    private Long author;

    
    /**
     * Description: the id to get
     *
     * @return the id
     * @see org.appfuse.tutorial.model.Article#id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable=false)
    public Long getId() {
        return id;
    }

    
    /**
     * Description: the id to set
     *
     * @param id
     * @see org.appfuse.tutorial.model.Article#id
     */
    public void setId(Long id) {
        this.id = id;
    }


    
    /**
     * Description: the title to get
     *
     * @return the title
     * @see org.appfuse.tutorial.model.Article#title
     */
    @Column(name="title",length=500)
    @Field
    public String getTitle() {
        return title;
    }


    
    /**
     * Description: the title to set
     *
     * @param title
     * @see org.appfuse.tutorial.model.Article#title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    
    /**
     * Description: the content to get
     *
     * @return the content
     * @see org.appfuse.tutorial.model.Article#content
     */
    @Lob
    @Basic(fetch = FetchType.LAZY) 
    /*@Type(type="longtext")*/
    @Column(name="content", columnDefinition="longtext",length = 16777216)
    @Field
    public String getContent() {
        return content;
    }


    
    /**
     * Description: the content to set
     *
     * @param content
     * @see org.appfuse.tutorial.model.Article#content
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * Description: the categorys to get
     *
     * @return the categorys
     * @see org.appfuse.tutorial.model.Article#categorys
     */
    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE},mappedBy="articles")
    public Set<Category> getCategorys() {
        return categorys;
    }


    
    /**
     * Description: the categorys to set
     *
     * @param categorys
     * @see org.appfuse.tutorial.model.Article#categorys
     */
    public void setCategorys(Set<Category> categorys) {
        this.categorys = categorys;
    }


    /**
     * Description: the pubDate to get
     *
     * @return the pubDate
     * @see org.appfuse.tutorial.model.Article#pubDate
     */
    @Column(name="pubdate")
    @Field
    public Date getPubDate() {
        return pubDate;
    }


    
    /**
     * Description: the pubDate to set
     *
     * @param pubDate
     * @see org.appfuse.tutorial.model.Article#pubDate
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }


    
    /**
     * Description: the summa to get
     *
     * @return the summa
     * @see org.appfuse.tutorial.model.Article#summa
     */
    @Column(length=4000,name="digest")
    @Field
    public String getDigest() {
        return digest;
    }


    
    /**
     * Description: the summa to set
     *
     * @param summa
     * @see org.appfuse.tutorial.model.Article#summa
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }


    
    /**
     * Description: the keyword to get
     *
     * @return the keyword
     * @see org.appfuse.tutorial.model.Article#keyword
     */
    @Column(length=500,name="keyword")
    @Field
    public String getKeyword() {
        return keyword;
    }


    
    /**
     * Description: the keyword to set
     *
     * @param keyword
     * @see org.appfuse.tutorial.model.Article#keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    
    /**
     * Description: the author to get
     *
     * @return the author
     * @see org.appfuse.tutorial.model.Article#author
     */
    @Column(name="author")
    @Field
    public Long getAuthor() {
        return author;
    }


    
    /**
     * Description: the author to set
     *
     * @param author
     * @see org.appfuse.tutorial.model.Article#author
     */
    public void setAuthor(Long author) {
        this.author = author;
    }

    
   
    
}

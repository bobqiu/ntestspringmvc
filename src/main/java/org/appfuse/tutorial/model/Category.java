/*
 * @(#)Catalogry.java
 *
  */

package org.appfuse.tutorial.model;

import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * Title : Catalogry
 *
 * @author  qiubo
 * @version 1.0.0.2013-8-25
 */
@Entity
@Table(name = "category")
public class Category {
private long id;
private String value;
private Set<Article> articles=new HashSet<Article>();
/**
 * Description: the value to get
 *
 * @return the value
 * @see org.appfuse.tutorial.model.Category#value
 */
@Column(name="category_name",nullable=false,length=20)
@Field
public String getValue() {
    return value;
}


/**
 * Description: the id to get
 *
 * @return the id
 * @see org.appfuse.tutorial.model.Category#id
 */
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="category_id",nullable=false)
public long getId() {
    return id;
}



/**
 * Description: the articles to get
 *
 * @return the articles
 * @see org.appfuse.tutorial.model.Category#articles
 */
@ManyToMany(cascade = CascadeType.PERSIST,fetch=FetchType.LAZY)
@JoinTable(name="article_category",joinColumns={@JoinColumn(name="category_id")},inverseJoinColumns={@JoinColumn(name="article_id")})
public Set<Article> getArticles() {
    return articles;
}



/**
 * Description: the articles to set
 *
 * @param articles
 * @see org.appfuse.tutorial.model.Category#articles
 */
public void setArticles(Set<Article> articles) {
    this.articles = articles;
}


/**
 * Description: the id to set
 *
 * @param id
 * @see org.appfuse.tutorial.model.Category#id
 */
public void setId(long id) {
    this.id = id;
}

/**
 * Description: the value to set
 *
 * @param value
 * @see org.appfuse.tutorial.model.Category#value
 */
public void setValue(String value) {
    this.value = value;
}

}

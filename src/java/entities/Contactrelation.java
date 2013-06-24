package entities;
// Generated Jun 24, 2013 4:38:10 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contactrelation generated by hbm2java
 */
@Entity
@Table(name="contactrelation"
    ,catalog="contactmanagementsystem"
)
public class Contactrelation  implements java.io.Serializable {


     private Integer contactRelationId;
     private Contactlist contactlist;
     private String nickName;
     private Integer rating;
     private String notes;
     private String personalMsg;

    public Contactrelation() {
    }

    public Contactrelation(Contactlist contactlist, String nickName, Integer rating, String notes, String personalMsg) {
       this.contactlist = contactlist;
       this.nickName = nickName;
       this.rating = rating;
       this.notes = notes;
       this.personalMsg = personalMsg;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="contactRelationId", unique=true, nullable=false)
    public Integer getContactRelationId() {
        return this.contactRelationId;
    }
    
    public void setContactRelationId(Integer contactRelationId) {
        this.contactRelationId = contactRelationId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contactListId")
    public Contactlist getContactlist() {
        return this.contactlist;
    }
    
    public void setContactlist(Contactlist contactlist) {
        this.contactlist = contactlist;
    }
    
    @Column(name="nickName", length=30)
    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    @Column(name="rating")
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    @Column(name="notes", length=300)
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    @Column(name="personalMsg", length=300)
    public String getPersonalMsg() {
        return this.personalMsg;
    }
    
    public void setPersonalMsg(String personalMsg) {
        this.personalMsg = personalMsg;
    }




}



package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * DomainsMapping generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`DOMAINSMAPPING`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`NOTIFICATIONSERVICEMAPPINGID`", "`NAME`"})
)
public class DomainsMapping extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer domainsMappingId;
     protected NotificationServiceMapping notificationServiceMapping;
     protected String name;
     protected String notificationService;

    public DomainsMapping() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="DomainM_seq")}
	)

    
    @Column(name="`DOMAINSMAPPINGID`", unique=true, nullable=false)
    public Integer getDomainsMappingId() {
        return this.domainsMappingId;
    }
    
    public void setDomainsMappingId(Integer domainsMappingId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("domainsMappingId", this.domainsMappingId, this.domainsMappingId = domainsMappingId);
        else
            this.domainsMappingId = domainsMappingId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`NOTIFICATIONSERVICEMAPPINGID`", nullable=false)
    public NotificationServiceMapping getNotificationServiceMapping() {
        return this.notificationServiceMapping;
    }
    
    public void setNotificationServiceMapping(NotificationServiceMapping notificationServiceMapping) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("notificationServiceMapping", this.notificationServiceMapping, this.notificationServiceMapping = notificationServiceMapping);
        else
            this.notificationServiceMapping = notificationServiceMapping;
    }


    
    @Column(name="`NAME`", nullable=false, length=256)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("name", this.name, this.name = name);
        else
            this.name = name;
    }


    
    @Column(name="`NOTIFICATIONSERVICE`", nullable=false, length=256)
    public String getNotificationService() {
        return this.notificationService;
    }
    
    public void setNotificationService(String notificationService) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("notificationService", this.notificationService, this.notificationService = notificationService);
        else
            this.notificationService = notificationService;
    }



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DomainsMapping) ) return false;
		 DomainsMapping castOther = ( DomainsMapping ) other;

		 return ( (this.getNotificationServiceMapping()==castOther.getNotificationServiceMapping()) || ( this.getNotificationServiceMapping()!=null && castOther.getNotificationServiceMapping()!=null && this.getNotificationServiceMapping().equals(castOther.getNotificationServiceMapping()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getNotificationServiceMapping() == null ? 0 : this.getNotificationServiceMapping().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         return result;
   }


}



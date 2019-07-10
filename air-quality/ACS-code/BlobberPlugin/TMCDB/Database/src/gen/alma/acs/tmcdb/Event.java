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
 * Event generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`EVENT`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`EVENTCHANNELID`", "`NAME`"})
)
public class Event extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer eventId;
     protected EventChannel eventChannel;
     protected String name;
     protected Double maxProcessTime;

    public Event() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="Event_seq")}
	)

    
    @Column(name="`EVENTID`", unique=true, nullable=false)
    public Integer getEventId() {
        return this.eventId;
    }
    
    public void setEventId(Integer eventId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("eventId", this.eventId, this.eventId = eventId);
        else
            this.eventId = eventId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`EVENTCHANNELID`", nullable=false)
    public EventChannel getEventChannel() {
        return this.eventChannel;
    }
    
    public void setEventChannel(EventChannel eventChannel) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("eventChannel", this.eventChannel, this.eventChannel = eventChannel);
        else
            this.eventChannel = eventChannel;
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


    
    @Column(name="`MAXPROCESSTIME`", precision=64, scale=0)
    public Double getMaxProcessTime() {
        return this.maxProcessTime;
    }
    
    public void setMaxProcessTime(Double maxProcessTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxProcessTime", this.maxProcessTime, this.maxProcessTime = maxProcessTime);
        else
            this.maxProcessTime = maxProcessTime;
    }



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Event) ) return false;
		 Event castOther = ( Event ) other;

		 return ( (this.getEventChannel()==castOther.getEventChannel()) || ( this.getEventChannel()!=null && castOther.getEventChannel()!=null && this.getEventChannel().equals(castOther.getEventChannel()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getEventChannel() == null ? 0 : this.getEventChannel().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         return result;
   }


}



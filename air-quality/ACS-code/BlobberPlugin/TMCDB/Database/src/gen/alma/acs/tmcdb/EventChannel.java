package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import alma.hibernate.util.StringEnumUserType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

/**
 * EventChannel generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`EVENTCHANNEL`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`NAME`", "`PATH`", "`CONFIGURATIONID`"})
)
@TypeDefs({
@TypeDef(name="EventChannelOrderPolicy", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.EventChannelOrderPolicy") }),
@TypeDef(name="EventChannelConReliability", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.EventChannelConReliability") }),
@TypeDef(name="EventChannelEventReliability", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.EventChannelEventReliability") }),
@TypeDef(name="EventChannelDiscardPolicy", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.EventChannelDiscardPolicy") })
})
public class EventChannel extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer eventChannelId;
     protected Configuration configuration;
     protected String name;
     protected String path;
     protected Boolean integrationLogs;
     protected Integer maxQueueLength;
     protected Integer maxConsumers;
     protected Integer maxSuppliers;
     protected Boolean rejectNewEvents;
     protected EventChannelDiscardPolicy discardPolicy;
     protected EventChannelEventReliability eventReliability;
     protected EventChannelConReliability connectionReliability;
     protected Short priority;
     protected Integer timeout;
     protected EventChannelOrderPolicy orderPolicy;
     protected Boolean startTimeSupported;
     protected Boolean stopTimeSupported;
     protected Integer maxEventsPerConsumer;
     private Set<Event> events = new HashSet<Event>(0);

    public EventChannel() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="EventChannel_seq")}
	)

    
    @Column(name="`EVENTCHANNELID`", unique=true, nullable=false)
    public Integer getEventChannelId() {
        return this.eventChannelId;
    }
    
    public void setEventChannelId(Integer eventChannelId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("eventChannelId", this.eventChannelId, this.eventChannelId = eventChannelId);
        else
            this.eventChannelId = eventChannelId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`CONFIGURATIONID`", nullable=false)
    public Configuration getConfiguration() {
        return this.configuration;
    }
    
    public void setConfiguration(Configuration configuration) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("configuration", this.configuration, this.configuration = configuration);
        else
            this.configuration = configuration;
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


    
    @Column(name="`PATH`", nullable=false, length=256)
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("path", this.path, this.path = path);
        else
            this.path = path;
    }


    
    @Column(name="`INTEGRATIONLOGS`")
    public Boolean getIntegrationLogs() {
        return this.integrationLogs;
    }
    
    public void setIntegrationLogs(Boolean integrationLogs) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("integrationLogs", this.integrationLogs, this.integrationLogs = integrationLogs);
        else
            this.integrationLogs = integrationLogs;
    }


    
    @Column(name="`MAXQUEUELENGTH`")
    public Integer getMaxQueueLength() {
        return this.maxQueueLength;
    }
    
    public void setMaxQueueLength(Integer maxQueueLength) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxQueueLength", this.maxQueueLength, this.maxQueueLength = maxQueueLength);
        else
            this.maxQueueLength = maxQueueLength;
    }


    
    @Column(name="`MAXCONSUMERS`")
    public Integer getMaxConsumers() {
        return this.maxConsumers;
    }
    
    public void setMaxConsumers(Integer maxConsumers) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxConsumers", this.maxConsumers, this.maxConsumers = maxConsumers);
        else
            this.maxConsumers = maxConsumers;
    }


    
    @Column(name="`MAXSUPPLIERS`")
    public Integer getMaxSuppliers() {
        return this.maxSuppliers;
    }
    
    public void setMaxSuppliers(Integer maxSuppliers) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxSuppliers", this.maxSuppliers, this.maxSuppliers = maxSuppliers);
        else
            this.maxSuppliers = maxSuppliers;
    }


    
    @Column(name="`REJECTNEWEVENTS`")
    public Boolean getRejectNewEvents() {
        return this.rejectNewEvents;
    }
    
    public void setRejectNewEvents(Boolean rejectNewEvents) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("rejectNewEvents", this.rejectNewEvents, this.rejectNewEvents = rejectNewEvents);
        else
            this.rejectNewEvents = rejectNewEvents;
    }


    
    @Column(name="`DISCARDPOLICY`", length=16777216)
	@Type(type="EventChannelDiscardPolicy")
    public EventChannelDiscardPolicy getDiscardPolicy() {
        return this.discardPolicy;
    }
    
    public void setDiscardPolicy(EventChannelDiscardPolicy discardPolicy) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("discardPolicy", this.discardPolicy, this.discardPolicy = discardPolicy);
        else
            this.discardPolicy = discardPolicy;
    }


    
    @Column(name="`EVENTRELIABILITY`", length=16777216)
	@Type(type="EventChannelEventReliability")
    public EventChannelEventReliability getEventReliability() {
        return this.eventReliability;
    }
    
    public void setEventReliability(EventChannelEventReliability eventReliability) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("eventReliability", this.eventReliability, this.eventReliability = eventReliability);
        else
            this.eventReliability = eventReliability;
    }


    
    @Column(name="`CONNECTIONRELIABILITY`", length=16777216)
	@Type(type="EventChannelConReliability")
    public EventChannelConReliability getConnectionReliability() {
        return this.connectionReliability;
    }
    
    public void setConnectionReliability(EventChannelConReliability connectionReliability) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("connectionReliability", this.connectionReliability, this.connectionReliability = connectionReliability);
        else
            this.connectionReliability = connectionReliability;
    }


    
    @Column(name="`PRIORITY`")
    public Short getPriority() {
        return this.priority;
    }
    
    public void setPriority(Short priority) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("priority", this.priority, this.priority = priority);
        else
            this.priority = priority;
    }


    
    @Column(name="`TIMEOUT`")
    public Integer getTimeout() {
        return this.timeout;
    }
    
    public void setTimeout(Integer timeout) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("timeout", this.timeout, this.timeout = timeout);
        else
            this.timeout = timeout;
    }


    
    @Column(name="`ORDERPOLICY`", length=16777216)
	@Type(type="EventChannelOrderPolicy")
    public EventChannelOrderPolicy getOrderPolicy() {
        return this.orderPolicy;
    }
    
    public void setOrderPolicy(EventChannelOrderPolicy orderPolicy) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("orderPolicy", this.orderPolicy, this.orderPolicy = orderPolicy);
        else
            this.orderPolicy = orderPolicy;
    }


    
    @Column(name="`STARTTIMESUPPORTED`")
    public Boolean getStartTimeSupported() {
        return this.startTimeSupported;
    }
    
    public void setStartTimeSupported(Boolean startTimeSupported) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("startTimeSupported", this.startTimeSupported, this.startTimeSupported = startTimeSupported);
        else
            this.startTimeSupported = startTimeSupported;
    }


    
    @Column(name="`STOPTIMESUPPORTED`")
    public Boolean getStopTimeSupported() {
        return this.stopTimeSupported;
    }
    
    public void setStopTimeSupported(Boolean stopTimeSupported) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("stopTimeSupported", this.stopTimeSupported, this.stopTimeSupported = stopTimeSupported);
        else
            this.stopTimeSupported = stopTimeSupported;
    }


    
    @Column(name="`MAXEVENTSPERCONSUMER`")
    public Integer getMaxEventsPerConsumer() {
        return this.maxEventsPerConsumer;
    }
    
    public void setMaxEventsPerConsumer(Integer maxEventsPerConsumer) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxEventsPerConsumer", this.maxEventsPerConsumer, this.maxEventsPerConsumer = maxEventsPerConsumer);
        else
            this.maxEventsPerConsumer = maxEventsPerConsumer;
    }


@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="eventChannel")
    @Cascade( {org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK} )
    public Set<Event> getEvents() {
        return this.events;
    }
    
    public void setEvents(Set<Event> events) {    
    	this.events = events;
    }

	public void addEvents(Set<Event> elements) {
		if( this.events != null )
			for(Iterator<Event> it = elements.iterator(); it.hasNext(); )
				addEventToEvents((Event)it.next());
	}

	public void addEventToEvents(Event element) {
		if( !this.events.contains(element) ) {
			this.events.add(element);
		}
	}



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventChannel) ) return false;
		 EventChannel castOther = ( EventChannel ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getPath()==castOther.getPath()) || ( this.getPath()!=null && castOther.getPath()!=null && this.getPath().equals(castOther.getPath()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getPath() == null ? 0 : this.getPath().hashCode() );
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         return result;
   }


}



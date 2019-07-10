package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * BaseElementOnline generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`BASEELEMENTONLINE`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`BASEELEMENTID`", "`CONFIGURATIONID`", "`STARTTIME`"})
)
public class BaseElementOnline extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer baseElementOnlineId;
     protected HWConfiguration HWConfiguration;
     protected BaseElement baseElement;
     protected Long startTime;
     protected Long endTime;
     protected Boolean normalTermination;
     private Set<AssemblyOnline> assemblyOnlines = new HashSet<AssemblyOnline>(0);

    public BaseElementOnline() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="BaseElO_seq")}
	)

    
    @Column(name="`BASEELEMENTONLINEID`", unique=true, nullable=false)
    public Integer getBaseElementOnlineId() {
        return this.baseElementOnlineId;
    }
    
    public void setBaseElementOnlineId(Integer baseElementOnlineId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElementOnlineId", this.baseElementOnlineId, this.baseElementOnlineId = baseElementOnlineId);
        else
            this.baseElementOnlineId = baseElementOnlineId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`CONFIGURATIONID`", nullable=false)
    public HWConfiguration getHWConfiguration() {
        return this.HWConfiguration;
    }
    
    public void setHWConfiguration(HWConfiguration HWConfiguration) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("HWConfiguration", this.HWConfiguration, this.HWConfiguration = HWConfiguration);
        else
            this.HWConfiguration = HWConfiguration;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`BASEELEMENTID`", nullable=false)
    public BaseElement getBaseElement() {
        return this.baseElement;
    }
    
    public void setBaseElement(BaseElement baseElement) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElement", this.baseElement, this.baseElement = baseElement);
        else
            this.baseElement = baseElement;
    }


    
    @Column(name="`STARTTIME`", nullable=false)
    public Long getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Long startTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("startTime", this.startTime, this.startTime = startTime);
        else
            this.startTime = startTime;
    }


    
    @Column(name="`ENDTIME`")
    public Long getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Long endTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("endTime", this.endTime, this.endTime = endTime);
        else
            this.endTime = endTime;
    }


    
    @Column(name="`NORMALTERMINATION`", nullable=false)
    public Boolean getNormalTermination() {
        return this.normalTermination;
    }
    
    public void setNormalTermination(Boolean normalTermination) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("normalTermination", this.normalTermination, this.normalTermination = normalTermination);
        else
            this.normalTermination = normalTermination;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="baseElementOnline")
    public Set<AssemblyOnline> getAssemblyOnlines() {
        return this.assemblyOnlines;
    }
    
    public void setAssemblyOnlines(Set<AssemblyOnline> assemblyOnlines) {    
    	this.assemblyOnlines = assemblyOnlines;
    }

	public void addAssemblyOnlines(Set<AssemblyOnline> elements) {
		if( this.assemblyOnlines != null )
			for(Iterator<AssemblyOnline> it = elements.iterator(); it.hasNext(); )
				addAssemblyOnlineToAssemblyOnlines((AssemblyOnline)it.next());
	}

	public void addAssemblyOnlineToAssemblyOnlines(AssemblyOnline element) {
		if( !this.assemblyOnlines.contains(element) ) {
			this.assemblyOnlines.add(element);
		}
	}



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BaseElementOnline) ) return false;
		 BaseElementOnline castOther = ( BaseElementOnline ) other;

		 return ( (this.getHWConfiguration()==castOther.getHWConfiguration()) || ( this.getHWConfiguration()!=null && castOther.getHWConfiguration()!=null && this.getHWConfiguration().equals(castOther.getHWConfiguration()) ) )
 && ( (this.getBaseElement()==castOther.getBaseElement()) || ( this.getBaseElement()!=null && castOther.getBaseElement()!=null && this.getBaseElement().equals(castOther.getBaseElement()) ) )
 && ( (this.getStartTime()==castOther.getStartTime()) || ( this.getStartTime()!=null && castOther.getStartTime()!=null && this.getStartTime().equals(castOther.getStartTime()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getHWConfiguration() == null ? 0 : this.getHWConfiguration().hashCode() );
         result = 37 * result + ( getBaseElement() == null ? 0 : this.getBaseElement().hashCode() );
         result = 37 * result + ( getStartTime() == null ? 0 : this.getStartTime().hashCode() );
         
         
         
         return result;
   }


}



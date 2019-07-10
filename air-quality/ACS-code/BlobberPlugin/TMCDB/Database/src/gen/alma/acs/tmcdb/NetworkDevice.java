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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * NetworkDevice generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`NETWORKDEVICE`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`NETWORKNAME`", "`CONFIGURATIONID`"})
)
@Inheritance(strategy=InheritanceType.JOINED)
public class NetworkDevice extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer networkDeviceId;
     protected Configuration configuration;
     protected String networkName;
     protected String physicalLocation;
     protected String name;
     private Set<PowerstripSocket> powerstripSockets = new HashSet<PowerstripSocket>(0);
     protected NetworkDeviceSnmpConfig networkDeviceSnmpConfig;

    public NetworkDevice() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="NetworD_seq")}
	)

    
    @Column(name="`NETWORKDEVICEID`", unique=true, nullable=false)
    public Integer getNetworkDeviceId() {
        return this.networkDeviceId;
    }
    
    public void setNetworkDeviceId(Integer networkDeviceId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("networkDeviceId", this.networkDeviceId, this.networkDeviceId = networkDeviceId);
        else
            this.networkDeviceId = networkDeviceId;
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


    
    @Column(name="`NETWORKNAME`", nullable=false, length=256)
    public String getNetworkName() {
        return this.networkName;
    }
    
    public void setNetworkName(String networkName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("networkName", this.networkName, this.networkName = networkName);
        else
            this.networkName = networkName;
    }


    
    @Column(name="`PHYSICALLOCATION`", length=256)
    public String getPhysicalLocation() {
        return this.physicalLocation;
    }
    
    public void setPhysicalLocation(String physicalLocation) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("physicalLocation", this.physicalLocation, this.physicalLocation = physicalLocation);
        else
            this.physicalLocation = physicalLocation;
    }


    
    @Column(name="`NAME`", length=256)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("name", this.name, this.name = name);
        else
            this.name = name;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="networkDevice")
    public Set<PowerstripSocket> getPowerstripSockets() {
        return this.powerstripSockets;
    }
    
    public void setPowerstripSockets(Set<PowerstripSocket> powerstripSockets) {    
    	this.powerstripSockets = powerstripSockets;
    }

	public void addPowerstripSockets(Set<PowerstripSocket> elements) {
		if( this.powerstripSockets != null )
			for(Iterator<PowerstripSocket> it = elements.iterator(); it.hasNext(); )
				addPowerstripSocketToPowerstripSockets((PowerstripSocket)it.next());
	}

	public void addPowerstripSocketToPowerstripSockets(PowerstripSocket element) {
		if( !this.powerstripSockets.contains(element) ) {
			this.powerstripSockets.add(element);
		}
	}


@OneToOne(fetch=FetchType.LAZY, mappedBy="networkDevice")
    public NetworkDeviceSnmpConfig getNetworkDeviceSnmpConfig() {
        return this.networkDeviceSnmpConfig;
    }
    
    public void setNetworkDeviceSnmpConfig(NetworkDeviceSnmpConfig networkDeviceSnmpConfig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("networkDeviceSnmpConfig", this.networkDeviceSnmpConfig, this.networkDeviceSnmpConfig = networkDeviceSnmpConfig);
        else
            this.networkDeviceSnmpConfig = networkDeviceSnmpConfig;
    }



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NetworkDevice) ) return false;
		 NetworkDevice castOther = ( NetworkDevice ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getNetworkName()==castOther.getNetworkName()) || ( this.getNetworkName()!=null && castOther.getNetworkName()!=null && this.getNetworkName().equals(castOther.getNetworkName()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         result = 37 * result + ( getNetworkName() == null ? 0 : this.getNetworkName().hashCode() );
         
         
         
         
         return result;
   }


}



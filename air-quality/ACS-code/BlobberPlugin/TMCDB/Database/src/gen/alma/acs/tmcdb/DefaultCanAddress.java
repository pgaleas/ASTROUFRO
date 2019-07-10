package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * DefaultCanAddress generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`DEFAULTCANADDRESS`"
)
public class DefaultCanAddress extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer componentId;
     protected Component component;
     protected Boolean isEthernet;
     protected String nodeAddress;
     protected Byte channelNumber;
     protected String hostname;
     protected Integer port;
     protected String macAddress;
     protected Short retries;
     protected Double timeOutRxTx;
     protected Integer lingerTime;

    public DefaultCanAddress() {
    }
   
       @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="component"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="`COMPONENTID`", unique=true, nullable=false)
    public Integer getComponentId() {
        return this.componentId;
    }
    
    public void setComponentId(Integer componentId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("componentId", this.componentId, this.componentId = componentId);
        else
            this.componentId = componentId;
    }


@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Component getComponent() {
        return this.component;
    }
    
    public void setComponent(Component component) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("component", this.component, this.component = component);
        else
            this.component = component;
    }


    
    @Column(name="`ISETHERNET`", nullable=false)
    public Boolean getIsEthernet() {
        return this.isEthernet;
    }
    
    public void setIsEthernet(Boolean isEthernet) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("isEthernet", this.isEthernet, this.isEthernet = isEthernet);
        else
            this.isEthernet = isEthernet;
    }


    
    @Column(name="`NODEADDRESS`", length=16)
    public String getNodeAddress() {
        return this.nodeAddress;
    }
    
    public void setNodeAddress(String nodeAddress) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("nodeAddress", this.nodeAddress, this.nodeAddress = nodeAddress);
        else
            this.nodeAddress = nodeAddress;
    }


    
    @Column(name="`CHANNELNUMBER`")
    public Byte getChannelNumber() {
        return this.channelNumber;
    }
    
    public void setChannelNumber(Byte channelNumber) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("channelNumber", this.channelNumber, this.channelNumber = channelNumber);
        else
            this.channelNumber = channelNumber;
    }


    
    @Column(name="`HOSTNAME`", length=80)
    public String getHostname() {
        return this.hostname;
    }
    
    public void setHostname(String hostname) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("hostname", this.hostname, this.hostname = hostname);
        else
            this.hostname = hostname;
    }


    
    @Column(name="`PORT`")
    public Integer getPort() {
        return this.port;
    }
    
    public void setPort(Integer port) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("port", this.port, this.port = port);
        else
            this.port = port;
    }


    
    @Column(name="`MACADDRESS`", length=80)
    public String getMacAddress() {
        return this.macAddress;
    }
    
    public void setMacAddress(String macAddress) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("macAddress", this.macAddress, this.macAddress = macAddress);
        else
            this.macAddress = macAddress;
    }


    
    @Column(name="`RETRIES`")
    public Short getRetries() {
        return this.retries;
    }
    
    public void setRetries(Short retries) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("retries", this.retries, this.retries = retries);
        else
            this.retries = retries;
    }


    
    @Column(name="`TIMEOUTRXTX`", precision=64, scale=0)
    public Double getTimeOutRxTx() {
        return this.timeOutRxTx;
    }
    
    public void setTimeOutRxTx(Double timeOutRxTx) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("timeOutRxTx", this.timeOutRxTx, this.timeOutRxTx = timeOutRxTx);
        else
            this.timeOutRxTx = timeOutRxTx;
    }


    
    @Column(name="`LINGERTIME`")
    public Integer getLingerTime() {
        return this.lingerTime;
    }
    
    public void setLingerTime(Integer lingerTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("lingerTime", this.lingerTime, this.lingerTime = lingerTime);
        else
            this.lingerTime = lingerTime;
    }





}



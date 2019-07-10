package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MonitorData generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`MONITORDATA`"
)
public class MonitorData extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected MonitorDataId id;
     protected MonitorPoint monitorPoint;
     protected Long startTime;
     protected Long endTime;
     protected Integer sampleSize;
     protected String monitorClob;
     protected Double minStat;
     protected Double maxStat;
     protected Double meanStat;
     protected Double stdDevStat;

    public MonitorData() {
    }
   
       @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="`monitorPointId`", column=@Column(name="MONITORPOINTID`", nullable=false) ), 
        @AttributeOverride(name="monitorTS`", column=@Column(name="MONITORTS`", nullable=false, length=26) ) } )
    public MonitorDataId getId() {
        return this.id;
    }
    
    public void setId(MonitorDataId id) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("id", this.id, this.id = id);
        else
            this.id = id;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`MONITORPOINTID`", nullable=false, insertable=false, updatable=false)
    public MonitorPoint getMonitorPoint() {
        return this.monitorPoint;
    }
    
    public void setMonitorPoint(MonitorPoint monitorPoint) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("monitorPoint", this.monitorPoint, this.monitorPoint = monitorPoint);
        else
            this.monitorPoint = monitorPoint;
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


    
    @Column(name="`ENDTIME`", nullable=false)
    public Long getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Long endTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("endTime", this.endTime, this.endTime = endTime);
        else
            this.endTime = endTime;
    }


    
    @Column(name="`SAMPLESIZE`", nullable=false)
    public Integer getSampleSize() {
        return this.sampleSize;
    }
    
    public void setSampleSize(Integer sampleSize) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("sampleSize", this.sampleSize, this.sampleSize = sampleSize);
        else
            this.sampleSize = sampleSize;
    }


    
    @Column(name="`MONITORCLOB`", nullable=false, length=16777216)
    public String getMonitorClob() {
        return this.monitorClob;
    }
    
    public void setMonitorClob(String monitorClob) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("monitorClob", this.monitorClob, this.monitorClob = monitorClob);
        else
            this.monitorClob = monitorClob;
    }


    
    @Column(name="`MINSTAT`", precision=64, scale=0)
    public Double getMinStat() {
        return this.minStat;
    }
    
    public void setMinStat(Double minStat) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("minStat", this.minStat, this.minStat = minStat);
        else
            this.minStat = minStat;
    }


    
    @Column(name="`MAXSTAT`", precision=64, scale=0)
    public Double getMaxStat() {
        return this.maxStat;
    }
    
    public void setMaxStat(Double maxStat) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("maxStat", this.maxStat, this.maxStat = maxStat);
        else
            this.maxStat = maxStat;
    }


    
    @Column(name="`MEANSTAT`", precision=64, scale=0)
    public Double getMeanStat() {
        return this.meanStat;
    }
    
    public void setMeanStat(Double meanStat) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("meanStat", this.meanStat, this.meanStat = meanStat);
        else
            this.meanStat = meanStat;
    }


    
    @Column(name="`STDDEVSTAT`", precision=64, scale=0)
    public Double getStdDevStat() {
        return this.stdDevStat;
    }
    
    public void setStdDevStat(Double stdDevStat) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("stdDevStat", this.stdDevStat, this.stdDevStat = stdDevStat);
        else
            this.stdDevStat = stdDevStat;
    }





}



package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DefaultBaciProperty generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`DEFAULTBACIPROPERTY`"
)
public class DefaultBaciProperty extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer defaultBaciPropId;
     protected DefaultComponent defaultComponent;
     protected String propertyName;
     protected String description;
     protected String format;
     protected String units;
     protected String resolution;
     protected Integer archive_priority;
     protected Double archive_min_int;
     protected Double archive_max_int;
     protected String archive_mechanism;
     protected Boolean archive_suppress;
     protected Double default_timer_trig;
     protected Double min_timer_trig;
     protected Boolean initialize_devio;
     protected Double min_delta_trig;
     protected String default_value;
     protected Double graph_min;
     protected Double graph_max;
     protected Double min_step;
     protected Double archive_delta;
     protected Double archive_delta_percent;
     protected Double alarm_high_on;
     protected Double alarm_low_on;
     protected Double alarm_high_off;
     protected Double alarm_low_off;
     protected Double alarm_timer_trig;
     protected Double min_value;
     protected Double max_value;
     protected String bitDescription;
     protected String whenSet;
     protected String whenCleared;
     protected String statesDescription;
     protected String condition;
     protected String alarm_on;
     protected String alarm_off;
     protected String alarm_fault_family;
     protected String alarm_fault_member;
     protected Integer alarm_level;
     protected String data;
     private Set<DefaultMonitorPoint> defaultMonitorPoints = new HashSet<DefaultMonitorPoint>(0);

    public DefaultBaciProperty() {
    }
   
       @Id 

    
    @Column(name="`DEFAULTBACIPROPID`", unique=true, nullable=false)
    public Integer getDefaultBaciPropId() {
        return this.defaultBaciPropId;
    }
    
    public void setDefaultBaciPropId(Integer defaultBaciPropId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("defaultBaciPropId", this.defaultBaciPropId, this.defaultBaciPropId = defaultBaciPropId);
        else
            this.defaultBaciPropId = defaultBaciPropId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`DEFAULTCOMPONENTID`", nullable=false)
    public DefaultComponent getDefaultComponent() {
        return this.defaultComponent;
    }
    
    public void setDefaultComponent(DefaultComponent defaultComponent) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("defaultComponent", this.defaultComponent, this.defaultComponent = defaultComponent);
        else
            this.defaultComponent = defaultComponent;
    }


    
    @Column(name="`PROPERTYNAME`", nullable=false, length=128)
    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(String propertyName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("propertyName", this.propertyName, this.propertyName = propertyName);
        else
            this.propertyName = propertyName;
    }


    
    @Column(name="`DESCRIPTION`", nullable=false, length=16777216)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("description", this.description, this.description = description);
        else
            this.description = description;
    }


    
    @Column(name="`FORMAT`", nullable=false, length=16777216)
    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("format", this.format, this.format = format);
        else
            this.format = format;
    }


    
    @Column(name="`UNITS`", nullable=false, length=16777216)
    public String getUnits() {
        return this.units;
    }
    
    public void setUnits(String units) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("units", this.units, this.units = units);
        else
            this.units = units;
    }


    
    @Column(name="`RESOLUTION`", nullable=false, length=16777216)
    public String getResolution() {
        return this.resolution;
    }
    
    public void setResolution(String resolution) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("resolution", this.resolution, this.resolution = resolution);
        else
            this.resolution = resolution;
    }


    
    @Column(name="`ARCHIVE_PRIORITY`", nullable=false)
    public Integer getArchive_priority() {
        return this.archive_priority;
    }
    
    public void setArchive_priority(Integer archive_priority) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_priority", this.archive_priority, this.archive_priority = archive_priority);
        else
            this.archive_priority = archive_priority;
    }


    
    @Column(name="`ARCHIVE_MIN_INT`", nullable=false, precision=64, scale=0)
    public Double getArchive_min_int() {
        return this.archive_min_int;
    }
    
    public void setArchive_min_int(Double archive_min_int) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_min_int", this.archive_min_int, this.archive_min_int = archive_min_int);
        else
            this.archive_min_int = archive_min_int;
    }


    
    @Column(name="`ARCHIVE_MAX_INT`", nullable=false, precision=64, scale=0)
    public Double getArchive_max_int() {
        return this.archive_max_int;
    }
    
    public void setArchive_max_int(Double archive_max_int) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_max_int", this.archive_max_int, this.archive_max_int = archive_max_int);
        else
            this.archive_max_int = archive_max_int;
    }


    
    @Column(name="`ARCHIVE_MECHANISM`", nullable=false, length=16777216)
    public String getArchive_mechanism() {
        return this.archive_mechanism;
    }
    
    public void setArchive_mechanism(String archive_mechanism) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_mechanism", this.archive_mechanism, this.archive_mechanism = archive_mechanism);
        else
            this.archive_mechanism = archive_mechanism;
    }


    
    @Column(name="`ARCHIVE_SUPPRESS`", nullable=false)
    public Boolean getArchive_suppress() {
        return this.archive_suppress;
    }
    
    public void setArchive_suppress(Boolean archive_suppress) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_suppress", this.archive_suppress, this.archive_suppress = archive_suppress);
        else
            this.archive_suppress = archive_suppress;
    }


    
    @Column(name="`DEFAULT_TIMER_TRIG`", nullable=false, precision=64, scale=0)
    public Double getDefault_timer_trig() {
        return this.default_timer_trig;
    }
    
    public void setDefault_timer_trig(Double default_timer_trig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("default_timer_trig", this.default_timer_trig, this.default_timer_trig = default_timer_trig);
        else
            this.default_timer_trig = default_timer_trig;
    }


    
    @Column(name="`MIN_TIMER_TRIG`", nullable=false, precision=64, scale=0)
    public Double getMin_timer_trig() {
        return this.min_timer_trig;
    }
    
    public void setMin_timer_trig(Double min_timer_trig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("min_timer_trig", this.min_timer_trig, this.min_timer_trig = min_timer_trig);
        else
            this.min_timer_trig = min_timer_trig;
    }


    
    @Column(name="`INITIALIZE_DEVIO`", nullable=false)
    public Boolean getInitialize_devio() {
        return this.initialize_devio;
    }
    
    public void setInitialize_devio(Boolean initialize_devio) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("initialize_devio", this.initialize_devio, this.initialize_devio = initialize_devio);
        else
            this.initialize_devio = initialize_devio;
    }


    
    @Column(name="`MIN_DELTA_TRIG`", precision=64, scale=0)
    public Double getMin_delta_trig() {
        return this.min_delta_trig;
    }
    
    public void setMin_delta_trig(Double min_delta_trig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("min_delta_trig", this.min_delta_trig, this.min_delta_trig = min_delta_trig);
        else
            this.min_delta_trig = min_delta_trig;
    }


    
    @Column(name="`DEFAULT_VALUE`", nullable=false, length=16777216)
    public String getDefault_value() {
        return this.default_value;
    }
    
    public void setDefault_value(String default_value) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("default_value", this.default_value, this.default_value = default_value);
        else
            this.default_value = default_value;
    }


    
    @Column(name="`GRAPH_MIN`", precision=64, scale=0)
    public Double getGraph_min() {
        return this.graph_min;
    }
    
    public void setGraph_min(Double graph_min) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("graph_min", this.graph_min, this.graph_min = graph_min);
        else
            this.graph_min = graph_min;
    }


    
    @Column(name="`GRAPH_MAX`", precision=64, scale=0)
    public Double getGraph_max() {
        return this.graph_max;
    }
    
    public void setGraph_max(Double graph_max) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("graph_max", this.graph_max, this.graph_max = graph_max);
        else
            this.graph_max = graph_max;
    }


    
    @Column(name="`MIN_STEP`", precision=64, scale=0)
    public Double getMin_step() {
        return this.min_step;
    }
    
    public void setMin_step(Double min_step) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("min_step", this.min_step, this.min_step = min_step);
        else
            this.min_step = min_step;
    }


    
    @Column(name="`ARCHIVE_DELTA`", nullable=false, precision=64, scale=0)
    public Double getArchive_delta() {
        return this.archive_delta;
    }
    
    public void setArchive_delta(Double archive_delta) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_delta", this.archive_delta, this.archive_delta = archive_delta);
        else
            this.archive_delta = archive_delta;
    }


    
    @Column(name="`ARCHIVE_DELTA_PERCENT`", precision=64, scale=0)
    public Double getArchive_delta_percent() {
        return this.archive_delta_percent;
    }
    
    public void setArchive_delta_percent(Double archive_delta_percent) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("archive_delta_percent", this.archive_delta_percent, this.archive_delta_percent = archive_delta_percent);
        else
            this.archive_delta_percent = archive_delta_percent;
    }


    
    @Column(name="`ALARM_HIGH_ON`", precision=64, scale=0)
    public Double getAlarm_high_on() {
        return this.alarm_high_on;
    }
    
    public void setAlarm_high_on(Double alarm_high_on) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_high_on", this.alarm_high_on, this.alarm_high_on = alarm_high_on);
        else
            this.alarm_high_on = alarm_high_on;
    }


    
    @Column(name="`ALARM_LOW_ON`", precision=64, scale=0)
    public Double getAlarm_low_on() {
        return this.alarm_low_on;
    }
    
    public void setAlarm_low_on(Double alarm_low_on) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_low_on", this.alarm_low_on, this.alarm_low_on = alarm_low_on);
        else
            this.alarm_low_on = alarm_low_on;
    }


    
    @Column(name="`ALARM_HIGH_OFF`", precision=64, scale=0)
    public Double getAlarm_high_off() {
        return this.alarm_high_off;
    }
    
    public void setAlarm_high_off(Double alarm_high_off) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_high_off", this.alarm_high_off, this.alarm_high_off = alarm_high_off);
        else
            this.alarm_high_off = alarm_high_off;
    }


    
    @Column(name="`ALARM_LOW_OFF`", precision=64, scale=0)
    public Double getAlarm_low_off() {
        return this.alarm_low_off;
    }
    
    public void setAlarm_low_off(Double alarm_low_off) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_low_off", this.alarm_low_off, this.alarm_low_off = alarm_low_off);
        else
            this.alarm_low_off = alarm_low_off;
    }


    
    @Column(name="`ALARM_TIMER_TRIG`", precision=64, scale=0)
    public Double getAlarm_timer_trig() {
        return this.alarm_timer_trig;
    }
    
    public void setAlarm_timer_trig(Double alarm_timer_trig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_timer_trig", this.alarm_timer_trig, this.alarm_timer_trig = alarm_timer_trig);
        else
            this.alarm_timer_trig = alarm_timer_trig;
    }


    
    @Column(name="`MIN_VALUE`", precision=64, scale=0)
    public Double getMin_value() {
        return this.min_value;
    }
    
    public void setMin_value(Double min_value) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("min_value", this.min_value, this.min_value = min_value);
        else
            this.min_value = min_value;
    }


    
    @Column(name="`MAX_VALUE`", precision=64, scale=0)
    public Double getMax_value() {
        return this.max_value;
    }
    
    public void setMax_value(Double max_value) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("max_value", this.max_value, this.max_value = max_value);
        else
            this.max_value = max_value;
    }


    
    @Column(name="`BITDESCRIPTION`", length=16777216)
    public String getBitDescription() {
        return this.bitDescription;
    }
    
    public void setBitDescription(String bitDescription) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("bitDescription", this.bitDescription, this.bitDescription = bitDescription);
        else
            this.bitDescription = bitDescription;
    }


    
    @Column(name="`WHENSET`", length=16777216)
    public String getWhenSet() {
        return this.whenSet;
    }
    
    public void setWhenSet(String whenSet) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("whenSet", this.whenSet, this.whenSet = whenSet);
        else
            this.whenSet = whenSet;
    }


    
    @Column(name="`WHENCLEARED`", length=16777216)
    public String getWhenCleared() {
        return this.whenCleared;
    }
    
    public void setWhenCleared(String whenCleared) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("whenCleared", this.whenCleared, this.whenCleared = whenCleared);
        else
            this.whenCleared = whenCleared;
    }


    
    @Column(name="`STATESDESCRIPTION`", length=16777216)
    public String getStatesDescription() {
        return this.statesDescription;
    }
    
    public void setStatesDescription(String statesDescription) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("statesDescription", this.statesDescription, this.statesDescription = statesDescription);
        else
            this.statesDescription = statesDescription;
    }


    
    @Column(name="`CONDITION`", length=16777216)
    public String getCondition() {
        return this.condition;
    }
    
    public void setCondition(String condition) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("condition", this.condition, this.condition = condition);
        else
            this.condition = condition;
    }


    
    @Column(name="`ALARM_ON`", length=16777216)
    public String getAlarm_on() {
        return this.alarm_on;
    }
    
    public void setAlarm_on(String alarm_on) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_on", this.alarm_on, this.alarm_on = alarm_on);
        else
            this.alarm_on = alarm_on;
    }


    
    @Column(name="`ALARM_OFF`", length=16777216)
    public String getAlarm_off() {
        return this.alarm_off;
    }
    
    public void setAlarm_off(String alarm_off) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_off", this.alarm_off, this.alarm_off = alarm_off);
        else
            this.alarm_off = alarm_off;
    }


    
    @Column(name="`ALARM_FAULT_FAMILY`", length=16777216)
    public String getAlarm_fault_family() {
        return this.alarm_fault_family;
    }
    
    public void setAlarm_fault_family(String alarm_fault_family) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_fault_family", this.alarm_fault_family, this.alarm_fault_family = alarm_fault_family);
        else
            this.alarm_fault_family = alarm_fault_family;
    }


    
    @Column(name="`ALARM_FAULT_MEMBER`", length=16777216)
    public String getAlarm_fault_member() {
        return this.alarm_fault_member;
    }
    
    public void setAlarm_fault_member(String alarm_fault_member) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_fault_member", this.alarm_fault_member, this.alarm_fault_member = alarm_fault_member);
        else
            this.alarm_fault_member = alarm_fault_member;
    }


    
    @Column(name="`ALARM_LEVEL`")
    public Integer getAlarm_level() {
        return this.alarm_level;
    }
    
    public void setAlarm_level(Integer alarm_level) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarm_level", this.alarm_level, this.alarm_level = alarm_level);
        else
            this.alarm_level = alarm_level;
    }


    
    @Column(name="`DATA`", length=16777216)
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("data", this.data, this.data = data);
        else
            this.data = data;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="defaultBaciProperty")
    public Set<DefaultMonitorPoint> getDefaultMonitorPoints() {
        return this.defaultMonitorPoints;
    }
    
    public void setDefaultMonitorPoints(Set<DefaultMonitorPoint> defaultMonitorPoints) {    
    	this.defaultMonitorPoints = defaultMonitorPoints;
    }

	public void addDefaultMonitorPoints(Set<DefaultMonitorPoint> elements) {
		if( this.defaultMonitorPoints != null )
			for(Iterator<DefaultMonitorPoint> it = elements.iterator(); it.hasNext(); )
				addDefaultMonitorPointToDefaultMonitorPoints((DefaultMonitorPoint)it.next());
	}

	public void addDefaultMonitorPointToDefaultMonitorPoints(DefaultMonitorPoint element) {
		if( !this.defaultMonitorPoints.contains(element) ) {
			this.defaultMonitorPoints.add(element);
		}
	}





}



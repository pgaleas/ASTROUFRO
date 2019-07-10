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
 * CentralLO generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`CENTRALLO`"
)
public class CentralLO extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer baseElementId;
     protected BaseElement baseElement;
     protected Long commissionDate;

    public CentralLO() {
    }
   
       @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="baseElement"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="`BASEELEMENTID`", unique=true, nullable=false)
    public Integer getBaseElementId() {
        return this.baseElementId;
    }
    
    public void setBaseElementId(Integer baseElementId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElementId", this.baseElementId, this.baseElementId = baseElementId);
        else
            this.baseElementId = baseElementId;
    }


@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public BaseElement getBaseElement() {
        return this.baseElement;
    }
    
    public void setBaseElement(BaseElement baseElement) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElement", this.baseElement, this.baseElement = baseElement);
        else
            this.baseElement = baseElement;
    }


    
    @Column(name="`COMMISSIONDATE`", nullable=false)
    public Long getCommissionDate() {
        return this.commissionDate;
    }
    
    public void setCommissionDate(Long commissionDate) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("commissionDate", this.commissionDate, this.commissionDate = commissionDate);
        else
            this.commissionDate = commissionDate;
    }





}



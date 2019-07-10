package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import alma.hibernate.util.HibernateXmlType;
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
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * Schemas generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`SCHEMAS`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`URN`", "`CONFIGURATIONID`"})
)
@TypeDef(name="xmltype", typeClass=HibernateXmlType.class)
public class Schemas extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer schemaId;
     protected Configuration configuration;
     protected String URN;
     protected String schema;

    public Schemas() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="Schemas_seq")}
	)

    
    @Column(name="`SCHEMAID`", unique=true, nullable=false)
    public Integer getSchemaId() {
        return this.schemaId;
    }
    
    public void setSchemaId(Integer schemaId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("schemaId", this.schemaId, this.schemaId = schemaId);
        else
            this.schemaId = schemaId;
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


    
    @Column(name="`URN`", nullable=false, length=16777216)
    public String getURN() {
        return this.URN;
    }
    
    public void setURN(String URN) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("URN", this.URN, this.URN = URN);
        else
            this.URN = URN;
    }


    
    @Column(name="`SCHEMA`", length=16777216)
    @Type(type="xmltype")
    public String getSchema() {
        return this.schema;
    }
    
    public void setSchema(String schema) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("schema", this.schema, this.schema = schema);
        else
            this.schema = schema;
    }



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Schemas) ) return false;
		 Schemas castOther = ( Schemas ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getURN()==castOther.getURN()) || ( this.getURN()!=null && castOther.getURN()!=null && this.getURN().equals(castOther.getURN()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         result = 37 * result + ( getURN() == null ? 0 : this.getURN().hashCode() );
         
         return result;
   }


}



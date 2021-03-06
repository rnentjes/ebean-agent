package test.model.domain;

import test.model.domain.finder.CountryFinder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Country entity bean.
 */
@Entity
@Table(name="o_country")
public class Country {

	public static CountryFinder find = new CountryFinder();

    @Id
    //@Size(max=2)
    String code;

    //@Size(max=60)
    String name;
    
    public String toString() {
    	return code;
    }
    
    /**
     * Return code.
     */    
    public String getCode() {
  	    return code;
    }

    /**
     * Set code.
     */    
    public void setCode(String code) {
  	    this.code = code;
    }

    /**
     * Return name.
     */    
    public String getName() {
  	    return name;
    }

    /**
     * Set name.
     */    
    public void setName(String name) {
  	    this.name = name;
    }


}


package acme.entities.roles.shouts;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shout extends DomainEntity {

	//Serialisation indentifier
	private static final long	serialVersionID	= 1L;

	//Attributes
	@NotBlank
	private String				author;

	@NotBlank
	private String				text;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}

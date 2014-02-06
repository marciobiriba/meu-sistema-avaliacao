package br.edu.infnet.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Avaliacao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer codigo;
	@Column
	private Integer rating1;
	@Column
	private Integer rating2;
	@Column
	private Integer rating3;
	@Column
	private Integer rating4;
	@Column
	private Integer rating5;
	@Column
	private Integer rating6;
	@Column
	private Integer rating7;
	@Column
	private Integer rating8;
	@Column
	private Integer rating9;
	@Column
	private Integer rating10;
	@Column
	private Integer rating11;
	@Column
	private Integer rating12;
	@Column
	private Integer rating13;
	@Column
	private Integer rating14;
	@Column
	private Integer rating15;
	@Column
	private Integer rating16;
	@Column
	private Integer rating17;
	@Column
	private String comentario;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getRating1() {
		return rating1;
	}
	public void setRating1(Integer rating1) {
		this.rating1 = rating1;
	}
	public Integer getRating2() {
		return rating2;
	}
	public void setRating2(Integer rating2) {
		this.rating2 = rating2;
	}
	public Integer getRating3() {
		return rating3;
	}
	public void setRating3(Integer rating3) {
		this.rating3 = rating3;
	}
	public Integer getRating4() {
		return rating4;
	}
	public void setRating4(Integer rating4) {
		this.rating4 = rating4;
	}
	public Integer getRating5() {
		return rating5;
	}
	public void setRating5(Integer rating5) {
		this.rating5 = rating5;
	}
	public Integer getRating6() {
		return rating6;
	}
	public void setRating6(Integer rating6) {
		this.rating6 = rating6;
	}
	public Integer getRating7() {
		return rating7;
	}
	public void setRating7(Integer rating7) {
		this.rating7 = rating7;
	}
	public Integer getRating8() {
		return rating8;
	}
	public void setRating8(Integer rating8) {
		this.rating8 = rating8;
	}
	public Integer getRating9() {
		return rating9;
	}
	public void setRating9(Integer rating9) {
		this.rating9 = rating9;
	}
	public Integer getRating10() {
		return rating10;
	}
	public void setRating10(Integer rating10) {
		this.rating10 = rating10;
	}
	public Integer getRating11() {
		return rating11;
	}
	public void setRating11(Integer rating11) {
		this.rating11 = rating11;
	}
	public Integer getRating12() {
		return rating12;
	}
	public void setRating12(Integer rating12) {
		this.rating12 = rating12;
	}
	public Integer getRating13() {
		return rating13;
	}
	public void setRating13(Integer rating13) {
		this.rating13 = rating13;
	}
	public Integer getRating14() {
		return rating14;
	}
	public void setRating14(Integer rating14) {
		this.rating14 = rating14;
	}
	public Integer getRating15() {
		return rating15;
	}
	public void setRating15(Integer rating15) {
		this.rating15 = rating15;
	}
	public Integer getRating16() {
		return rating16;
	}
	public void setRating16(Integer rating16) {
		this.rating16 = rating16;
	}
	public Integer getRating17() {
		return rating17;
	}
	public void setRating17(Integer rating17) {
		this.rating17 = rating17;
	}
	public String getCometario() {
		return comentario;
	}
	public void setCometario(String cometario) {
		this.comentario = cometario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((rating1 == null) ? 0 : rating1.hashCode());
		result = prime * result
				+ ((rating10 == null) ? 0 : rating10.hashCode());
		result = prime * result
				+ ((rating11 == null) ? 0 : rating11.hashCode());
		result = prime * result
				+ ((rating12 == null) ? 0 : rating12.hashCode());
		result = prime * result
				+ ((rating13 == null) ? 0 : rating13.hashCode());
		result = prime * result
				+ ((rating14 == null) ? 0 : rating14.hashCode());
		result = prime * result
				+ ((rating15 == null) ? 0 : rating15.hashCode());
		result = prime * result
				+ ((rating16 == null) ? 0 : rating16.hashCode());
		result = prime * result
				+ ((rating17 == null) ? 0 : rating17.hashCode());
		result = prime * result + ((rating2 == null) ? 0 : rating2.hashCode());
		result = prime * result + ((rating3 == null) ? 0 : rating3.hashCode());
		result = prime * result + ((rating4 == null) ? 0 : rating4.hashCode());
		result = prime * result + ((rating5 == null) ? 0 : rating5.hashCode());
		result = prime * result + ((rating6 == null) ? 0 : rating6.hashCode());
		result = prime * result + ((rating7 == null) ? 0 : rating7.hashCode());
		result = prime * result + ((rating8 == null) ? 0 : rating8.hashCode());
		result = prime * result + ((rating9 == null) ? 0 : rating9.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (rating1 == null) {
			if (other.rating1 != null)
				return false;
		} else if (!rating1.equals(other.rating1))
			return false;
		if (rating10 == null) {
			if (other.rating10 != null)
				return false;
		} else if (!rating10.equals(other.rating10))
			return false;
		if (rating11 == null) {
			if (other.rating11 != null)
				return false;
		} else if (!rating11.equals(other.rating11))
			return false;
		if (rating12 == null) {
			if (other.rating12 != null)
				return false;
		} else if (!rating12.equals(other.rating12))
			return false;
		if (rating13 == null) {
			if (other.rating13 != null)
				return false;
		} else if (!rating13.equals(other.rating13))
			return false;
		if (rating14 == null) {
			if (other.rating14 != null)
				return false;
		} else if (!rating14.equals(other.rating14))
			return false;
		if (rating15 == null) {
			if (other.rating15 != null)
				return false;
		} else if (!rating15.equals(other.rating15))
			return false;
		if (rating16 == null) {
			if (other.rating16 != null)
				return false;
		} else if (!rating16.equals(other.rating16))
			return false;
		if (rating17 == null) {
			if (other.rating17 != null)
				return false;
		} else if (!rating17.equals(other.rating17))
			return false;
		if (rating2 == null) {
			if (other.rating2 != null)
				return false;
		} else if (!rating2.equals(other.rating2))
			return false;
		if (rating3 == null) {
			if (other.rating3 != null)
				return false;
		} else if (!rating3.equals(other.rating3))
			return false;
		if (rating4 == null) {
			if (other.rating4 != null)
				return false;
		} else if (!rating4.equals(other.rating4))
			return false;
		if (rating5 == null) {
			if (other.rating5 != null)
				return false;
		} else if (!rating5.equals(other.rating5))
			return false;
		if (rating6 == null) {
			if (other.rating6 != null)
				return false;
		} else if (!rating6.equals(other.rating6))
			return false;
		if (rating7 == null) {
			if (other.rating7 != null)
				return false;
		} else if (!rating7.equals(other.rating7))
			return false;
		if (rating8 == null) {
			if (other.rating8 != null)
				return false;
		} else if (!rating8.equals(other.rating8))
			return false;
		if (rating9 == null) {
			if (other.rating9 != null)
				return false;
		} else if (!rating9.equals(other.rating9))
			return false;
		return true;
	}
	
}

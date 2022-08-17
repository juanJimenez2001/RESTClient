package models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaTesoros {
	
	private List<Link> tesoros;
	
	public ListaTesoros(){}

	public List<Link> getTesoro() {
		return tesoros;
	}

	public void setTesoros(List<Link> tesoros) {
		this.tesoros = tesoros;
	}

	@Override
	public String toString() {
		return "ListaTesoros [tesoros=" + tesoros + "]";
	}
}

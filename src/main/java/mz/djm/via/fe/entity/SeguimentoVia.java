package mz.djm.via.fe.entity;

import java.awt.Point;

public class SeguimentoVia extends BaseObject{

	private Double larguraValue;
	
	private Double comprimentoValue;
	
	private Double icpValue;
		
	private IntervencaoType intervencaoTypeObject;
	
	//nome da via sera igual a descricao existente na entidade generica
	//private String nome
	//private Point pointObject; //coordenadas x e y
	
	private String longitude;
	
	private String latitude;

	public Double getLarguraValue() {
		return larguraValue;
	}

	public void setLarguraValue(Double larguraValue) {
		this.larguraValue = larguraValue;
	}

	public Double getComprimentoValue() {
		return comprimentoValue;
	}

	public void setComprimentoValue(Double comprimentoValue) {
		this.comprimentoValue = comprimentoValue;
	}

	public Double getIcpValue() {
		return icpValue;
	}

	public void setIcpValue(Double icpValue) {
		this.icpValue = icpValue;
	}

	public IntervencaoType getIntervencaoTypeObject() {
		return intervencaoTypeObject;
	}

	public void setIntervencaoTypeObject(IntervencaoType intervencaoTypeObject) {
		this.intervencaoTypeObject = intervencaoTypeObject;
	}

	public String getLongitudeValue() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitudeValue() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

		
	
}

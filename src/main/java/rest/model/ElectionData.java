package rest.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ElectionData {
	
	private int regionID;
	private String regionName;
	private String regionAddresse;
	private int regionPostalCode;
	private String federalState;
	private String timestamp;

	private List<ElectionParty> countingData;
	/**
	 * Constructor
	 */
	public ElectionData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}
	
	/**
	 * Setter and Getter Methods
	 */
	public int getRegionID() {
		return regionID;
	}


	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionAddresse() {
		return regionAddresse;
	}

	public void setRegionAddresse(String regionAddresse) {
		this.regionAddresse = regionAddresse;
	}

	public int getRegionPostalCode() {
		return regionPostalCode;
	}

	public void setRegionPostalCode(int regionPostalCode) {
		this.regionPostalCode = regionPostalCode;
	}

	public String getFederalState() {
		return federalState;
	}

	public void setFederalState(String federalState) {
		this.federalState = federalState;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<ElectionParty> getCountingData() {
		return countingData;
	}

	public void setCountingData(List<ElectionParty> countingData) {
		this.countingData = countingData;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {


		String info = String.format("Election Info: ID = %s, timestamp = %s", regionID, timestamp );
		return info;
	}
}

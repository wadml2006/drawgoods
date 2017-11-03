package drawgoods.main;

import java.io.Serializable;

public class Record extends Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String recordId;
	private String phoneNo;
	private String branchid;
	private String customerid;
	private String timestamp;
	private String badgeId;
}

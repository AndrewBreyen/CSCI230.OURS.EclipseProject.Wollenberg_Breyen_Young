/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author abreyen001
 *
 */
public class SimplePrint {
	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}

	private String pName;
	private int pAge;

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0 ; i < args.length ; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
		//System.out.println("Gavin, Andrew, Sam")

	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

}

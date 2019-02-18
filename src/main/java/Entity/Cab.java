package Entity;

public  class Cab {
	
	

	private int c_id;
	private int req_id;
	private int trn;
	private int year;
	private String model;
	private String name;
	

	public Cab()
	{
		this(0,0,0,0,"civic","John Jones");
	}

	public Cab(int c_id, int req_id, int trn, int year, String model, String name) {
		super();
		this.c_id = c_id;
		this.req_id = req_id;
		this.trn = trn;
		this.year = year;
		this.model = model;
		this.name = name;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getReq_id() {
		return req_id;
	}

	public void setReq_id(int req_id) {
		this.req_id = req_id;
	}

	public int getTrn() {
		return trn;
	}

	public void setTrn(int trn) {
		this.trn = trn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Cab [c_id=" + c_id + ", req_id=" + req_id + ", trn=" + trn + ", year=" + year + ", model=" + model
				+ ", name=" + name + "]";
	}
}

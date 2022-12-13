package com.example.course.corejava;

public final class ImmutableStudentClass {
	
	private final Integer stdId;
	private final String name;
	private final String address;
	
	public ImmutableStudentClass(Integer stdId, String name, String address) {
		
		super();
		this.stdId = stdId;
		this.name = name;
		this.address = address;
	}

	public Integer getStdId() {
		return stdId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}

package ivprep;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Person that = (Person) o;
	    return this.getFirstName().equals(that.getFirstName()) &&
	      this.getLastName().equals(that.getLastName());
	}
}

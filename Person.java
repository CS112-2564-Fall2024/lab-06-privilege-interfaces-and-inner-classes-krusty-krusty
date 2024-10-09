public class Person implements Comparable<Person>
{
	/***** TODO: (Part 2) create helper inner class for Identity*****/
	public class Identity {
		String pronouns, background;

		public Identity(String pronouns, String background) {
			this.pronouns = pronouns;
			this.background = background;
		}

		public Identity() {
			this.pronouns = "Xe";
		}

		public boolean equals(Identity other) {
			return this.pronouns.equals(other.pronouns)
					&& this.background.equals(other.background);
		}
		}
		
		}

	// CONSTANT VARIABLES
	public static final String DEFAULT_NAME = "Jamie Doe";
	public static final String DEFAULT_STORY =  "Unknown";
	public static final int DEFAULT_PRIVILEGE = 100;

	// INSTANCE VARIABLES
	private String name;
	private Identity identity;
	private int privilege;

	// CONSTRUCTORS	
	public Person(String name, String story, int privilege) {
		this.setAll(name, story, privilege);
	}
		
	public Person() {
		this(DEFAULT_NAME, DEFAULT_STORY, DEFAULT_PRIVILEGE);
	}
	
	public Person(Person original) {
		if(original == null) {
			throw new IllegalArgumentException("Cannot copy null obect in Person copy constructor");
		} else {
			this.setAll(original.name, original.story, original.privilege);
		}
	}

	// MUTATORS/SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setIdentity(String story) {
		this.Identity = story;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public void setAll(String name, String story, int privilege) {
		this.setPrivilege(privilege);
		this.setName(name);
		this.setStory(story);
	}

	// ACCESSORS / GETTERS
	public String getName() {
		return this.name;
	}
		
	public String getIdentity() {
		return this.identity;
	}

	public int getPrivilege() {
		return this.privilege;
	}

	// OTHER REQUIRED METHODS
	@Override
	public String toString()
	{
		return "My name is "+ this.name + " and "+ this.identity + "\n"
				+ "According to this calculator I ended up with "+ this.privilege + " estimated privilege points";
	}
	
	@Override
	public boolean equals(Object other) 
	{
		if(other == null || (!(other instanceof Person))) {
		      return false;
		}
		
		Person otherPerson = (Person) other;
		return this.name.equals(otherPerson.name) && this.story.equals(otherPerson.story) &&
			this.privilege == otherPerson.privilege;	
	}
	public int compareTo(Person other) {
        return Integer.compare(this.privilege, other.privilege);
    }
	// INTERFACE METHODS
	/***** TODO: (Part 1) override compareTo method to implement Comparable interface*****/

	//public interface Comparable<T> {
	//	public int compareTo(T o);

	//}

	//public final class people implements Comparable<people> {
		// @Override
		public int compareTo(Person other) {
			if (this.privilege < other.privilege) {
				return -1;
			}
			else if (this.privilege > other.privilege) {
				return 1;
			}

			else {
				return 0;
			}
			
			// return Integer.compare(this.privilege, other.privilege);


		}
	}

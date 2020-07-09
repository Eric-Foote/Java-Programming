public class Student {
        private String firstName, lastName;
        private Address homeAddress, schoolAddress;
	private int testScore1, testScore2, testScore3, testNumber;

        public Student(String first, String last, Address home, Address school, int tS1, int tS2, int tS3) 
	{
                firstName = first;
                lastName = last;
                homeAddress = home;
                schoolAddress = school;
		testScore1 = tS;
		testScore2 = tS2;
		testScore3 = tS3;
        }
	
	public Student() 
	{
		firstName = "";
		lastName = "";
		homeAddress = "";
		schoolAddress = "";
		testScore1 = 0;
		testScore2 = 0;
		testScore3 = 0;
	}

	public setTestScore( int testScore, int testNumber)
	{
	
	}

        public String toString()
        {
                String result = firstName + " " + lastName + " " + "\n" + "Home Address:\n" + homeAddress + "\n" + "School Address:\n" + schoolAddress;
                return result;
        }
}

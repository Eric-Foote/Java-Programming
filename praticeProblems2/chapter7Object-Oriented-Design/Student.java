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

	public setTestScore( int testScore, int tN)
	{
		testNumber = tN;
		if(tN == 1) {
			testScore1 = testScore;
		}
		if(tN == 2) {
			testScore2 = testScore;
		}
		if(tN == 3) {
			testScore3 = testScore;
		}	
	}
	
	public int getTestScore(int tN) {
		if(tN == 1)
		{
		 	return testScore1;
		}
		if(tN == 2)
		{
			return testScore2;
		}
		if(tN == 3)
		{
			return testScore3;
		}

	public double average(){
		double avg = (testScore1 + testScore2 + testScore3)/3;
		return avg;
	}

        public String toString()
        {
                String result = firstName + " " + lastName + " " + "\n" + "Home Address:\n" + homeAddress + "\n" + "School Address:\n" + schoolAddress + "\n" + "Test Score 1:" + testScore1 + "Test Score 2:" + testScore2 + "Test Score 3:" + testScore3 + "\n" + "Average: " + average();
                return result;
        }
}

public class Address
{
        private String streetAddress, city, province;
        private long postalCode;
        public Address(String street, String town, String prov, long post)
        {
                streetAddress = street;
                city = town;
                province = prov;
                postalCode = post;
        }
	
	public Address() 
	{
		streetAdress = "";
		city = "";
		province = "";
		postalCode = "";
	}

        public String toString()
        {
                String result = streetAddress + "\n" + city  + ", " + "\n" + province + " " + postalCode;
                return result;
        }


}

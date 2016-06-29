/*Addrees file*/
public class Address {
private String addressLine;
private String city;
private String state;
private String country;
/**
 * @return the addressLine
 */
public String getAddressLine() {
	return addressLine;
}
/**
 * @param addressLine the addressLine to set
 */
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}


}

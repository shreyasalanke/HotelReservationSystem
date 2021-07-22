package com.bridgelab.hotelreservationsystem;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation 
{
	final Hotel LAKEWOOD = new Hotel("LakeWood", 110);
	final Hotel BRIDGEWOOD = new Hotel("BridgeWood", 150);
	final Hotel RIDGEWOOD = new Hotel("RidgeWood", 220);

	List<Hotel> hotel = new ArrayList<>();
	public HotelReservation() 
	{
		hotel.add(LAKEWOOD);
		hotel.add(BRIDGEWOOD);
		hotel.add(RIDGEWOOD);
	}
	public void add(Hotel hotel1)
	{
		
	}
	public List<Hotel> getHotelList() 
	{
		return hotel;
	}
}
package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.apnahotel.model.Booking;

public class BookingDaoImplementation implements BookingDao {

	@Override
	public boolean insertBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Booking> getAllBookings() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCheckOut(String bookingId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}

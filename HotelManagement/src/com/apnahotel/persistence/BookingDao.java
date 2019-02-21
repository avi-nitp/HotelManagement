package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.apnahotel.model.Booking;

public interface BookingDao {
	boolean insertBooking(Booking booking) throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getAllBookings() throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException,SQLException;
	boolean updateCheckOut(String bookingId)throws ClassNotFoundException,SQLException;
}

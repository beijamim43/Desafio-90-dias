create table Reservation (
	reservationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	roomId LONG,
	guestName VARCHAR(75) null,
	guestEmail VARCHAR(75) null,
	checkInDate DATE null,
	checkOutDate DATE null,
	totalAmount BIGDECIMAL null,
	status INTEGER
);

create table Room (
	roomId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	ImageFileEntryId LONG,
	maxGuests INTEGER,
	dailyRate BIGDECIMAL null,
	amenities VARCHAR(75) null,
	status BOOLEAN
);
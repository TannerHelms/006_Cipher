<?php
$sql = "SELECT id, firstname, lastname, email, reg_date, website, comments FROM MyGuests";
$result = $conn -> query($sql);

if ($result -> num_rows > 0) {
	// output data of each row
	while ($row = $result -> fetch_assoc()) {
		echo "id: " . $row["id"] . " - Name: " . $row["firstname"] . " " . $row["lastname"] . " - Email: " . $row["email"] . " - Website" . $row["website"] . " - Comments" . $row["comments"]. "<br>";
	}
} else {
	echo "0 results";
}

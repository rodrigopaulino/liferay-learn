curl -F "document={\"description\": \"Bar.sh\", \"title\": \"Bar.sh\"}" -H  "Content-Type: multipart/form-data; boundary=ARBITRARY" -X PATCH "http://localhost:8080/o/headless-delivery/v1.0/documents/${1}" -u "test@liferay.com:test"
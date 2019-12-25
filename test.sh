chmod 744 test.sh

curl -X POST \
  http://localhost:8080/credit-apply \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
	"tckno": "TCKNO",
	"isim": "ISIM",
	"soyisim": "SOYISIM",
	"aylikGelir": 4000,
	"telno": "TELNO"
}'
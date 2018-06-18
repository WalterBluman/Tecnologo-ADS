import requests

def main():
	quant = 3
	for i in range(quant):
		r = requests.get('http://localhost:8000/')
		print('Request nº: ' + str(i + 1) + '--------------------------- Status:' + str(r.status_code))
	

if __name__ == '__main__':
	main()
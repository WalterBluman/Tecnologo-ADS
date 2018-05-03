import requests
import base64

def main():
    client_id = '###'
    client_secret = '###'
    authorization = 'Basic ' + base64.b64encode((client_id + ":" + client_secret).encode('UTF-8')).decode('ascii')
        
    headers = {
        'Authorization': authorization,
    }

    dados = [
      ('grant_type', 'client_credentials'),
    ]

    response = requests.post('https://accounts.spotify.com/api/token', headers=headers, data=dados)

    print(response.json())

if __name__ == "__main__":
    main()


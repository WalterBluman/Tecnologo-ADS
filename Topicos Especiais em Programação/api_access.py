import requests

def spotfy():
    access_token = '#######'
        
    headers = {
        'Authorization': 'Bearer ' + access_token,
    }

    #alguns exemplos
    # https://api.spotify.com/v1/albums/{id}     albuns
    # https://api.spotify.com/v1/artists/{id}    artistas
    # https://api.spotify.com/tracks/{id}        trilhas

    #url documentacao: https://beta.developer.spotify.com/documentation/web-api/reference/
    
    response = requests.get('https://api.spotify.com/v1/albums/41MnTivkwTO3UUJ8DrqEJJ', headers=headers)

    print(response.json())


def soccer():

    #alguns exemplos
    # https://soccer.sportmonks.com/api/v2.0/fixtures/{id}/?api_token={token}                jogo
    # https://soccer.sportmonks.com/api/v2.0/fixtures/between/{from}/{to}/?api_token={token} jogos entre duas datas
    # https://soccer.sportmonks.com/api/v2.0/leagues/?api_token={token}                      todos as ligas


    #url documentacao: https://www.sportmonks.com/products/soccer/docs/2.0
    
    response = requests.get('https://soccer.sportmonks.com/api/v2.0/leagues/?api_token={token}')

    print(response.json())


def main():
    spotfy()
    
if __name__ == "__main__":
    main()

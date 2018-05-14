from rest_framework import serializers
from .models import Game


class GameSerializer(serializers.ModelSerializer):

	name = serializers.CharField(max_length=40)
	release_date = serializers.DateTimeField()
	game_category = serializers.CharField(max_length=40)

	class Meta:
		model = Game
		fields = ('id', 'name', 'release_date', 'game_category')


	def validate(self, data):	
		self.verifica_repeticao(data)
		return data


	def verifica_repeticao(self, data):		

		if Game.objects.filter(name = data['name']).exists():
			raise serializers.ValidationError("Você não pode adicionar nome repetido")			

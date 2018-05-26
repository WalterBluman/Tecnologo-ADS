from rest_framework import serializers
from .models import User, Post


class PostSerializers(serializers.HyperlinkedModelSerializer):
	user = serializers.SlugRelatedField(queryset=User.objects.all(),slug_field='name')
	
	class Meta:
		model = Post
		fields = ('url','pk', 'title','body','user', 'comments_quantity')


class UserPostSerializers(serializers.HyperlinkedModelSerializer):
	posts = PostSerializers(many=True)

	class Meta:
		model = User
		fields = ('pk', 'username', 'name', 'email','posts')		


class UserSerializers(serializers.HyperlinkedModelSerializer):
	class Meta:
		model = User
		fields = ('pk', 'username', 'name', 'email')		
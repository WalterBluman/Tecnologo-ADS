from rest_framework import serializers
from .models import User, Post, Comment


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


class CommentSerializers(serializers.HyperlinkedModelSerializer):
	post = serializers.SlugRelatedField(queryset=Post.objects.all(),slug_field='title')

	class Meta:
		model = Comment
		fields = ('pk','post','name','email','body')
from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .models import User, Post, Comment
from .serializers import UserSerializers, PostSerializers,UserPostSerializers, CommentSerializers

# Create your views here.
class Users(ModelViewSet):
	queryset = User.objects.all()
	serializer_class = UserSerializers


class Posts(ModelViewSet):
	queryset = Post.objects.all()
	serializer_class = PostSerializers

	def get_queryset(self):
		return Post.objects.filter(user=self.kwargs['user_pk'])


class UsersPosts(ModelViewSet):
	queryset = User.objects.all()
	serializer_class = UserPostSerializers


class Comments(ModelViewSet):
	queryset = Comment.objects.all()
	serializer_class = CommentSerializers

	def get_queryset(self):
		return Comment.objects.filter(post=self.kwargs['post_pk'])

		
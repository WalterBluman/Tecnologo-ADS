from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .models import User, Post
from .serializers import UserSerializers, PostSerializers,UserPostSerializers

# Create your views here.
class Users(ModelViewSet):
	queryset = User.objects.all()
	serializer_class = UserSerializers


class Posts(ModelViewSet):
	queryset = Post.objects.all()
	serializer_class = PostSerializers


class UsersPosts(ModelViewSet):
	queryset = User.objects.all()
	serializer_class = UserPostSerializers

		
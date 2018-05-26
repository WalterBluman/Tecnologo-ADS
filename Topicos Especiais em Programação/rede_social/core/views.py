from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .models import User
from .serializers import UserSerializers

# Create your views here.
class Users(ModelViewSet):
	queryset = User.objects.all()
	serializer_class = UserSerializers


		
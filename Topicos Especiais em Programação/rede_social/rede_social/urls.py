"""rede_social URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from rest_framework_nested import routers
from rest_framework.routers import DefaultRouter
from rest_framework.authtoken.views import obtain_auth_token
from core.views import Profiles, Posts, ProfilePosts, Comments, CustomAuthToken

router = DefaultRouter()
router.register(r'users', Profiles,'list')
router.register(r'posts', Posts)
router.register(r'users-posts', ProfilePosts)
router.register(r'comments', Comments)


user_router = routers.NestedSimpleRouter(router, r'users', lookup='user')
user_router.register(r'posts',Posts)
post_router = routers.NestedSimpleRouter(user_router, r'posts', lookup='post')
post_router.register(r'comments',Comments)

urlpatterns = [
	path('api-token-auth/', obtain_auth_token),
	path('api-token-auth2/', CustomAuthToken.as_view()),
]

urlpatterns += router.urls 
urlpatterns += user_router.urls
urlpatterns += post_router.urls
package com.example.firebasemvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasemvvm.ui.theme.screens.Home.HomeScreen
import com.example.firebasemvvm.ui.theme.screens.Login.LoginScreen
import com.example.firebasemvvm.ui.theme.screens.Products.AddProductsScreen
import com.example.firebasemvvm.ui.theme.screens.Products.UpdateProductsScreen
import com.example.firebasemvvm.ui.theme.screens.Products.ViewProductsScreen
import com.example.firebasemvvm.ui.theme.screens.Products.ViewUploadsScreen
import com.example.firebasemvvm.ui.theme.screens.Registration.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }

}
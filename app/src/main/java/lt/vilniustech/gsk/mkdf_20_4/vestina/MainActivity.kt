package lt.vilniustech.gsk.mkdf_20_4.vestina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import lt.vilniustech.gsk.mkdf_20_4.vestina.data.AppPreferences
import lt.vilniustech.gsk.mkdf_20_4.vestina.screens.CVScreen
import lt.vilniustech.gsk.mkdf_20_4.vestina.screens.ContactScreen
import lt.vilniustech.gsk.mkdf_20_4.vestina.screens.HomeScreen
import lt.vilniustech.gsk.mkdf_20_4.vestina.screens.Portfolio
import lt.vilniustech.gsk.mkdf_20_4.vestina.screens.QR
import lt.vilniustech.gsk.mkdf_20_4.vestina.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    private val appPreferences by lazy { AppPreferences(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                val navController = rememberNavController()

                // Set up the NavHost with two composable screens
                NavHost(
                    navController = navController,
                    startDestination = "screen1"
                ) {
                    composable("screen1") {
                        HomeScreen(navController = navController, activity = LocalContext.current as ComponentActivity)
                    }
                    composable("screen2") {
                        CVScreen(navController = navController, appPreferences = appPreferences)
                    }
                    composable("screen3") {
                        ContactScreen(navController = navController)
                    }
                    composable("screen4") {
                        Portfolio(navController = navController)
                    }
                    composable("screen5") {
                        QR(navController = navController)
                    }
                }
            }
        }
    }}
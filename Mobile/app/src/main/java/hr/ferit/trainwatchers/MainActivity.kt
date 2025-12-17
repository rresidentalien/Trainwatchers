package hr.ferit.trainwatchers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import hr.ferit.trainwatchers.data.TrainViewModel
import hr.ferit.trainwatchers.ui.theme.AppNavigation
import hr.ferit.trainwatchers.ui.theme.TrainwatchersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrainwatchersTheme {
                AppNavigation(viewModel = TrainViewModel())
            }
        }
    }
}
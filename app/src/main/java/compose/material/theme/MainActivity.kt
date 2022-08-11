package compose.material.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import compose.material.theme.ui.theme.Material3ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize(),
                        // Gap between children = 26 dp

                        verticalArrangement = Arrangement.spacedBy(26.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {



                        Spacer(modifier = Modifier.height(20.dp))

                        ButtonSample()

                        ElevatedButtonSample()

                        FilledTonalButtonSample()

                        OutlinedButtonSample()

                        TextButtonSample()

                        ButtonWithIconSample()

                        //Icon Button
                        IconButtonSample()

                        //Icon Toggle Button Sample
                        IconToggleButtonSample()


                        // * Button cut corner shape
                        Button(
                            onClick = { /*TODO*/ }
                          , shape = CutCornerShape(12.dp)
                            // , shape = CutCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
                        ) {
                            Text(
                                text = "Button cut corner shape",
                                Modifier.padding(8.dp)
                                , style = MaterialTheme.typography.labelLarge)
                        }


                        // * Rounded corners button
                        Button(
                            onClick = { /*TODO*/ }
                            , shape = RoundedCornerShape(20.dp)
                            //, shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
                        ) {
                            Text(
                                text = "Rounded corners button",
                                Modifier.padding(8.dp)
                                , style = MaterialTheme.typography.labelLarge)
                        }


                        Spacer(modifier = Modifier.height(20.dp))

                    }



                }
            }
        }
    }
}


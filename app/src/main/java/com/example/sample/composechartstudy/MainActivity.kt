package com.example.sample.composechartstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sample.composechartstudy.ui.theme.ComposeChartStudyTheme
import com.patrykandpatrick.vico.compose.axis.horizontal.bottomAxis
import com.patrykandpatrick.vico.compose.axis.vertical.startAxis
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.core.entry.entriesOf
import com.patrykandpatrick.vico.core.entry.entryModelOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeChartStudyTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    LineChart()
}

@Composable
fun LineChart() {
    val chartEntryModel = entryModelOf(
        entriesOf(4f, 12f, 8f, 16f),
        entriesOf(12f, 16f, 4f, 12f)
    )

    Chart(
        chart = lineChart(),
        model = chartEntryModel,
        startAxis = startAxis(),
        bottomAxis = bottomAxis(),
    )
}


@Preview
@Composable
fun LineChartPreview() {
    LineChart()
}

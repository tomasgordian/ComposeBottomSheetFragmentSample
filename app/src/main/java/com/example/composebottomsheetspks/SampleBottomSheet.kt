package com.example.composebottomsheetspks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import com.example.composebottomsheetspks.ui.theme.MyTheme
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SampleBottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Theme_Sample_BottomSheetDialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MyTheme {
                    Box(
                        modifier = Modifier.height(500.dp)
                    ) {
                        TextField(value = "Type here", onValueChange = {})
                        Button(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .imePadding(),
                            onClick = {  }
                        ) {
                            Text(text = "BUTTON")
                        }
                    }
                }
            }
        }
    }
}

package com.example.praktikum4tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_app))
            .windowInsetsPadding(WindowInsets.statusBars)
            .padding(dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            modifier = Modifier.fillMaxWidth(),
            fontSize = dimensionResource(R.dimen.header_title_size).value.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_title),
            textAlign = TextAlign.Center
        )

        Text(
            text = stringResource(R.string.univ),
            modifier = Modifier.fillMaxWidth(),
            fontSize = dimensionResource(R.dimen.header_subtitle_size).value.sp,
            color = colorResource(R.color.text_title),
            textAlign = TextAlign.Center
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.header_spacing)
            )
        )

        CardMahasiswa(
            nama = stringResource(R.string.nama_1),
            alamat = stringResource(R.string.alamat_1),
            warna = R.color.card_0_bg,
            khususDzaki = true
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.card_spacing)
            )
        )

        CardMahasiswa(
            nama = stringResource(R.string.nama_2),
            alamat = stringResource(R.string.alamat_2),
            warna = R.color.card_1_bg
        )


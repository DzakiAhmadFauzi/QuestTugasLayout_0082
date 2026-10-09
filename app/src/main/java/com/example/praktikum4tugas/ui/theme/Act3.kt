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

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.card_spacing)
            )
        )

        CardMahasiswa(
            nama = stringResource(R.string.nama_3),
            alamat = stringResource(R.string.alamat_3),
            warna = R.color.card_2_bg
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.card_spacing)
            )
        )

        CardMahasiswa(
            nama = stringResource(R.string.nama_4),
            alamat = stringResource(R.string.alamat_4),
            warna = R.color.card_3_bg
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copy),
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    vertical = dimensionResource(R.dimen.footer_vertical_padding)
                ),
            fontSize = dimensionResource(R.dimen.footer_text_size).value.sp,
            color = colorResource(R.color.text_title),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CardMahasiswa(
    nama: String,
    alamat: String,
    warna: Int,
    khususDzaki: Boolean = false
) {
    val density = LocalDensity.current

    val ukuranNama: TextUnit = with(density) {
        dimensionResource(
            if (khususDzaki) {
                R.dimen.dzaki_name_size
            } else {
                R.dimen.student_name_size
            }
        ).value.sp
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.card_height)),
        shape = RoundedCornerShape(
            dimensionResource(R.dimen.card_corner_radius)
        ),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(
                    dimensionResource(R.dimen.card_logo_size)
                )
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        horizontal = dimensionResource(
                            R.dimen.text_horizontal_padding
                        )
                    ),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = nama,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = ukuranNama,
                    fontFamily = if (khususDzaki) {
                        FontFamily.Cursive
                    } else {
                        FontFamily.Default
                    },
                    fontWeight = if (khususDzaki) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    },
                    color = Color.White,
                    textAlign = TextAlign.Start
                )

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(R.dimen.text_spacing)
                    )
                )

                Text(
                    text = alamat,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = dimensionResource(
                        R.dimen.student_address_size
                    ).value.sp,
                    fontWeight = FontWeight.Normal,
                    color = colorResource(R.color.text_white),
                    textAlign = TextAlign.Start
                )
            }

            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(
                    dimensionResource(R.dimen.card_logo_size)
                )
            )
        }
    }
}

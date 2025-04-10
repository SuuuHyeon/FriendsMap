package com.example.friends_map

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.friends_map.presentation.view.MapScreen
import com.example.friends_map.ui.theme.Friends_mapTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val packageName = applicationContext.packageName
//        Log.d("packageName==============", "📌 실제 패키지명: $packageName")
//
//        // ✅ 클라이언트 설정
//        val clientId = "lh66pivs4m"
//        val naverCloudClient = NaverMapSdk.NaverCloudPlatformClient(clientId)
//        NaverMapSdk.getInstance(this).client = naverCloudClient
//
//        // ✅ 인증 실패 콜백 먼저 설정
//        NaverMapSdk.getInstance(this).setOnAuthFailedListener { exception ->
//            Log.e("navermap-auth", "❌ 인증 실패 발생: ${exception.message}", exception)
//
//            when (exception) {
//                is NaverMapSdk.UnauthorizedClientException -> {
//                    Log.e("navermap-auth", "→ [401] 잘못된 Client ID / 패키지명 / SHA-1 키 해시")
//                }
//
//                is NaverMapSdk.QuotaExceededException -> {
//                    Log.e("navermap-auth", "→ [429] Maps API 미등록 or 호출량 초과")
//                }
//
//                is NaverMapSdk.ClientUnspecifiedException -> {
//                    Log.e("navermap-auth", "→ [800] Client ID 미지정")
//                }
//
//                else -> {
//                    Log.e("navermap-auth", "→ 기타 인증 실패: ${exception.javaClass.simpleName}")
//                }
//            }
//        }

        enableEdgeToEdge()
        setContent {
            Friends_mapTheme {
                MapScreen()
            }
        }
    }
}

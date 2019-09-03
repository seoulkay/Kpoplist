package www.ufo79.com.kpoplist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds;
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView
    //var dogList = arrayListOf<Row>()

    var dogList = arrayListOf<Row>(
        Row("Chow Chow", "Male", "4", "hell0", "hey"),
        Row("Breed Pomeranian", "Female", "1", "hell0", "hey"),
        Row("Golden Retriver", "Female", "3", "hell0", "hey"),
        Row("Yorkshire Terrier", "Male", "5", "hell0","hey"),
        Row("Pug", "Male", "4", "hell0", "hey"),
        Row("Alaskan Malamute", "Male", "7", "hell0", "hey"),
        Row("Shih Tzu", "Female", "5", "hell0", "hey")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogAdapter = MainListAdapter(this, dogList)
        mainListView.adapter = dogAdapter


        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mAdView.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(errorCode : Int) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }
    }


}

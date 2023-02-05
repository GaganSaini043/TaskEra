package gagan.app.taskera

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import gagan.app.taskera.R
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    @BindView(R.id.app_title)
    lateinit var txtTitle : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ButterKnife.bind(this)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val typeface : Typeface = Typeface.createFromAsset(assets , "Holiday Trip Free.ttf")
        txtTitle.typeface = typeface

        goToNextScreen()
    }

    fun goToNextScreen(){

        Observable
            .timer(2000, TimeUnit.MILLISECONDS)
            .map { o ->
                startActivity(Intent(this,IntroActivity::class.java))
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()

    }
}
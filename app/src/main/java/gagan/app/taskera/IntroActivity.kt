package gagan.app.taskera

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class IntroActivity : AppCompatActivity() {

    @BindView(R.id.txt_appname)
    lateinit var txtAppName : TextView

    @BindView(R.id.button_signup)
    lateinit var buttonSignUp : Button

    @BindView(R.id.button_signin)
    lateinit var buttonSignIn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        ButterKnife.bind(this)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var typeface : Typeface = Typeface.createFromAsset(assets , "Holiday Trip Free.ttf")
        txtAppName.typeface = typeface
    }

    @OnClick(R.id.button_signup)
    fun onSignUpButtonClick(){
        startActivity(Intent(this,SignUpActivity::class.java))
    }

    @OnClick(R.id.button_signin)
    fun onSignInButtonClick(){
        startActivity(Intent(this,SignUpActivity::class.java))
    }
}
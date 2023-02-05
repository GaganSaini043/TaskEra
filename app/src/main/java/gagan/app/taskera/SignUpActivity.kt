package gagan.app.taskera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import butterknife.ButterKnife

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        ButterKnife.bind(this)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

    }
}
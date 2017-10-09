package sa.sarah.nationalambulance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signup_btn.setOnClickListener({
            val signUpIntent = Intent(this, SignupActivity::class.java)
            startActivity(signUpIntent)
        })

        signin_btn.setOnClickListener({
            val signInIntent = Intent(this, SigninActivity::class.java)
            startActivity(signInIntent)
        })
    }
}

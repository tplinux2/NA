package sa.sarah.nationalambulance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_main.*

class UserMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_main)

        open_map_btn.setOnClickListener({
            val mapIntent = Intent(this, UserMapActivity::class.java)
            startActivity(mapIntent)
        })
    }
}

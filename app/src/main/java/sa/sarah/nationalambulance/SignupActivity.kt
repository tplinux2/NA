package sa.sarah.nationalambulance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    var mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        mAuth = FirebaseAuth.getInstance()
        var mUser = mAuth!!.currentUser

        Log.d("AUTHHH", mAuth!!.currentUser.toString())

        signup_btn_complete.setOnClickListener({
            var name = name_field.text.toString()
            var email = email_field.text.toString()
            var password = password_field.text.toString()
            var phone = phone_field.text.toString()


            mAuth!!.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener{task: Task<AuthResult> ->
                        if(task.isSuccessful){
                            Log.d("REG", "WOW")
                        }else{
                            Log.d("REG", "NO")
                        }
                    }
        })
    }
}

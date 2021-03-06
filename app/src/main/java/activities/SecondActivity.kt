package activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceapplication.Constants
import com.example.practiceapplication.R
import com.example.practiceapplication.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    companion object{
        val TAG:String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        bundle?.let {   val msg = bundle.getString(Constants.USER_MSG_KEY)
            if (msg != null) {
                showToast(msg)
            }
            txvUserMessage.text=msg}


    }
}


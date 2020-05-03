package arb.test.switchs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnClickListener {
            if (switch1.isChecked){
                main.setBackgroundColor(Color.DKGRAY)
                switch1.setTextColor(Color.WHITE)
            }
            else{
                main.setBackgroundColor(Color.WHITE)
                switch1.setTextColor(Color.BLACK)
            }
        }
    }
}

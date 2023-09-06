import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Appendable

class MainActivity: AppCompatActivity() {
    lateinint var toplayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toplayout=findViewById(R.id.toplayout)
        toplayout.setBackgroundColor(Color.parseColor("#495357"))
        var textview = TextView(this)
        textview.text = resources.getText(R.string.little_lemon)
        textview.setTextColor(Color.parseColor(#F4CE14))
        toplayout.addView(textview)
    }
}
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.pethub.BuyerHome
import com.example.pethub.BuyerProf
import com.example.pethub.Category
import com.example.pethub.R

class Buyer_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyer_profile)

        val profile: ImageButton =findViewById(R.id.profile)
        profile.setOnClickListener {
            startActivity(Intent(this, BuyerProf::class.java))
        }

        val caegorie: ImageButton =findViewById(R.id.catogorie)
        caegorie.setOnClickListener {
            startActivity(Intent(this, Category::class.java))
        }
        val homebtn: ImageButton =findViewById(R.id.homebtn)
        homebtn.setOnClickListener {
            startActivity(Intent(this, BuyerHome::class.java))
        }
    }
}
package com.plugin.pregnantcarekuwuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.plugin.pregnantcarekuwuk.FragmentBumil.BerandaFragment
import com.plugin.pregnantcarekuwuk.FragmentBumil.ChatFragment
import com.plugin.pregnantcarekuwuk.FragmentBumil.ProfileFragment
import com.plugin.pregnantcarekuwuk.FragmentUser.HistoryFragment
import com.plugin.pregnantcarekuwuk.FragmentUser.MapsFragment
import com.plugin.pregnantcarekuwuk.FragmentUser.ProfilFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_user.*

class MainUserActivity : AppCompatActivity() {

    private var contentUser: FrameLayout? = null

    companion object{
        private const val ID_MAPS =0
        private const val ID_HISTORY =1
        private const val ID_PROFILE =2
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.contentUser, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        val fragment = MapsFragment()
        addFragment(fragment)

        bottomNavigationUser.add(MeowBottomNavigation.Model(ID_MAPS, R.drawable.ic_home))
        bottomNavigationUser.add(MeowBottomNavigation.Model(ID_HISTORY, R.drawable.ic_history))
        bottomNavigationUser.add(MeowBottomNavigation.Model(ID_PROFILE, R.drawable.ic_account))

//        bottomNavigationUser.setCount(ID_HISTORY, "3")

        bottomNavigationUser.setOnShowListener {
                item -> when (item.id){
            ID_MAPS -> {
                val fragment = MapsFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
            ID_HISTORY -> {
                val fragment = HistoryFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
            ID_PROFILE -> {
                val fragment = ProfilFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
        }

        }

        bottomNavigationUser.setOnClickMenuListener {
            val name = when (it.id){
                ID_MAPS -> "Beranda"
                ID_HISTORY -> "Pesan"
                ID_PROFILE -> "Akun"
                else -> ""
            }
        }
    }
}

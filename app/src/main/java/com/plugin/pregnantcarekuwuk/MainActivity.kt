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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    companion object{
        private const val ID_HOME =1
        private const val ID_CHAT =2
        private const val ID_PROFILE =3
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        val fragment = BerandaFragment()
        addFragment(fragment)

        bottomNavigation.add(MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(ID_CHAT, R.drawable.ic_message))
        bottomNavigation.add(MeowBottomNavigation.Model(ID_PROFILE, R.drawable.ic_account))

        bottomNavigation.setCount(ID_CHAT, "3")

        bottomNavigation.setOnShowListener {
                item -> when (item.id){
            ID_HOME -> {
                val fragment = BerandaFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
            ID_CHAT -> {
                val fragment = ChatFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
            ID_PROFILE -> {
                val fragment = ProfileFragment()
                addFragment(fragment)
                return@setOnShowListener
                true
            }
        }

}

        bottomNavigation.setOnClickMenuListener {
            val name = when (it.id){
                ID_HOME -> "Beranda"
                ID_CHAT -> "Pesan"
                ID_PROFILE -> "Akun"
                else -> ""
            }
        }
    }
}

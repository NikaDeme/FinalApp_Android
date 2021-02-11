package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

val VajaGamotqma = listOf<String>(
    "ადამიანი იმით ფასდება, აზრს ვინ ატარებს რამდენად ფრთიანსა.",
    "ადვილ ვერ იცნობ ვაჟკაცსა მის ვაჟკაცური რჯულითა.",
    "ავი დატანჯე და დაამონე, კეთილის მქნელსა შეასხი ფრთები.",
    "ვგონებ ჩემთან ერთად თქვენც იტყვით, რომ სულიერი მამები არიან „მიიღე ჯამაგირის“ პარტიისა…" ,
    "ადამიანის ფიქრის ერთი საქებური თვისება - მოვლენათა მიზეზების ძიებაა",
    "ბუნების ცოდვა ეს არი, მუდამ საწყინო ჩემია, ავსა და კარგსა ყველას ჰკლავს, არავინ გადურჩენია.",
    "მაშ რისთვის მინდა სიცოცხლე, სული რადა მრჩავ პირშია, თუკი არ გამოვადგები სამშობლოს გასაჭირშია.",
    "ბრიყვი ჭკვიანის ბარგია, ზურგით სათრევი გუდადა, უნდა ჭკვიანმა ასწოროს ბრიყვის ნათალი მრუდადა.",
    "მწერლობა მაშინ ასრულებს თავის წმინდა მოვალეობას, როცა უკეთესად ემსახურება ქვეყანას.",
    "განა ყველა რაც ხმელია, კაცთაგან საწუნარია? ათას ცოცხალსა ბევრჯელა, ასჯერ სჯობს ერთი მკვდარია.",
    "სამშობლოს არვის წავართმევთ, სხვაც ნურვინ შეგვეცილება, თორემ ისეთ დღეს დავაყრით მკვდარასაც კი გაეცინება.",
    "ჩვენში ძალიან სათაკილოდ და ვითომ ნიჭის დამამცირებლად მიაჩნიათ მწერალზე სხვისი გაველან.",

)

private lateinit var Vaja: ListView
private lateinit var OnClickUkan : Button



class VajaListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaja_list_view)

        Vaja = findViewById(R.id.VajaGamonatqvamebiListView)
        OnClickUkan = findViewById(R.id.ClickUkanButton)

        supportActionBar?.hide()


        Vaja.adapter = VajaGamonatqvamebi(this, VajaGamotqma)



        OnClickUkan.setOnClickListener {
            val intent = Intent(this , Gamonatqvamebi_Activity::class.java)
            startActivity(intent)
        }


    }
}
package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

private lateinit var Rchevebi : ListView
private lateinit var GoMenu : Button

val user = listOf<String>(
"ჩაიწერე ნებისმიერი რამ: როგორ გრძნობ თავს, რას აკეთებ დღის განმავლობაში, ჩვენ ხომ უნიკალური ისტორიული დროის ეპიცენტრში ვიმყოფებით." ,
    "მისწერე წერილი შენს მომავალ მეს.",
    "თუკი კინოთეატრი მოგენატრა, შექმენი მისი განწყობა - მოამზადე პოპკორნი, ჩააქრე შუქები და ისიამოვნე.",
    "თუ იზოლაციაში მარტო არ იმყოფები, ითამაშე სამაგიდო თამაშები.",
    "საკუთარი რეზიუმეს გასაახლებლად დღეს ნამდვილად ბევრი დრო გაქვს. ",
    "გადახედე წიგნის თაროებს, აარჩიე რომელიმე და ისიამოვნე.",
    "გადმოიწერე რაიმე თამაში ტელეფონში, გაუზიარე მეგობარს და ითამაშეთ ერთად.",
    " ჩართე ვიდეოგაკვეთილები და ივარჯიშე სახლში იოგა, პილატესი... მოკლედ, რაც გინდა.",
    "ჩართე ვიდეოგაკვეთილები და თავად მოამზადე გემრიელი კერძები.",
    "შეცვალე შენი ოთახის ინტერიერი, გადაადგილე ავეჯი, მაგიდა, გასაქანი მიეცი შენს წარმოსახვას და მოეწყვე უფრო მყუდროდ." ,
    "თუკი საღამოს განტვირთვა მოგინდა, ინტერნეტში კოქტეილების უამრავ რეცეპტს აღმოაჩენ.",
    "თუ შემოქმედებითი ადამიანი ხარ, ხატვა, ქარგვა, წერა, გადაღება - ეს ყველაფერი სახლში, შენს ახალ სახელოსნოში შეგიძლია აკეთო.",
)
class Rchevebi_ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rchevebi__list_view)

        Rchevebi = findViewById(R.id.RchevebiListView)
        GoMenu = findViewById(R.id.GoMenuButton)

        supportActionBar?.hide()

    Rchevebi.adapter = RchevebiAdapt(this, user)

        GoMenu.setOnClickListener {
            val intent = Intent(this,Menu_Activity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
val Gamotqma = listOf<String>(
        "„ადამიანის უძვირფასესი საუნჯე მისი ვინაობაა.“",
        "„ავი კაცი რამდენადაც მეცნიერია, დიდი სწავული, იმოდენად უფრო ძლიერ საშიშია, უფრო ძლიერ მავნებელია.“",
        "„არამც თუ უსაბუთო ძაგება, უსაბუთო ქებაც კი საწყენია მართებულის კაცისათვის.“",
        "„ზოგი საგანია, რომ თუ არ დაინახავ, ვერ ირწმუნებ, და ზოგი – იმისთანა, თუ არ ირწმუნებ, ვერ დაინახავ.“",
        "„მხოლოდ წარსულის ცოდნით დაუცავს ყოველს ერს თავისი ეროვნება, თავისი არსებობა, თავისი ვინაობა.“",
        "„ქვეყანა ტაძარი კი არაა, საცა კაცი უნდა ლოცულობდეს, არამედ სახელოსნოა, საცა უნდა ირჯებოდეს და მუშაობდეს!“",
        "„ქვეყანა იმით კი არ არის უბედური, რომ ღარიბია, არამედ იმით, რომ მცოდნე, გონებაგახსნილი, გულანთებული კაცები არა ჰყავს.“",
        "„ვინც კაცად არ ვარგა, ის არც მამად ივარგებს, არც დედად და არც სხვად რადმე; იმიტომ, რომ მამობა და დედობა ადამიანური მარტო შვილების გამრავლება და ძუძუს წოვება არ არის.“",
        "„ვინც ლაფში თავიდან ფეხებამდე ამოსვრილია, არ შეიძლება ისე შეეხოს სხვას, რომ თავისი ლაფი იმასაც არ მოაცხოს.“",
        "„ერი, ერთის ღვაწლის დამდები, ერთს ისტორიულ უღელში ბმული, ერთად მებრძოლი ერთსა და იმავე ჭირსა და ლხინში გამოტარებული – ერთსულოვნებით, ერთგულებით ძლიერია.“",


)
private lateinit var Ilia : ListView
private lateinit var Ukandabruneba : Button

class IliaListview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilia_listview)

        Ilia = findViewById(R.id.IliaGamonatqvamebiListview)
        Ukandabruneba = findViewById(R.id.iliaGoBack)

        supportActionBar?.hide()

        Ilia.adapter = IliaGamonatqvamebi(this, Gamotqma)


        Ukandabruneba.setOnClickListener {
            val intent = Intent(this,Gamonatqvamebi_Activity::class.java)
            startActivity(intent)
        }



    }
}
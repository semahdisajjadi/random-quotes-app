package com.example.randomquotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    private val quotes = listOf(
        "زندگی مثل دوچرخه‌سواری است. برای حفظ تعادل باید حرکت کرد. - انیشتین",
        "امید، تنها چیزی است که قوی‌تر از ترس است. - سوگندنامه",
        "ساده‌ترین کارها را سخت‌ترین کارها قرار نده. - خودتو",
        "هر روز فرصتی تازه برای شروع هست.",
        "بهترین راه برای پیش‌بینی آینده، ساختن آن است."
    )
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val quoteText: TextView = findViewById(R.id.quoteText)
        val nextButton: Button = findViewById(R.id.nextButton)
        
        // نمایش اولین نقل قول
        showRandomQuote(quoteText)
        
        // دکمه برای نقل قول بعدی
        nextButton.setOnClickListener {
            showRandomQuote(quoteText)
        }
    }
    
    private fun showRandomQuote(textView: TextView) {
        val randomQuote = quotes.random()
        textView.text = randomQuote
    }
}
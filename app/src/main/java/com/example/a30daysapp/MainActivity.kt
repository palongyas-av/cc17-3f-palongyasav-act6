package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // List of tips for 30 days
    private val cleaningTips = listOf(
        Tip(1, "Organize your desk", "Start by clearing off your desk and removing clutter. Organize files, pens, papers, and books neatly.", R.drawable.d1),
        Tip(2, "Vacuum the floor", "Make sure to vacuum under the bed and in corners where dust collects.", R.drawable.d2),
        Tip(3, "Wipe down surfaces", "Use a microfiber cloth to clean surfaces, including tables, shelves, and countertops.", R.drawable.d3),
        Tip(4, "Declutter drawers", "Go through one drawer at a time and get rid of unnecessary items.", R.drawable.d4),
        Tip(5, "Clean the windows", "Wipe down windows to remove dust and fingerprints.", R.drawable.d5),
        Tip(6, "Dust the shelves", "Dust bookshelves, cabinets, and display areas using a duster or microfiber cloth.", R.drawable.d6),
        Tip(7, "Wash bed linens", "Take time to clean your bed linens, including pillow covers and blankets.", R.drawable.d7),
        Tip(8, "Declutter closet", "Sort through your clothes and donate or throw away items you no longer need.", R.drawable.d8),
        Tip(9, "Wipe down electronics", "Gently clean your computer screen, TV, and other electronics using appropriate cleaning materials.", R.drawable.d9),
        Tip(10, "Organize cables", "Tidy up cables behind your desk or TV by organizing or using cable ties.", R.drawable.d10),
        Tip(11, "Clean light fixtures", "Wipe down light fixtures and lamps to remove dust and cobwebs.", R.drawable.d11),
        Tip(12, "Clean mirrors", "Use a glass cleaner to remove streaks and smudges from mirrors.", R.drawable.d12),
        Tip(13, "Mop the floor", "After vacuuming, mop the floor to remove stains and dust residue.", R.drawable.d13),
        Tip(14, "Clean under the bed", "Pull out items from under the bed and vacuum or clean this often neglected space.", R.drawable.d14),
        Tip(15, "Tidy up books and magazines", "Organize books and magazines on shelves or in storage boxes.", R.drawable.d15),
        Tip(16, "Polish furniture", "Polish wooden furniture with appropriate cleaning products to maintain their shine.", R.drawable.d16),
        Tip(17, "Clean window sills", "Wipe down window sills to remove dust and debris.", R.drawable.d17),
        Tip(18, "Organize personal items", "Go through your personal items such as jewelry, accessories, and gadgets, and organize them properly.", R.drawable.d18),
        Tip(19, "Disinfect frequently touched areas", "Disinfect door handles, light switches, and other frequently touched surfaces.", R.drawable.d19),
        Tip(20, "Sort out paper clutter", "Go through papers, old receipts, and mail. File away what you need and recycle the rest.", R.drawable.d20),
        Tip(21, "Clean out trash cans", "Take out the trash and wash trash cans with soap and water.", R.drawable.d21),
        Tip(22, "Refresh air in the room", "Open windows to let fresh air in, or use an air purifier to improve air quality.", R.drawable.d22),
        Tip(23, "Clean the baseboards", "Wipe down the baseboards in your room to remove dust and grime.", R.drawable.d23),
        Tip(24, "Organize shoes", "Sort and organize your shoes. Dust off any that need cleaning.", R.drawable.d24),
        Tip(25, "Wipe door frames", "Dust and clean the top and sides of door frames.", R.drawable.d25),
        Tip(26, "Wash throw pillows", "Wash or refresh your throw pillows to keep them clean and soft.", R.drawable.d26),
        Tip(27, "Clean the fan or AC vents", "Dust or vacuum the ceiling fan and any air conditioning vents.", R.drawable.d27),
        Tip(28, "Organize your nightstand", "Declutter and clean your nightstand by removing unnecessary items and wiping it down.", R.drawable.d28),
        Tip(29, "Vacuum curtains", "Vacuum or clean your curtains to remove dust and allergens.", R.drawable.d29),
        Tip(30, "Give your room a final touch", "Light a scented candle or use a room freshener to give your space a pleasant smell.", R.drawable.d30_)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(cleaningTips)
    }
}

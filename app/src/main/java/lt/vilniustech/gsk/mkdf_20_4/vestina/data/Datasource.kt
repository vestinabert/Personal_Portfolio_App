package lt.vilniustech.gsk.mkdf_20_4.vestina.data

import lt.vilniustech.gsk.mkdf_20_4.vestina.R
import lt.vilniustech.gsk.mkdf_20_4.vestina.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.instagram, R.string.affirmation1_1),
            Affirmation(R.string.affirmation2, R.drawable.glitch,R.string.affirmation2_2),
            Affirmation(R.string.affirmation3, R.drawable.diary,R.string.affirmation3_3),
            Affirmation(R.string.affirmation4, R.drawable.matlab,R.string.affirmation4_4)
        )
    }
}
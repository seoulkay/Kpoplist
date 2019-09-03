package www.ufo79.com.kpoplist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MainListAdapter (val context: Context, val dogList: ArrayList<Row>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_adapter, null)

        val dogPhoto = view.findViewById<ImageView>(R.id.dogPhotoImg)
        val dogBreed = view.findViewById<TextView>(R.id.dogBreedTv)
        val dogAge = view.findViewById<TextView>(R.id.dogAgeTv)
        val dogGender = view.findViewById<TextView>(R.id.dogGenderTv)

        val row = dogList[p0]
        val  resourceId = context.resources.getIdentifier(row.thumb, "drawable", context.packageName)
        dogPhoto.setImageResource(resourceId)
        dogBreed.text = row.cate
        dogAge.text  = row.descrip
        dogGender.text = row.longDescrip


        return view
    }

    override fun getItem(p0: Int): Any {
        return dogList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return dogList.size
    }

}
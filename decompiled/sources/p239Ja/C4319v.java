package p239Ja;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: Ja.v */
/* JADX INFO: loaded from: classes.dex */
public final class C4319v extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f14082a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f14083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialAutoCompleteTextView f14084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4319v(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f14084c = materialAutoCompleteTextView;
        m5132a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5132a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f14084c;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.f36709y0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f14083b = colorStateList;
        if (materialAutoCompleteTextView.f36708x0 != 0 && materialAutoCompleteTextView.f36709y0 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC18861b.m20167e(materialAutoCompleteTextView.f36709y0.getColorForState(iArr3, 0), materialAutoCompleteTextView.f36708x0), AbstractC18861b.m20167e(materialAutoCompleteTextView.f36709y0.getColorForState(iArr2, 0), materialAutoCompleteTextView.f36708x0), materialAutoCompleteTextView.f36708x0});
        }
        this.f14082a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f14084c;
            Drawable rippleDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f36708x0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f36708x0);
                if (this.f14083b != null) {
                    colorDrawable.setTintList(this.f14082a);
                    rippleDrawable = new RippleDrawable(this.f14083b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}

package p038Ba;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import p353O4.C6115b;

/* JADX INFO: renamed from: Ba.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0853c {

    /* JADX INFO: renamed from: a */
    public C6115b f2367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2369c;

    public /* synthetic */ C0853c(View view, int i10) {
        this.f2368b = i10;
        this.f2369c = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m1912a(Drawable drawable) {
        switch (this.f2368b) {
            case 0:
                AbstractC0854d abstractC0854d = (AbstractC0854d) this.f2369c;
                abstractC0854d.setIndeterminate(false);
                abstractC0854d.m1915a(abstractC0854d.f2371p0);
                break;
            case 1:
                AbstractC0854d abstractC0854d2 = (AbstractC0854d) this.f2369c;
                if (!abstractC0854d2.f2375t0) {
                    abstractC0854d2.setVisibility(abstractC0854d2.f2376u0);
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.f2369c).f36509C0;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1913b(Drawable drawable) {
        switch (this.f2368b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f2369c;
                ColorStateList colorStateList = materialCheckBox.f36509C0;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f36513G0, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1914c(Drawable drawable) {
    }
}

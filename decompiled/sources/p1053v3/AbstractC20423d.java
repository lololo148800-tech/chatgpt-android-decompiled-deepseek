package p1053v3;

import android.os.Bundle;
import android.text.Spanned;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: v3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20423d {

    /* JADX INFO: renamed from: a */
    public static final String f64596a;

    /* JADX INFO: renamed from: b */
    public static final String f64597b;

    /* JADX INFO: renamed from: c */
    public static final String f64598c;

    /* JADX INFO: renamed from: d */
    public static final String f64599d;

    /* JADX INFO: renamed from: e */
    public static final String f64600e;

    static {
        int i10 = AbstractC20817s.f66106a;
        f64596a = Integer.toString(0, 36);
        f64597b = Integer.toString(1, 36);
        f64598c = Integer.toString(2, 36);
        f64599d = Integer.toString(3, 36);
        f64600e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m21082a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f64596a, spanned.getSpanStart(obj));
        bundle2.putInt(f64597b, spanned.getSpanEnd(obj));
        bundle2.putInt(f64598c, spanned.getSpanFlags(obj));
        bundle2.putInt(f64599d, i10);
        if (bundle != null) {
            bundle2.putBundle(f64600e, bundle);
        }
        return bundle2;
    }
}

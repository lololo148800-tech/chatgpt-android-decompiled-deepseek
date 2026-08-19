package p330N4;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import p038Ba.C0857g;
import p315Me.Myis.CxcULo;

/* JADX INFO: renamed from: N4.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5642H {

    /* JADX INFO: renamed from: a */
    public static final C5643I f18332a;

    /* JADX INFO: renamed from: b */
    public static final C0857g f18333b;

    /* JADX INFO: renamed from: c */
    public static final C0857g f18334c;

    /* JADX INFO: renamed from: a */
    public static void m6071a(View view, int i10, int i11, int i12, int i13) {
        f18332a.mo6073f(view, i10, i11, i12, i13);
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f18332a = new C5644J();
        } else {
            f18332a = new C5643I();
        }
        f18333b = new C0857g(Float.class, "translationAlpha", 9);
        f18334c = new C0857g(Rect.class, CxcULo.nIxljTSFhqiSXd, 10);
    }
}

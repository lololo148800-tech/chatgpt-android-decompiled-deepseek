package p931ok;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1436k;
import p586Y0.C9555g;

/* JADX INFO: renamed from: ok.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18223d {

    /* JADX INFO: renamed from: a */
    public static final boolean f58070a;

    static {
        f58070a = Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: renamed from: a */
    public static void m19731a(View view, int i10) {
        boolean z6 = (i10 & 1) != 0;
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 4) != 0;
        boolean z12 = (i10 & 8) != 0;
        AbstractC16544l.m18094g(view, "<this>");
        m19732b(view, new C18221b(view, z11, z6, z12, z10));
    }

    /* JADX INFO: renamed from: b */
    public static final void m19732b(View view, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(view, "<this>");
        C9555g c9555g = new C9555g(interfaceC1436k);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0730K.m1555l(view, c9555g);
        if (view.isAttachedToWindow()) {
            return;
        }
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC18222c(0));
        }
    }
}

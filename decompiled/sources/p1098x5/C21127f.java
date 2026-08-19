package p1098x5;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC8154o0;
import p864l5.C16823j;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: x5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21127f implements InterfaceC21130i {

    /* JADX INFO: renamed from: Y */
    public final ImageView f67126Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f67127Z;

    public C21127f(ImageView imageView, boolean z6) {
        this.f67126Y = imageView;
        this.f67127Z = z6;
    }

    @Override // p1098x5.InterfaceC21130i
    /* JADX INFO: renamed from: a */
    public final Object mo10210a(C16823j c16823j) {
        C21129h c21129hM21248s = AbstractC20734X.m21248s(this);
        if (c21129hM21248s != null) {
            return c21129hM21248s;
        }
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c16823j));
        c0624m.m1262r();
        ViewTreeObserver viewTreeObserver = this.f67126Y.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC21132k viewTreeObserverOnPreDrawListenerC21132k = new ViewTreeObserverOnPreDrawListenerC21132k(this, viewTreeObserver, c0624m);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21132k);
        c0624m.m1264u(new C21131j(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC21132k));
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21127f) {
            C21127f c21127f = (C21127f) obj;
            if (AbstractC16544l.m18089b(this.f67126Y, c21127f.f67126Y) && this.f67127Z == c21127f.f67127Z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f67126Y.hashCode() * 31) + (this.f67127Z ? 1231 : 1237);
    }
}

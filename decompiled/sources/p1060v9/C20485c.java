package p1060v9;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import p007A5.AbstractC0369d;
import p007A5.ComponentCallbacks2C0378m;
import p007A5.InterfaceC0374i;
import p1075w5.C20827e;
import p1075w5.C20831i;
import p1075w5.C20834l;
import p1075w5.C20835m;
import p1075w5.EnumC20824b;
import p1098x5.C21123b;
import p1098x5.C21129h;
import p1098x5.EnumC21128g;
import p1121y5.C21388a;
import p1121y5.InterfaceC21389b;
import p239Ja.C4308k;
import p470T4.AbstractC7255t;
import p523V9.AbstractC7870D5;
import p885m4.C17151a;

/* JADX INFO: renamed from: v9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20485c {

    /* JADX INFO: renamed from: a */
    public Object f65029a;

    /* JADX INFO: renamed from: b */
    public Object f65030b;

    /* JADX INFO: renamed from: c */
    public Object f65031c;

    /* JADX INFO: renamed from: b */
    public static C20827e m21132b(C20831i c20831i, Throwable th2) {
        Drawable drawableM1000b;
        if (!(th2 instanceof C20834l) || (drawableM1000b = AbstractC0369d.m1000b(c20831i, null, null, c20831i.f66209D.f66172l)) == null) {
            drawableM1000b = AbstractC0369d.m1000b(c20831i, null, null, c20831i.f66209D.f66171k);
        }
        return new C20827e(drawableM1000b, c20831i, th2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21133c(C20831i c20831i, Bitmap.Config config) {
        if (!AbstractC7255t.m7696d(config)) {
            return true;
        }
        if (!c20831i.f66222m) {
            return false;
        }
        InterfaceC21389b interfaceC21389b = c20831i.f66212c;
        if (interfaceC21389b instanceof C21388a) {
            ImageView imageView = ((C21388a) interfaceC21389b).f67898Z;
            if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m21134a(int[] iArr, ValueAnimator valueAnimator) {
        C17151a c17151a = new C17151a();
        valueAnimator.addListener((C4308k) this.f65031c);
        ((ArrayList) this.f65029a).add(c17151a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX INFO: renamed from: d */
    public C20835m m21135d(C20831i c20831i, C21129h c21129h) {
        boolean z6;
        c20831i.f66217h.getClass();
        Bitmap.Config config = c20831i.f66214e;
        if (AbstractC7255t.m7696d(config) && (!m21133c(c20831i, config) || !((InterfaceC0374i) this.f65031c).mo1009b(c21129h))) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config2 = config;
        AbstractC7870D5 abstractC7870D5 = c21129h.f67132a;
        C21123b c21123b = C21123b.f67119b;
        EnumC21128g enumC21128g = (abstractC7870D5.equals(c21123b) || c21129h.f67133b.equals(c21123b)) ? EnumC21128g.f67129Z : c20831i.f66234y;
        if (c20831i.f66223n) {
            c20831i.f66217h.getClass();
            if (config2 != Bitmap.Config.ALPHA_8) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        return new C20835m(c20831i.f66210a, config2, null, c21129h, enumC21128g, AbstractC0369d.m999a(c20831i), z6, c20831i.f66224o, null, c20831i.f66219j, c20831i.f66220k, c20831i.f66235z, c20831i.f66225p, c20831i.f66226q, c20831i.f66227r);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX INFO: renamed from: e */
    public C20835m m21136e(C20835m c20835m) {
        boolean z6;
        Bitmap.Config config;
        EnumC20824b enumC20824b;
        boolean z10;
        Bitmap.Config config2 = c20835m.f66239b;
        EnumC20824b enumC20824b2 = c20835m.f66252o;
        boolean z11 = true;
        if (!AbstractC7255t.m7696d(config2) || ((InterfaceC0374i) this.f65031c).mo1008a()) {
            z6 = false;
            config = config2;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z6 = true;
        }
        if (c20835m.f66252o.f66159Y) {
            ComponentCallbacks2C0378m componentCallbacks2C0378m = (ComponentCallbacks2C0378m) this.f65030b;
            synchronized (componentCallbacks2C0378m) {
                componentCallbacks2C0378m.m1017a();
                z10 = componentCallbacks2C0378m.f1285q0;
            }
            if (z10) {
                enumC20824b = enumC20824b2;
                z11 = z6;
            } else {
                enumC20824b = EnumC20824b.f66157p0;
            }
        } else {
            enumC20824b = enumC20824b2;
            z11 = z6;
        }
        return z11 ? new C20835m(c20835m.f66238a, config, c20835m.f66240c, c20835m.f66241d, c20835m.f66242e, c20835m.f66243f, c20835m.f66244g, c20835m.f66245h, c20835m.f66246i, c20835m.f66247j, c20835m.f66248k, c20835m.f66249l, c20835m.f66250m, c20835m.f66251n, enumC20824b) : c20835m;
    }
}

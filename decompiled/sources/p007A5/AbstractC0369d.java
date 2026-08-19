package p007A5;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p050Bn.C1451e;
import p1075w5.C20825c;
import p1075w5.C20826d;
import p1075w5.C20831i;
import p1075w5.EnumC20824b;
import p1098x5.C21124c;
import p1098x5.C21127f;
import p1098x5.EnumC21125d;
import p1098x5.InterfaceC21130i;
import p1121y5.C21388a;
import p1121y5.InterfaceC21389b;
import p1144z5.C21799c;
import p1144z5.InterfaceC21801e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9106B3;

/* JADX INFO: renamed from: A5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0369d {

    /* JADX INFO: renamed from: a */
    public static final C20825c f1260a;

    static {
        C3516e c3516e = AbstractC0593T.f1824a;
        C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        C21799c c21799c = InterfaceC21801e.f69163a;
        EnumC21125d enumC21125d = EnumC21125d.f67123o0;
        Bitmap.Config config = AbstractC0371f.f1262a;
        EnumC20824b enumC20824b = EnumC20824b.f66156o0;
        f1260a = new C20825c(c1451e, executorC3515d, executorC3515d, executorC3515d, c21799c, enumC21125d, config, true, false, null, null, null, enumC20824b, enumC20824b, enumC20824b);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m999a(C20831i c20831i) {
        int iOrdinal = c20831i.f66215f.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0644w();
            }
            C20826d c20826d = c20831i.f66208C;
            InterfaceC21130i interfaceC21130i = c20831i.f66233x;
            if (c20826d.f66176a != null || !(interfaceC21130i instanceof C21124c)) {
                InterfaceC21389b interfaceC21389b = c20831i.f66212c;
                if (!(interfaceC21389b instanceof C21388a) || !(interfaceC21130i instanceof C21127f)) {
                    return false;
                }
                ImageView imageView = ((C21388a) interfaceC21389b).f67898Z;
                if (!(imageView instanceof ImageView) || imageView != ((C21127f) interfaceC21130i).f67126Y) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final Drawable m1000b(C20831i c20831i, GradientDrawable gradientDrawable, Integer num, Drawable drawable) {
        if (gradientDrawable != null) {
            return gradientDrawable;
        }
        if (num == null) {
            return drawable;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = c20831i.f66210a;
        int iIntValue = num.intValue();
        Drawable drawableM9636b = AbstractC9106B3.m9636b(context, iIntValue);
        if (drawableM9636b != null) {
            return drawableM9636b;
        }
        throw new IllegalStateException(AbstractC10763a.m11048f(iIntValue, "Invalid resource ID: ").toString());
    }
}

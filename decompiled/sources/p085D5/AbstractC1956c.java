package p085D5;

import android.content.Context;
import android.os.Looper;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6035w;
import p374P5.C6351d;
import p374P5.C6354g;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: D5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1956c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0563B f5791a;

    static {
        AbstractC0563B abstractC0563B;
        try {
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
            boolean z6 = c1451e.f3818p0;
            abstractC0563B = c1451e;
            if (z6) {
                AbstractC16544l.m18089b(Looper.myLooper(), c1451e.f3816Z.getLooper());
                abstractC0563B = c1451e;
            }
        } catch (Throwable unused) {
            abstractC0563B = AbstractC0593T.f1825b;
        }
        f5791a = abstractC0563B;
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0571F m3138a(C6021p c6021p) {
        InterfaceC18776i interfaceC18776i;
        InterfaceC18776i interfaceC18776iPlus;
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (objM6514H == obj) {
            objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
        }
        C2925c c2925c = ((C6035w) objM6514H).f19668Y;
        boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
        boolean zM6542f = c6021p.m6542f(c2925c) | c6021p.m6544g(zBooleanValue);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f || objM6514H2 == obj) {
            InterfaceC18776i interfaceC18776i2 = c2925c.f8769Y;
            if (zBooleanValue) {
                interfaceC18776iPlus = interfaceC18776i2.plus(AbstractC0593T.f1825b);
            } else {
                AbstractC0563B abstractC0563B = (AbstractC0563B) interfaceC18776i2.get(AbstractC0563B.f1782Y);
                if (abstractC0563B instanceof C1451e) {
                    try {
                        interfaceC18776i = ((C1451e) abstractC0563B).f3819q0;
                    } catch (UnsupportedOperationException unused) {
                        interfaceC18776i = f5791a;
                    }
                } else {
                    interfaceC18776i = f5791a;
                }
                interfaceC18776iPlus = interfaceC18776i2.plus(interfaceC18776i);
            }
            objM6514H2 = AbstractC0575H.m1174c(interfaceC18776iPlus);
            c6021p.m6537c0(objM6514H2);
        }
        return (InterfaceC0571F) objM6514H2;
    }

    /* JADX INFO: renamed from: b */
    public static final C6354g m3139b(Object obj, C6021p c6021p) {
        c6021p.m6524S(1319639034);
        if (obj instanceof C6354g) {
            c6021p.m6524S(-72322677);
            C6354g c6354g = (C6354g) obj;
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            return c6354g;
        }
        c6021p.m6524S(-72283431);
        Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
        boolean zM6542f = c6021p.m6542f(context) | c6021p.m6542f(obj);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            C6351d c6351d = new C6351d(context);
            c6351d.f20623c = obj;
            objM6514H = c6351d.m6972a();
            c6021p.m6537c0(objM6514H);
        }
        C6354g c6354g2 = (C6354g) objM6514H;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c6354g2;
    }
}

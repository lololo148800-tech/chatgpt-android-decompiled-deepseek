package p334Na;

import android.content.Context;
import android.javax.sip.C10808o;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0345f;
import p006A4.C0347h;
import p006A4.C0355p;
import p006A4.C0358s;
import p006A4.C0359t;
import p006A4.C0360u;
import p008A6.C0384d;
import p1095x1.InterfaceC21056J;
import p1139z0.C21585H;
import p1143z4.AbstractC21769K;
import p1143z4.C21770L;
import p1143z4.C21795y;
import p349O0.C6021p;
import p451Sb.C7102a;
import p544W9.AbstractC8740x3;
import p562X0.AbstractC9020o;
import p594Y9.AbstractC9834X3;
import p636a2.C10482s;
import p716e2.C13265b;
import p760g2.C13807d;
import p972qm.C18777j;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Na.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5695b {

    /* JADX INFO: renamed from: a */
    public static C10808o f18467a;

    /* JADX INFO: renamed from: a */
    public static final C21795y m6134a(Context context) {
        AbstractC16544l.m18094g(context, "context");
        C21795y c21795y = new C21795y(context);
        C21770L c21770l = c21795y.f33551w;
        c21770l.m22261a(new C0345f(c21770l));
        c21795y.f33551w.m22261a(new C0347h());
        c21795y.f33551w.m22261a(new C0355p());
        return c21795y;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6135b(C10482s state, List measurables) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) measurables.get(i10);
            Object objM11315a = AbstractC10868a.m11315a(interfaceC21056J);
            if (objM11315a == null) {
                interfaceC21056J.mo21534t();
                objM11315a = new C7102a(21);
            }
            C13265b c13265bM10948a = state.m10948a(objM11315a);
            if (c13265bM10948a instanceof C13265b) {
                c13265bM10948a.f41893K = interfaceC21056J;
                C13807d c13807d = c13265bM10948a.f41894L;
                if (c13807d != null) {
                    c13807d.f43668g0 = interfaceC21056J;
                }
            }
            interfaceC21056J.mo21534t();
            if (i11 > size) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC18774g m6136c(InterfaceC18774g interfaceC18774g, InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        if (AbstractC16544l.m18089b(interfaceC18774g.getKey(), key)) {
            return interfaceC18774g;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC18776i m6137d(InterfaceC18774g interfaceC18774g, InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        return AbstractC16544l.m18089b(interfaceC18774g.getKey(), key) ? C18777j.f59682Y : interfaceC18774g;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC18776i m6138e(InterfaceC18774g interfaceC18774g, InterfaceC18776i context) {
        AbstractC16544l.m18094g(context, "context");
        InterfaceC18774g interfaceC18774g2 = interfaceC18774g;
        return context == C18777j.f59682Y ? interfaceC18774g2 : (InterfaceC18776i) context.fold(interfaceC18774g2, new C0384d(13));
    }

    /* JADX INFO: renamed from: f */
    public static final C21795y m6139f(AbstractC21769K[] abstractC21769KArr, C6021p c6021p) {
        int i10 = 0;
        c6021p.m6525T(-312215566);
        Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
        Object[] objArrCopyOf = Arrays.copyOf(abstractC21769KArr, abstractC21769KArr.length);
        C0358s c0358s = C0358s.f1233Y;
        C0359t c0359t = new C0359t(context, i10);
        C21585H c21585h = AbstractC9020o.f27518a;
        C21795y c21795y = (C21795y) AbstractC9834X3.m10481d(objArrCopyOf, new C21585H(c0358s, 10, c0359t), null, new C0360u(context, i10), c6021p, 72, 4);
        for (AbstractC21769K abstractC21769K : abstractC21769KArr) {
            c21795y.f33551w.m22261a(abstractC21769K);
        }
        c6021p.m6553p(false);
        AbstractC16544l.m18094g(c21795y, "<this>");
        c6021p.m6525T(-941334997);
        AbstractC8740x3.m9476b(c21795y, true, true, c6021p, 440, 0);
        c6021p.m6553p(false);
        return c21795y;
    }
}

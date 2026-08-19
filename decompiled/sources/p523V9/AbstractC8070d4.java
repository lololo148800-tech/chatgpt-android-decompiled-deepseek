package p523V9;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p042Bf.C1282x;
import p096Dg.AbstractC2045b;
import p124Ei.C2446D;
import p228J.AbstractC3794B0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p544W9.AbstractC8662k3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.AbstractC10494k;
import p637a3.C10485b;
import p637a3.InterfaceC10492i;
import p672c3.C11564B;
import p672c3.C11598c0;
import p672c3.C11633u;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: V9.d4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8070d4 {
    /* JADX INFO: renamed from: a */
    public static final void m8474a(int i10, C6021p c6021p) {
        int i11 = 1;
        c6021p.m6526U(1257244356);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = C11598c0.f35089Y;
            c6021p.m6525T(-1115894518);
            c6021p.m6525T(1886828752);
            if (!(c6021p.f19565a instanceof C10485b)) {
                C5997d.m6425L();
                throw null;
            }
            c6021p.m6522Q();
            int i13 = 0;
            if (c6021p.f19563O) {
                c6021p.m6549l(new C11633u(i13, i11));
            } else {
                c6021p.m6543f0();
            }
            AbstractC3794B0.m4471F(c6021p, true, false, false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8475b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(1103935424);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            AbstractC8662k3.m9350a(interfaceC10459q, null, 0L, null, false, AbstractC2045b.f6261c, c6021p, (i11 & 14) | 196608, 30);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8476c(int i10, int i11) {
        return AbstractC18861b.m20169g(i10, (Color.alpha(i10) * i11) / 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m8477d(Context context, int i10, int i11) {
        TypedValue typedValueM8263d = AbstractC7972Q3.m8263d(context, i10);
        if (typedValueM8263d == null) {
            return i11;
        }
        int i12 = typedValueM8263d.resourceId;
        return i12 != 0 ? context.getColor(i12) : typedValueM8263d.data;
    }

    /* JADX INFO: renamed from: e */
    public static int m8478e(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueM8265f = AbstractC7972Q3.m8265f(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueM8265f.resourceId;
        return i11 != 0 ? context.getColor(i11) : typedValueM8265f.data;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8479f(int i10) {
        return i10 != 0 && AbstractC18861b.m20166d(i10) > 0.5d;
    }

    /* JADX INFO: renamed from: g */
    public static int m8480g(float f10, int i10, int i11) {
        return AbstractC18861b.m20167e(AbstractC18861b.m20169g(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m8481h(InterfaceC10492i interfaceC10492i) {
        if (interfaceC10492i instanceof C11564B) {
            return true;
        }
        if (!(interfaceC10492i instanceof AbstractC10494k)) {
            return false;
        }
        ArrayList arrayList = ((AbstractC10494k) interfaceC10492i).f31096c;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m8481h((InterfaceC10492i) it.next())) {
                return true;
            }
        }
        return false;
    }
}

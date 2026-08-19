package p571X9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import mo.C17327D;
import mo.C17358y;
import mo.InterfaceC17351r;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2184i;
import p1113xn.AbstractC21322p;
import p349O0.C5967N0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16459g;
import p914o3.AbstractC17814e;
import p914o3.C17812c;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;
import ro.C19261e;

/* JADX INFO: renamed from: X9.C3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9112C3 {
    /* JADX INFO: renamed from: a */
    public static final C17327D m9639a(InterfaceC17351r interfaceC17351r, C19261e c19261e) {
        List list = AbstractC16435B.f50983a;
        C17358y c17358y = c19261e.f61057e;
        String strM19012f = c17358y.f55381c.m19012f(SIPHeaderNames.ACCEPT);
        return (strM19012f == null || !AbstractC21322p.m21667A(strM19012f, AbstractC16459g.f51064b.toString(), false)) ? interfaceC17351r.intercept(c19261e) : c19261e.m20335b(c17358y);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5985X m9640b(InterfaceC2184i interfaceC2184i, Serializable serializable, C6021p c6021p, int i10) {
        InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
        return m9641c(interfaceC2184i, serializable, interfaceC11112u.mo7809i(), EnumC11104m.f33477p0, C18777j.f59682Y, c6021p, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (i10 & 57344));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5985X m9641c(InterfaceC2184i interfaceC2184i, Object obj, AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC18776i interfaceC18776i, C6021p c6021p, int i10) {
        boolean z6 = true;
        Object[] objArr = {interfaceC2184i, abstractC11105n, enumC11104m, interfaceC18776i};
        boolean zM6545h = c6021p.m6545h(abstractC11105n);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c6021p.m6542f(enumC11104m)) && (i10 & 3072) != 2048) {
            z6 = false;
        }
        boolean zM6545h2 = zM6545h | z6 | c6021p.m6545h(interfaceC18776i) | c6021p.m6545h(interfaceC2184i);
        Object objM6514H = c6021p.m6514H();
        Object obj2 = C6013l.f19514a;
        if (zM6545h2 || objM6514H == obj2) {
            Object c17812c = new C17812c(abstractC11105n, enumC11104m, interfaceC18776i, interfaceC2184i, null);
            c6021p.m6537c0(c17812c);
            objM6514H = c17812c;
        }
        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H;
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == obj2) {
            objM6514H2 = C5997d.m6430Q(obj, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H2);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zM6545h3 = c6021p.m6545h(interfaceC1439n);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6545h3 || objM6514H3 == obj2) {
            objM6514H3 = new C5967N0(interfaceC1439n, interfaceC5985X, null);
            c6021p.m6537c0(objM6514H3);
        }
        C5997d.m6453i(objArrCopyOf, (InterfaceC1439n) objM6514H3, c6021p);
        return interfaceC5985X;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5985X m9642d(InterfaceC2149O0 interfaceC2149O0, C6021p c6021p) {
        InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
        return m9641c(interfaceC2149O0, interfaceC2149O0.getValue(), interfaceC11112u.mo7809i(), EnumC11104m.f33477p0, C18777j.f59682Y, c6021p, 0);
    }
}

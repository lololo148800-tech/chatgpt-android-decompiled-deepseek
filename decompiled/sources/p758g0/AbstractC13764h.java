package p758g0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1747o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p547Wc.C8816z;

/* JADX INFO: renamed from: g0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13764h {

    /* JADX INFO: renamed from: a */
    public static final C13746W f43457a = AbstractC13758e.m15254s(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: b */
    public static final C13746W f43458b;

    static {
        Object obj = AbstractC13795w0.f43580a;
        f43458b = AbstractC13758e.m15254s(0.0f, 0.0f, new C7540e(0.1f), 3);
        AbstractC8112i6.m8603a(0.5f, 0.5f);
        AbstractC8088f6.m8536b(0.5f, 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5982V0 m15260a(float f10, C13781p0 c13781p0, String str, C6021p c6021p, int i10, int i11) {
        InterfaceC13772l interfaceC13772l = c13781p0;
        if ((i11 & 2) != 0) {
            interfaceC13772l = f43458b;
        }
        InterfaceC13772l interfaceC13772l2 = interfaceC13772l;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        return m15262c(new C7540e(f10), AbstractC13785r0.f43530c, interfaceC13772l2, null, str, null, c6021p, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5982V0 m15261b(float f10, InterfaceC13726B interfaceC13726B, String str, C6021p c6021p, int i10, int i11) {
        InterfaceC13726B interfaceC13726B2;
        int i12 = i11 & 2;
        C13746W c13746w = f43457a;
        InterfaceC13726B interfaceC13726B3 = i12 != 0 ? c13746w : interfaceC13726B;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        if (interfaceC13726B3 == c13746w) {
            c6021p.m6524S(1125598679);
            boolean zM6536c = c6021p.m6536c(0.01f);
            Object objM6514H = c6021p.m6514H();
            if (zM6536c || objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC13758e.m15254s(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            interfaceC13726B2 = (C13746W) objM6514H;
        } else {
            c6021p.m6524S(1125708605);
            c6021p.m6553p(false);
            interfaceC13726B2 = interfaceC13726B3;
        }
        return m15262c(Float.valueOf(f10), AbstractC13785r0.f43528a, interfaceC13726B2, Float.valueOf(0.01f), str2, null, c6021p, (i10 << 3) & 57344, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5982V0 m15262c(Object obj, C13783q0 c13783q0, InterfaceC13772l interfaceC13772l, Float f10, String str, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10, int i11) {
        InterfaceC13772l c13746w = interfaceC13772l;
        Object obj2 = C6013l.f19514a;
        Float f11 = (i11 & 8) != 0 ? null : f10;
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == obj2) {
            objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == obj2) {
            objM6514H2 = new C13756d(obj, c13783q0, f11);
            c6021p.m6537c0(objM6514H2);
        }
        C13756d c13756d = (C13756d) objM6514H2;
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
        if (f11 != null && (c13746w instanceof C13746W)) {
            C13746W c13746w2 = (C13746W) c13746w;
            if (!AbstractC16544l.m18089b(c13746w2.f43354c, f11)) {
                c13746w = new C13746W(c13746w2.f43352a, c13746w2.f43353b, f11);
            }
        }
        InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(c13746w, c6021p);
        Object objM6514H3 = c6021p.m6514H();
        if (objM6514H3 == obj2) {
            objM6514H3 = AbstractC8017W3.m8337a(-1, 6, null);
            c6021p.m6537c0(objM6514H3);
        }
        InterfaceC1747o interfaceC1747o = (InterfaceC1747o) objM6514H3;
        boolean zM6545h = c6021p.m6545h(interfaceC1747o) | ((((i10 & 14) ^ 6) > 4 && c6021p.m6545h(obj)) || (i10 & 6) == 4);
        Object objM6514H4 = c6021p.m6514H();
        if (zM6545h || objM6514H4 == obj2) {
            objM6514H4 = new C8816z(interfaceC1747o, 23, obj);
            c6021p.m6537c0(objM6514H4);
        }
        C5997d.m6454j((InterfaceC1426a) objM6514H4, c6021p);
        boolean zM6545h2 = c6021p.m6545h(interfaceC1747o) | c6021p.m6545h(c13756d) | c6021p.m6542f(interfaceC5985XM6435V2) | c6021p.m6542f(interfaceC5985XM6435V);
        Object objM6514H5 = c6021p.m6514H();
        if (zM6545h2 || objM6514H5 == obj2) {
            objM6514H5 = new C13762g(interfaceC1747o, c13756d, interfaceC5985XM6435V2, interfaceC5985XM6435V, null);
            c6021p.m6537c0(objM6514H5);
        }
        C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p, interfaceC1747o);
        InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) interfaceC5985X.getValue();
        return interfaceC5982V0 == null ? c13756d.f43411c : interfaceC5982V0;
    }
}

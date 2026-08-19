package p229J0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1139z0.C21585H;
import p349O0.C6013l;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p562X0.AbstractC9020o;
import p594Y9.AbstractC9834X3;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13781p0;

/* JADX INFO: renamed from: J0.x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4159x3 {

    /* JADX INFO: renamed from: a */
    public static final float f13483a = 22;

    /* JADX INFO: renamed from: b */
    public static final C13781p0 f13484b = AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, AbstractC13725A.f43288a, 2);

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX INFO: renamed from: a */
    public static final C3880A3 m4787a(boolean z6, InterfaceC1436k interfaceC1436k, EnumC3886B3 enumC3886B3, boolean z10, C6021p c6021p, int i10, int i11) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = (i11 & 1) != 0 ? false : z6;
        boolean z14 = (i11 & 8) != 0 ? false : z10;
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        Object[] objArr = {Boolean.valueOf(z13), interfaceC1436k, Boolean.valueOf(z14)};
        C3969Q0 c3969q0 = C3969Q0.f12386M0;
        C4165y3 c4165y3 = new C4165y3(z13, interfaceC7537b, interfaceC1436k, z14);
        C21585H c21585h = AbstractC9020o.f27518a;
        C21585H c21585h2 = new C21585H(c3969q0, 10, c4165y3);
        boolean zM6542f = ((((i10 & 14) ^ 6) > 4 && c6021p.m6544g(z13)) || (i10 & 6) == 4) | c6021p.m6542f(interfaceC7537b);
        if (((i10 & 896) ^ 384) > 256 && c6021p.m6542f(enumC3886B3)) {
            z11 = true;
        } else if ((i10 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = zM6542f | z11 | ((((i10 & 112) ^ 48) > 32 && c6021p.m6542f(interfaceC1436k)) || (i10 & 48) == 32);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c6021p.m6544g(z14)) && (i10 & 3072) != 2048) {
            z12 = false;
        }
        boolean z16 = z15 | z12;
        Object objM6514H = c6021p.m6514H();
        if (z16 || objM6514H == C6013l.f19514a) {
            Object c4153w3 = new C4153w3(z13, interfaceC7537b, enumC3886B3, interfaceC1436k, z14);
            c6021p.m6537c0(c4153w3);
            objM6514H = c4153w3;
        }
        return (C3880A3) AbstractC9834X3.m10481d(objArr, c21585h2, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
    }
}

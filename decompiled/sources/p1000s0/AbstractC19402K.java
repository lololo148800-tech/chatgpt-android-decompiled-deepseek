package p1000s0;

import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p1139z0.C21585H;
import p349O0.C6013l;
import p349O0.C6021p;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9834X3;
import p860l0.EnumC16673F0;
import p881m0.C17138o;
import p972qm.C18777j;

/* JADX INFO: renamed from: s0.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19402K {

    /* JADX INFO: renamed from: a */
    public static final float f61474a = 56;

    /* JADX INFO: renamed from: b */
    public static final C19429y f61475b;

    /* JADX INFO: renamed from: c */
    public static final C19399H f61476c;

    static {
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
        C17138o c17138o = C17138o.f54801o0;
        C19398G c19398g = new C19398G();
        AbstractC0575H.m1174c(C18777j.f59682Y);
        f61475b = new C19429y(0, 0, 0, enumC16673F0, 0, 0, 0, c17138o, c19398g);
        f61476c = new C19399H();
    }

    /* JADX INFO: renamed from: a */
    public static final long m20507a(C19429y c19429y, int i10) {
        long j10 = ((long) i10) * ((long) (c19429y.f61599c + c19429y.f61598b));
        int i11 = c19429y.f61602f;
        long j11 = j10 + ((long) (-i11)) + ((long) c19429y.f61600d);
        int iM20511d = (int) (c19429y.f61601e == EnumC16673F0.f53402Z ? c19429y.m20511d() >> 32 : c19429y.m20511d() & 4294967295L);
        return AbstractC8301I.m8916g(j11 - ((long) (iM20511d - AbstractC8301I.m8921l(c19429y.f61611o.mo18903a(iM20511d, c19429y.f61598b, -i11, c19429y.f61600d, i10 - 1, i10), 0, iM20511d))), 0L);
    }

    /* JADX INFO: renamed from: b */
    public static final C19408d m20508b(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        C21585H c21585h = C19408d.f61488H;
        boolean zM6538d = c6021p.m6538d(i10) | c6021p.m6536c(0.0f) | c6021p.m6542f(interfaceC1426a);
        Object objM6514H = c6021p.m6514H();
        if (zM6538d || objM6514H == C6013l.f19514a) {
            objM6514H = new C19401J(i10, 0.0f, interfaceC1426a);
            c6021p.m6537c0(objM6514H);
        }
        C19408d c19408d = (C19408d) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
        c19408d.f61489G.setValue(interfaceC1426a);
        return c19408d;
    }
}

package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;
import p232J3.C4206F;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12021w1 implements InterfaceC12033z1 {

    /* JADX INFO: renamed from: b */
    public static final C11961h1 f36343b = new C11961h1(4);

    /* JADX INFO: renamed from: a */
    public final Object f36344a;

    public C12021w1(InterfaceC12033z1... interfaceC12033z1Arr) {
        this.f36344a = interfaceC12033z1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC12033z1
    /* JADX INFO: renamed from: a */
    public C11877H1 mo13468a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC12033z1 interfaceC12033z1 = ((InterfaceC12033z1[]) this.f36344a)[i10];
            if (interfaceC12033z1.mo13469b(cls)) {
                return interfaceC12033z1.mo13468a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC12033z1
    /* JADX INFO: renamed from: b */
    public boolean mo13469b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((InterfaceC12033z1[]) this.f36344a)[i10].mo13469b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m13531c(int i10, int i11) {
        ((C11933a1) this.f36344a).m13397g0(i10, (i11 >> 31) ^ (i11 + i11));
    }

    /* JADX INFO: renamed from: d */
    public void m13532d(int i10, long j10) {
        ((C11933a1) this.f36344a).m13399i0(i10, (j10 >> 63) ^ (j10 + j10));
    }

    /* JADX INFO: renamed from: e */
    public void m13533e(int i10, List list) {
        boolean z6 = list instanceof InterfaceC12005s1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) this.f36344a;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13395e0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC12005s1 interfaceC12005s1 = (InterfaceC12005s1) list;
        while (i11 < list.size()) {
            Object objM13524c = interfaceC12005s1.m13524c();
            if (objM13524c instanceof String) {
                c11933a1.m13395e0(i10, (String) objM13524c);
            } else {
                c11933a1.m13388X(i10, (C11929Z0) objM13524c);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13534f(int i10, int i11) {
        ((C11933a1) this.f36344a).m13397g0(i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public void m13535g(int i10, long j10) {
        ((C11933a1) this.f36344a).m13399i0(i10, j10);
    }

    /* JADX INFO: renamed from: h */
    public void m13536h(int i10, boolean z6) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        C11933a1 c11933a1 = (C11933a1) this.f36344a;
        c11933a1.m13398h0(i10 << 3);
        int i11 = c11933a1.f36237q0;
        try {
            int i12 = i11 + 1;
            try {
                c11933a1.f36235o0[i11] = z6 ? (byte) 1 : (byte) 0;
                c11933a1.f36237q0 = i12;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i11 = i12;
                throw new C4206F(i11, c11933a1.f36236p0, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13537i(int i10, C11929Z0 c11929z0) {
        ((C11933a1) this.f36344a).m13388X(i10, c11929z0);
    }

    /* JADX INFO: renamed from: j */
    public void m13538j(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C11933a1) this.f36344a).m13388X(i10, (C11929Z0) list.get(i11));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13539k(int i10, double d10) {
        ((C11933a1) this.f36344a).m13391a0(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: l */
    public void m13540l(int i10, int i11) {
        ((C11933a1) this.f36344a).m13393c0(i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m13541m(int i10, int i11) {
        ((C11933a1) this.f36344a).m13389Y(i10, i11);
    }

    /* JADX INFO: renamed from: n */
    public void m13542n(int i10, long j10) {
        ((C11933a1) this.f36344a).m13391a0(i10, j10);
    }

    /* JADX INFO: renamed from: o */
    public void m13543o(int i10, float f10) {
        ((C11933a1) this.f36344a).m13389Y(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: p */
    public void m13544p(int i10, Object obj, InterfaceC11880I1 interfaceC11880I1) {
        C11933a1 c11933a1 = (C11933a1) this.f36344a;
        c11933a1.m13396f0(i10, 3);
        interfaceC11880I1.mo13245i((AbstractC11908S0) obj, c11933a1.f36234Z);
        c11933a1.m13396f0(i10, 4);
    }

    /* JADX INFO: renamed from: q */
    public void m13545q(int i10, int i11) {
        ((C11933a1) this.f36344a).m13393c0(i10, i11);
    }

    /* JADX INFO: renamed from: r */
    public void m13546r(int i10, long j10) {
        ((C11933a1) this.f36344a).m13399i0(i10, j10);
    }

    /* JADX INFO: renamed from: s */
    public void m13547s(int i10, Object obj, InterfaceC11880I1 interfaceC11880I1) {
        AbstractC11908S0 abstractC11908S0 = (AbstractC11908S0) obj;
        C11933a1 c11933a1 = (C11933a1) this.f36344a;
        c11933a1.m13398h0((i10 << 3) | 2);
        c11933a1.m13398h0(abstractC11908S0.mo13345a(interfaceC11880I1));
        interfaceC11880I1.mo13245i(abstractC11908S0, c11933a1.f36234Z);
    }

    /* JADX INFO: renamed from: t */
    public void m13548t(int i10, int i11) {
        ((C11933a1) this.f36344a).m13389Y(i10, i11);
    }

    /* JADX INFO: renamed from: u */
    public void m13549u(int i10, long j10) {
        ((C11933a1) this.f36344a).m13391a0(i10, j10);
    }

    public C12021w1() {
        C11871F1 c11871f1 = C11871F1.f36125c;
        C12021w1 c12021w1 = new C12021w1(C11961h1.f36273b, f36343b);
        Charset charset = AbstractC11989o1.f36309a;
        this.f36344a = c12021w1;
    }

    public C12021w1(C11933a1 c11933a1) {
        Charset charset = AbstractC11989o1.f36309a;
        this.f36344a = c11933a1;
        c11933a1.f36234Z = this;
    }
}

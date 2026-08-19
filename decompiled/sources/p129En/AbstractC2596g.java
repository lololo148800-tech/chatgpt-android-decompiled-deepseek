package p129En;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1730B;
import p077Cn.InterfaceC1758z;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p523V9.AbstractC8017W3;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: En.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2596g implements InterfaceC2614y {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f8047Y;

    /* JADX INFO: renamed from: Z */
    public final int f8048Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC1733a f8049o0;

    public AbstractC2596g(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        this.f8047Y = interfaceC18776i;
        this.f8048Z = i10;
        this.f8049o0 = enumC1733a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // p129En.InterfaceC2614y
    /* JADX INFO: renamed from: b */
    public final InterfaceC2184i mo3229b(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        InterfaceC18776i interfaceC18776i2 = this.f8047Y;
        InterfaceC18776i interfaceC18776iPlus = interfaceC18776i.plus(interfaceC18776i2);
        EnumC1733a enumC1733a2 = EnumC1733a.f4961Y;
        EnumC1733a enumC1733a3 = this.f8049o0;
        int i11 = this.f8048Z;
        if (enumC1733a == enumC1733a2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC1733a = enumC1733a3;
        }
        return (AbstractC16544l.m18089b(interfaceC18776iPlus, interfaceC18776i2) && i10 == i11 && enumC1733a == enumC1733a3) ? this : mo3254h(interfaceC18776iPlus, i10, enumC1733a);
    }

    /* JADX INFO: renamed from: c */
    public String mo3255c() {
        return null;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objM1183l = AbstractC0575H.m1183l(new C2594e(interfaceC2186j, this, null), interfaceC18770c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo3253g(InterfaceC1758z interfaceC1758z, InterfaceC18770c interfaceC18770c);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC2596g mo3254h(InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a);

    /* JADX INFO: renamed from: j */
    public InterfaceC2184i mo3256j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC1730B mo3257k(InterfaceC0571F interfaceC0571F) {
        int i10 = this.f8048Z;
        if (i10 == -3) {
            i10 = -2;
        }
        EnumC0573G enumC0573G = EnumC0573G.f1792o0;
        InterfaceC1439n c2595f = new C2595f(this, null);
        C1757y c1757y = new C1757y(AbstractC0575H.m1157E(interfaceC0571F, this.f8047Y), AbstractC8017W3.m8337a(i10, 4, this.f8049o0), true, true);
        c1757y.m1226i0(enumC0573G, c1757y, c2595f);
        return c1757y;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo3255c = mo3255c();
        if (strMo3255c != null) {
            arrayList.add(strMo3255c);
        }
        C18777j c18777j = C18777j.f59682Y;
        InterfaceC18776i interfaceC18776i = this.f8047Y;
        if (interfaceC18776i != c18777j) {
            arrayList.add("context=" + interfaceC18776i);
        }
        int i10 = this.f8048Z;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        EnumC1733a enumC1733a = EnumC1733a.f4961Y;
        EnumC1733a enumC1733a2 = this.f8049o0;
        if (enumC1733a2 != enumC1733a) {
            arrayList.add("onBufferOverflow=" + enumC1733a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return AbstractC9306j0.m9892k(sb2, AbstractC17680n.m19349Y(arrayList, ", ", null, null, 0, null, null, 62), ']');
    }
}

package p080D0;

import p492U1.C7543h;
import p492U1.C7544i;
import p492U1.EnumC7546k;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9101A4;
import p587Y1.InterfaceC9595u;
import p635a1.InterfaceC10446d;

/* JADX INFO: renamed from: D0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1810j implements InterfaceC9595u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10446d f5213a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1818n f5214b;

    /* JADX INFO: renamed from: c */
    public long f5215c = 0;

    public C1810j(InterfaceC10446d interfaceC10446d, InterfaceC1818n interfaceC1818n) {
        this.f5213a = interfaceC10446d;
        this.f5214b = interfaceC1818n;
    }

    @Override // p587Y1.InterfaceC9595u
    /* JADX INFO: renamed from: a */
    public final long mo2638a(C7544i c7544i, long j10, EnumC7546k enumC7546k, long j11) {
        long jMo2571a = this.f5214b.mo2571a();
        if (!AbstractC8088f6.m8538d(jMo2571a)) {
            jMo2571a = this.f5215c;
        }
        this.f5215c = jMo2571a;
        return C7543h.m7882d(C7543h.m7882d(AbstractC9101A4.m9631a(c7544i.f23899a, c7544i.f23900b), AbstractC9101A4.m9633c(jMo2571a)), this.f5213a.mo10925a(j11, 0L, enumC7546k));
    }
}

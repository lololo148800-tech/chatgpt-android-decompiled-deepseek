package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p635a1.InterfaceC10446d;

/* JADX INFO: renamed from: f0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C13464B extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42604Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13466D f42605Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f42606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13464B(C13466D c13466d, long j10, int i10) {
        super(1);
        this.f42604Y = i10;
        this.f42605Z = c13466d;
        this.f42606o0 = j10;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v15, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC1436k interfaceC1436k;
        InterfaceC1436k interfaceC1436k2;
        int iOrdinal;
        switch (this.f42604Y) {
            case 0:
                C13466D c13466d = this.f42605Z;
                c13466d.getClass();
                int iOrdinal2 = ((EnumC13504v) obj).ordinal();
                long j10 = this.f42606o0;
                if (iOrdinal2 == 0) {
                    C13501s c13501s = c13466d.f42613E0.f42622a.f42662c;
                    if (c13501s != null && (interfaceC1436k = c13501s.f42745b) != null) {
                        j10 = ((C7545j) interfaceC1436k.invoke(new C7545j(j10))).f23903a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new C0644w();
                    }
                    C13501s c13501s2 = c13466d.f42614F0.f42625a.f42662c;
                    if (c13501s2 != null && (interfaceC1436k2 = c13501s2.f42745b) != null) {
                        j10 = ((C7545j) interfaceC1436k2.invoke(new C7545j(j10))).f23903a;
                    }
                }
                return new C7545j(j10);
            case 1:
                EnumC13504v enumC13504v = (EnumC13504v) obj;
                C13466D c13466d2 = this.f42605Z;
                long jM7881c = 0;
                if (c13466d2.f42618J0 != null && c13466d2.m14994M0() != null && !AbstractC16544l.m18089b(c13466d2.f42618J0, c13466d2.m14994M0()) && (iOrdinal = enumC13504v.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    C13501s c13501s3 = c13466d2.f42614F0.f42625a.f42662c;
                    if (c13501s3 != null) {
                        long j11 = this.f42606o0;
                        long j12 = ((C7545j) c13501s3.f42745b.invoke(new C7545j(j11))).f23903a;
                        InterfaceC10446d interfaceC10446dM14994M0 = c13466d2.m14994M0();
                        AbstractC16544l.m18091d(interfaceC10446dM14994M0);
                        EnumC7546k enumC7546k = EnumC7546k.f23904Y;
                        long jMo10925a = interfaceC10446dM14994M0.mo10925a(j11, j12, enumC7546k);
                        InterfaceC10446d interfaceC10446d = c13466d2.f42618J0;
                        AbstractC16544l.m18091d(interfaceC10446d);
                        jM7881c = C7543h.m7881c(jMo10925a, interfaceC10446d.mo10925a(j11, j12, enumC7546k));
                    }
                }
                return new C7543h(jM7881c);
            default:
                EnumC13504v enumC13504v2 = (EnumC13504v) obj;
                C13466D c13466d3 = this.f42605Z;
                C13480S c13480s = c13466d3.f42613E0.f42622a.f42661b;
                long j13 = this.f42606o0;
                long j14 = 0;
                long j15 = c13480s != null ? ((C7543h) c13480s.f42657a.invoke(new C7545j(j13))).f23897a : 0L;
                C13480S c13480s2 = c13466d3.f42614F0.f42625a.f42661b;
                long j16 = c13480s2 != null ? ((C7543h) c13480s2.f42657a.invoke(new C7545j(j13))).f23897a : 0L;
                int iOrdinal3 = enumC13504v2.ordinal();
                if (iOrdinal3 == 0) {
                    j14 = j15;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new C0644w();
                    }
                    j14 = j16;
                }
                return new C7543h(j14);
        }
    }
}

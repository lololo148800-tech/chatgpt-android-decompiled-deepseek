package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p758g0.InterfaceC13726B;
import p758g0.InterfaceC13763g0;

/* JADX INFO: renamed from: f0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C13506x extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42764Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13467E f42765Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13468F f42766o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13506x(C13467E c13467e, C13468F c13468f, int i10) {
        super(1);
        this.f42764Y = i10;
        this.f42765Z = c13467e;
        this.f42766o0 = c13468f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC13726B interfaceC13726B;
        InterfaceC13726B interfaceC13726B2;
        InterfaceC13726B interfaceC13726B3;
        InterfaceC13726B interfaceC13726B4;
        switch (this.f42764Y) {
            case 0:
                InterfaceC13763g0 interfaceC13763g0 = (InterfaceC13763g0) obj;
                EnumC13504v enumC13504v = EnumC13504v.f42754Y;
                EnumC13504v enumC13504v2 = EnumC13504v.f42755Z;
                if (interfaceC13763g0.mo15005b(enumC13504v, enumC13504v2)) {
                    C13469G c13469g = this.f42765Z.f42622a.f42660a;
                    return (c13469g == null || (interfaceC13726B2 = c13469g.f42627b) == null) ? AbstractC13508z.f42769b : interfaceC13726B2;
                }
                if (!interfaceC13763g0.mo15005b(enumC13504v2, EnumC13504v.f42756o0)) {
                    return AbstractC13508z.f42769b;
                }
                C13469G c13469g2 = this.f42766o0.f42625a.f42660a;
                return (c13469g2 == null || (interfaceC13726B = c13469g2.f42627b) == null) ? AbstractC13508z.f42769b : interfaceC13726B;
            case 1:
                int iOrdinal = ((EnumC13504v) obj).ordinal();
                float f10 = 1.0f;
                if (iOrdinal == 0) {
                    C13469G c13469g3 = this.f42765Z.f42622a.f42660a;
                    if (c13469g3 != null) {
                        f10 = c13469g3.f42626a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    C13469G c13469g4 = this.f42766o0.f42625a.f42660a;
                    if (c13469g4 != null) {
                        f10 = c13469g4.f42626a;
                    }
                }
                return Float.valueOf(f10);
            case 2:
                InterfaceC13763g0 interfaceC13763g1 = (InterfaceC13763g0) obj;
                EnumC13504v enumC13504v3 = EnumC13504v.f42754Y;
                EnumC13504v enumC13504v4 = EnumC13504v.f42755Z;
                if (interfaceC13763g1.mo15005b(enumC13504v3, enumC13504v4)) {
                    C13473K c13473k = this.f42765Z.f42622a.f42663d;
                    return (c13473k == null || (interfaceC13726B4 = c13473k.f42635c) == null) ? AbstractC13508z.f42769b : interfaceC13726B4;
                }
                if (!interfaceC13763g1.mo15005b(enumC13504v4, EnumC13504v.f42756o0)) {
                    return AbstractC13508z.f42769b;
                }
                C13473K c13473k2 = this.f42766o0.f42625a.f42663d;
                return (c13473k2 == null || (interfaceC13726B3 = c13473k2.f42635c) == null) ? AbstractC13508z.f42769b : interfaceC13726B3;
            default:
                int iOrdinal2 = ((EnumC13504v) obj).ordinal();
                float f11 = 1.0f;
                if (iOrdinal2 == 0) {
                    C13473K c13473k3 = this.f42765Z.f42622a.f42663d;
                    if (c13473k3 != null) {
                        f11 = c13473k3.f42633a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new C0644w();
                    }
                    C13473K c13473k4 = this.f42766o0.f42625a.f42663d;
                    if (c13473k4 != null) {
                        f11 = c13473k4.f42633a;
                    }
                }
                return Float.valueOf(f11);
        }
    }
}

package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p758g0.InterfaceC13726B;
import p758g0.InterfaceC13763g0;

/* JADX INFO: renamed from: f0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C13465C extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42607Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13466D f42608Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13465C(C13466D c13466d, int i10) {
        super(1);
        this.f42607Y = i10;
        this.f42608Z = c13466d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC13726B interfaceC13726B;
        InterfaceC13726B interfaceC13726B2;
        switch (this.f42607Y) {
            case 0:
                InterfaceC13763g0 interfaceC13763g0 = (InterfaceC13763g0) obj;
                EnumC13504v enumC13504v = EnumC13504v.f42754Y;
                EnumC13504v enumC13504v2 = EnumC13504v.f42755Z;
                boolean zMo15005b = interfaceC13763g0.mo15005b(enumC13504v, enumC13504v2);
                Object obj2 = null;
                C13466D c13466d = this.f42608Z;
                if (zMo15005b) {
                    C13501s c13501s = c13466d.f42613E0.f42622a.f42662c;
                    if (c13501s != null) {
                        obj2 = c13501s.f42746c;
                    }
                } else if (interfaceC13763g0.mo15005b(enumC13504v2, EnumC13504v.f42756o0)) {
                    C13501s c13501s2 = c13466d.f42614F0.f42625a.f42662c;
                    if (c13501s2 != null) {
                        obj2 = c13501s2.f42746c;
                    }
                } else {
                    obj2 = AbstractC13508z.f42771d;
                }
                return obj2 == null ? AbstractC13508z.f42771d : obj2;
            default:
                InterfaceC13763g0 interfaceC13763g1 = (InterfaceC13763g0) obj;
                EnumC13504v enumC13504v3 = EnumC13504v.f42754Y;
                EnumC13504v enumC13504v4 = EnumC13504v.f42755Z;
                boolean zMo15005b2 = interfaceC13763g1.mo15005b(enumC13504v3, enumC13504v4);
                C13466D c13466d2 = this.f42608Z;
                if (zMo15005b2) {
                    C13480S c13480s = c13466d2.f42613E0.f42622a.f42661b;
                    return (c13480s == null || (interfaceC13726B2 = c13480s.f42658b) == null) ? AbstractC13508z.f42770c : interfaceC13726B2;
                }
                if (!interfaceC13763g1.mo15005b(enumC13504v4, EnumC13504v.f42756o0)) {
                    return AbstractC13508z.f42770c;
                }
                C13480S c13480s2 = c13466d2.f42614F0.f42625a.f42661b;
                return (c13480s2 == null || (interfaceC13726B = c13480s2.f42658b) == null) ? AbstractC13508z.f42770c : interfaceC13726B;
        }
    }
}

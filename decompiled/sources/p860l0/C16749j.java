package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p759g1.C13800b;
import p773h0.InterfaceC14300o0;

/* JADX INFO: renamed from: l0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16749j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53726Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16758m f53727Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16779t f53728o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16749j(C16758m c16758m, C16779t c16779t, int i10) {
        super(1);
        this.f53726Y = i10;
        this.f53727Z = c16758m;
        this.f53728o0 = c16779t;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f53726Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C16758m c16758m = this.f53727Z;
                C16782u c16782u = c16758m.f53767J0;
                EnumC16673F0 enumC16673F0 = c16758m.f53768K0;
                EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
                float fM18549c = c16782u.m18549c(enumC16673F0 == enumC16673F1 ? C13800b.m15307h(j10) : C13800b.m15306g(j10));
                float fM18550d = fM18549c - c16758m.f53767J0.m18550d();
                EnumC16673F0 enumC16673F2 = c16758m.f53768K0;
                float f10 = enumC16673F2 == EnumC16673F0.f53402Z ? fM18550d : 0.0f;
                if (enumC16673F2 != enumC16673F1) {
                    fM18550d = 0.0f;
                }
                long jM8536b = AbstractC8088f6.m8536b(f10, fM18550d);
                this.f53728o0.m18544a(fM18549c, 0.0f);
                return new C13800b(jM8536b);
            default:
                C16701P c16701p = (C16701P) obj;
                C16758m c16758m2 = this.f53727Z;
                InterfaceC14300o0 interfaceC14300o0 = c16758m2.f53769L0;
                C16779t c16779t = this.f53728o0;
                if (interfaceC14300o0 == null) {
                    C16782u c16782u2 = c16758m2.f53767J0;
                    long j11 = c16701p.f53514a;
                    long jM15312m = c16758m2.m18538W0() ? C13800b.m15312m(-1.0f, j11) : C13800b.m15312m(1.0f, j11);
                    c16779t.m18544a(c16782u2.m18549c(c16758m2.f53768K0 == EnumC16673F0.f53401Y ? C13800b.m15307h(jM15312m) : C13800b.m15306g(jM15312m)), 0.0f);
                } else {
                    long j12 = c16701p.f53514a;
                    interfaceC14300o0.mo15581d(c16758m2.m18538W0() ? C13800b.m15312m(-1.0f, j12) : C13800b.m15312m(1.0f, j12), 1, new C16749j(c16758m2, c16779t, 0));
                }
                return C17296C.f55119a;
        }
    }
}

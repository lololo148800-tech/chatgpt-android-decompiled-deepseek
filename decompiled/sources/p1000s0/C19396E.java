package p1000s0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5994b0;
import p349O0.C5996c0;

/* JADX INFO: renamed from: s0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C19396E extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61430Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19397F f61431Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19396E(AbstractC19397F abstractC19397F, int i10) {
        super(0);
        this.f61430Y = i10;
        this.f61431Z = abstractC19397F;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int iM20498j;
        switch (this.f61430Y) {
            case 0:
                AbstractC19397F abstractC19397F = this.f61431Z;
                return Integer.valueOf(abstractC19397F.f61447j.mo5255a() ? abstractC19397F.f61456s.m6412g() : abstractC19397F.m20498j());
            default:
                AbstractC19397F abstractC19397F2 = this.f61431Z;
                if (abstractC19397F2.f61447j.mo5255a()) {
                    C5996c0 c5996c0 = abstractC19397F2.f61455r;
                    if (c5996c0.m6412g() != -1) {
                        iM20498j = c5996c0.m6412g();
                    } else if (Math.abs(((C5994b0) abstractC19397F2.f61440c.f207p0).m6409g()) >= Math.abs(Math.min(abstractC19397F2.f61453p.mo7864b0(AbstractC19402K.f61474a), abstractC19397F2.m20501m() / 2.0f) / abstractC19397F2.m20501m())) {
                        iM20498j = ((Boolean) abstractC19397F2.f61436E.getValue()).booleanValue() ? abstractC19397F2.f61441d + 1 : abstractC19397F2.f61441d;
                    } else {
                        iM20498j = abstractC19397F2.m20498j();
                    }
                } else {
                    iM20498j = abstractC19397F2.m20498j();
                }
                return Integer.valueOf(abstractC19397F2.m20497i(iM20498j));
        }
    }
}

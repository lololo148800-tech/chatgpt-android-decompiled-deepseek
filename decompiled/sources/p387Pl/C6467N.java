package p387Pl;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Pl.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C6467N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20978Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC6468O f20979Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC6468O f20980o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6467N(AbstractC6468O abstractC6468O, AbstractC6468O abstractC6468O2, int i10) {
        super(0);
        this.f20978Y = i10;
        this.f20979Z = abstractC6468O;
        this.f20980o0 = abstractC6468O2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f20978Y) {
            case 0:
                C17296C c17296c = C17296C.f55119a;
                AbstractC6468O abstractC6468O = this.f20979Z;
                if (!abstractC6468O.m7052d()) {
                    abstractC6468O.mo7051c();
                    this.f20980o0.mo7051c().dispose();
                }
                return c17296c;
            default:
                AbstractC6468O abstractC6468O2 = this.f20979Z;
                if (abstractC6468O2.m7052d()) {
                    return Boolean.FALSE;
                }
                abstractC6468O2.mo7051c();
                return Boolean.valueOf(this.f20980o0.mo7051c().enabled());
        }
    }
}

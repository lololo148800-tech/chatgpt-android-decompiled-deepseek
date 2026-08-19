package p385Pj;

import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p544W9.AbstractC8566U3;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Pj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6438m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20901Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13711h f20902Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6438m(C13711h c13711h, int i10) {
        super(0);
        this.f20901Y = i10;
        this.f20902Z = c13711h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f20901Y) {
            case 0:
                ((AbstractC16283c) this.f20902Z.f43259Z).mo10188b(new String[]{"image/*", "application/pdf"});
                break;
            default:
                C13711h c13711h = this.f20902Z;
                ((AbstractC16283c) c13711h.f43260o0).mo10188b(AbstractC8566U3.m9231a());
                break;
        }
        return C17296C.f55119a;
    }
}

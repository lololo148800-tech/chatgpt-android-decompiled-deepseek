package p185H6;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p974qo.C18792h;

/* JADX INFO: renamed from: H6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3255k implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9911Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18792h f9912Z;

    public /* synthetic */ C3255k(C18792h c18792h, int i10) {
        this.f9911Y = i10;
        this.f9912Z = c18792h;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9911Y) {
            case 0:
                this.f9912Z.cancel();
                break;
            default:
                this.f9912Z.cancel();
                break;
        }
        return C17296C.f55119a;
    }
}

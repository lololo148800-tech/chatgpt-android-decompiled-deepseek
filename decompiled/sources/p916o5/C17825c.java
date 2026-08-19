package p916o5;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p466T0.C7186m;

/* JADX INFO: renamed from: o5.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17825c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56862Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f56863Z;

    public /* synthetic */ C17825c(Object obj, int i10) {
        this.f56862Y = i10;
        this.f56863Z = obj;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f56862Y) {
            case 0:
                ((C17830h) this.f56863Z).f56890w0 = true;
                return C17296C.f55119a;
            default:
                return ((C7186m) this.f56863Z).m7561j(((Integer) obj).intValue());
        }
    }
}

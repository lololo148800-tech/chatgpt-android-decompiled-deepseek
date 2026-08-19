package p619Zb;

import p501Ub.C7602d;
import p501Ub.C7604f;
import p658b5.C11238i;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Zb.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10270c implements InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C10270c f30504Z = new C10270c(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C10270c f30505o0 = new C10270c(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30506Y;

    public /* synthetic */ C10270c(int i10) {
        this.f30506Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public final Object mo391g(C11238i c11238i) {
        switch (this.f30506Y) {
            case 0:
                return new C10272e((C7604f) c11238i.mo12555a(C7604f.class));
            default:
                return new C10271d((C10272e) c11238i.mo12555a(C10272e.class), (C7602d) c11238i.mo12555a(C7602d.class));
        }
    }
}

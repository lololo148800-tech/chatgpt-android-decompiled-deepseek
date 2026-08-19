package p704dc;

import p501Ub.C7602d;
import p501Ub.C7604f;
import p658b5.C11238i;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: dc.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13067h implements InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C13067h f41508Z = new C13067h(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C13067h f41509o0 = new C13067h(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41510Y;

    public /* synthetic */ C13067h(int i10) {
        this.f41510Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public final Object mo391g(C11238i c11238i) {
        switch (this.f41510Y) {
            case 0:
                return new C13063d((C7604f) c11238i.mo12555a(C7604f.class));
            default:
                return new C13062c((C13063d) c11238i.mo12555a(C13063d.class), (C7602d) c11238i.mo12555a(C7602d.class));
        }
    }
}

package p1081wc;

import p248Jk.InterfaceC4473d;
import p484Ti.C7476e;
import p484Ti.C7491t;
import p580Xi.C9522h;

/* JADX INFO: renamed from: wc.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C20867M implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final C20867M f66429b = new C20867M();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66430a;

    public /* synthetic */ C20867M() {
        this.f66430a = 0;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f66430a) {
            case 0:
                return new C9522h(1);
            case 1:
                return new C7476e();
            default:
                return new C7491t();
        }
    }

    public /* synthetic */ C20867M(C20884c c20884c, int i10) {
        this.f66430a = i10;
    }
}

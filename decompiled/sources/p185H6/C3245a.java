package p185H6;

import java.util.ArrayList;
import java.util.List;
import p005A3.C0326m;
import p658b5.C11238i;
import p791hj.C14522e;
import p909nm.AbstractC17681o;
import p942p6.C18299c;

/* JADX INFO: renamed from: H6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3245a implements InterfaceC3250f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9887a;

    /* JADX INFO: renamed from: b */
    public final Object f9888b;

    public /* synthetic */ C3245a(Object obj, int i10) {
        this.f9887a = i10;
        this.f9888b = obj;
    }

    @Override // p185H6.InterfaceC3250f
    /* JADX INFO: renamed from: a */
    public final Object mo4133a(C11238i c11238i, C3246b c3246b, C3252h c3252h) {
        switch (this.f9887a) {
            case 0:
                C14522e c14522eM12531t0 = C11238i.m12531t0(c11238i, null, 3);
                c14522eM12531t0.m16013c((List) this.f9888b);
                return c3246b.m4136c(c14522eM12531t0.m16015f(), c3252h);
            case 1:
                return ((InterfaceC3247c) ((C0326m) this.f9888b).f1141c).mo4137w(c11238i, c3252h);
            default:
                C14522e c14522eM12531t1 = C11238i.m12531t0(c11238i, null, 3);
                c14522eM12531t1.m16013c((ArrayList) this.f9888b);
                return c3246b.m4136c(c14522eM12531t1.m16015f(), c3252h);
        }
    }

    public C3245a() {
        this.f9887a = 0;
        this.f9888b = AbstractC17681o.m19382k(new C18299c("apollographql-client-name", "android"), new C18299c("apollographql-client-version", "1.2025.007"));
    }
}

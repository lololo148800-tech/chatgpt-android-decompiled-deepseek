package p385Pj;

import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;
import p658b5.C11242m;
import p841k.C16288h;

/* JADX INFO: renamed from: Pj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6429d implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20884a;

    /* JADX INFO: renamed from: b */
    public final C11242m f20885b;

    public /* synthetic */ C6429d(C11242m c11242m, int i10) {
        this.f20884a = i10;
        this.f20885b = c11242m;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f20884a) {
            case 0:
                C16288h c16288h = (C16288h) this.f20885b.f34019Z;
                AbstractC8446A2.m9048a(c16288h);
                return c16288h;
            case 1:
                C16288h c16288h2 = (C16288h) this.f20885b.f34020o0;
                AbstractC8446A2.m9048a(c16288h2);
                return c16288h2;
            default:
                C16288h c16288h3 = (C16288h) this.f20885b.f34018Y;
                AbstractC8446A2.m9048a(c16288h3);
                return c16288h3;
        }
    }
}

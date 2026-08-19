package p092Dc;

import p248Jk.InterfaceC4478i;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Dc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2000q implements InterfaceC4478i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6088b;

    public /* synthetic */ C2000q(Object obj, int i10) {
        this.f6087a = i10;
        this.f6088b = obj;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f6087a) {
            case 0:
                C2001r c2001r = (C2001r) this.f6088b;
                return new C2002s(c2001r.f6100b, c2001r.f6101c, c2001r.f6102d, c2001r.f6103e);
            case 1:
                C2005v c2005v = (C2005v) this.f6088b;
                return new C1994k(c2005v.f6135c, c2005v.f6136d);
            case 2:
                C2007x c2007x = (C2007x) this.f6088b;
                return new C2008y(c2007x.f6153c, c2007x.f6154d);
            default:
                return ((InterfaceC17068a) this.f6088b).get();
        }
    }
}

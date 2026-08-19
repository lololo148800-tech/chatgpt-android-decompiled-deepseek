package p214Ib;

import p288Lb.AbstractC4984q;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Ib.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3668k extends AbstractC4984q {

    /* JADX INFO: renamed from: a */
    public AbstractC3656B f11147a;

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) {
        AbstractC3656B abstractC3656B = this.f11147a;
        if (abstractC3656B != null) {
            return abstractC3656B.mo4358a(c6381b);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) {
        AbstractC3656B abstractC3656B = this.f11147a;
        if (abstractC3656B == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC3656B.mo4359b(c6382c, obj);
    }

    @Override // p288Lb.AbstractC4984q
    /* JADX INFO: renamed from: c */
    public final AbstractC3656B mo4366c() {
        AbstractC3656B abstractC3656B = this.f11147a;
        if (abstractC3656B != null) {
            return abstractC3656B;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}

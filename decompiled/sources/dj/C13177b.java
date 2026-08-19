package dj;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.EnumC11476w;

/* JADX INFO: renamed from: dj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13177b extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final AbstractC11471r f41819a;

    public C13177b(AbstractC11471r abstractC11471r) {
        this.f41819a = abstractC11471r;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        if (abstractC11477x.mo12805S() != EnumC11476w.f34694u0) {
            return this.f41819a.fromJson(abstractC11477x);
        }
        abstractC11477x.mo12815e0();
        return null;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        if (obj == null) {
            abstractC11440E.mo12829W();
        } else {
            this.f41819a.toJson(abstractC11440E, obj);
        }
    }

    public final String toString() {
        return this.f41819a + ".nullSafe()";
    }
}

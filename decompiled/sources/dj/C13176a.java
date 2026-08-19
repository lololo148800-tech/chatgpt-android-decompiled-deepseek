package dj;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11473t;
import bj.EnumC11476w;

/* JADX INFO: renamed from: dj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13176a extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final AbstractC11471r f41818a;

    public C13176a(AbstractC11471r abstractC11471r) {
        this.f41818a = abstractC11471r;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        if (abstractC11477x.mo12805S() != EnumC11476w.f34694u0) {
            return this.f41818a.fromJson(abstractC11477x);
        }
        throw new C11473t("Unexpected null at " + abstractC11477x.m12867E());
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        if (obj != null) {
            this.f41818a.toJson(abstractC11440E, obj);
        } else {
            throw new C11473t("Unexpected null at " + abstractC11440E.m12835P());
        }
    }

    public final String toString() {
        return this.f41818a + ".nonNull()";
    }
}

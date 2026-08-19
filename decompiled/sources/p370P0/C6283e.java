package p370P0;

import java.util.ArrayList;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p349O0.C5995c;
import p349O0.C5997d;
import p349O0.C6036w0;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6283e extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6283e f20410c = new C6283e(0, 2, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        C5995c c5995c = (C5995c) c6277d.m6798d(0);
        Object objM6798d = c6277d.m6798d(1);
        if (objM6798d instanceof C6036w0) {
            ((ArrayList) c1313k.f3468c).add(((C6036w0) objM6798d).f19669a);
        }
        if (c5947d0.f19377n != 0) {
            C5997d.m6470z("Can only append a slot if not current inserting");
            throw null;
        }
        int i10 = c5947d0.f19372i;
        int i11 = c5947d0.f19373j;
        int iM6366c = c5947d0.m6366c(c5995c);
        int iM6369f = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(iM6366c + 1));
        c5947d0.f19372i = iM6369f;
        c5947d0.f19373j = iM6369f;
        c5947d0.m6381s(1, iM6366c);
        if (i10 >= iM6369f) {
            i10++;
            i11++;
        }
        c5947d0.f19366c[iM6369f] = objM6798d;
        c5947d0.f19372i = i10;
        c5947d0.f19373j = i11;
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        if (AbstractC9186P.m9747a(i10, 0)) {
            return "anchor";
        }
        return AbstractC9186P.m9747a(i10, 1) ? "value" : super.mo6759c(i10);
    }
}

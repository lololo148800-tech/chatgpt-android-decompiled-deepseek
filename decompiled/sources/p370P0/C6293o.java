package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5943B0;
import p349O0.C5947D0;
import p349O0.C5995c;
import p349O0.C5997d;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6293o extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6293o f20424c = new C6293o(0, 3, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        C5943B0 c5943b0 = (C5943B0) c6277d.m6798d(1);
        C5995c c5995c = (C5995c) c6277d.m6798d(0);
        C6281c c6281c = (C6281c) c6277d.m6798d(2);
        C5947D0 c5947d0M6344p = c5943b0.m6344p();
        try {
            if (!c6281c.f20408b.m6842f()) {
                C5997d.m6470z("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c6281c.f20407a.m6841e(abstractC0865o, c5947d0M6344p, c1313k);
            c5947d0M6344p.m6368e(true);
            c5947d0.m6367d();
            c5995c.getClass();
            c5947d0.m6383u(c5943b0, c5943b0.m6341f(c5995c));
            c5947d0.m6372j();
        } catch (Throwable th2) {
            c5947d0M6344p.m6368e(false);
            throw th2;
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        if (AbstractC9186P.m9747a(i10, 0)) {
            return "anchor";
        }
        if (AbstractC9186P.m9747a(i10, 1)) {
            return "from";
        }
        return AbstractC9186P.m9747a(i10, 2) ? "fixups" : super.mo6759c(i10);
    }
}

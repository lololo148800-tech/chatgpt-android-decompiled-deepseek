package p881m0;

import java.util.Iterator;
import p1095x1.InterfaceC21058L;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8478F4;
import p571X9.AbstractC9113C4;
import p860l0.EnumC16673F0;
import p936p0.C18272l;
import p936p0.C18273m;
import p936p0.C18280t;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17126c implements InterfaceC17137n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C18280t f54760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17139p f54761b;

    public C17126c(C18280t c18280t, InterfaceC17139p interfaceC17139p) {
        this.f54760a = c18280t;
        this.f54761b = interfaceC17139p;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // p881m0.InterfaceC17137n
    /* JADX INFO: renamed from: a */
    public final float mo18895a(float f10, float f11) {
        float fAbs = Math.abs(f11);
        C18272l c18272lM19824g = this.f54760a.m19824g();
        int i10 = 0;
        if (!c18272lM19824g.f58296j.isEmpty()) {
            ?? r6 = c18272lM19824g.f58296j;
            int size = r6.size();
            Iterator it = ((Iterable) r6).iterator();
            while (it.hasNext()) {
                i10 += ((C18273m) it.next()).f58320q;
            }
            i10 /= size;
        }
        return Math.signum(f11) * AbstractC8301I.m8915f(fAbs - i10, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // p881m0.InterfaceC17137n
    /* JADX INFO: renamed from: b */
    public final float mo18896b(float f10) {
        int i10;
        int i11;
        C18280t c18280t = this.f54760a;
        ?? r6 = c18280t.m19824g().f58296j;
        int size = r6.size();
        float f11 = Float.NEGATIVE_INFINITY;
        float f12 = Float.POSITIVE_INFINITY;
        for (int i12 = 0; i12 < size; i12++) {
            C18273m c18273m = (C18273m) r6.get(i12);
            C18272l c18272lM19824g = c18280t.m19824g();
            EnumC16673F0 enumC16673F0 = c18272lM19824g.f58300n;
            EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
            InterfaceC21058L interfaceC21058L = c18272lM19824g.f58303q;
            int iM9643a = (int) (enumC16673F0 == enumC16673F1 ? AbstractC9113C4.m9643a(interfaceC21058L.getWidth(), interfaceC21058L.getHeight()) & 4294967295L : AbstractC9113C4.m9643a(interfaceC21058L.getWidth(), interfaceC21058L.getHeight()) >> 32);
            int i13 = -c18280t.m19824g().f58297k;
            int i14 = c18280t.m19824g().f58301o;
            float fMo18903a = c18273m.f58319p - this.f54761b.mo18903a(iM9643a, c18273m.f58320q, i13, i14, c18273m.f58304a, c18280t.m19824g().f58299m);
            if (fMo18903a <= 0.0f && fMo18903a > f11) {
                f11 = fMo18903a;
            }
            if (fMo18903a >= 0.0f && fMo18903a < f12) {
                f12 = fMo18903a;
            }
        }
        if (Math.abs(f10) < ((C18272l) c18280t.f58350f.getValue()).f58294h.mo7864b0(AbstractC17136m.f54799a)) {
            i11 = 0;
            i10 = 0;
        } else {
            i10 = f10 > 0.0f ? 1 : 2;
            i11 = 0;
        }
        if (AbstractC8478F4.m9119b(i10, i11)) {
            if (Math.abs(f12) <= Math.abs(f11)) {
                f11 = f12;
            }
        } else if (AbstractC8478F4.m9119b(i10, 1)) {
            f11 = f12;
        } else if (!AbstractC8478F4.m9119b(i10, 2)) {
            f11 = 0.0f;
        }
        if (f11 == Float.POSITIVE_INFINITY || f11 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f11;
    }
}

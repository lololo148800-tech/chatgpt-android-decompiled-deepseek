package p775h2;

import java.util.ArrayList;

/* JADX INFO: renamed from: h2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C14383m {

    /* JADX INFO: renamed from: a */
    public AbstractC14386p f45094a;

    /* JADX INFO: renamed from: b */
    public ArrayList f45095b;

    /* JADX INFO: renamed from: a */
    public static long m15877a(C14377g c14377g, long j10) {
        AbstractC14386p abstractC14386p = c14377g.f45082d;
        if (abstractC14386p instanceof C14381k) {
            return j10;
        }
        ArrayList arrayList = c14377g.f45089k;
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC14375e interfaceC14375e = (InterfaceC14375e) arrayList.get(i10);
            if (interfaceC14375e instanceof C14377g) {
                C14377g c14377g2 = (C14377g) interfaceC14375e;
                if (c14377g2.f45082d != abstractC14386p) {
                    jMin = Math.min(jMin, m15877a(c14377g2, ((long) c14377g2.f45084f) + j10));
                }
            }
        }
        if (c14377g != abstractC14386p.f45112i) {
            return jMin;
        }
        long jMo15818j = abstractC14386p.mo15818j();
        C14377g c14377g3 = abstractC14386p.f45111h;
        long j11 = j10 - jMo15818j;
        return Math.min(Math.min(jMin, m15877a(c14377g3, j11)), j11 - ((long) c14377g3.f45084f));
    }

    /* JADX INFO: renamed from: b */
    public static long m15878b(C14377g c14377g, long j10) {
        AbstractC14386p abstractC14386p = c14377g.f45082d;
        if (abstractC14386p instanceof C14381k) {
            return j10;
        }
        ArrayList arrayList = c14377g.f45089k;
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC14375e interfaceC14375e = (InterfaceC14375e) arrayList.get(i10);
            if (interfaceC14375e instanceof C14377g) {
                C14377g c14377g2 = (C14377g) interfaceC14375e;
                if (c14377g2.f45082d != abstractC14386p) {
                    jMax = Math.max(jMax, m15878b(c14377g2, ((long) c14377g2.f45084f) + j10));
                }
            }
        }
        if (c14377g != abstractC14386p.f45111h) {
            return jMax;
        }
        long jMo15818j = abstractC14386p.mo15818j();
        C14377g c14377g3 = abstractC14386p.f45112i;
        long j11 = j10 + jMo15818j;
        return Math.max(Math.max(jMax, m15878b(c14377g3, j11)), j11 - ((long) c14377g3.f45084f));
    }
}

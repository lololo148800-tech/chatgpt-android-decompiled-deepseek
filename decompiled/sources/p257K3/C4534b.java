package p257K3;

import bb.AbstractC11278C;
import bb.C11292Q;
import bb.C11294T;
import bb.C11302a0;
import bb.C11319l;
import bb.C11329v;
import bb.C11333z;
import java.util.ArrayList;
import p1073w3.AbstractC20800b;
import p117Eb.C2385o;
import p885m4.C17153c;

/* JADX INFO: renamed from: K3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4534b implements InterfaceC4533a {

    /* JADX INFO: renamed from: Z */
    public static final C11329v f14810Z;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f14811Y = new ArrayList();

    static {
        C11292Q c11292q = C11292Q.f34184Y;
        C2385o c2385o = new C2385o(13);
        c11292q.getClass();
        C11319l c11319l = new C11319l(c2385o, c11292q);
        C11302a0 c11302a0 = C11302a0.f34216Y;
        C2385o c2385o2 = new C2385o(14);
        c11302a0.getClass();
        f14810Z = new C11329v(c11319l, new C11319l(c2385o2, c11302a0));
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: a */
    public final long mo5275a(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f14811Y;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((C17153c) arrayList.get(i10)).f54821b;
            long j12 = ((C17153c) arrayList.get(i10)).f54823d;
            if (j10 < j11) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
            }
            i10++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: b */
    public final boolean mo5276b(C17153c c17153c, long j10) {
        long j11 = c17153c.f54821b;
        AbstractC20800b.m21316d(j11 != -9223372036854775807L);
        AbstractC20800b.m21316d(c17153c.f54822c != -9223372036854775807L);
        boolean z6 = j11 <= j10 && j10 < c17153c.f54823d;
        ArrayList arrayList = this.f14811Y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((C17153c) arrayList.get(size)).f54821b) {
                arrayList.add(size + 1, c17153c);
                return z6;
            }
        }
        arrayList.add(0, c17153c);
        return z6;
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: c */
    public final AbstractC11278C mo5277c(long j10) {
        ArrayList arrayList = this.f14811Y;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((C17153c) arrayList.get(0)).f54821b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C17153c c17153c = (C17153c) arrayList.get(i10);
                    if (j10 >= c17153c.f54821b && j10 < c17153c.f54823d) {
                        arrayList2.add(c17153c);
                    }
                    if (j10 < c17153c.f54821b) {
                        break;
                    }
                }
                C11294T c11294tM12688A = AbstractC11278C.m12688A(f14810Z, arrayList2);
                C11333z c11333zM12690s = AbstractC11278C.m12690s();
                for (int i11 = 0; i11 < c11294tM12688A.size(); i11++) {
                    c11333zM12690s.m12764d(((C17153c) c11294tM12688A.get(i11)).f54820a);
                }
                return c11333zM12690s.m12768j();
            }
        }
        return AbstractC11278C.m12693w();
    }

    @Override // p257K3.InterfaceC4533a
    public final void clear() {
        this.f14811Y.clear();
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: d */
    public final long mo5278d(long j10) {
        ArrayList arrayList = this.f14811Y;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((C17153c) arrayList.get(0)).f54821b) {
            return -9223372036854775807L;
        }
        long jMax = ((C17153c) arrayList.get(0)).f54821b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((C17153c) arrayList.get(i10)).f54821b;
            long j12 = ((C17153c) arrayList.get(i10)).f54823d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: e */
    public final void mo5279e(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14811Y;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((C17153c) arrayList.get(i10)).f54821b;
            if (j10 > j11 && j10 > ((C17153c) arrayList.get(i10)).f54823d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}

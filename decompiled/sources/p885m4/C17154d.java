package p885m4;

import bb.AbstractC11278C;
import bb.C11292Q;
import bb.C11294T;
import bb.C11319l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p849k7.C16349b;

/* JADX INFO: renamed from: m4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17154d implements InterfaceC17157g {

    /* JADX INFO: renamed from: o0 */
    public static final C11319l f54824o0;

    /* JADX INFO: renamed from: Y */
    public final AbstractC11278C f54825Y;

    /* JADX INFO: renamed from: Z */
    public final long[] f54826Z;

    static {
        C11292Q c11292q = C11292Q.f34184Y;
        C16349b c16349b = new C16349b(5);
        c11292q.getClass();
        f54824o0 = new C11319l(c16349b, c11292q);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    public C17154d(C11294T c11294t) {
        int i10 = 0;
        long j10 = -9223372036854775807L;
        if (c11294t.size() == 1) {
            Iterator<E> it = c11294t.iterator();
            Object next = it.next();
            if (it.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i10 < 4 && it.hasNext()) {
                    sb2.append(", ");
                    sb2.append(it.next());
                    i10++;
                }
                if (it.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            C17153c c17153c = (C17153c) next;
            long j11 = c17153c.f54821b;
            long j12 = j11 == -9223372036854775807L ? 0L : j11;
            long j13 = c17153c.f54822c;
            AbstractC11278C abstractC11278C = c17153c.f54820a;
            if (j13 == -9223372036854775807L) {
                this.f54825Y = AbstractC11278C.m12695y(abstractC11278C);
                this.f54826Z = new long[]{j12};
                return;
            } else {
                this.f54825Y = AbstractC11278C.m12696z(abstractC11278C, AbstractC11278C.m12693w());
                this.f54826Z = new long[]{j12, j13 + j12};
                return;
            }
        }
        long[] jArr = new long[c11294t.size() * 2];
        this.f54826Z = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C11294T c11294tM12688A = AbstractC11278C.m12688A(f54824o0, c11294t);
        int i11 = 0;
        while (i10 < c11294tM12688A.size()) {
            C17153c c17153c2 = (C17153c) c11294tM12688A.get(i10);
            long j14 = c17153c2.f54821b;
            j14 = j14 == j10 ? 0L : j14;
            long j15 = c17153c2.f54822c;
            long j16 = j14 + j15;
            AbstractC11278C abstractC11278C2 = c17153c2.f54820a;
            if (i11 != 0) {
                int i12 = i11 - 1;
                long j17 = this.f54826Z[i12];
                if (j17 < j14) {
                    this.f54826Z[i11] = j14;
                    arrayList.add(abstractC11278C2);
                    i11++;
                } else if (j17 == j14 && ((AbstractC11278C) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, abstractC11278C2);
                } else {
                    AbstractC20800b.m21332t("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f54826Z[i12] = j14;
                    arrayList.set(i12, abstractC11278C2);
                }
            } else {
                this.f54826Z[i11] = j14;
                arrayList.add(abstractC11278C2);
                i11++;
            }
            if (j15 != -9223372036854775807L) {
                this.f54826Z[i11] = j16;
                arrayList.add(AbstractC11278C.m12693w());
                i11++;
            }
            i10++;
            j10 = -9223372036854775807L;
        }
        this.f54825Y = AbstractC11278C.m12691t(arrayList);
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: e */
    public final int mo10555e(long j10) {
        int iM21401b = AbstractC20817s.m21401b(this.f54826Z, j10, false);
        if (iM21401b < this.f54825Y.size()) {
            return iM21401b;
        }
        return -1;
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: h */
    public final long mo10557h(int i10) {
        AbstractC20800b.m21316d(i10 < this.f54825Y.size());
        return this.f54826Z[i10];
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: k */
    public final List mo10558k(long j10) {
        int iM21404e = AbstractC20817s.m21404e(this.f54826Z, j10, false);
        return iM21404e == -1 ? AbstractC11278C.m12693w() : (AbstractC11278C) this.f54825Y.get(iM21404e);
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: p */
    public final int mo10560p() {
        return this.f54825Y.size();
    }
}

package p005A3;

import java.util.ArrayList;
import java.util.TreeSet;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: A3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0324k {

    /* JADX INFO: renamed from: a */
    public final int f1129a;

    /* JADX INFO: renamed from: b */
    public final String f1130b;

    /* JADX INFO: renamed from: c */
    public final TreeSet f1131c = new TreeSet();

    /* JADX INFO: renamed from: d */
    public final ArrayList f1132d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public C0329p f1133e;

    public C0324k(int i10, String str, C0329p c0329p) {
        this.f1129a = i10;
        this.f1130b = str;
        this.f1133e = c0329p;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m937a(long j10, long j11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1132d;
            if (i10 >= arrayList.size()) {
                return false;
            }
            C0323j c0323j = (C0323j) arrayList.get(i10);
            long j12 = c0323j.f1128b;
            long j13 = c0323j.f1127a;
            if (j12 == -1) {
                if (j10 >= j13) {
                    return true;
                }
            } else if (j11 != -1 && j13 <= j10 && j10 + j11 <= j13 + j12) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0324k.class != obj.getClass()) {
            return false;
        }
        C0324k c0324k = (C0324k) obj;
        return this.f1129a == c0324k.f1129a && this.f1130b.equals(c0324k.f1130b) && this.f1131c.equals(c0324k.f1131c) && this.f1133e.equals(c0324k.f1133e);
    }

    public final int hashCode() {
        return this.f1133e.hashCode() + AbstractC0168G.m527p(this.f1129a * 31, 31, this.f1130b);
    }
}

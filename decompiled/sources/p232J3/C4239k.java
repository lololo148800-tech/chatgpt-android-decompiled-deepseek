package p232J3;

import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import java.util.List;
import p057C3.C1535M;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: J3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4239k implements InterfaceC4221V {

    /* JADX INFO: renamed from: Y */
    public final C11294T f13851Y;

    /* JADX INFO: renamed from: Z */
    public long f13852Z;

    public C4239k(List list, List list2) {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        AbstractC20800b.m21316d(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c11333zM12690s.m12762a(new C4238j((InterfaceC4221V) list.get(i10), (List) list2.get(i10)));
        }
        this.f13851Y = c11333zM12690s.m12768j();
        this.f13852Z = -9223372036854775807L;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C11294T c11294t = this.f13851Y;
            if (i10 >= c11294t.size()) {
                break;
            }
            long jMo4916a = ((C4238j) c11294t.get(i10)).mo4916a();
            if (jMo4916a != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4916a);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        int i10 = 0;
        while (true) {
            C11294T c11294t = this.f13851Y;
            if (i10 >= c11294t.size()) {
                return false;
            }
            if (((C4238j) c11294t.get(i10)).mo4921g()) {
                return true;
            }
            i10++;
        }
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        boolean zMo4923j;
        boolean z6 = false;
        do {
            long jMo4916a = mo4916a();
            if (jMo4916a == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zMo4923j = false;
            while (true) {
                C11294T c11294t = this.f13851Y;
                if (i10 >= c11294t.size()) {
                    break;
                }
                long jMo4916a2 = ((C4238j) c11294t.get(i10)).mo4916a();
                boolean z10 = jMo4916a2 != Long.MIN_VALUE && jMo4916a2 <= c1535m.f4174a;
                if (jMo4916a2 == jMo4916a || z10) {
                    zMo4923j |= ((C4238j) c11294t.get(i10)).mo4923j(c1535m);
                }
                i10++;
            }
            z6 |= zMo4923j;
        } while (zMo4923j);
        return z6;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C11294T c11294t = this.f13851Y;
            if (i10 >= c11294t.size()) {
                break;
            }
            C4238j c4238j = (C4238j) c11294t.get(i10);
            long jMo4925l = c4238j.mo4925l();
            if ((c4238j.m5009b().contains(1) || c4238j.m5009b().contains(2) || c4238j.m5009b().contains(4)) && jMo4925l != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4925l);
            }
            if (jMo4925l != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo4925l);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f13852Z = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f13852Z;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
        int i10 = 0;
        while (true) {
            C11294T c11294t = this.f13851Y;
            if (i10 >= c11294t.size()) {
                return;
            }
            ((C4238j) c11294t.get(i10)).mo4928p(j10);
            i10++;
        }
    }
}

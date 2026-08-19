package p257K3;

import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.C11276A;
import bb.C11294T;
import java.util.ArrayList;
import java.util.Iterator;
import p1073w3.AbstractC20800b;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;
import p615Z6.C10223l;
import p758g0.AbstractC13784r;
import p758g0.C13729E;
import p758g0.InterfaceC13727C;
import p758g0.InterfaceC13786s;
import p784hb.C14438g;
import p885m4.C17153c;
import p895n1.C17429i;
import p895n1.C17430j;
import p895n1.C17431k;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17435o;
import p895n1.C17438r;
import p895n1.C17439s;
import p895n1.C17440t;
import p895n1.C17443w;
import p895n1.C17445y;
import p895n1.C17446z;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: K3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4535c implements InterfaceC4533a, InterfaceC13786s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14812Y;

    /* JADX INFO: renamed from: Z */
    public ArrayList f14813Z;

    public C4535c(int i10) {
        this.f14812Y = i10;
        switch (i10) {
            case 1:
                this.f14813Z = null;
                break;
            case 2:
            default:
                this.f14813Z = new ArrayList();
                break;
            case 3:
                this.f14813Z = new ArrayList(32);
                break;
        }
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: a */
    public long mo5275a(long j10) {
        ArrayList arrayList = this.f14813Z;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((C17153c) arrayList.get(0)).f54821b) {
            return ((C17153c) arrayList.get(0)).f54821b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            C17153c c17153c = (C17153c) arrayList.get(i10);
            if (j10 < c17153c.f54821b) {
                long j11 = ((C17153c) arrayList.get(i10 - 1)).f54823d;
                long j12 = c17153c.f54821b;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= j12) ? j12 : j11;
            }
        }
        long j13 = ((C17153c) AbstractC11320m.m12729i(arrayList)).f54823d;
        if (j13 == -9223372036854775807L || j10 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: b */
    public boolean mo5276b(C17153c c17153c, long j10) {
        boolean z6;
        long j11 = c17153c.f54821b;
        AbstractC20800b.m21316d(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = c17153c.f54823d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        ArrayList arrayList = this.f14813Z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((C17153c) arrayList.get(size)).f54821b) {
                arrayList.add(size + 1, c17153c);
                return z6;
            }
            if (((C17153c) arrayList.get(size)).f54821b <= j10) {
                z6 = false;
            }
        }
        arrayList.add(0, c17153c);
        return z6;
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: c */
    public AbstractC11278C mo5277c(long j10) {
        int iM5285k = m5285k(j10);
        if (iM5285k == 0) {
            C11276A c11276a = AbstractC11278C.f34162Z;
            return C11294T.f34185q0;
        }
        C17153c c17153c = (C17153c) this.f14813Z.get(iM5285k - 1);
        long j11 = c17153c.f54823d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return c17153c.f54820a;
        }
        C11276A c11276a2 = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    @Override // p257K3.InterfaceC4533a
    public void clear() {
        this.f14813Z.clear();
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: d */
    public long mo5278d(long j10) {
        ArrayList arrayList = this.f14813Z;
        if (arrayList.isEmpty() || j10 < ((C17153c) arrayList.get(0)).f54821b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((C17153c) arrayList.get(i10)).f54821b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                C17153c c17153c = (C17153c) arrayList.get(i10 - 1);
                long j12 = c17153c.f54823d;
                return (j12 == -9223372036854775807L || j12 > j10) ? c17153c.f54821b : j12;
            }
        }
        C17153c c17153c2 = (C17153c) AbstractC11320m.m12729i(arrayList);
        long j13 = c17153c2.f54823d;
        return (j13 == -9223372036854775807L || j10 < j13) ? c17153c2.f54821b : j13;
    }

    @Override // p257K3.InterfaceC4533a
    /* JADX INFO: renamed from: e */
    public void mo5279e(long j10) {
        int iM5285k = m5285k(j10);
        if (iM5285k > 0) {
            this.f14813Z.subList(0, iM5285k).clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5280f(C10223l c10223l) {
        if (this.f14813Z == null) {
            this.f14813Z = new ArrayList();
        }
        for (int i10 = 0; i10 < this.f14813Z.size(); i10++) {
            if (((C10223l) this.f14813Z.get(i10)).f30349a.f30353b > c10223l.f30349a.f30353b) {
                this.f14813Z.add(i10, c10223l);
                return;
            }
        }
        this.f14813Z.add(c10223l);
    }

    /* JADX INFO: renamed from: g */
    public void m5281g(C4535c c4535c) {
        if (c4535c.f14813Z == null) {
            return;
        }
        if (this.f14813Z == null) {
            this.f14813Z = new ArrayList(c4535c.f14813Z.size());
        }
        Iterator it = c4535c.f14813Z.iterator();
        while (it.hasNext()) {
            m5280f((C10223l) it.next());
        }
    }

    @Override // p758g0.InterfaceC13786s
    public InterfaceC13727C get(int i10) {
        return (C13729E) this.f14813Z.get(i10);
    }

    /* JADX INFO: renamed from: h */
    public void m5282h() {
        this.f14813Z.add(C17429i.f55733c);
    }

    /* JADX INFO: renamed from: i */
    public void m5283i(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f14813Z.add(new C17430j(f10, f11, f12, f13, f14, f15));
    }

    /* JADX INFO: renamed from: j */
    public void m5284j(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f14813Z.add(new C17438r(f10, f11, f12, f13, f14, f15));
    }

    /* JADX INFO: renamed from: k */
    public int m5285k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14813Z;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((C17153c) arrayList.get(i10)).f54821b) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5286l(float f10) {
        this.f14813Z.add(new C17431k(f10));
    }

    /* JADX INFO: renamed from: m */
    public void m5287m(float f10) {
        this.f14813Z.add(new C17439s(f10));
    }

    /* JADX INFO: renamed from: n */
    public void m5288n(float f10, float f11) {
        this.f14813Z.add(new C17432l(f10, f11));
    }

    /* JADX INFO: renamed from: o */
    public void m5289o(float f10, float f11) {
        this.f14813Z.add(new C17440t(f10, f11));
    }

    /* JADX INFO: renamed from: p */
    public void m5290p(float f10, float f11) {
        this.f14813Z.add(new C17433m(f10, f11));
    }

    /* JADX INFO: renamed from: q */
    public void m5291q(float f10, float f11, float f12, float f13) {
        this.f14813Z.add(new C17435o(f10, f11, f12, f13));
    }

    /* JADX INFO: renamed from: r */
    public void m5292r(float f10, float f11, float f12, float f13) {
        this.f14813Z.add(new C17443w(f10, f11, f12, f13));
    }

    /* JADX INFO: renamed from: s */
    public void m5293s(float f10) {
        this.f14813Z.add(new C17446z(f10));
    }

    /* JADX INFO: renamed from: t */
    public void m5294t(float f10) {
        this.f14813Z.add(new C17445y(f10));
    }

    public String toString() {
        switch (this.f14812Y) {
            case 1:
                if (this.f14813Z == null) {
                    return "";
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = this.f14813Z.iterator();
                while (it.hasNext()) {
                    sb2.append(((C10223l) it.next()).toString());
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C4535c(C14438g c14438g) {
        this.f14812Y = 4;
        this.f14813Z = new ArrayList();
    }

    public C4535c(float f10, float f11, AbstractC13784r abstractC13784r) {
        this.f14812Y = 2;
        C3508g c3508gM8929t = AbstractC8301I.m8929t(0, abstractC13784r.mo15284b());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
        C3507f it = c3508gM8929t.iterator();
        while (it.f10596o0) {
            arrayList.add(new C13729E(f10, f11, abstractC13784r.mo15283a(it.mo4199a())));
        }
        this.f14813Z = arrayList;
    }
}

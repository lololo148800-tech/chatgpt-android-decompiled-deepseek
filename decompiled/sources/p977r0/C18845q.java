package p977r0;

import androidx.compose.foundation.lazy.layout.C10846a;
import java.util.List;
import p1095x1.AbstractC21069X;
import p571X9.AbstractC9101A4;
import p909nm.AbstractC17681o;
import p953q0.InterfaceC18559Q;

/* JADX INFO: renamed from: r0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C18845q implements InterfaceC18559Q {

    /* JADX INFO: renamed from: a */
    public final int f60006a;

    /* JADX INFO: renamed from: b */
    public final Object f60007b;

    /* JADX INFO: renamed from: c */
    public final List f60008c;

    /* JADX INFO: renamed from: d */
    public final boolean f60009d;

    /* JADX INFO: renamed from: e */
    public final int f60010e;

    /* JADX INFO: renamed from: f */
    public final int f60011f;

    /* JADX INFO: renamed from: g */
    public final int f60012g;

    /* JADX INFO: renamed from: h */
    public final int f60013h;

    /* JADX INFO: renamed from: i */
    public final Object f60014i;

    /* JADX INFO: renamed from: j */
    public final C10846a f60015j;

    /* JADX INFO: renamed from: k */
    public final long f60016k;

    /* JADX INFO: renamed from: l */
    public boolean f60017l = true;

    /* JADX INFO: renamed from: m */
    public final int f60018m;

    /* JADX INFO: renamed from: n */
    public int f60019n;

    /* JADX INFO: renamed from: o */
    public int f60020o;

    /* JADX INFO: renamed from: p */
    public int f60021p;

    /* JADX INFO: renamed from: q */
    public boolean f60022q;

    /* JADX INFO: renamed from: r */
    public long f60023r;

    public C18845q(int i10, Object obj, List list, boolean z6, int i11, int i12, int i13, int i14, int i15, Object obj2, C10846a c10846a, long j10) {
        Integer numValueOf;
        this.f60006a = i10;
        this.f60007b = obj;
        this.f60008c = list;
        this.f60009d = z6;
        this.f60010e = i12;
        this.f60011f = i13;
        this.f60012g = i14;
        this.f60013h = i15;
        this.f60014i = obj2;
        this.f60015j = c10846a;
        this.f60016k = j10;
        int i16 = 1;
        if (!list.isEmpty()) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(0);
            numValueOf = Integer.valueOf(z6 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
            int iM19381j = AbstractC17681o.m19381j(list);
            if (1 <= iM19381j) {
                int i17 = 1;
                while (true) {
                    AbstractC21069X abstractC21069X2 = (AbstractC21069X) list.get(i17);
                    Integer numValueOf2 = Integer.valueOf(this.f60009d ? abstractC21069X2.f66982Z : abstractC21069X2.f66981Y);
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i17 == iM19381j) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + i11;
        this.f60018m = iIntValue < 0 ? 0 : iIntValue;
        List list2 = this.f60008c;
        if (!list2.isEmpty()) {
            AbstractC21069X abstractC21069X3 = (AbstractC21069X) list2.get(0);
            Integer numValueOf3 = Integer.valueOf(this.f60009d ? abstractC21069X3.f66981Y : abstractC21069X3.f66982Z);
            int iM19381j2 = AbstractC17681o.m19381j(list2);
            if (1 <= iM19381j2) {
                while (true) {
                    AbstractC21069X abstractC21069X4 = (AbstractC21069X) list2.get(i16);
                    Integer numValueOf4 = Integer.valueOf(this.f60009d ? abstractC21069X4.f66981Y : abstractC21069X4.f66982Z);
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i16 == iM19381j2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        }
        this.f60019n = -1;
        this.f60023r = 0L;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: a */
    public final int mo19809a() {
        return this.f60008c.size();
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: b */
    public final int mo19810b() {
        return this.f60018m;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: c */
    public final Object mo19811c(int i10) {
        return ((AbstractC21069X) this.f60008c.get(i10)).mo21534t();
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: d */
    public final long mo19812d() {
        return this.f60016k;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: e */
    public final int mo19813e() {
        return this.f60011f;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: f */
    public final boolean mo19814f() {
        return this.f60009d;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: g */
    public final void mo19815g() {
        this.f60022q = true;
    }

    @Override // p953q0.InterfaceC18559Q
    public final int getIndex() {
        return this.f60006a;
    }

    @Override // p953q0.InterfaceC18559Q
    public final Object getKey() {
        return this.f60007b;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: h */
    public final long mo19816h(int i10) {
        return this.f60023r;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: i */
    public final int mo19817i() {
        return this.f60010e;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: j */
    public final void mo19818j(int i10, int i11, int i12, int i13) {
        if (this.f60009d) {
            i12 = i13;
        }
        m20149m(i10, i11, i12);
    }

    /* JADX INFO: renamed from: k */
    public final int m20147k(long j10) {
        return (int) (this.f60009d ? j10 & 4294967295L : j10 >> 32);
    }

    /* JADX INFO: renamed from: l */
    public final int m20148l() {
        return (int) (!this.f60009d ? this.f60023r >> 32 : this.f60023r & 4294967295L);
    }

    /* JADX INFO: renamed from: m */
    public final void m20149m(int i10, int i11, int i12) {
        this.f60019n = i12;
        this.f60020o = -this.f60012g;
        this.f60021p = i12 + this.f60013h;
        this.f60023r = this.f60009d ? AbstractC9101A4.m9631a(i11, i10) : AbstractC9101A4.m9631a(i10, i11);
    }
}

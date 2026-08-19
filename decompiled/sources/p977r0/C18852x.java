package p977r0;

import androidx.compose.foundation.lazy.layout.C10846a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import mm.C17296C;
import p003A1.C0295v;
import p013Ab.C0420b;
import p032B4.C0806a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1139z0.C21585H;
import p1140z1.C21658D;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p594Y9.AbstractC9828W3;
import p773h0.EnumC14284g0;
import p784hb.C14438g;
import p858ko.C16482A;
import p860l0.C16696N;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16736e1;
import p894n0.C17407m;
import p909nm.AbstractC17680n;
import p936p0.C18275o;
import p953q0.AbstractC18551I;
import p953q0.C18561T;
import p953q0.C18563V;
import p953q0.C18566Y;
import p953q0.C18572c;
import p953q0.InterfaceC18565X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: r0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C18852x implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: u */
    public static final C21585H f60041u = AbstractC9828W3.m10471b(C18849u.f60031Y, C18840l.f59979o0);

    /* JADX INFO: renamed from: a */
    public final C0806a f60042a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f60043b = C5997d.m6430Q(AbstractC18844p.f60005a, C5975S.f19445o0);

    /* JADX INFO: renamed from: c */
    public final C0420b f60044c = new C0420b(18, (byte) 0);

    /* JADX INFO: renamed from: d */
    public final C6002f0 f60045d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f60046e;

    /* JADX INFO: renamed from: f */
    public C21658D f60047f;

    /* JADX INFO: renamed from: g */
    public final C18275o f60048g;

    /* JADX INFO: renamed from: h */
    public final C18572c f60049h;

    /* JADX INFO: renamed from: i */
    public final C14438g f60050i;

    /* JADX INFO: renamed from: j */
    public final boolean f60051j;

    /* JADX INFO: renamed from: k */
    public final C18566Y f60052k;

    /* JADX INFO: renamed from: l */
    public final C16696N f60053l;

    /* JADX INFO: renamed from: m */
    public float f60054m;

    /* JADX INFO: renamed from: n */
    public int f60055n;

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap f60056o;

    /* JADX INFO: renamed from: p */
    public final C17407m f60057p;

    /* JADX INFO: renamed from: q */
    public final C18563V f60058q;

    /* JADX INFO: renamed from: r */
    public final C10846a f60059r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC5985X f60060s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5985X f60061t;

    public C18852x(int[] iArr, int[] iArr2) {
        this.f60042a = new C0806a(iArr, iArr2, new C0295v(2, this, C18852x.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 15));
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f60045d = C5997d.m6430Q(bool, c5975s);
        this.f60046e = C5997d.m6430Q(bool, c5975s);
        this.f60048g = new C18275o(this, 1);
        this.f60049h = new C18572c();
        this.f60050i = new C14438g(8);
        this.f60051j = true;
        this.f60052k = new C18566Y(null, null);
        this.f60053l = new C16696N(new C16482A(this, 20));
        this.f60055n = -1;
        this.f60056o = new LinkedHashMap();
        this.f60057p = new C17407m();
        this.f60058q = new C18563V();
        this.f60059r = new C10846a();
        this.f60060s = AbstractC18551I.m19927h();
        this.f60061t = AbstractC18551I.m19927h();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return this.f60053l.mo5255a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C18850v c18850v;
        C18852x c18852x;
        if (abstractC19687c instanceof C18850v) {
            c18850v = (C18850v) abstractC19687c;
            int i10 = c18850v.f60037r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18850v.f60037r0 = i10 - Integer.MIN_VALUE;
            } else {
                c18850v = new C18850v(this, abstractC19687c);
            }
        } else {
            c18850v = new C18850v(this, abstractC19687c);
        }
        Object obj = c18850v.f60035p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18850v.f60037r0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC1439n = c18850v.f60034o0;
                enumC14284g0 = c18850v.f60033Z;
                c18852x = c18850v.f60032Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c18850v.f60032Y = this;
        c18850v.f60033Z = enumC14284g0;
        c18850v.f60034o0 = interfaceC1439n;
        c18850v.f60037r0 = 1;
        if (this.f60049h.m19944a(c18850v) == enumC19250a) {
            return enumC19250a;
        }
        c18852x = this;
        C16696N c16696n = c18852x.f60053l;
        c18850v.f60032Y = null;
        c18850v.f60033Z = null;
        c18850v.f60034o0 = null;
        c18850v.f60037r0 = 2;
        if (c16696n.mo5256b(enumC14284g0, interfaceC1439n, c18850v) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: c */
    public final boolean mo5257c() {
        return ((Boolean) this.f60046e.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: d */
    public final boolean mo5258d() {
        return ((Boolean) this.f60045d.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return this.f60053l.mo5259e(f10);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final void m20150f(C18842n c18842n, boolean z6) {
        Object obj;
        this.f60054m -= c18842n.f59991c;
        this.f60043b.setValue(c18842n);
        int[] iArr = c18842n.f59989a;
        boolean z10 = true;
        C0806a c0806a = this.f60042a;
        if (z6) {
            int[] iArr2 = c18842n.f59990b;
            c0806a.f2239e = iArr2;
            ((C5996c0) c0806a.f2240f).m6413h(C0806a.m1841d((int[]) c0806a.f2237c, iArr2));
        } else {
            c0806a.getClass();
            int iM1840c = C0806a.m1840c(iArr);
            ?? r6 = c18842n.f59998j;
            int size = r6.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = r6.get(i10);
                if (((C18845q) obj).f60006a == iM1840c) {
                    break;
                } else {
                    i10++;
                }
            }
            C18845q c18845q = (C18845q) obj;
            c0806a.f2241g = c18845q != null ? c18845q.f60007b : null;
            ((C18561T) c0806a.f2242h).m19939c(iM1840c);
            if (c0806a.f2235a || c18842n.f59997i > 0) {
                c0806a.f2235a = true;
                AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
                InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
                AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
                try {
                    int[] iArr3 = c18842n.f59990b;
                    c0806a.f2237c = iArr;
                    ((C5996c0) c0806a.f2238d).m6413h(C0806a.m1840c(iArr));
                    c0806a.f2239e = iArr3;
                    ((C5996c0) c0806a.f2240f).m6413h(C0806a.m1841d(iArr, iArr3));
                    AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                } catch (Throwable th2) {
                    AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                    throw th2;
                }
            }
            if (this.f60055n != -1 && !((Collection) r6).isEmpty()) {
                int i11 = ((C18845q) AbstractC17680n.m19341Q(r6)).f60006a;
                int i12 = ((C18845q) AbstractC17680n.m19351a0(r6)).f60006a;
                int i13 = this.f60055n;
                if (i11 > i13 || i13 > i12) {
                    this.f60055n = -1;
                    LinkedHashMap linkedHashMap = this.f60056o;
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC18565X) it.next()).cancel();
                    }
                    linkedHashMap.clear();
                }
            }
        }
        if (iArr[0] == 0 && c18842n.f59990b[0] <= 0) {
            z10 = false;
        }
        this.f60046e.setValue(Boolean.valueOf(z10));
        this.f60045d.setValue(Boolean.valueOf(c18842n.f59993e));
    }

    /* JADX INFO: renamed from: g */
    public final C18842n m20151g() {
        return (C18842n) this.f60043b.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m20152h(float f10, C18842n c18842n) {
        LinkedHashMap linkedHashMap;
        int i10;
        long jM9966i;
        if (!this.f60051j || ((Collection) c18842n.f59998j).isEmpty()) {
            return;
        }
        int i11 = 1;
        boolean z6 = f10 < 0.0f;
        ?? r6 = c18842n.f59998j;
        int iM1059o = z6 ? ((C18845q) AbstractC17680n.m19351a0(r6)).f60006a : ((C18845q) AbstractC17680n.m19341Q(r6)).f60006a;
        if (iM1059o == this.f60055n) {
            return;
        }
        this.f60055n = iM1059o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C18848t c18848t = c18842n.f59995g;
        int length = c18848t.f60030b.length;
        int i12 = 0;
        while (true) {
            linkedHashMap = this.f60056o;
            if (i12 >= length) {
                break;
            }
            C0420b c0420b = this.f60044c;
            if (z6) {
                iM1059o++;
                int length2 = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                while (true) {
                    if (iM1059o >= length2) {
                        iM1059o = c0420b.f1381Z + ((int[]) c0420b.f1382o0).length;
                        break;
                    } else if (c0420b.m1049d(iM1059o, i12)) {
                        break;
                    } else {
                        iM1059o++;
                    }
                }
            } else {
                iM1059o = c0420b.m1059o(iM1059o, i12);
            }
            if (iM1059o < 0 || iM1059o >= c18842n.f59997i || linkedHashSet.contains(Integer.valueOf(iM1059o))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(iM1059o));
            if (!linkedHashMap.containsKey(Integer.valueOf(iM1059o))) {
                boolean zM16555f = c18842n.f59996h.m16555f(iM1059o);
                int i13 = zM16555f ? 0 : i12;
                int i14 = zM16555f ? length : i11;
                int[] iArr = c18848t.f60030b;
                if (i14 == i11) {
                    i10 = iArr[i13];
                } else {
                    int[] iArr2 = c18848t.f60029a;
                    int i15 = iArr2[i13];
                    int i16 = (i13 + i14) - i11;
                    i10 = (iArr2[i16] + iArr[i16]) - i15;
                }
                if (c18842n.f60004p == EnumC16673F0.f53401Y) {
                    if (i10 < 0) {
                        AbstractC9406z4.m9983b("width(" + i10 + ") must be >= 0");
                        throw null;
                    }
                    jM9966i = AbstractC9388w4.m9966i(i10, i10, 0, Integer.MAX_VALUE);
                } else {
                    if (i10 < 0) {
                        AbstractC9406z4.m9983b("height(" + i10 + ") must be >= 0");
                        throw null;
                    }
                    jM9966i = AbstractC9388w4.m9966i(0, Integer.MAX_VALUE, i10, i10);
                }
                linkedHashMap.put(Integer.valueOf(iM1059o), this.f60052k.m19943a(iM1059o, jM9966i));
            }
            i12++;
            i11 = 1;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!linkedHashSet.contains(entry.getKey())) {
                ((InterfaceC18565X) entry.getValue()).cancel();
                it.remove();
            }
        }
    }
}

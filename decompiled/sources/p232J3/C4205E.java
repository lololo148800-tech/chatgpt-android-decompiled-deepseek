package p232J3;

import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.C11276A;
import bb.C11294T;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p057C3.C1535M;
import p057C3.C1561g0;
import p1016t3.C19765O;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p117Eb.C2385o;
import p281L3.InterfaceC4930q;
import p525Vb.C8258a;

/* JADX INFO: renamed from: J3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C4205E implements InterfaceC4251w, InterfaceC4250v {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC4251w[] f13661Y;

    /* JADX INFO: renamed from: Z */
    public final IdentityHashMap f13662Z;

    /* JADX INFO: renamed from: o0 */
    public final C8258a f13663o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f13664p0 = new ArrayList();

    /* JADX INFO: renamed from: q0 */
    public final HashMap f13665q0 = new HashMap();

    /* JADX INFO: renamed from: r0 */
    public InterfaceC4250v f13666r0;

    /* JADX INFO: renamed from: s0 */
    public C4227a0 f13667s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC4251w[] f13668t0;

    /* JADX INFO: renamed from: u0 */
    public C4239k f13669u0;

    public C4205E(C8258a c8258a, long[] jArr, InterfaceC4251w... interfaceC4251wArr) {
        this.f13663o0 = c8258a;
        this.f13661Y = interfaceC4251wArr;
        c8258a.getClass();
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        this.f13669u0 = new C4239k(c11294t, c11294t);
        this.f13662Z = new IdentityHashMap();
        this.f13668t0 = new InterfaceC4251w[0];
        for (int i10 = 0; i10 < interfaceC4251wArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f13661Y[i10] = new C4225Z(interfaceC4251wArr[i10], j10);
            }
        }
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        return this.f13669u0.mo4916a();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: b */
    public final void mo2295b(InterfaceC4251w interfaceC4251w) {
        ArrayList arrayList = this.f13664p0;
        arrayList.remove(interfaceC4251w);
        if (arrayList.isEmpty()) {
            InterfaceC4251w[] interfaceC4251wArr = this.f13661Y;
            int i10 = 0;
            for (InterfaceC4251w interfaceC4251w2 : interfaceC4251wArr) {
                i10 += interfaceC4251w2.mo4924k().f13815a;
            }
            C19765O[] c19765oArr = new C19765O[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < interfaceC4251wArr.length; i12++) {
                C4227a0 c4227a0Mo4924k = interfaceC4251wArr[i12].mo4924k();
                int i13 = c4227a0Mo4924k.f13815a;
                int i14 = 0;
                while (i14 < i13) {
                    C19765O c19765oM4999a = c4227a0Mo4924k.m4999a(i14);
                    int i15 = c19765oM4999a.f62602a;
                    C19788o[] c19788oArr = new C19788o[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        C19788o c19788o = c19765oM4999a.f62605d[i16];
                        C19787n c19787nM20747a = c19788o.m20747a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = c19788o.f62740a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        c19787nM20747a.f62703a = sb2.toString();
                        c19788oArr[i16] = new C19788o(c19787nM20747a);
                    }
                    C19765O c19765o = new C19765O(i12 + ":" + c19765oM4999a.f62603b, c19788oArr);
                    this.f13665q0.put(c19765o, c19765oM4999a);
                    c19765oArr[i11] = c19765o;
                    i14++;
                    i11++;
                }
            }
            this.f13667s0 = new C4227a0(c19765oArr);
            InterfaceC4250v interfaceC4250v = this.f13666r0;
            interfaceC4250v.getClass();
            interfaceC4250v.mo2295b(this);
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: c */
    public final void mo4917c() {
        for (InterfaceC4251w interfaceC4251w : this.f13661Y) {
            interfaceC4251w.mo4917c();
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: d */
    public final long mo4918d(long j10) {
        long jMo4918d = this.f13668t0[0].mo4918d(j10);
        int i10 = 1;
        while (true) {
            InterfaceC4251w[] interfaceC4251wArr = this.f13668t0;
            if (i10 >= interfaceC4251wArr.length) {
                return jMo4918d;
            }
            if (interfaceC4251wArr[i10].mo4918d(jMo4918d) != jMo4918d) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: e */
    public final void mo4919e(long j10) {
        for (InterfaceC4251w interfaceC4251w : this.f13668t0) {
            interfaceC4251w.mo4919e(j10);
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: f */
    public final void mo4920f(InterfaceC4250v interfaceC4250v, long j10) {
        this.f13666r0 = interfaceC4250v;
        ArrayList arrayList = this.f13664p0;
        InterfaceC4251w[] interfaceC4251wArr = this.f13661Y;
        Collections.addAll(arrayList, interfaceC4251wArr);
        for (InterfaceC4251w interfaceC4251w : interfaceC4251wArr) {
            interfaceC4251w.mo4920f(this, j10);
        }
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        return this.f13669u0.mo4921g();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: h */
    public final void mo2307h(InterfaceC4221V interfaceC4221V) {
        InterfaceC4250v interfaceC4250v = this.f13666r0;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2307h(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: i */
    public final long mo4922i() {
        long j10 = -9223372036854775807L;
        for (InterfaceC4251w interfaceC4251w : this.f13668t0) {
            long jMo4922i = interfaceC4251w.mo4922i();
            if (jMo4922i == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && interfaceC4251w.mo4918d(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (InterfaceC4251w interfaceC4251w2 : this.f13668t0) {
                    if (interfaceC4251w2 == interfaceC4251w) {
                        break;
                    }
                    if (interfaceC4251w2.mo4918d(jMo4922i) != jMo4922i) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jMo4922i;
            } else if (jMo4922i != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        ArrayList arrayList = this.f13664p0;
        if (arrayList.isEmpty()) {
            return this.f13669u0.mo4923j(c1535m);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC4251w) arrayList.get(i10)).mo4923j(c1535m);
        }
        return false;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: k */
    public final C4227a0 mo4924k() {
        C4227a0 c4227a0 = this.f13667s0;
        c4227a0.getClass();
        return c4227a0;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        return this.f13669u0.mo4925l();
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: m */
    public final long mo4926m(long j10, C1561g0 c1561g0) {
        InterfaceC4251w[] interfaceC4251wArr = this.f13668t0;
        return (interfaceC4251wArr.length > 0 ? interfaceC4251wArr[0] : this.f13661Y[0]).mo4926m(j10, c1561g0);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: o */
    public final long mo4927o(InterfaceC4930q[] interfaceC4930qArr, boolean[] zArr, InterfaceC4220U[] interfaceC4220UArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC4930qArr.length];
        int[] iArr2 = new int[interfaceC4930qArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = interfaceC4930qArr.length;
            identityHashMap = this.f13662Z;
            if (i11 >= length) {
                break;
            }
            InterfaceC4220U interfaceC4220U = interfaceC4220UArr[i11];
            Integer num = interfaceC4220U == null ? null : (Integer) identityHashMap.get(interfaceC4220U);
            iArr[i11] = num == null ? -1 : num.intValue();
            InterfaceC4930q interfaceC4930q = interfaceC4930qArr[i11];
            if (interfaceC4930q != null) {
                String str = interfaceC4930q.mo4904a().f62603b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = interfaceC4930qArr.length;
        InterfaceC4220U[] interfaceC4220UArr2 = new InterfaceC4220U[length2];
        InterfaceC4220U[] interfaceC4220UArr3 = new InterfaceC4220U[interfaceC4930qArr.length];
        InterfaceC4930q[] interfaceC4930qArr2 = new InterfaceC4930q[interfaceC4930qArr.length];
        InterfaceC4251w[] interfaceC4251wArr = this.f13661Y;
        ArrayList arrayList = new ArrayList(interfaceC4251wArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < interfaceC4251wArr.length) {
            int i13 = i10;
            while (i13 < interfaceC4930qArr.length) {
                interfaceC4220UArr3[i13] = iArr[i13] == i12 ? interfaceC4220UArr[i13] : null;
                if (iArr2[i13] == i12) {
                    InterfaceC4930q interfaceC4930q2 = interfaceC4930qArr[i13];
                    interfaceC4930q2.getClass();
                    C19765O c19765o = (C19765O) this.f13665q0.get(interfaceC4930q2.mo4904a());
                    c19765o.getClass();
                    interfaceC4930qArr2[i13] = new C4204D(interfaceC4930q2, c19765o);
                } else {
                    interfaceC4930qArr2[i13] = null;
                }
                i13++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            InterfaceC4251w[] interfaceC4251wArr2 = interfaceC4251wArr;
            InterfaceC4930q[] interfaceC4930qArr3 = interfaceC4930qArr2;
            long jMo4927o = interfaceC4251wArr[i12].mo4927o(interfaceC4930qArr2, zArr, interfaceC4220UArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jMo4927o;
            } else if (jMo4927o != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i15 = 0; i15 < interfaceC4930qArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    InterfaceC4220U interfaceC4220U2 = interfaceC4220UArr3[i15];
                    interfaceC4220U2.getClass();
                    interfaceC4220UArr2[i15] = interfaceC4220UArr3[i15];
                    identityHashMap.put(interfaceC4220U2, Integer.valueOf(i14));
                    z6 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC20800b.m21320h(interfaceC4220UArr3[i15] == null);
                }
            }
            if (z6) {
                arrayList2.add(interfaceC4251wArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            interfaceC4251wArr = interfaceC4251wArr2;
            interfaceC4930qArr2 = interfaceC4930qArr3;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC4220UArr2, i16, interfaceC4220UArr, i16, length2);
        this.f13668t0 = (InterfaceC4251w[]) arrayList3.toArray(new InterfaceC4251w[i16]);
        AbstractList abstractListM12740t = AbstractC11320m.m12740t(arrayList3, new C2385o(9));
        this.f13663o0.getClass();
        this.f13669u0 = new C4239k(arrayList3, abstractListM12740t);
        return j11;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
        this.f13669u0.mo4928p(j10);
    }
}

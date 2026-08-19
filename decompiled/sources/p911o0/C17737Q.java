package p911o0;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import p003A1.C0186M;
import p105E.C2222a;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21061O;
import p1095x1.InterfaceC21095p;
import p174Gk.uSfJ.HpucjswO;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p332N8.C5677a;
import p392Q0.C6546d;
import p492U1.C7536a;
import p492U1.C7540e;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9388w4;
import p692d0.AbstractC12972k;
import p692d0.C12970i;
import p692d0.C12981t;
import p692d0.C12982u;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C17737Q implements InterfaceC21061O, InterfaceC17773n0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17760h f56642a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17766k f56643b;

    /* JADX INFO: renamed from: c */
    public final float f56644c;

    /* JADX INFO: renamed from: d */
    public final C17719C f56645d;

    /* JADX INFO: renamed from: e */
    public final float f56646e;

    /* JADX INFO: renamed from: f */
    public final int f56647f;

    /* JADX INFO: renamed from: g */
    public final int f56648g;

    /* JADX INFO: renamed from: h */
    public final C17734N f56649h;

    /* JADX INFO: renamed from: i */
    public final AbstractC16546n f56650i = C17736P.f56638Z;

    /* JADX INFO: renamed from: j */
    public final AbstractC16546n f56651j = C17736P.f56639o0;

    /* JADX INFO: renamed from: k */
    public final AbstractC16546n f56652k = C17736P.f56640p0;

    public C17737Q(InterfaceC17760h interfaceC17760h, InterfaceC17766k interfaceC17766k, float f10, C17719C c17719c, float f11, int i10, int i11, C17734N c17734n) {
        this.f56642a = interfaceC17760h;
        this.f56643b = interfaceC17766k;
        this.f56644c = f10;
        this.f56645d = c17719c;
        this.f56646e = f11;
        this.f56647f = i10;
        this.f56648g = i11;
        this.f56649h = c17734n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Bm.o, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: a */
    public final int mo4650a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        List list2 = (List) AbstractC17680n.m19344T(1, list);
        InterfaceC21056J interfaceC21056J = list2 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list2) : null;
        List list3 = (List) AbstractC17680n.m19344T(2, list);
        this.f56649h.m19464b(interfaceC21056J, list3 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list3) : null, AbstractC9388w4.m9959b(i10, 0, 13));
        List list4 = (List) AbstractC17680n.m19343S(list);
        if (list4 == null) {
            list4 = C17689w.f56480Y;
        }
        return (int) (AbstractC17731K.m19461b(list4, this.f56652k, this.f56651j, i10, interfaceC21095p.mo7866k0(this.f56644c), interfaceC21095p.mo7866k0(this.f56646e), this.f56647f, this.f56648g, this.f56649h) >> 32);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Bm.o, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: b */
    public final int mo4651b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        List list2 = (List) AbstractC17680n.m19344T(1, list);
        InterfaceC21056J interfaceC21056J = list2 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list2) : null;
        List list3 = (List) AbstractC17680n.m19344T(2, list);
        this.f56649h.m19464b(interfaceC21056J, list3 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list3) : null, AbstractC9388w4.m9959b(i10, 0, 13));
        List list4 = (List) AbstractC17680n.m19343S(list);
        if (list4 == null) {
            list4 = C17689w.f56480Y;
        }
        return (int) (AbstractC17731K.m19461b(list4, this.f56652k, this.f56651j, i10, interfaceC21095p.mo7866k0(this.f56644c), interfaceC21095p.mo7866k0(this.f56646e), this.f56647f, this.f56648g, this.f56649h) >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo4652c(InterfaceC21059M interfaceC21059M, List list, long j10) throws Throwable {
        InterfaceC21056J interfaceC21056J;
        InterfaceC21056J interfaceC21056J2;
        C12982u c12982u;
        int i10;
        InterfaceC21056J interfaceC21056J3;
        Object obj;
        C12970i c12970i;
        int iMin;
        int i11;
        C12981t c12981t;
        C12981t c12981t2;
        int i12;
        C17727G c17727gM566a;
        int i13 = this.f56648g;
        C17690x c17690x = C17690x.f56481Y;
        if (i13 != 0 && this.f56647f != 0 && !((ArrayList) list).isEmpty()) {
            int iM7853h = C7536a.m7853h(j10);
            C17734N c17734n = this.f56649h;
            if (iM7853h != 0 || c17734n.f56619a == 1) {
                List list2 = (List) AbstractC17680n.m19341Q(list);
                if (list2.isEmpty()) {
                    return interfaceC21059M.mo19936R(0, 0, c17690x, C17776p.f56740q0);
                }
                List list3 = (List) AbstractC17680n.m19344T(1, list);
                InterfaceC21056J interfaceC21056J4 = list3 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list3) : null;
                List list4 = (List) AbstractC17680n.m19344T(2, list);
                InterfaceC21056J interfaceC21056J5 = list4 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list4) : null;
                list2.size();
                c17734n.getClass();
                long jM19491m = AbstractC17758g.m19491m(AbstractC17758g.m19484f(10, AbstractC17758g.m19483e(1, j10)));
                if (interfaceC21056J4 != null) {
                    AbstractC17731K.m19462c(interfaceC21056J4, this, jM19491m, new C17733M(c17734n, this, 0));
                    c17734n.f56622d = interfaceC21056J4;
                }
                if (interfaceC21056J5 != null) {
                    AbstractC17731K.m19462c(interfaceC21056J5, this, jM19491m, new C17733M(c17734n, this, 1));
                    c17734n.f56624f = interfaceC21056J5;
                }
                Iterator it = list2.iterator();
                long jM19483e = AbstractC17758g.m19483e(1, j10);
                C6546d c6546d = new C6546d(new InterfaceC21058L[16]);
                int iM7854i = C7536a.m7854i(jM19483e);
                int iM7856k = C7536a.m7856k(jM19483e);
                int iM7853h2 = C7536a.m7853h(jM19483e);
                C12982u c12982u2 = AbstractC12972k.f41182a;
                C12982u c12982u3 = new C12982u();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(interfaceC21059M.mo7864b0(this.f56644c));
                int iCeil2 = (int) Math.ceil(interfaceC21059M.mo7864b0(this.f56646e));
                long jM9958a = AbstractC9388w4.m9958a(0, iM7854i, 0, iM7853h2);
                C17690x c17690x2 = c17690x;
                long jM19491m2 = AbstractC17758g.m19491m(AbstractC17758g.m19484f(14, jM9958a));
                C16525B c16525b = new C16525B();
                if (it.hasNext()) {
                    try {
                        interfaceC21056J = (InterfaceC21056J) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        interfaceC21056J = null;
                    }
                    interfaceC21056J2 = interfaceC21056J;
                } else {
                    interfaceC21056J2 = null;
                }
                C12970i c12970i2 = interfaceC21056J2 != null ? new C12970i(AbstractC17731K.m19462c(interfaceC21056J2, this, jM19491m2, new C5677a(c16525b, 3))) : null;
                InterfaceC21056J interfaceC21056J6 = interfaceC21056J2;
                Integer numValueOf = c12970i2 != null ? Integer.valueOf((int) (c12970i2.f41180a >> 32)) : null;
                Integer numValueOf2 = c12970i2 != null ? Integer.valueOf((int) (c12970i2.f41180a & 4294967295L)) : null;
                C12981t c12981t3 = new C12981t();
                C12981t c12981t4 = new C12981t();
                Integer num = numValueOf2;
                int i14 = this.f56648g;
                Integer numValueOf3 = numValueOf;
                int i15 = this.f56647f;
                C12981t c12981t5 = c12981t3;
                C17734N c17734n2 = this.f56649h;
                C0186M c0186m = new C0186M(i15, c17734n2, jM19483e, i14, iCeil, iCeil2);
                C2222a c2222aM567b = c0186m.m567b(it.hasNext(), 0, C12970i.m14660a(iM7854i, iM7853h2), c12970i2, 0, 0, 0, false, false);
                int i16 = iM7854i;
                C12981t c12981t6 = c12981t4;
                InterfaceC21056J interfaceC21056J7 = interfaceC21056J6;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = iM7853h2;
                int i23 = 0;
                C17727G c17727gM566a2 = c2222aM567b.f6806b ? c0186m.m566a(c2222aM567b, c12970i2 != null, -1, 0, iM7854i, 0) : null;
                int i24 = iM7856k;
                C17727G c17727g = c17727gM566a2;
                while (!c2222aM567b.f6806b && interfaceC21056J7 != null) {
                    AbstractC16544l.m18091d(numValueOf3);
                    int iIntValue = numValueOf3.intValue();
                    AbstractC16544l.m18091d(num);
                    int i25 = iM7854i;
                    int i26 = i24;
                    int i27 = i18 + iIntValue;
                    int iMax = Math.max(i17, num.intValue());
                    int i28 = i16 - iIntValue;
                    int i29 = i23 + 1;
                    c17734n2.getClass();
                    arrayList.add(interfaceC21056J7);
                    c12982u3.m14697i(i23, c16525b.f51262Y);
                    int i30 = i29 - i19;
                    if (it.hasNext()) {
                        try {
                            interfaceC21056J3 = (InterfaceC21056J) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            interfaceC21056J3 = null;
                        }
                        interfaceC21056J7 = interfaceC21056J3;
                        obj = null;
                    } else {
                        obj = null;
                        interfaceC21056J7 = null;
                    }
                    c16525b.f51262Y = obj;
                    C12970i c12970i3 = interfaceC21056J7 != null ? new C12970i(AbstractC17731K.m19462c(interfaceC21056J7, this, jM19491m2, new C5677a(c16525b, 2))) : null;
                    Integer numValueOf4 = c12970i3 != null ? Integer.valueOf(((int) (c12970i3.f41180a >> 32)) + iCeil) : null;
                    long j11 = jM19491m2;
                    Integer numValueOf5 = c12970i3 != null ? Integer.valueOf((int) (c12970i3.f41180a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jM14660a = C12970i.m14660a(i28, i22);
                    if (c12970i3 == null) {
                        c12970i = null;
                    } else {
                        AbstractC16544l.m18091d(numValueOf4);
                        int iIntValue2 = numValueOf4.intValue();
                        AbstractC16544l.m18091d(numValueOf5);
                        c12970i = new C12970i(C12970i.m14660a(iIntValue2, numValueOf5.intValue()));
                    }
                    C2222a c2222aM567b2 = c0186m.m567b(zHasNext, i30, jM14660a, c12970i, i21, i20, iMax, false, false);
                    int i31 = i27;
                    if (c2222aM567b2.f6805a) {
                        iMin = Math.min(Math.max(i26, i31), i25);
                        int i32 = i20 + iMax;
                        c17727gM566a = c0186m.m566a(c2222aM567b2, c12970i3 != null, i21, i32, i28, i30);
                        c12981t = c12981t6;
                        c12981t.m14684a(iMax);
                        int i33 = (i22 - i32) - iCeil2;
                        c12981t2 = c12981t5;
                        c12981t2.m14684a(i29);
                        i21++;
                        i20 = i32 + iCeil2;
                        i22 = i33;
                        numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i19 = i29;
                        i12 = i25;
                        i11 = i12;
                        iMax = 0;
                        i31 = 0;
                    } else {
                        iMin = i26;
                        i11 = i25;
                        c12981t = c12981t6;
                        c12981t2 = c12981t5;
                        numValueOf3 = numValueOf4;
                        i12 = i28;
                        c17727gM566a = c17727g;
                    }
                    c12981t5 = c12981t2;
                    c17727g = c17727gM566a;
                    i16 = i12;
                    num = numValueOf5;
                    c12981t6 = c12981t;
                    i23 = i29;
                    i24 = iMin;
                    c2222aM567b = c2222aM567b2;
                    it = it;
                    c12982u3 = c12982u3;
                    i17 = iMax;
                    i18 = i31;
                    iM7854i = i11;
                    jM19491m2 = j11;
                }
                C12982u c12982u4 = c12982u3;
                int i34 = i24;
                C12981t c12981t7 = c12981t5;
                C12981t c12981t8 = c12981t6;
                if (c17727g != null) {
                    C17727G c17727g2 = c17727g;
                    arrayList.add(c17727g2.f56593a);
                    c12982u = c12982u4;
                    c12982u.m14697i(arrayList.size() - 1, c17727g2.f56594b);
                    int i35 = c12981t7.f41203b - 1;
                    boolean z6 = c17727g2.f56596d;
                    long j12 = c17727g2.f56595c;
                    if (z6) {
                        c12981t8.m14688e(i35, Math.max(c12981t8.m14686c(i35), (int) (j12 & 4294967295L)));
                        int i36 = c12981t7.f41203b;
                        if (i36 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        c12981t7.m14688e(i35, c12981t7.f41202a[i36 - 1] + 1);
                    } else {
                        c12981t8.m14684a((int) (j12 & 4294967295L));
                        int i37 = c12981t7.f41203b;
                        if (i37 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        c12981t7.m14684a(c12981t7.f41202a[i37 - 1] + 1);
                    }
                } else {
                    c12982u = c12982u4;
                }
                int size = arrayList.size();
                Object[] objArr = new AbstractC21069X[size];
                for (int i38 = 0; i38 < size; i38++) {
                    objArr[i38] = c12982u.m14694f(i38);
                }
                int i39 = c12981t7.f41203b;
                int[] iArr = new int[i39];
                for (int i40 = 0; i40 < i39; i40++) {
                    iArr[i40] = 0;
                }
                int i41 = c12981t7.f41203b;
                int[] iArr2 = new int[i41];
                for (int i42 = 0; i42 < i41; i42++) {
                    iArr2[i42] = 0;
                }
                int[] iArr3 = c12981t7.f41202a;
                int i43 = c12981t7.f41203b;
                int iMax2 = i34;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                while (i44 < i43) {
                    int i47 = iArr3[i44];
                    int iM14686c = c12981t8.m14686c(i44);
                    int iM7855j = C7536a.m7855j(jM9958a);
                    int iM7854i2 = C7536a.m7854i(jM9958a);
                    long j13 = jM9958a;
                    int i48 = i44;
                    int i49 = i43;
                    int i50 = iCeil;
                    int[] iArr4 = iArr3;
                    ArrayList arrayList2 = arrayList;
                    int i51 = iCeil;
                    AbstractC21069X[] abstractC21069XArr = objArr;
                    ArrayList arrayList3 = arrayList;
                    int i52 = i45;
                    C6546d c6546d2 = c6546d;
                    Object[] objArr2 = objArr;
                    int[] iArr5 = iArr2;
                    InterfaceC21058L interfaceC21058LM19489k = AbstractC17758g.m19489k(this, iMax2, iM7855j, iM7854i2, iM14686c, i50, interfaceC21059M, arrayList2, abstractC21069XArr, i52, i47, iArr, i48);
                    int width = interfaceC21058LM19489k.getWidth();
                    int height = interfaceC21058LM19489k.getHeight();
                    iArr5[i48] = height;
                    i46 += height;
                    iMax2 = Math.max(iMax2, width);
                    c6546d2.m7099c(interfaceC21058LM19489k);
                    i44 = i48 + 1;
                    c6546d = c6546d2;
                    iArr2 = iArr5;
                    i45 = i47;
                    i43 = i49;
                    c12981t8 = c12981t8;
                    iArr3 = iArr4;
                    iCeil = i51;
                    arrayList = arrayList3;
                    objArr = objArr2;
                    c17690x2 = c17690x2;
                    jM9958a = j13;
                }
                C6546d c6546d3 = c6546d;
                int i53 = iMax2;
                int[] iArr6 = iArr2;
                C17690x c17690x3 = c17690x2;
                if (c6546d3.m7108m()) {
                    i10 = 0;
                    i46 = 0;
                } else {
                    i10 = i53;
                }
                InterfaceC17766k interfaceC17766k = this.f56643b;
                int iM8921l = AbstractC8301I.m8921l(((c6546d3.f21184o0 - 1) * interfaceC21059M.mo7866k0(interfaceC17766k.mo455a())) + i46, C7536a.m7855j(jM19483e), C7536a.m7853h(jM19483e));
                interfaceC17766k.mo456b(iM8921l, interfaceC21059M, iArr6, iArr);
                return interfaceC21059M.mo19936R(AbstractC8301I.m8921l(i10, C7536a.m7856k(jM19483e), C7536a.m7854i(jM19483e)), iM8921l, c17690x3, new C17730J(0, c6546d3));
            }
        }
        return interfaceC21059M.mo19936R(0, 0, c17690x, C17776p.f56739p0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: d */
    public final int mo4653d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        List list2 = (List) AbstractC17680n.m19344T(1, list);
        InterfaceC21056J interfaceC21056J = list2 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list2) : null;
        List list3 = (List) AbstractC17680n.m19344T(2, list);
        this.f56649h.m19464b(interfaceC21056J, list3 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list3) : null, AbstractC9388w4.m9959b(0, i10, 7));
        List list4 = (List) AbstractC17680n.m19343S(list);
        if (list4 == null) {
            list4 = C17689w.f56480Y;
        }
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56644c);
        ?? r6 = this.f56650i;
        int size = list4.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iIntValue = ((Number) r6.invoke((InterfaceC21056J) list4.get(i11), Integer.valueOf(i11), Integer.valueOf(i10))).intValue() + iMo7866k0;
            int i14 = i11 + 1;
            if (i14 - i12 == this.f56647f || i14 == list4.size()) {
                iMax = Math.max(iMax, (i13 + iIntValue) - iMo7866k0);
                i12 = i11;
                i13 = 0;
            } else {
                i13 += iIntValue;
            }
            i11 = i14;
        }
        return iMax;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [Bm.o, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r8v4, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: e */
    public final int mo4654e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11;
        List list2 = (List) AbstractC17680n.m19344T(1, list);
        InterfaceC21056J interfaceC21056J = list2 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list2) : null;
        List list3 = (List) AbstractC17680n.m19344T(2, list);
        this.f56649h.m19464b(interfaceC21056J, list3 != null ? (InterfaceC21056J) AbstractC17680n.m19343S(list3) : null, AbstractC9388w4.m9959b(0, i10, 7));
        List list4 = (List) AbstractC17680n.m19343S(list);
        if (list4 == null) {
            list4 = C17689w.f56480Y;
        }
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56644c);
        int iMo7866k1 = interfaceC21095p.mo7866k0(this.f56646e);
        ?? r6 = this.f56652k;
        ?? r10 = this.f56651j;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = 0;
        }
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            iArr2[i13] = 0;
        }
        int size3 = list4.size();
        for (int i14 = 0; i14 < size3; i14++) {
            InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list4.get(i14);
            int iIntValue = ((Number) r6.invoke(interfaceC21056J2, Integer.valueOf(i14), Integer.valueOf(i10))).intValue();
            iArr[i14] = iIntValue;
            iArr2[i14] = ((Number) r10.invoke(interfaceC21056J2, Integer.valueOf(i14), Integer.valueOf(iIntValue))).intValue();
        }
        int i15 = this.f56647f;
        int i16 = this.f56648g;
        int i17 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i17 = i15 * i16;
        }
        int size4 = list4.size();
        C17734N c17734n = this.f56649h;
        int iMin = Math.min(i17 - (((i17 >= size4 || !((i11 = c17734n.f56619a) == 3 || i11 == 4)) && (i17 < list4.size() || i16 < c17734n.f56620b || c17734n.f56619a != 4)) ? 0 : 1), list4.size());
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            i18 += iArr[i19];
        }
        int size5 = ((list4.size() - 1) * iMo7866k0) + i18;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr2[0];
        C3507f it = new C3508g(1, size2 - 1, 1).iterator();
        int i21 = i20;
        while (it.f10596o0) {
            int i22 = iArr2[it.mo4199a()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i23 = iArr[0];
        C3507f it2 = new C3508g(1, size - 1, 1).iterator();
        while (it2.f10596o0) {
            int i24 = iArr[it2.mo4199a()];
            if (i23 < i24) {
                i23 = i24;
            }
        }
        int i25 = size5;
        int i26 = i23;
        while (i26 <= size5 && i21 != i10) {
            i25 = (i26 + size5) / 2;
            int i27 = i26;
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            long jM19461b = AbstractC17731K.m19461b(list4, new C17729I(iArr, 0), new C17729I(iArr2, 1), i25, iMo7866k0, iMo7866k1, i15, i16, c17734n);
            i21 = (int) (jM19461b >> 32);
            int i28 = (int) (jM19461b & 4294967295L);
            if (i21 <= i10 && i28 >= iMin) {
                if (i21 >= i10) {
                    break;
                }
                size5 = i25 - 1;
                i26 = i27;
            } else {
                i26 = i25 + 1;
                if (i26 > size5) {
                    return i26;
                }
            }
            iArr2 = iArr3;
            iArr = iArr4;
        }
        return i25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17737Q)) {
            return false;
        }
        C17737Q c17737q = (C17737Q) obj;
        c17737q.getClass();
        return this.f56642a.equals(c17737q.f56642a) && this.f56643b.equals(c17737q.f56643b) && C7540e.m7873a(this.f56644c, c17737q.f56644c) && AbstractC16544l.m18089b(this.f56645d, c17737q.f56645d) && C7540e.m7873a(this.f56646e, c17737q.f56646e) && this.f56647f == c17737q.f56647f && this.f56648g == c17737q.f56648g && AbstractC16544l.m18089b(this.f56649h, c17737q.f56649h);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: f */
    public final long mo19465f(int i10, int i11, int i12, boolean z6) {
        return AbstractC17777p0.m19505a(i10, i11, i12, z6);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: g */
    public final int mo19466g(AbstractC21069X abstractC21069X) {
        return abstractC21069X.mo21549L();
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: h */
    public final int mo19467h(AbstractC21069X abstractC21069X) {
        return abstractC21069X.mo21548K();
    }

    public final int hashCode() {
        return this.f56649h.hashCode() + ((((AbstractC12107L1.m13819j(this.f56646e, (this.f56645d.hashCode() + AbstractC12107L1.m13819j(this.f56644c, (this.f56643b.hashCode() + ((this.f56642a.hashCode() + 38161) * 31)) * 31, 31)) * 31, 31) + this.f56647f) * 31) + this.f56648g) * 31);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: i */
    public final void mo19468i(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        this.f56642a.mo457c(interfaceC21059M, i10, iArr, interfaceC21059M.getLayoutDirection(), iArr2);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: j */
    public final InterfaceC21058L mo19469j(AbstractC21069X[] abstractC21069XArr, InterfaceC21059M interfaceC21059M, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return interfaceC21059M.mo19936R(i11, i12, C17690x.f56481Y, new C17735O(iArr2, i13, i14, i15, abstractC21069XArr, this, i12, interfaceC21059M, i10, iArr));
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f56642a + ", verticalArrangement=" + this.f56643b + ", mainAxisSpacing=" + ((Object) C7540e.m7874b(this.f56644c)) + ", crossAxisAlignment=" + this.f56645d + ", crossAxisArrangementSpacing=" + ((Object) C7540e.m7874b(this.f56646e)) + ", maxItemsInMainAxis=" + this.f56647f + ", maxLines=" + this.f56648g + HpucjswO.KCfr + this.f56649h + ')';
    }
}

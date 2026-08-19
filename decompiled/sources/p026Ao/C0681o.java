package p026Ao;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p760g2.AbstractC13812i;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;
import p760g2.C13811h;
import p775h2.AbstractC14386p;
import p775h2.C14371a;
import p775h2.C14372b;
import p775h2.C14374d;
import p775h2.C14377g;
import p775h2.C14378h;
import p775h2.C14380j;
import p775h2.C14381k;
import p775h2.C14382l;
import p775h2.C14383m;
import p775h2.C14384n;
import p775h2.InterfaceC14373c;
import p775h2.InterfaceC14375e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: Ao.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C0681o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1982a;

    /* JADX INFO: renamed from: b */
    public boolean f1983b;

    /* JADX INFO: renamed from: c */
    public boolean f1984c;

    /* JADX INFO: renamed from: d */
    public final Object f1985d;

    /* JADX INFO: renamed from: e */
    public final Object f1986e;

    /* JADX INFO: renamed from: f */
    public final Serializable f1987f;

    /* JADX INFO: renamed from: g */
    public Object f1988g;

    /* JADX INFO: renamed from: h */
    public final Object f1989h;

    /* JADX INFO: renamed from: i */
    public final Object f1990i;

    public C0681o(C13808e c13808e) {
        this.f1982a = 1;
        this.f1983b = true;
        this.f1984c = true;
        this.f1987f = new ArrayList();
        new ArrayList();
        this.f1988g = null;
        this.f1989h = new C14372b();
        this.f1990i = new ArrayList();
        this.f1985d = c13808e;
        this.f1986e = c13808e;
    }

    /* JADX INFO: renamed from: a */
    public void m1454a(C14377g c14377g, int i10, ArrayList arrayList, C14383m c14383m) {
        AbstractC14386p abstractC14386p = c14377g.f45082d;
        if (abstractC14386p.f45106c == null) {
            C13808e c13808e = (C13808e) this.f1985d;
            if (abstractC14386p == c13808e.f43661d || abstractC14386p == c13808e.f43663e) {
                return;
            }
            if (c14383m == null) {
                c14383m = new C14383m();
                c14383m.f45094a = null;
                c14383m.f45095b = new ArrayList();
                c14383m.f45094a = abstractC14386p;
                arrayList.add(c14383m);
            }
            abstractC14386p.f45106c = c14383m;
            c14383m.f45095b.add(abstractC14386p);
            C14377g c14377g2 = abstractC14386p.f45111h;
            for (InterfaceC14375e interfaceC14375e : c14377g2.f45089k) {
                if (interfaceC14375e instanceof C14377g) {
                    m1454a((C14377g) interfaceC14375e, i10, arrayList, c14383m);
                }
            }
            C14377g c14377g3 = abstractC14386p.f45112i;
            for (InterfaceC14375e interfaceC14375e2 : c14377g3.f45089k) {
                if (interfaceC14375e2 instanceof C14377g) {
                    m1454a((C14377g) interfaceC14375e2, i10, arrayList, c14383m);
                }
            }
            if (i10 == 1 && (abstractC14386p instanceof C14384n)) {
                for (InterfaceC14375e interfaceC14375e3 : ((C14384n) abstractC14386p).f45096k.f45089k) {
                    if (interfaceC14375e3 instanceof C14377g) {
                        m1454a((C14377g) interfaceC14375e3, i10, arrayList, c14383m);
                    }
                }
            }
            Iterator it = c14377g2.f45090l.iterator();
            while (it.hasNext()) {
                m1454a((C14377g) it.next(), i10, arrayList, c14383m);
            }
            Iterator it2 = c14377g3.f45090l.iterator();
            while (it2.hasNext()) {
                m1454a((C14377g) it2.next(), i10, arrayList, c14383m);
            }
            if (i10 == 1 && (abstractC14386p instanceof C14384n)) {
                Iterator it3 = ((C14384n) abstractC14386p).f45096k.f45090l.iterator();
                while (it3.hasNext()) {
                    m1454a((C14377g) it3.next(), i10, arrayList, c14383m);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0239 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    /* JADX INFO: renamed from: b */
    public void m1455b(C13808e c13808e) {
        int iM15387r;
        int iM15383l;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        for (C13807d c13807d : c13808e.f43711r0) {
            int[] iArr = c13807d.f43688q0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            if (c13807d.f43670h0 == 8) {
                c13807d.f43655a = true;
            } else {
                float f11 = c13807d.f43695x;
                if (f11 < 1.0f && i15 == 3) {
                    c13807d.f43690s = 2;
                }
                float f12 = c13807d.f43629A;
                if (f12 < 1.0f && i16 == 3) {
                    c13807d.f43691t = 2;
                }
                if (c13807d.f43652X > 0.0f) {
                    if (i15 == 3 && (i16 == 2 || i16 == 1)) {
                        c13807d.f43690s = 3;
                    } else if (i16 == 3 && (i15 == 2 || i15 == 1)) {
                        c13807d.f43691t = 3;
                    } else if (i15 == 3 && i16 == 3) {
                        if (c13807d.f43690s == 0) {
                            c13807d.f43690s = 3;
                        }
                        if (c13807d.f43691t == 0) {
                            c13807d.f43691t = 3;
                        }
                    }
                }
                C13806c c13806c = c13807d.f43640L;
                C13806c c13806c2 = c13807d.f43638J;
                if (i15 == 3 && c13807d.f43690s == 1 && (c13806c2.f43625f == null || c13806c.f43625f == null)) {
                    i15 = 2;
                }
                C13806c c13806c3 = c13807d.f43641M;
                C13806c c13806c4 = c13807d.f43639K;
                int i17 = (i16 == 3 && c13807d.f43691t == 1 && (c13806c4.f43625f == null || c13806c3.f43625f == null)) ? 2 : i16;
                C14382l c14382l = c13807d.f43661d;
                c14382l.f45107d = i15;
                int i18 = c13807d.f43690s;
                c14382l.f45104a = i18;
                C14384n c14384n = c13807d.f43663e;
                c14384n.f45107d = i17;
                int i19 = c13807d.f43691t;
                c14384n.f45104a = i19;
                if ((i15 == 4 || i15 == 1 || i15 == 2) && (i17 == 4 || i17 == 1 || i17 == 2)) {
                    int iM15387r2 = c13807d.m15387r();
                    if (i15 == 4) {
                        iM15387r = (c13808e.m15387r() - c13806c2.f43626g) - c13806c.f43626g;
                        i15 = 1;
                    } else {
                        iM15387r = iM15387r2;
                    }
                    int iM15383l2 = c13807d.m15383l();
                    if (i17 == 4) {
                        iM15383l = (c13808e.m15383l() - c13806c4.f43626g) - c13806c3.f43626g;
                        i10 = 1;
                    } else {
                        iM15383l = iM15383l2;
                        i10 = i17;
                    }
                    m1459f(i15, iM15387r, i10, iM15383l, c13807d);
                    c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                    c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                    c13807d.f43655a = true;
                } else {
                    int[] iArr2 = c13808e.f43688q0;
                    C13806c[] c13806cArr = c13807d.f43646R;
                    if (i15 != 3 || (i17 != 2 && i17 != 1)) {
                        i11 = 3;
                        if (i17 == i11) {
                            if (i15 == 2 && i15 != 1) {
                                i13 = i11;
                                i12 = 1;
                                if (i15 != i13 && i17 == i13) {
                                    if (i18 == i12 || i19 == i12) {
                                        m1459f(2, 0, 2, 0, c13807d);
                                        c13807d.f43661d.f45108e.f45091m = c13807d.m15387r();
                                        c13807d.f43663e.f45108e.f45091m = c13807d.m15383l();
                                    } else if (i19 == 2 && i18 == 2 && iArr2[0] == 1 && iArr2[i12] == 1) {
                                        m1459f(1, (int) ((f11 * c13808e.m15387r()) + 0.5f), 1, (int) ((f12 * c13808e.m15383l()) + 0.5f), c13807d);
                                        c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                        c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                        c13807d.f43655a = true;
                                    }
                                }
                            } else if (i19 == i11) {
                                if (i15 == 2) {
                                    m1459f(2, 0, 2, 0, c13807d);
                                }
                                int iM15387r3 = c13807d.m15387r();
                                f10 = c13807d.f43652X;
                                if (c13807d.f43653Y == -1) {
                                    f10 = 1.0f / f10;
                                }
                                m1459f(1, iM15387r3, 1, (int) ((iM15387r3 * f10) + 0.5f), c13807d);
                                c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                c13807d.f43655a = true;
                            } else if (i19 == 1) {
                                m1459f(i15, 0, 2, 0, c13807d);
                                c13807d.f43663e.f45108e.f45091m = c13807d.m15383l();
                            } else if (i19 == 2) {
                                i14 = iArr2[1];
                                if (i14 != 1 || i14 == 4) {
                                    m1459f(i15, c13807d.m15387r(), 1, (int) ((f12 * c13808e.m15383l()) + 0.5f), c13807d);
                                    c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                    c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                    c13807d.f43655a = true;
                                }
                            } else if (c13806cArr[2].f43625f != null || c13806cArr[3].f43625f == null) {
                                m1459f(2, 0, i17, 0, c13807d);
                                c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                c13807d.f43655a = true;
                            }
                        }
                        i12 = 1;
                        i13 = 3;
                        if (i15 != i13) {
                        }
                    } else if (i18 == 3) {
                        if (i17 == 2) {
                            m1459f(2, 0, 2, 0, c13807d);
                        }
                        int iM15383l3 = c13807d.m15383l();
                        m1459f(1, (int) ((iM15383l3 * c13807d.f43652X) + 0.5f), 1, iM15383l3, c13807d);
                        c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                        c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                        c13807d.f43655a = true;
                    } else if (i18 == 1) {
                        m1459f(2, 0, i17, 0, c13807d);
                        c13807d.f43661d.f45108e.f45091m = c13807d.m15387r();
                    } else if (i18 == 2) {
                        int i20 = iArr2[0];
                        if (i20 == 1 || i20 == 4) {
                            m1459f(1, (int) ((f11 * c13808e.m15387r()) + 0.5f), i17, c13807d.m15383l(), c13807d);
                            c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                            c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                            c13807d.f43655a = true;
                        } else {
                            i11 = 3;
                            if (i17 == i11) {
                                if (i15 == 2) {
                                }
                                if (i19 == i11) {
                                    if (i15 == 2) {
                                        m1459f(2, 0, 2, 0, c13807d);
                                    }
                                    int iM15387r4 = c13807d.m15387r();
                                    f10 = c13807d.f43652X;
                                    if (c13807d.f43653Y == -1) {
                                        f10 = 1.0f / f10;
                                    }
                                    m1459f(1, iM15387r4, 1, (int) ((iM15387r4 * f10) + 0.5f), c13807d);
                                    c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                    c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                    c13807d.f43655a = true;
                                } else if (i19 == 1) {
                                    m1459f(i15, 0, 2, 0, c13807d);
                                    c13807d.f43663e.f45108e.f45091m = c13807d.m15383l();
                                } else if (i19 == 2) {
                                    i14 = iArr2[1];
                                    if (i14 != 1) {
                                    }
                                    m1459f(i15, c13807d.m15387r(), 1, (int) ((f12 * c13808e.m15383l()) + 0.5f), c13807d);
                                    c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                    c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                    c13807d.f43655a = true;
                                } else {
                                    if (c13806cArr[2].f43625f != null) {
                                    }
                                    m1459f(2, 0, i17, 0, c13807d);
                                    c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                    c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                    c13807d.f43655a = true;
                                }
                            }
                            i12 = 1;
                            i13 = 3;
                            if (i15 != i13) {
                            }
                        }
                    } else if (c13806cArr[0].f43625f == null || c13806cArr[1].f43625f == null) {
                        m1459f(2, 0, i17, 0, c13807d);
                        c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                        c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                        c13807d.f43655a = true;
                    } else {
                        i11 = 3;
                        if (i17 == i11) {
                            if (i15 == 2) {
                            }
                            if (i19 == i11) {
                                if (i15 == 2) {
                                    m1459f(2, 0, 2, 0, c13807d);
                                }
                                int iM15387r5 = c13807d.m15387r();
                                f10 = c13807d.f43652X;
                                if (c13807d.f43653Y == -1) {
                                    f10 = 1.0f / f10;
                                }
                                m1459f(1, iM15387r5, 1, (int) ((iM15387r5 * f10) + 0.5f), c13807d);
                                c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                c13807d.f43655a = true;
                            } else if (i19 == 1) {
                                m1459f(i15, 0, 2, 0, c13807d);
                                c13807d.f43663e.f45108e.f45091m = c13807d.m15383l();
                            } else if (i19 == 2) {
                                i14 = iArr2[1];
                                if (i14 != 1) {
                                }
                                m1459f(i15, c13807d.m15387r(), 1, (int) ((f12 * c13808e.m15383l()) + 0.5f), c13807d);
                                c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                c13807d.f43655a = true;
                            } else {
                                if (c13806cArr[2].f43625f != null) {
                                }
                                m1459f(2, 0, i17, 0, c13807d);
                                c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                                c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                                c13807d.f43655a = true;
                            }
                        }
                        i12 = 1;
                        i13 = 3;
                        if (i15 != i13) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1456c() {
        ArrayList<AbstractC14386p> arrayList = (ArrayList) this.f1987f;
        arrayList.clear();
        C13808e c13808e = (C13808e) this.f1986e;
        c13808e.f43661d.mo15817f();
        c13808e.f43663e.mo15817f();
        arrayList.add(c13808e.f43661d);
        arrayList.add(c13808e.f43663e);
        HashSet hashSet = null;
        for (C13807d c13807d : c13808e.f43711r0) {
            if (c13807d instanceof C13811h) {
                C14380j c14380j = new C14380j(c13807d);
                c13807d.f43661d.mo15817f();
                c13807d.f43663e.mo15817f();
                c14380j.f45109f = ((C13811h) c13807d).f43778v0;
                arrayList.add(c14380j);
            } else {
                if (c13807d.m15394y()) {
                    if (c13807d.f43657b == null) {
                        c13807d.f43657b = new C14374d(c13807d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c13807d.f43657b);
                } else {
                    arrayList.add(c13807d.f43661d);
                }
                if (c13807d.m15395z()) {
                    if (c13807d.f43659c == null) {
                        c13807d.f43659c = new C14374d(c13807d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c13807d.f43659c);
                } else {
                    arrayList.add(c13807d.f43663e);
                }
                if (c13807d instanceof AbstractC13812i) {
                    arrayList.add(new C14381k(c13807d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC14386p) it.next()).mo15817f();
        }
        for (AbstractC14386p abstractC14386p : arrayList) {
            if (abstractC14386p.f45105b != c13808e) {
                abstractC14386p.mo15815d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f1990i;
        arrayList2.clear();
        C13808e c13808e2 = (C13808e) this.f1985d;
        m1458e(c13808e2.f43661d, 0, arrayList2);
        m1458e(c13808e2.f43663e, 1, arrayList2);
        this.f1983b = false;
    }

    /* JADX INFO: renamed from: d */
    public int m1457d(C13808e c13808e, int i10) {
        ArrayList arrayList;
        int i11;
        int i12;
        long jMo15818j;
        float f10;
        long j10;
        ArrayList arrayList2 = (ArrayList) this.f1990i;
        int size = arrayList2.size();
        int i13 = 0;
        long jMax = 0;
        while (i13 < size) {
            AbstractC14386p abstractC14386p = ((C14383m) arrayList2.get(i13)).f45094a;
            if (!(abstractC14386p instanceof C14374d) ? !(i10 != 0 ? (abstractC14386p instanceof C14384n) : (abstractC14386p instanceof C14382l)) : ((C14374d) abstractC14386p).f45109f != i10) {
                C14377g c14377g = (i10 == 0 ? c13808e.f43661d : c13808e.f43663e).f45111h;
                C14377g c14377g2 = (i10 == 0 ? c13808e.f43661d : c13808e.f43663e).f45112i;
                boolean zContains = abstractC14386p.f45111h.f45090l.contains(c14377g);
                C14377g c14377g3 = abstractC14386p.f45112i;
                boolean zContains2 = c14377g3.f45090l.contains(c14377g2);
                long jMo15818j2 = abstractC14386p.mo15818j();
                C14377g c14377g4 = abstractC14386p.f45111h;
                if (zContains && zContains2) {
                    long jM15878b = C14383m.m15878b(c14377g4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long jM15877a = C14383m.m15877a(c14377g3, 0L);
                    long j11 = jM15878b - jMo15818j2;
                    int i14 = c14377g3.f45084f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j11 >= (-i14)) {
                        j11 += (long) i14;
                    }
                    long j12 = (-jM15877a) - jMo15818j2;
                    long j13 = c14377g4.f45084f;
                    long j14 = j12 - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    C13807d c13807d = abstractC14386p.f45105b;
                    if (i10 == 0) {
                        f10 = c13807d.f43664e0;
                    } else if (i10 == 1) {
                        f10 = c13807d.f43666f0;
                    } else {
                        c13807d.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j10 = (long) ((j11 / (1.0f - f10)) + (j14 / f10));
                    } else {
                        j10 = 0;
                    }
                    float f11 = j10;
                    jMo15818j = (((long) c14377g4.f45084f) + ((((long) ((f11 * f10) + 0.5f)) + jMo15818j2) + ((long) AbstractC12107L1.m13818i(1.0f, f10, f11, 0.5f)))) - ((long) c14377g3.f45084f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    if (zContains) {
                        jMo15818j = Math.max(C14383m.m15878b(c14377g4, c14377g4.f45084f), ((long) c14377g4.f45084f) + jMo15818j2);
                    } else if (zContains2) {
                        jMo15818j = Math.max(-C14383m.m15877a(c14377g3, c14377g3.f45084f), ((long) (-c14377g3.f45084f)) + jMo15818j2);
                    } else {
                        jMo15818j = (abstractC14386p.mo15818j() + ((long) c14377g4.f45084f)) - ((long) c14377g3.f45084f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                jMo15818j = 0;
            }
            jMax = Math.max(jMax, jMo15818j);
            i13 = i12 + 1;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: e */
    public void m1458e(AbstractC14386p abstractC14386p, int i10, ArrayList arrayList) {
        C14377g c14377g;
        Iterator it = abstractC14386p.f45111h.f45089k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c14377g = abstractC14386p.f45112i;
            if (!zHasNext) {
                break;
            }
            InterfaceC14375e interfaceC14375e = (InterfaceC14375e) it.next();
            if (interfaceC14375e instanceof C14377g) {
                m1454a((C14377g) interfaceC14375e, i10, arrayList, null);
            } else if (interfaceC14375e instanceof AbstractC14386p) {
                m1454a(((AbstractC14386p) interfaceC14375e).f45111h, i10, arrayList, null);
            }
        }
        for (InterfaceC14375e interfaceC14375e2 : c14377g.f45089k) {
            if (interfaceC14375e2 instanceof C14377g) {
                m1454a((C14377g) interfaceC14375e2, i10, arrayList, null);
            } else if (interfaceC14375e2 instanceof AbstractC14386p) {
                m1454a(((AbstractC14386p) interfaceC14375e2).f45112i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC14375e interfaceC14375e3 : ((C14384n) abstractC14386p).f45096k.f45089k) {
                if (interfaceC14375e3 instanceof C14377g) {
                    m1454a((C14377g) interfaceC14375e3, i10, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1459f(int i10, int i11, int i12, int i13, C13807d c13807d) {
        C14372b c14372b = (C14372b) this.f1989h;
        c14372b.f45067a = i10;
        c14372b.f45068b = i12;
        c14372b.f45069c = i11;
        c14372b.f45070d = i13;
        ((InterfaceC14373c) this.f1988g).mo10946b(c13807d, c14372b);
        c13807d.m15371R(c14372b.f45071e);
        c13807d.m15366M(c14372b.f45072f);
        c13807d.f43634F = c14372b.f45074h;
        c13807d.m15363J(c14372b.f45073g);
    }

    /* JADX INFO: renamed from: g */
    public void m1460g() {
        C14371a c14371a;
        for (C13807d c13807d : ((C13808e) this.f1985d).f43711r0) {
            if (!c13807d.f43655a) {
                int[] iArr = c13807d.f43688q0;
                boolean z6 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = c13807d.f43690s;
                int i13 = c13807d.f43691t;
                boolean z10 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z6 = true;
                }
                C14378h c14378h = c13807d.f43661d.f45108e;
                boolean z11 = c14378h.f45088j;
                C14378h c14378h2 = c13807d.f43663e.f45108e;
                boolean z12 = c14378h2.f45088j;
                if (z11 && z12) {
                    m1459f(1, c14378h.f45085g, 1, c14378h2.f45085g, c13807d);
                    c13807d.f43655a = true;
                } else if (z11 && z6) {
                    m1459f(1, c14378h.f45085g, 2, c14378h2.f45085g, c13807d);
                    if (i11 == 3) {
                        c13807d.f43663e.f45108e.f45091m = c13807d.m15383l();
                    } else {
                        c13807d.f43663e.f45108e.mo15863d(c13807d.m15383l());
                        c13807d.f43655a = true;
                    }
                } else if (z12 && z10) {
                    m1459f(2, c14378h.f45085g, 1, c14378h2.f45085g, c13807d);
                    if (i10 == 3) {
                        c13807d.f43661d.f45108e.f45091m = c13807d.m15387r();
                    } else {
                        c13807d.f43661d.f45108e.mo15863d(c13807d.m15387r());
                        c13807d.f43655a = true;
                    }
                }
                if (c13807d.f43655a && (c14371a = c13807d.f43663e.f45097l) != null) {
                    c14371a.mo15863d(c13807d.f43658b0);
                }
            }
        }
    }

    public String toString() {
        switch (this.f1982a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (this.f1983b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f1984c) {
                    arrayList.add("isDirectory");
                }
                Long l4 = (Long) this.f1986e;
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4);
                }
                Long l10 = (Long) this.f1987f;
                if (l10 != null) {
                    arrayList.add("createdAt=" + l10);
                }
                Long l11 = (Long) this.f1988g;
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                Long l12 = (Long) this.f1989h;
                if (l12 != null) {
                    arrayList.add("lastAccessedAt=" + l12);
                }
                Map map = (Map) this.f1990i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC17680n.m19349Y(arrayList, ", ", "FileMetadata(", Separators.RPAREN, 0, null, null, 56);
            default:
                return super.toString();
        }
    }

    public C0681o(boolean z6, boolean z10, C0654C c0654c, Long l4, Long l10, Long l11, Long l12, Map extras) {
        this.f1982a = 0;
        AbstractC16544l.m18094g(extras, "extras");
        this.f1983b = z6;
        this.f1984c = z10;
        this.f1985d = c0654c;
        this.f1986e = l4;
        this.f1987f = l10;
        this.f1988g = l11;
        this.f1989h = l12;
        this.f1990i = AbstractC17659D.m19254p(extras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0681o(boolean z6, boolean z10, C0654C c0654c, Long l4, Long l10, Long l11, Long l12) {
        this(z6, z10, c0654c, l4, l10, l11, l12, C17690x.f56481Y);
        this.f1982a = 0;
    }
}

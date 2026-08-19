package p084D4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import mo.C17342i;
import p004A2.C0312c;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p232J3.C4227a0;
import p477Tb.C7296c;
import p658b5.C11242m;
import p880m.AbstractC17123a;
import p960q9.C18655i;
import p999s.AbstractC19357i0;
import p999s.C19372q;

/* JADX INFO: renamed from: D4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1904b {

    /* JADX INFO: renamed from: a */
    public int f5565a;

    /* JADX INFO: renamed from: b */
    public final Object f5566b;

    /* JADX INFO: renamed from: c */
    public final Object f5567c;

    /* JADX INFO: renamed from: d */
    public Object f5568d;

    /* JADX INFO: renamed from: e */
    public Object f5569e;

    /* JADX INFO: renamed from: f */
    public Object f5570f;

    public C1904b(View view) {
        this.f5565a = -1;
        this.f5566b = view;
        this.f5567c = C19372q.m20473a();
    }

    /* JADX INFO: renamed from: a */
    public void m2993a() {
        View view = (View) this.f5566b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C17342i) this.f5568d) != null) {
                if (((C17342i) this.f5570f) == null) {
                    this.f5570f = new C17342i();
                }
                C17342i c17342i = (C17342i) this.f5570f;
                c17342i.f55254c = null;
                c17342i.f55253b = false;
                c17342i.f55255d = null;
                c17342i.f55252a = false;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                ColorStateList colorStateListM1546c = AbstractC0730K.m1546c(view);
                if (colorStateListM1546c != null) {
                    c17342i.f55253b = true;
                    c17342i.f55254c = colorStateListM1546c;
                }
                PorterDuff.Mode modeM1547d = AbstractC0730K.m1547d(view);
                if (modeM1547d != null) {
                    c17342i.f55252a = true;
                    c17342i.f55255d = modeM1547d;
                }
                if (c17342i.f55253b || c17342i.f55252a) {
                    C19372q.m20476e(background, c17342i, view.getDrawableState());
                    return;
                }
            }
            C17342i c17342i2 = (C17342i) this.f5569e;
            if (c17342i2 != null) {
                C19372q.m20476e(background, c17342i2, view.getDrawableState());
                return;
            }
            C17342i c17342i3 = (C17342i) this.f5568d;
            if (c17342i3 != null) {
                C19372q.m20476e(background, c17342i3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m2994b(int i10) {
        ArrayList arrayList = (ArrayList) this.f5568d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1902a c1902a = (C1902a) arrayList.get(i11);
            int i12 = c1902a.f5561a;
            if (i12 == 8) {
                if (m2999g(c1902a.f5564d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = c1902a.f5562b;
                int i14 = c1902a.f5564d + i13;
                while (i13 < i14) {
                    if (m2999g(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m2995c() {
        ArrayList arrayList = (ArrayList) this.f5568d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C7296c) this.f5569e).m7761t((C1902a) arrayList.get(i10));
        }
        m3009q(arrayList);
        this.f5565a = 0;
    }

    /* JADX INFO: renamed from: d */
    public void m2996d() {
        m2995c();
        ArrayList arrayList = (ArrayList) this.f5567c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1902a c1902a = (C1902a) arrayList.get(i10);
            int i11 = c1902a.f5561a;
            C7296c c7296c = (C7296c) this.f5569e;
            if (i11 == 1) {
                c7296c.m7761t(c1902a);
                c7296c.m7751C(c1902a.f5562b, c1902a.f5564d);
            } else if (i11 == 2) {
                c7296c.m7761t(c1902a);
                int i12 = c1902a.f5562b;
                int i13 = c1902a.f5564d;
                RecyclerView recyclerView = (RecyclerView) c7296c.f23104Z;
                recyclerView.m12269S(i12, i13, true);
                recyclerView.f33653u1 = true;
                recyclerView.f33647r1.f5638c += i13;
            } else if (i11 == 4) {
                c7296c.m7761t(c1902a);
                c7296c.m7750B(c1902a.f5562b, c1902a.f5563c, c1902a.f5564d);
            } else if (i11 == 8) {
                c7296c.m7761t(c1902a);
                c7296c.m7752D(c1902a.f5562b, c1902a.f5564d);
            }
        }
        m3009q(arrayList);
        this.f5565a = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m2997e(C1902a c1902a) {
        int i10;
        C0312c c0312c;
        int i11 = c1902a.f5561a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM3013u = m3013u(c1902a.f5562b, i11);
        int i12 = c1902a.f5562b;
        int i13 = c1902a.f5561a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1902a);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = c1902a.f5564d;
            c0312c = (C0312c) this.f5566b;
            if (i14 >= i16) {
                break;
            }
            int iM3013u2 = m3013u((i10 * i14) + c1902a.f5562b, c1902a.f5561a);
            int i17 = c1902a.f5561a;
            if (i17 == 2 ? iM3013u2 != iM3013u : !(i17 == 4 && iM3013u2 == iM3013u + 1)) {
                C1902a c1902aM3004l = m3004l(c1902a.f5563c, i17, iM3013u, i15);
                m2998f(c1902aM3004l, i12);
                c1902aM3004l.f5563c = null;
                c0312c.mo914c(c1902aM3004l);
                if (c1902a.f5561a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iM3013u = iM3013u2;
            } else {
                i15++;
            }
            i14++;
        }
        Object obj = c1902a.f5563c;
        c1902a.f5563c = null;
        c0312c.mo914c(c1902a);
        if (i15 > 0) {
            C1902a c1902aM3004l2 = m3004l(obj, c1902a.f5561a, iM3013u, i15);
            m2998f(c1902aM3004l2, i12);
            c1902aM3004l2.f5563c = null;
            c0312c.mo914c(c1902aM3004l2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2998f(C1902a c1902a, int i10) {
        C7296c c7296c = (C7296c) this.f5569e;
        c7296c.m7761t(c1902a);
        int i11 = c1902a.f5561a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c7296c.m7750B(i10, c1902a.f5563c, c1902a.f5564d);
            return;
        }
        int i12 = c1902a.f5564d;
        RecyclerView recyclerView = (RecyclerView) c7296c.f23104Z;
        recyclerView.m12269S(i10, i12, true);
        recyclerView.f33653u1 = true;
        recyclerView.f33647r1.f5638c += i12;
    }

    /* JADX INFO: renamed from: g */
    public int m2999g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f5568d;
        int size = arrayList.size();
        while (i11 < size) {
            C1902a c1902a = (C1902a) arrayList.get(i11);
            int i12 = c1902a.f5561a;
            if (i12 == 8) {
                int i13 = c1902a.f5562b;
                if (i13 == i10) {
                    i10 = c1902a.f5564d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c1902a.f5564d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c1902a.f5562b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c1902a.f5564d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c1902a.f5564d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m3000h() {
        C17342i c17342i = (C17342i) this.f5569e;
        if (c17342i != null) {
            return (ColorStateList) c17342i.f55254c;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode m3001i() {
        C17342i c17342i = (C17342i) this.f5569e;
        if (c17342i != null) {
            return (PorterDuff.Mode) c17342i.f55255d;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3002j() {
        return ((ArrayList) this.f5567c).size() > 0;
    }

    /* JADX INFO: renamed from: k */
    public void m3003k(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListM20386i;
        View view = (View) this.f5566b;
        Context context = view.getContext();
        int[] iArr = AbstractC17123a.f54756y;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        View view2 = (View) this.f5566b;
        AbstractC0738T.m1583k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f5565a = typedArray.getResourceId(0, -1);
                C19372q c19372q = (C19372q) this.f5567c;
                Context context2 = view.getContext();
                int i11 = this.f5565a;
                synchronized (c19372q) {
                    colorStateListM20386i = c19372q.f61354a.m20386i(context2, i11);
                }
                if (colorStateListM20386i != null) {
                    m3010r(colorStateListM20386i);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0730K.m1552i(view, c11242mM12599G.m12600A(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0730K.m1553j(view, AbstractC19357i0.m20463b(typedArray.getInt(2, -1), null));
            }
            c11242mM12599G.m12606H();
        } catch (Throwable th2) {
            c11242mM12599G.m12606H();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public C1902a m3004l(Object obj, int i10, int i11, int i12) {
        C1902a c1902a = (C1902a) ((C0312c) this.f5566b).mo912a();
        if (c1902a != null) {
            c1902a.f5561a = i10;
            c1902a.f5562b = i11;
            c1902a.f5564d = i12;
            c1902a.f5563c = obj;
            return c1902a;
        }
        C1902a c1902a2 = new C1902a();
        c1902a2.f5561a = i10;
        c1902a2.f5562b = i11;
        c1902a2.f5564d = i12;
        c1902a2.f5563c = obj;
        return c1902a2;
    }

    /* JADX INFO: renamed from: m */
    public void m3005m() {
        this.f5565a = -1;
        m3010r(null);
        m2993a();
    }

    /* JADX INFO: renamed from: n */
    public void m3006n(int i10) {
        ColorStateList colorStateListM20386i;
        this.f5565a = i10;
        C19372q c19372q = (C19372q) this.f5567c;
        if (c19372q != null) {
            Context context = ((View) this.f5566b).getContext();
            synchronized (c19372q) {
                colorStateListM20386i = c19372q.f61354a.m20386i(context, i10);
            }
        } else {
            colorStateListM20386i = null;
        }
        m3010r(colorStateListM20386i);
        m2993a();
    }

    /* JADX INFO: renamed from: o */
    public void m3007o(C1902a c1902a) {
        ((ArrayList) this.f5568d).add(c1902a);
        int i10 = c1902a.f5561a;
        C7296c c7296c = (C7296c) this.f5569e;
        if (i10 == 1) {
            c7296c.m7751C(c1902a.f5562b, c1902a.f5564d);
            return;
        }
        if (i10 == 2) {
            int i11 = c1902a.f5562b;
            int i12 = c1902a.f5564d;
            RecyclerView recyclerView = (RecyclerView) c7296c.f23104Z;
            recyclerView.m12269S(i11, i12, false);
            recyclerView.f33653u1 = true;
            return;
        }
        if (i10 == 4) {
            c7296c.m7750B(c1902a.f5562b, c1902a.f5563c, c1902a.f5564d);
        } else if (i10 == 8) {
            c7296c.m7752D(c1902a.f5562b, c1902a.f5564d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1902a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:184:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:79:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    /* JADX INFO: renamed from: p */
    public void m3008p() {
        byte b;
        int i10;
        boolean z6;
        byte b10;
        C1902a c1902aM3004l;
        int i11;
        int i12;
        int i13;
        C1902a c1902aM3004l2;
        boolean z10;
        boolean z11;
        C1902a c1902aM3004l3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ArrayList arrayList = (ArrayList) this.f5567c;
        C18655i c18655i = (C18655i) this.f5570f;
        c18655i.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                b = -1;
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1902a) arrayList.get(size)).f5561a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i22 = size + 1;
            C1902a c1902a = (C1902a) arrayList.get(size);
            C1902a c1902a2 = (C1902a) arrayList.get(i22);
            int i23 = c1902a2.f5561a;
            if (i23 != 1) {
                C1904b c1904b = (C1904b) c18655i.f59414Z;
                if (i23 == 2) {
                    int i24 = c1902a.f5562b;
                    int i25 = c1902a.f5564d;
                    if (i24 < i25) {
                        z11 = c1902a2.f5562b == i24 && c1902a2.f5564d == i25 - i24;
                        z10 = false;
                    } else if (c1902a2.f5562b == i25 + 1 && c1902a2.f5564d == i24 - i25) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    int i26 = c1902a2.f5562b;
                    if (i25 < i26) {
                        c1902a2.f5562b = i26 - 1;
                    } else {
                        int i27 = c1902a2.f5564d;
                        if (i25 < i26 + i27) {
                            c1902a2.f5564d = i27 - 1;
                            c1902a.f5561a = 2;
                            c1902a.f5564d = 1;
                            if (c1902a2.f5564d == 0) {
                                arrayList.remove(i22);
                                c1904b.getClass();
                                c1902a2.f5563c = null;
                                ((C0312c) c1904b.f5566b).mo914c(c1902a2);
                            }
                        }
                    }
                    int i28 = c1902a.f5562b;
                    int i29 = c1902a2.f5562b;
                    if (i28 <= i29) {
                        c1902a2.f5562b = i29 + 1;
                    } else {
                        int i30 = i29 + c1902a2.f5564d;
                        if (i28 < i30) {
                            c1902aM3004l3 = c1904b.m3004l(null, 2, i28 + 1, i30 - i28);
                            c1902a2.f5564d = c1902a.f5562b - c1902a2.f5562b;
                        }
                        if (z11) {
                            arrayList.set(size, c1902a2);
                            arrayList.remove(i22);
                            c1904b.getClass();
                            c1902a.f5563c = null;
                            ((C0312c) c1904b.f5566b).mo914c(c1902a);
                        } else {
                            if (z10) {
                                if (c1902aM3004l3 != null) {
                                    i20 = c1902a.f5562b;
                                    if (i20 > c1902aM3004l3.f5562b) {
                                        c1902a.f5562b = i20 - c1902aM3004l3.f5564d;
                                    }
                                    i21 = c1902a.f5564d;
                                    if (i21 > c1902aM3004l3.f5562b) {
                                        c1902a.f5564d = i21 - c1902aM3004l3.f5564d;
                                    }
                                }
                                i18 = c1902a.f5562b;
                                if (i18 > c1902a2.f5562b) {
                                    c1902a.f5562b = i18 - c1902a2.f5564d;
                                }
                                i19 = c1902a.f5564d;
                                if (i19 > c1902a2.f5562b) {
                                    c1902a.f5564d = i19 - c1902a2.f5564d;
                                }
                            } else {
                                if (c1902aM3004l3 != null) {
                                    i16 = c1902a.f5562b;
                                    if (i16 >= c1902aM3004l3.f5562b) {
                                        c1902a.f5562b = i16 - c1902aM3004l3.f5564d;
                                    }
                                    i17 = c1902a.f5564d;
                                    if (i17 >= c1902aM3004l3.f5562b) {
                                        c1902a.f5564d = i17 - c1902aM3004l3.f5564d;
                                    }
                                }
                                i14 = c1902a.f5562b;
                                if (i14 >= c1902a2.f5562b) {
                                    c1902a.f5562b = i14 - c1902a2.f5564d;
                                }
                                i15 = c1902a.f5564d;
                                if (i15 >= c1902a2.f5562b) {
                                    c1902a.f5564d = i15 - c1902a2.f5564d;
                                }
                            }
                            arrayList.set(size, c1902a2);
                            if (c1902a.f5562b != c1902a.f5564d) {
                                arrayList.set(i22, c1902a);
                            } else {
                                arrayList.remove(i22);
                            }
                            if (c1902aM3004l3 != null) {
                                arrayList.add(size, c1902aM3004l3);
                            }
                        }
                    }
                    c1902aM3004l3 = null;
                    if (z11) {
                        arrayList.set(size, c1902a2);
                        arrayList.remove(i22);
                        c1904b.getClass();
                        c1902a.f5563c = null;
                        ((C0312c) c1904b.f5566b).mo914c(c1902a);
                    } else {
                        if (z10) {
                            if (c1902aM3004l3 != null) {
                                i20 = c1902a.f5562b;
                                if (i20 > c1902aM3004l3.f5562b) {
                                    c1902a.f5562b = i20 - c1902aM3004l3.f5564d;
                                }
                                i21 = c1902a.f5564d;
                                if (i21 > c1902aM3004l3.f5562b) {
                                    c1902a.f5564d = i21 - c1902aM3004l3.f5564d;
                                }
                            }
                            i18 = c1902a.f5562b;
                            if (i18 > c1902a2.f5562b) {
                                c1902a.f5562b = i18 - c1902a2.f5564d;
                            }
                            i19 = c1902a.f5564d;
                            if (i19 > c1902a2.f5562b) {
                                c1902a.f5564d = i19 - c1902a2.f5564d;
                            }
                        } else {
                            if (c1902aM3004l3 != null) {
                                i16 = c1902a.f5562b;
                                if (i16 >= c1902aM3004l3.f5562b) {
                                    c1902a.f5562b = i16 - c1902aM3004l3.f5564d;
                                }
                                i17 = c1902a.f5564d;
                                if (i17 >= c1902aM3004l3.f5562b) {
                                    c1902a.f5564d = i17 - c1902aM3004l3.f5564d;
                                }
                            }
                            i14 = c1902a.f5562b;
                            if (i14 >= c1902a2.f5562b) {
                                c1902a.f5562b = i14 - c1902a2.f5564d;
                            }
                            i15 = c1902a.f5564d;
                            if (i15 >= c1902a2.f5562b) {
                                c1902a.f5564d = i15 - c1902a2.f5564d;
                            }
                        }
                        arrayList.set(size, c1902a2);
                        if (c1902a.f5562b != c1902a.f5564d) {
                            arrayList.set(i22, c1902a);
                        } else {
                            arrayList.remove(i22);
                        }
                        if (c1902aM3004l3 != null) {
                            arrayList.add(size, c1902aM3004l3);
                        }
                    }
                } else if (i23 == 4) {
                    int i31 = c1902a.f5564d;
                    int i32 = c1902a2.f5562b;
                    if (i31 < i32) {
                        c1902a2.f5562b = i32 - 1;
                    } else {
                        int i33 = c1902a2.f5564d;
                        if (i31 < i32 + i33) {
                            c1902a2.f5564d = i33 - 1;
                            c1902aM3004l = c1904b.m3004l(c1902a2.f5563c, 4, c1902a.f5562b, 1);
                        }
                        i11 = c1902a.f5562b;
                        i12 = c1902a2.f5562b;
                        if (i11 <= i12) {
                            c1902a2.f5562b = i12 + 1;
                        } else {
                            i13 = i12 + c1902a2.f5564d;
                            if (i11 < i13) {
                                int i34 = i13 - i11;
                                c1902aM3004l2 = c1904b.m3004l(c1902a2.f5563c, 4, i11 + 1, i34);
                                c1902a2.f5564d -= i34;
                            }
                            arrayList.set(i22, c1902a);
                            if (c1902a2.f5564d > 0) {
                                arrayList.set(size, c1902a2);
                            } else {
                                arrayList.remove(size);
                                c1904b.getClass();
                                c1902a2.f5563c = null;
                                ((C0312c) c1904b.f5566b).mo914c(c1902a2);
                            }
                            if (c1902aM3004l != null) {
                                arrayList.add(size, c1902aM3004l);
                            }
                            if (c1902aM3004l2 != null) {
                                arrayList.add(size, c1902aM3004l2);
                            }
                        }
                        c1902aM3004l2 = null;
                        arrayList.set(i22, c1902a);
                        if (c1902a2.f5564d > 0) {
                            arrayList.set(size, c1902a2);
                        } else {
                            arrayList.remove(size);
                            c1904b.getClass();
                            c1902a2.f5563c = null;
                            ((C0312c) c1904b.f5566b).mo914c(c1902a2);
                        }
                        if (c1902aM3004l != null) {
                            arrayList.add(size, c1902aM3004l);
                        }
                        if (c1902aM3004l2 != null) {
                            arrayList.add(size, c1902aM3004l2);
                        }
                    }
                    c1902aM3004l = null;
                    i11 = c1902a.f5562b;
                    i12 = c1902a2.f5562b;
                    if (i11 <= i12) {
                        c1902a2.f5562b = i12 + 1;
                    } else {
                        i13 = i12 + c1902a2.f5564d;
                        if (i11 < i13) {
                            int i35 = i13 - i11;
                            c1902aM3004l2 = c1904b.m3004l(c1902a2.f5563c, 4, i11 + 1, i35);
                            c1902a2.f5564d -= i35;
                        }
                        arrayList.set(i22, c1902a);
                        if (c1902a2.f5564d > 0) {
                            arrayList.set(size, c1902a2);
                        } else {
                            arrayList.remove(size);
                            c1904b.getClass();
                            c1902a2.f5563c = null;
                            ((C0312c) c1904b.f5566b).mo914c(c1902a2);
                        }
                        if (c1902aM3004l != null) {
                            arrayList.add(size, c1902aM3004l);
                        }
                        if (c1902aM3004l2 != null) {
                            arrayList.add(size, c1902aM3004l2);
                        }
                    }
                    c1902aM3004l2 = null;
                    arrayList.set(i22, c1902a);
                    if (c1902a2.f5564d > 0) {
                        arrayList.set(size, c1902a2);
                    } else {
                        arrayList.remove(size);
                        c1904b.getClass();
                        c1902a2.f5563c = null;
                        ((C0312c) c1904b.f5566b).mo914c(c1902a2);
                    }
                    if (c1902aM3004l != null) {
                        arrayList.add(size, c1902aM3004l);
                    }
                    if (c1902aM3004l2 != null) {
                        arrayList.add(size, c1902aM3004l2);
                    }
                }
            } else {
                int i36 = c1902a.f5564d;
                int i37 = c1902a2.f5562b;
                int i38 = i36 < i37 ? -1 : 0;
                int i39 = c1902a.f5562b;
                if (i39 < i37) {
                    i38++;
                }
                if (i37 <= i39) {
                    c1902a.f5562b = i39 + c1902a2.f5564d;
                }
                int i40 = c1902a2.f5562b;
                if (i40 <= i36) {
                    c1902a.f5564d = i36 + c1902a2.f5564d;
                }
                c1902a2.f5562b = i40 + i38;
                arrayList.set(size, c1902a2);
                arrayList.set(i22, c1902a);
            }
        }
        int size2 = arrayList.size();
        int i41 = 0;
        while (i41 < size2) {
            C1902a c1902aM3004l4 = (C1902a) arrayList.get(i41);
            int i42 = c1902aM3004l4.f5561a;
            if (i42 != 1) {
                C0312c c0312c = (C0312c) this.f5566b;
                C7296c c7296c = (C7296c) this.f5569e;
                if (i42 == 2) {
                    int i43 = c1902aM3004l4.f5562b;
                    int i44 = c1902aM3004l4.f5564d + i43;
                    int i45 = i43;
                    int i46 = 0;
                    byte b11 = -1;
                    while (i45 < i44) {
                        if (c7296c.m7762v(i45) != null || m2994b(i45)) {
                            if (b11 == 0) {
                                m2997e(m3004l(null, 2, i43, i46));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b10 = 1;
                        } else {
                            if (b11 == 1) {
                                m3007o(m3004l(null, 2, i43, i46));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b10 = 0;
                        }
                        if (z6) {
                            i45 -= i46;
                            i44 -= i46;
                            i46 = 1;
                        } else {
                            i46++;
                        }
                        i45++;
                        b11 = b10;
                    }
                    if (i46 != c1902aM3004l4.f5564d) {
                        c1902aM3004l4.f5563c = null;
                        c0312c.mo914c(c1902aM3004l4);
                        c1902aM3004l4 = m3004l(null, 2, i43, i46);
                    }
                    if (b11 == 0) {
                        m2997e(c1902aM3004l4);
                    } else {
                        m3007o(c1902aM3004l4);
                    }
                } else if (i42 == 4) {
                    int i47 = c1902aM3004l4.f5562b;
                    int i48 = c1902aM3004l4.f5564d + i47;
                    byte b12 = b;
                    int i49 = i47;
                    int i50 = 0;
                    while (i47 < i48) {
                        if (c7296c.m7762v(i47) != null || m2994b(i47)) {
                            if (b12 == 0) {
                                m2997e(m3004l(c1902aM3004l4.f5563c, 4, i49, i50));
                                i49 = i47;
                                i50 = 0;
                            }
                            b12 = 1;
                        } else {
                            if (b12 == 1) {
                                m3007o(m3004l(c1902aM3004l4.f5563c, 4, i49, i50));
                                i49 = i47;
                                i50 = 0;
                            }
                            b12 = 0;
                        }
                        i50++;
                        i47++;
                    }
                    if (i50 != c1902aM3004l4.f5564d) {
                        Object obj = c1902aM3004l4.f5563c;
                        c1902aM3004l4.f5563c = null;
                        c0312c.mo914c(c1902aM3004l4);
                        c1902aM3004l4 = m3004l(obj, 4, i49, i50);
                    }
                    if (b12 == 0) {
                        m2997e(c1902aM3004l4);
                    } else {
                        m3007o(c1902aM3004l4);
                    }
                } else if (i42 == i10) {
                    m3007o(c1902aM3004l4);
                }
            } else {
                m3007o(c1902aM3004l4);
            }
            i41++;
            b = -1;
            i10 = 8;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: q */
    public void m3009q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1902a c1902a = (C1902a) arrayList.get(i10);
            c1902a.f5563c = null;
            ((C0312c) this.f5566b).mo914c(c1902a);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: r */
    public void m3010r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C17342i) this.f5568d) == null) {
                this.f5568d = new C17342i();
            }
            C17342i c17342i = (C17342i) this.f5568d;
            c17342i.f55254c = colorStateList;
            c17342i.f55253b = true;
        } else {
            this.f5568d = null;
        }
        m2993a();
    }

    /* JADX INFO: renamed from: s */
    public void m3011s(ColorStateList colorStateList) {
        if (((C17342i) this.f5569e) == null) {
            this.f5569e = new C17342i();
        }
        C17342i c17342i = (C17342i) this.f5569e;
        c17342i.f55254c = colorStateList;
        c17342i.f55253b = true;
        m2993a();
    }

    /* JADX INFO: renamed from: t */
    public void m3012t(PorterDuff.Mode mode) {
        if (((C17342i) this.f5569e) == null) {
            this.f5569e = new C17342i();
        }
        C17342i c17342i = (C17342i) this.f5569e;
        c17342i.f55255d = mode;
        c17342i.f55252a = true;
        m2993a();
    }

    /* JADX INFO: renamed from: u */
    public int m3013u(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = (ArrayList) this.f5568d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1902a c1902a = (C1902a) arrayList.get(size);
            int i14 = c1902a.f5561a;
            if (i14 == 8) {
                int i15 = c1902a.f5562b;
                int i16 = c1902a.f5564d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c1902a.f5562b = i15 + 1;
                            c1902a.f5564d = i16 + 1;
                        } else if (i11 == 2) {
                            c1902a.f5562b = i15 - 1;
                            c1902a.f5564d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c1902a.f5564d = i16 + 1;
                    } else if (i11 == 2) {
                        c1902a.f5564d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c1902a.f5562b = i15 + 1;
                    } else if (i11 == 2) {
                        c1902a.f5562b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c1902a.f5562b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c1902a.f5564d;
                    } else if (i14 == 2) {
                        i10 += c1902a.f5564d;
                    }
                } else if (i11 == 1) {
                    c1902a.f5562b = i17 + 1;
                } else if (i11 == 2) {
                    c1902a.f5562b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1902a c1902a2 = (C1902a) arrayList.get(size2);
            int i18 = c1902a2.f5561a;
            C0312c c0312c = (C0312c) this.f5566b;
            if (i18 == 8) {
                int i19 = c1902a2.f5564d;
                if (i19 == c1902a2.f5562b || i19 < 0) {
                    arrayList.remove(size2);
                    c1902a2.f5563c = null;
                    c0312c.mo914c(c1902a2);
                }
            } else if (c1902a2.f5564d <= 0) {
                arrayList.remove(size2);
                c1902a2.f5563c = null;
                c0312c.mo914c(c1902a2);
            }
        }
        return i10;
    }

    public C1904b(C7296c c7296c) {
        this.f5566b = new C0312c(30);
        this.f5567c = new ArrayList();
        this.f5568d = new ArrayList();
        this.f5565a = 0;
        this.f5569e = c7296c;
        this.f5570f = new C18655i(this, 5);
    }

    public C1904b(int[] iArr, C4227a0[] c4227a0Arr, int[] iArr2, int[][][] iArr3, C4227a0 c4227a0) {
        this.f5566b = iArr;
        this.f5567c = c4227a0Arr;
        this.f5569e = iArr3;
        this.f5568d = iArr2;
        this.f5570f = c4227a0;
        this.f5565a = iArr.length;
    }
}

package p330N4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0748b0;
import p117Eb.C2391u;
import p239Ja.C4308k;
import p451Sb.C7102a;
import p544W9.AbstractC8609b4;
import p571X9.AbstractC9306j0;
import p692d0.C12966e;
import p692d0.C12977p;

/* JADX INFO: renamed from: N4.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5673x implements Cloneable {

    /* JADX INFO: renamed from: G0 */
    public static final int[] f18405G0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: H0 */
    public static final C7102a f18406H0 = new C7102a(12);

    /* JADX INFO: renamed from: I0 */
    public static final ThreadLocal f18407I0 = new ThreadLocal();

    /* JADX INFO: renamed from: E0 */
    public C5666q f18412E0;

    /* JADX INFO: renamed from: w0 */
    public ArrayList f18424w0;

    /* JADX INFO: renamed from: x0 */
    public ArrayList f18425x0;

    /* JADX INFO: renamed from: Y */
    public final String f18414Y = getClass().getName();

    /* JADX INFO: renamed from: Z */
    public long f18415Z = -1;

    /* JADX INFO: renamed from: o0 */
    public long f18416o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public TimeInterpolator f18417p0 = null;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f18418q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f18419r0 = new ArrayList();

    /* JADX INFO: renamed from: s0 */
    public C2391u f18420s0 = new C2391u(7);

    /* JADX INFO: renamed from: t0 */
    public C2391u f18421t0 = new C2391u(7);

    /* JADX INFO: renamed from: u0 */
    public C5637C f18422u0 = null;

    /* JADX INFO: renamed from: v0 */
    public final int[] f18423v0 = f18405G0;

    /* JADX INFO: renamed from: y0 */
    public final ArrayList f18426y0 = new ArrayList();

    /* JADX INFO: renamed from: z0 */
    public int f18427z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public boolean f18408A0 = false;

    /* JADX INFO: renamed from: B0 */
    public boolean f18409B0 = false;

    /* JADX INFO: renamed from: C0 */
    public ArrayList f18410C0 = null;

    /* JADX INFO: renamed from: D0 */
    public ArrayList f18411D0 = new ArrayList();

    /* JADX INFO: renamed from: F0 */
    public C7102a f18413F0 = f18406H0;

    /* JADX INFO: renamed from: b */
    public static void m6094b(C2391u c2391u, View view, C5640F c5640f) {
        ((C12966e) c2391u.f7429Z).put(view, c5640f);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) c2391u.f7430o0;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        String strM1549f = AbstractC0730K.m1549f(view);
        if (strM1549f != null) {
            C12966e c12966e = (C12966e) c2391u.f7432q0;
            if (c12966e.containsKey(strM1549f)) {
                c12966e.put(strM1549f, null);
            } else {
                c12966e.put(strM1549f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C12977p c12977p = (C12977p) c2391u.f7431p0;
                if (c12977p.m14666f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c12977p.m14668h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c12977p.m14664d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c12977p.m14668h(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C12966e m6095p() {
        ThreadLocal threadLocal = f18407I0;
        C12966e c12966e = (C12966e) threadLocal.get();
        if (c12966e != null) {
            return c12966e;
        }
        C12966e c12966e2 = new C12966e(0);
        threadLocal.set(c12966e2);
        return c12966e2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m6096u(C5640F c5640f, C5640F c5640f2, String str) {
        Object obj = c5640f.f18320a.get(str);
        Object obj2 = c5640f2.f18320a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: B */
    public void mo6047B(TimeInterpolator timeInterpolator) {
        this.f18417p0 = timeInterpolator;
    }

    /* JADX INFO: renamed from: C */
    public void mo6048C(C7102a c7102a) {
        if (c7102a == null) {
            this.f18413F0 = f18406H0;
        } else {
            this.f18413F0 = c7102a;
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo6049D(C5666q c5666q) {
        this.f18412E0 = c5666q;
    }

    /* JADX INFO: renamed from: F */
    public void mo6050F(long j10) {
        this.f18415Z = j10;
    }

    /* JADX INFO: renamed from: G */
    public final void m6097G() {
        if (this.f18427z0 == 0) {
            ArrayList arrayList = this.f18410C0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f18410C0.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC5672w) arrayList2.get(i10)).mo6067b(this);
                }
            }
            this.f18409B0 = false;
        }
        this.f18427z0++;
    }

    /* JADX INFO: renamed from: H */
    public String mo6051H(String str) {
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        sbM9893l.append(getClass().getSimpleName());
        sbM9893l.append(Separators.f31989AT);
        sbM9893l.append(Integer.toHexString(hashCode()));
        sbM9893l.append(": ");
        String string = sbM9893l.toString();
        if (this.f18416o0 != -1) {
            string = AbstractC10763a.m11050h(this.f18416o0, ") ", AbstractC9306j0.m9895n(string, "dur("));
        }
        if (this.f18415Z != -1) {
            string = AbstractC10763a.m11050h(this.f18415Z, ") ", AbstractC9306j0.m9895n(string, "dly("));
        }
        if (this.f18417p0 != null) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, "interp(");
            sbM9895n.append(this.f18417p0);
            sbM9895n.append(") ");
            string = sbM9895n.toString();
        }
        ArrayList arrayList = this.f18418q0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18419r0;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strM11052j = AbstractC10763a.m11052j(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strM11052j = AbstractC10763a.m11052j(strM11052j, ", ");
                }
                StringBuilder sbM9893l2 = AbstractC9306j0.m9893l(strM11052j);
                sbM9893l2.append(arrayList.get(i10));
                strM11052j = sbM9893l2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strM11052j = AbstractC10763a.m11052j(strM11052j, ", ");
                }
                StringBuilder sbM9893l3 = AbstractC9306j0.m9893l(strM11052j);
                sbM9893l3.append(arrayList2.get(i11));
                strM11052j = sbM9893l3.toString();
            }
        }
        return AbstractC10763a.m11052j(strM11052j, Separators.RPAREN);
    }

    /* JADX INFO: renamed from: a */
    public void m6098a(InterfaceC5672w interfaceC5672w) {
        if (this.f18410C0 == null) {
            this.f18410C0 = new ArrayList();
        }
        this.f18410C0.add(interfaceC5672w);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo6056c(C5640F c5640f);

    public void cancel() {
        ArrayList arrayList = this.f18426y0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f18410C0;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f18410C0.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((InterfaceC5672w) arrayList3.get(i10)).mo6068c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6099d(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C5640F c5640f = new C5640F(view);
            if (z6) {
                mo6058f(c5640f);
            } else {
                mo6056c(c5640f);
            }
            c5640f.f18322c.add(this);
            mo6057e(c5640f);
            if (z6) {
                m6094b(this.f18420s0, view, c5640f);
            } else {
                m6094b(this.f18421t0, view, c5640f);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m6099d(viewGroup.getChildAt(i10), z6);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo6057e(C5640F c5640f) {
        if (this.f18412E0 != null) {
            HashMap map = c5640f.f18320a;
            if (map.isEmpty()) {
                return;
            }
            this.f18412E0.getClass();
            String[] strArr = C5666q.f18387b;
            for (int i10 = 0; i10 < 2; i10++) {
                if (!map.containsKey(strArr[i10])) {
                    this.f18412E0.getClass();
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    View view = c5640f.f18321b;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo6058f(C5640F c5640f);

    /* JADX INFO: renamed from: g */
    public final void m6100g(ViewGroup viewGroup, boolean z6) {
        m6101h(z6);
        ArrayList arrayList = this.f18418q0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18419r0;
        if (size <= 0 && arrayList2.size() <= 0) {
            m6099d(viewGroup, z6);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                C5640F c5640f = new C5640F(viewFindViewById);
                if (z6) {
                    mo6058f(c5640f);
                } else {
                    mo6056c(c5640f);
                }
                c5640f.f18322c.add(this);
                mo6057e(c5640f);
                if (z6) {
                    m6094b(this.f18420s0, viewFindViewById, c5640f);
                } else {
                    m6094b(this.f18421t0, viewFindViewById, c5640f);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            C5640F c5640f2 = new C5640F(view);
            if (z6) {
                mo6058f(c5640f2);
            } else {
                mo6056c(c5640f2);
            }
            c5640f2.f18322c.add(this);
            mo6057e(c5640f2);
            if (z6) {
                m6094b(this.f18420s0, view, c5640f2);
            } else {
                m6094b(this.f18421t0, view, c5640f2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6101h(boolean z6) {
        if (z6) {
            ((C12966e) this.f18420s0.f7429Z).clear();
            ((SparseArray) this.f18420s0.f7430o0).clear();
            ((C12977p) this.f18420s0.f7431p0).m14662b();
        } else {
            ((C12966e) this.f18421t0.f7429Z).clear();
            ((SparseArray) this.f18421t0.f7430o0).clear();
            ((C12977p) this.f18421t0.f7431p0).m14662b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC5673x clone() {
        try {
            AbstractC5673x abstractC5673x = (AbstractC5673x) super.clone();
            abstractC5673x.f18411D0 = new ArrayList();
            abstractC5673x.f18420s0 = new C2391u(7);
            abstractC5673x.f18421t0 = new C2391u(7);
            abstractC5673x.f18424w0 = null;
            abstractC5673x.f18425x0 = null;
            return abstractC5673x;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Animator mo6083j(ViewGroup viewGroup, C5640F c5640f, C5640F c5640f2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x0185  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX INFO: renamed from: k */
    public void mo6060k(ViewGroup viewGroup, C2391u c2391u, C2391u c2391u2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo6083j;
        int i10;
        View view;
        C5640F c5640f;
        int i11;
        int[] iArr;
        int[] iArr2;
        int iAbs;
        long jRound;
        Integer num;
        C12966e c12966eM6095p = m6095p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            C5640F c5640f2 = (C5640F) arrayList.get(i12);
            C5640F c5640f3 = (C5640F) arrayList2.get(i12);
            if (c5640f2 != null && !c5640f2.f18322c.contains(this)) {
                c5640f2 = null;
            }
            if (c5640f3 != null && !c5640f3.f18322c.contains(this)) {
                c5640f3 = null;
            }
            if (!(c5640f2 == null && c5640f3 == null) && ((c5640f2 == null || c5640f3 == null || mo6085s(c5640f2, c5640f3)) && (animatorMo6083j = mo6083j(viewGroup, c5640f2, c5640f3)) != null)) {
                String str = this.f18414Y;
                if (c5640f3 != null) {
                    String[] strArrMo6084q = mo6084q();
                    view = c5640f3.f18321b;
                    if (strArrMo6084q != null && strArrMo6084q.length > 0) {
                        c5640f = new C5640F(view);
                        C5640F c5640f4 = (C5640F) ((C12966e) c2391u2.f7429Z).get(view);
                        if (c5640f4 != null) {
                            int i13 = 0;
                            while (i13 < strArrMo6084q.length) {
                                HashMap map = c5640f.f18320a;
                                int i14 = i12;
                                String str2 = strArrMo6084q[i13];
                                map.put(str2, c5640f4.f18320a.get(str2));
                                i13++;
                                i12 = i14;
                                strArrMo6084q = strArrMo6084q;
                            }
                            i10 = i12;
                        } else {
                            i10 = i12;
                        }
                        int i15 = c12966eM6095p.f41154o0;
                        for (int i16 = 0; i16 < i15; i16++) {
                            C5671v c5671v = (C5671v) c12966eM6095p.get((Animator) c12966eM6095p.m14646f(i16));
                            if (c5671v.f18402c != null && c5671v.f18400a == view && c5671v.f18401b.equals(str) && c5671v.f18402c.equals(c5640f)) {
                                animatorMo6083j = null;
                                break;
                            }
                        }
                    } else {
                        i10 = i12;
                        animatorMo6083j = animatorMo6083j;
                        c5640f = null;
                    }
                    animatorMo6083j = animatorMo6083j;
                } else {
                    i10 = i12;
                    view = c5640f2.f18321b;
                    c5640f = null;
                }
                if (animatorMo6083j != null) {
                    C5666q c5666q = this.f18412E0;
                    if (c5666q != null) {
                        if (c5640f2 == null && c5640f3 == null) {
                            jRound = 0;
                        } else {
                            if (c5640f3 != null) {
                                int iIntValue = 8;
                                if (c5640f2 != null && (num = (Integer) c5640f2.f18320a.get("android:visibilityPropagation:visibility")) != null) {
                                    iIntValue = num.intValue();
                                }
                                if (iIntValue == 0) {
                                    i11 = -1;
                                } else {
                                    c5640f2 = c5640f3;
                                    i11 = 1;
                                }
                            } else {
                                i11 = -1;
                            }
                            int i17 = (c5640f2 == null || (iArr = (int[]) c5640f2.f18320a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[0];
                            int i18 = (c5640f2 == null || (iArr2 = (int[]) c5640f2.f18320a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[1];
                            int[] iArr3 = new int[2];
                            viewGroup.getLocationOnScreen(iArr3);
                            int iRound = Math.round(viewGroup.getTranslationX()) + iArr3[0];
                            int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr3[1];
                            int width = viewGroup.getWidth() + iRound;
                            int height = viewGroup.getHeight() + iRound2;
                            int i19 = (iRound + width) / 2;
                            int i20 = (iRound2 + height) / 2;
                            int i21 = c5666q.f18388a;
                            if (i21 == 8388611) {
                                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                                if (viewGroup.getLayoutDirection() == 1) {
                                    i21 = 5;
                                } else {
                                    i21 = 3;
                                }
                            } else if (i21 == 8388613) {
                                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                                if (viewGroup.getLayoutDirection() == 1) {
                                    i21 = 3;
                                } else {
                                    i21 = 5;
                                }
                            }
                            if (i21 == 3) {
                                iAbs = Math.abs(i20 - i18) + (width - i17);
                            } else if (i21 == 5) {
                                iAbs = Math.abs(i20 - i18) + (i17 - iRound);
                            } else if (i21 != 48) {
                                iAbs = i21 != 80 ? 0 : Math.abs(i19 - i17) + (i18 - iRound2);
                            } else {
                                iAbs = Math.abs(i19 - i17) + (height - i18);
                            }
                            float f10 = iAbs;
                            int i22 = c5666q.f18388a;
                            float width2 = f10 / ((i22 == 3 || i22 == 5 || i22 == 8388611 || i22 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                            long j10 = this.f18416o0;
                            if (j10 < 0) {
                                j10 = 300;
                            }
                            jRound = Math.round(((j10 * ((long) i11)) / 3.0f) * width2);
                        }
                        sparseIntArray.put(this.f18411D0.size(), (int) jRound);
                        jMin = Math.min(jRound, jMin);
                    } else {
                        c12966eM6095p = c12966eM6095p;
                    }
                    C5643I c5643i = AbstractC5642H.f18332a;
                    C5649O c5649o = new C5649O(viewGroup);
                    C5671v c5671v2 = new C5671v();
                    c5671v2.f18400a = view;
                    c5671v2.f18401b = str;
                    c5671v2.f18402c = c5640f;
                    c5671v2.f18403d = c5649o;
                    c5671v2.f18404e = this;
                    c12966eM6095p = c12966eM6095p;
                    c12966eM6095p.put(animatorMo6083j, c5671v2);
                    this.f18411D0.add(animatorMo6083j);
                }
                i12 = i10 + 1;
                c12966eM6095p = c12966eM6095p;
                size = size;
            } else {
                size = size;
                i10 = i12;
            }
            i12 = i10 + 1;
            c12966eM6095p = c12966eM6095p;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i23 = 0; i23 < sparseIntArray.size(); i23++) {
                Animator animator = (Animator) this.f18411D0.get(sparseIntArray.keyAt(i23));
                animator.setStartDelay(animator.getStartDelay() + (((long) sparseIntArray.valueAt(i23)) - jMin));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6102l() {
        int i10 = this.f18427z0 - 1;
        this.f18427z0 = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f18410C0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f18410C0.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((InterfaceC5672w) arrayList2.get(i11)).mo6070e(this);
                }
            }
            for (int i12 = 0; i12 < ((C12977p) this.f18420s0.f7431p0).m14670j(); i12++) {
                View view = (View) ((C12977p) this.f18420s0.f7431p0).m14671k(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((C12977p) this.f18421t0.f7431p0).m14670j(); i13++) {
                View view2 = (View) ((C12977p) this.f18421t0.f7431p0).m14671k(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                    view2.setHasTransientState(false);
                }
            }
            this.f18409B0 = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo6061n(FrameLayout frameLayout) {
        C12966e c12966eM6095p = m6095p();
        int i10 = c12966eM6095p.f41154o0;
        if (i10 == 0) {
            return;
        }
        C5643I c5643i = AbstractC5642H.f18332a;
        WindowId windowId = frameLayout.getWindowId();
        C12966e c12966e = new C12966e(c12966eM6095p);
        c12966eM6095p.clear();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            C5671v c5671v = (C5671v) c12966e.m14649j(i11);
            if (c5671v.f18400a != null && c5671v.f18403d.f18357a.equals(windowId)) {
                ((Animator) c12966e.m14646f(i11)).end();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final C5640F m6103o(View view, boolean z6) {
        C5637C c5637c = this.f18422u0;
        if (c5637c != null) {
            return c5637c.m6103o(view, z6);
        }
        ArrayList arrayList = z6 ? this.f18424w0 : this.f18425x0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            C5640F c5640f = (C5640F) arrayList.get(i10);
            if (c5640f == null) {
                return null;
            }
            if (c5640f.f18321b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (C5640F) (z6 ? this.f18425x0 : this.f18424w0).get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo6084q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C5640F m6104r(View view, boolean z6) {
        C5637C c5637c = this.f18422u0;
        if (c5637c != null) {
            return c5637c.m6104r(view, z6);
        }
        return (C5640F) ((C12966e) (z6 ? this.f18420s0 : this.f18421t0).f7429Z).get(view);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo6085s(C5640F c5640f, C5640F c5640f2) {
        if (c5640f == null || c5640f2 == null) {
            return false;
        }
        String[] strArrMo6084q = mo6084q();
        if (strArrMo6084q == null) {
            Iterator it = c5640f.f18320a.keySet().iterator();
            while (it.hasNext()) {
                if (m6096u(c5640f, c5640f2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo6084q) {
            if (!m6096u(c5640f, c5640f2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6105t(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f18418q0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18419r0;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo6051H("");
    }

    /* JADX INFO: renamed from: v */
    public void mo6062v(ViewGroup viewGroup) {
        if (this.f18409B0) {
            return;
        }
        ArrayList arrayList = this.f18426y0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f18410C0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f18410C0.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((InterfaceC5672w) arrayList3.get(i10)).mo6066a();
            }
        }
        this.f18408A0 = true;
    }

    /* JADX INFO: renamed from: w */
    public void m6106w(InterfaceC5672w interfaceC5672w) {
        ArrayList arrayList = this.f18410C0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC5672w);
        if (this.f18410C0.size() == 0) {
            this.f18410C0 = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo6063x(View view) {
        if (this.f18408A0) {
            if (!this.f18409B0) {
                ArrayList arrayList = this.f18426y0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f18410C0;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f18410C0.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((InterfaceC5672w) arrayList3.get(i10)).mo6069d();
                    }
                }
            }
            this.f18408A0 = false;
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo6064y() {
        m6097G();
        C12966e c12966eM6095p = m6095p();
        for (Animator animator : this.f18411D0) {
            if (c12966eM6095p.containsKey(animator)) {
                m6097G();
                if (animator != null) {
                    animator.addListener(new C0748b0(this, c12966eM6095p));
                    long j10 = this.f18416o0;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f18415Z;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f18417p0;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C4308k(this, 3));
                    animator.start();
                }
            }
        }
        this.f18411D0.clear();
        m6102l();
    }

    /* JADX INFO: renamed from: z */
    public void mo6065z(long j10) {
        this.f18416o0 = j10;
    }

    /* JADX INFO: renamed from: A */
    public void mo6046A(AbstractC8609b4 abstractC8609b4) {
    }
}

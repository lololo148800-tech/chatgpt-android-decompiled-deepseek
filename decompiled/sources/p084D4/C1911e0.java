package p084D4;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p030B2.AbstractC0738T;
import p030B2.C0745a;
import p030B2.C0747b;
import p030B2.C0781s;
import p1072w2.AbstractC20798j;
import p167Gb.C3032c;
import p544W9.AbstractC8536P2;
import p775h2.AbstractC14376f;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: D4.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1911e0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5586a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5587b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5588c;

    /* JADX INFO: renamed from: d */
    public final List f5589d;

    /* JADX INFO: renamed from: e */
    public int f5590e;

    /* JADX INFO: renamed from: f */
    public int f5591f;

    /* JADX INFO: renamed from: g */
    public C1909d0 f5592g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f5593h;

    public C1911e0(RecyclerView recyclerView) {
        this.f5593h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5586a = arrayList;
        this.f5587b = null;
        this.f5588c = new ArrayList();
        this.f5589d = DesugarCollections.unmodifiableList(arrayList);
        this.f5590e = 2;
        this.f5591f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3026a(AbstractC1933p0 abstractC1933p0, boolean z6) {
        RecyclerView.m12252l(abstractC1933p0);
        RecyclerView recyclerView = this.f5593h;
        C1937r0 c1937r0 = recyclerView.f33661y1;
        View view = abstractC1933p0.f5680a;
        if (c1937r0 != null) {
            C1935q0 c1935q0 = c1937r0.f5718e;
            AbstractC0738T.m1584l(view, c1935q0 instanceof C1935q0 ? (C0747b) c1935q0.f5713e.remove(view) : null);
        }
        if (z6) {
            ArrayList arrayList = recyclerView.f33594C0;
            if (arrayList.size() > 0) {
                throw AbstractC14376f.m15860z(0, arrayList);
            }
            if (recyclerView.f33647r1 != null) {
                recyclerView.f33652u0.m16591u(abstractC1933p0);
            }
            if (RecyclerView.f33581L1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC1933p0);
            }
        }
        abstractC1933p0.f5698s = null;
        abstractC1933p0.f5697r = null;
        C1909d0 c1909d0M3028c = m3028c();
        c1909d0M3028c.getClass();
        int i10 = abstractC1933p0.f5685f;
        ArrayList arrayList2 = c1909d0M3028c.m3025a(i10).f5574a;
        if (((C1907c0) c1909d0M3028c.f5579a.get(i10)).f5575b <= arrayList2.size()) {
            AbstractC8536P2.m9198a(view);
        } else {
            if (RecyclerView.f33580K1 && arrayList2.contains(abstractC1933p0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC1933p0.m3100o();
            arrayList2.add(abstractC1933p0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3027b(int i10) {
        RecyclerView recyclerView = this.f5593h;
        if (i10 >= 0 && i10 < recyclerView.f33647r1.m3082b()) {
            return !recyclerView.f33647r1.f5642g ? i10 : recyclerView.f33648s0.m2999g(i10, 0);
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "invalid position ", ". State item count is ");
        sbM11057o.append(recyclerView.f33647r1.m3082b());
        sbM11057o.append(recyclerView.m12255B());
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: c */
    public final C1909d0 m3028c() {
        if (this.f5592g == null) {
            C1909d0 c1909d0 = new C1909d0();
            c1909d0.f5579a = new SparseArray();
            c1909d0.f5580b = 0;
            c1909d0.f5581c = Collections.newSetFromMap(new IdentityHashMap());
            this.f5592g = c1909d0;
            m3029d();
        }
        return this.f5592g;
    }

    /* JADX INFO: renamed from: d */
    public final void m3029d() {
        RecyclerView recyclerView;
        AbstractC1893Q abstractC1893Q;
        C1909d0 c1909d0 = this.f5592g;
        if (c1909d0 == null || (abstractC1893Q = (recyclerView = this.f5593h).f33590A0) == null || !recyclerView.f33602G0) {
            return;
        }
        c1909d0.f5581c.add(abstractC1893Q);
    }

    /* JADX INFO: renamed from: e */
    public final void m3030e(AbstractC1893Q abstractC1893Q, boolean z6) {
        C1909d0 c1909d0 = this.f5592g;
        if (c1909d0 == null) {
            return;
        }
        Set set = c1909d0.f5581c;
        set.remove(abstractC1893Q);
        if (set.size() != 0 || z6) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = c1909d0.f5579a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C1907c0) sparseArray.get(sparseArray.keyAt(i10))).f5574a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                AbstractC8536P2.m9198a(((AbstractC1933p0) arrayList.get(i11)).f5680a);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3031f() {
        ArrayList arrayList = this.f5588c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m3032g(size);
        }
        arrayList.clear();
        if (RecyclerView.f33586Q1) {
            C1878B c1878b = this.f5593h.f33645q1;
            int[] iArr = c1878b.f5455a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1878b.f5458d = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3032g(int i10) {
        if (RecyclerView.f33581L1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        ArrayList arrayList = this.f5588c;
        AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(i10);
        if (RecyclerView.f33581L1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC1933p0);
        }
        m3026a(abstractC1933p0, true);
        arrayList.remove(i10);
    }

    /* JADX INFO: renamed from: h */
    public final void m3033h(View view) {
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        boolean zM3097l = abstractC1933p0M12244L.m3097l();
        RecyclerView recyclerView = this.f5593h;
        if (zM3097l) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC1933p0M12244L.m3096k()) {
            abstractC1933p0M12244L.f5693n.m3037l(abstractC1933p0M12244L);
        } else if (abstractC1933p0M12244L.m3103r()) {
            abstractC1933p0M12244L.f5689j &= -33;
        }
        m3034i(abstractC1933p0M12244L);
        if (recyclerView.f33625Z0 == null || abstractC1933p0M12244L.m3094i()) {
            return;
        }
        recyclerView.f33625Z0.mo2912d(abstractC1933p0M12244L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[LOOP:2: B:50:0x00aa->B:54:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b8 A[EDGE_INSN: B:83:0x00b8->B:55:0x00b8 BREAK  A[LOOP:1: B:46:0x0095->B:53:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b8 A[EDGE_INSN: B:84:0x00b8->B:55:0x00b8 BREAK  A[LOOP:1: B:46:0x0095->B:53:0x00b2, LOOP_LABEL: LOOP:1: B:46:0x0095->B:53:0x00b2], SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final void m3034i(AbstractC1933p0 abstractC1933p0) {
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        C1878B c1878b;
        int i12;
        int i13;
        boolean zM3096k = abstractC1933p0.m3096k();
        boolean z11 = false;
        boolean z12 = true;
        RecyclerView recyclerView = this.f5593h;
        View view = abstractC1933p0.f5680a;
        if (zM3096k || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC1933p0.m3096k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.m12255B());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (abstractC1933p0.m3097l()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(abstractC1933p0);
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb3));
        }
        if (abstractC1933p0.m3102q()) {
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC1933p0.f5689j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (view.hasTransientState()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        AbstractC1893Q abstractC1893Q = recyclerView.f33590A0;
        boolean z13 = RecyclerView.f33580K1;
        ArrayList arrayList = this.f5588c;
        if (z13 && arrayList.contains(abstractC1933p0)) {
            StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
            sb4.append(abstractC1933p0);
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, sb4));
        }
        if (abstractC1933p0.m3094i()) {
            if (this.f5591f <= 0 || abstractC1933p0.m3090e(526)) {
                z10 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f5591f && size > 0) {
                    m3032g(0);
                    size--;
                }
                if (RecyclerView.f33586Q1 && size > 0) {
                    C1878B c1878b2 = recyclerView.f33645q1;
                    int i14 = abstractC1933p0.f5682c;
                    if (c1878b2.f5455a != null) {
                        int i15 = c1878b2.f5458d * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((AbstractC1933p0) arrayList.get(i10)).f5682c;
                                    c1878b = recyclerView.f33645q1;
                                    if (c1878b.f5455a != null) {
                                        break;
                                    }
                                    i12 = c1878b.f5458d * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (c1878b.f5455a[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (c1878b2.f5455a[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((AbstractC1933p0) arrayList.get(i10)).f5682c;
                            c1878b = recyclerView.f33645q1;
                            if (c1878b.f5455a != null) {
                                break;
                                break;
                            }
                            i12 = c1878b.f5458d * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (c1878b.f5455a[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, abstractC1933p0);
                z10 = true;
            }
            if (z10) {
                z12 = false;
            } else {
                m3026a(abstractC1933p0, true);
            }
            z11 = z10;
        } else {
            if (RecyclerView.f33581L1) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m12255B());
            }
            z12 = false;
        }
        recyclerView.f33652u0.m16591u(abstractC1933p0);
        if (z11 || z12 || !z6) {
            return;
        }
        AbstractC8536P2.m9198a(view);
        abstractC1933p0.f5698s = null;
        abstractC1933p0.f5697r = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m3035j(View view) {
        AbstractC1897V abstractC1897V;
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        boolean zM3090e = abstractC1933p0M12244L.m3090e(12);
        RecyclerView recyclerView = this.f5593h;
        if (!zM3090e && abstractC1933p0M12244L.m3098m() && (abstractC1897V = recyclerView.f33625Z0) != null) {
            C1934q c1934q = (C1934q) abstractC1897V;
            if (abstractC1933p0M12244L.m3089d().isEmpty() && c1934q.f5700g && !abstractC1933p0M12244L.m3093h()) {
                if (this.f5587b == null) {
                    this.f5587b = new ArrayList();
                }
                abstractC1933p0M12244L.f5693n = this;
                abstractC1933p0M12244L.f5694o = true;
                this.f5587b.add(abstractC1933p0M12244L);
                return;
            }
        }
        if (abstractC1933p0M12244L.m3093h() && !abstractC1933p0M12244L.m3095j() && !recyclerView.f33590A0.f5530b) {
            throw new IllegalArgumentException(AbstractC0168G.m531t(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC1933p0M12244L.f5693n = this;
        abstractC1933p0M12244L.f5694o = false;
        this.f5586a.add(abstractC1933p0M12244L);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0208  */
    /* JADX WARN: Code duplicated, block: B:193:0x037e A[EDGE_INSN: B:193:0x037e->B:194:0x037f BREAK  A[LOOP:5: B:188:0x0366->B:192:0x037b]] */
    /* JADX WARN: Code duplicated, block: B:358:0x0628  */
    /* JADX WARN: Code duplicated, block: B:359:0x0632  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e A[EDGE_INSN: B:35:0x007e->B:36:0x007f BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:361:0x0638  */
    /* JADX WARN: Code duplicated, block: B:362:0x0642  */
    /* JADX WARN: Code duplicated, block: B:365:0x0649 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x064c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX INFO: renamed from: k */
    public final AbstractC1933p0 m3036k(int i10, long j10) {
        boolean z6;
        AbstractC1933p0 abstractC1933p0Mo2902e;
        boolean z10;
        boolean z11;
        boolean z12;
        ViewGroup.LayoutParams layoutParams;
        C1901Z c1901z;
        String str;
        int i11;
        String str2;
        RecyclerView recyclerViewM12243G;
        AbstractC1933p0 abstractC1933p0;
        AbstractC1933p0 abstractC1933p1;
        View view;
        AbstractC1933p0 abstractC1933p2;
        int iM3056n;
        boolean z13;
        int size;
        int iM2999g;
        RecyclerView recyclerView = this.f5593h;
        if (i10 < 0 || i10 >= recyclerView.f33647r1.m3082b()) {
            StringBuilder sbM21e = AbstractC0010F.m21e("Invalid item position ", i10, Separators.LPAREN, i10, "). Item count:");
            sbM21e.append(recyclerView.f33647r1.m3082b());
            sbM21e.append(recyclerView.m12255B());
            throw new IndexOutOfBoundsException(sbM21e.toString());
        }
        C1925l0 c1925l0 = recyclerView.f33647r1;
        if (c1925l0.f5642g) {
            ArrayList arrayList = this.f5587b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        if (recyclerView.f33590A0.f5530b && (iM2999g = recyclerView.f33648s0.m2999g(i10, 0)) > 0 && iM2999g < recyclerView.f33590A0.mo2898a()) {
                            long jMo2899b = recyclerView.f33590A0.mo2899b(iM2999g);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    abstractC1933p0Mo2902e = null;
                                    break;
                                }
                                AbstractC1933p0 abstractC1933p3 = (AbstractC1933p0) this.f5587b.get(i13);
                                if (!abstractC1933p3.m3103r() && abstractC1933p3.f5684e == jMo2899b) {
                                    abstractC1933p3.m3086a(32);
                                    abstractC1933p0Mo2902e = abstractC1933p3;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            abstractC1933p0Mo2902e = null;
                            break;
                        }
                    } else {
                        abstractC1933p0Mo2902e = (AbstractC1933p0) this.f5587b.get(i12);
                        if (!abstractC1933p0Mo2902e.m3103r() && abstractC1933p0Mo2902e.m3088c() == i10) {
                            abstractC1933p0Mo2902e.m3086a(32);
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                abstractC1933p0Mo2902e = null;
                break;
            }
            z6 = abstractC1933p0Mo2902e != null;
        } else {
            z6 = false;
            abstractC1933p0Mo2902e = null;
        }
        ArrayList arrayList2 = this.f5588c;
        ArrayList arrayList3 = this.f5586a;
        String str3 = "RecyclerView";
        if (abstractC1933p0Mo2902e == null) {
            int size2 = arrayList3.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    ArrayList arrayList4 = (ArrayList) recyclerView.f33650t0.f5616Z;
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) arrayList4.get(i15);
                        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
                        if (abstractC1933p0M12244L.m3088c() == i10 && !abstractC1933p0M12244L.m3093h() && !abstractC1933p0M12244L.m3095j()) {
                            break;
                        }
                        i15++;
                    }
                    if (view == null) {
                        int size4 = arrayList2.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size4) {
                                abstractC1933p2 = null;
                                break;
                            }
                            abstractC1933p2 = (AbstractC1933p0) arrayList2.get(i16);
                            if (!abstractC1933p2.m3093h() && abstractC1933p2.m3088c() == i10 && !abstractC1933p2.m3091f()) {
                                arrayList2.remove(i16);
                                if (!RecyclerView.f33581L1) {
                                    break;
                                }
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + abstractC1933p2);
                                break;
                            }
                            i16++;
                        }
                    } else {
                        AbstractC1933p0 abstractC1933p0M12244L2 = RecyclerView.m12244L(view);
                        C1920j c1920j = recyclerView.f33650t0;
                        int iIndexOfChild = ((RecyclerView) ((C3032c) c1920j.f5618p0).f9127Z).indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        C1918i c1918i = (C1918i) c1920j.f5619q0;
                        if (!c1918i.m3058p(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c1918i.m3055m(iIndexOfChild);
                        c1920j.m3078m(view);
                        C1920j c1920j2 = recyclerView.f33650t0;
                        int iIndexOfChild2 = ((RecyclerView) ((C3032c) c1920j2.f5618p0).f9127Z).indexOfChild(view);
                        if (iIndexOfChild2 == -1) {
                            iM3056n = -1;
                        } else {
                            C1918i c1918i2 = (C1918i) c1920j2.f5619q0;
                            if (c1918i2.m3058p(iIndexOfChild2)) {
                                iM3056n = -1;
                            } else {
                                iM3056n = iIndexOfChild2 - c1918i2.m3056n(iIndexOfChild2);
                            }
                        }
                        if (iM3056n == -1) {
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(abstractC1933p0M12244L2);
                            throw new IllegalStateException(AbstractC0168G.m531t(recyclerView, sb2));
                        }
                        recyclerView.f33650t0.m3070e(iM3056n);
                        m3035j(view);
                        abstractC1933p0M12244L2.m3086a(8224);
                        abstractC1933p2 = abstractC1933p0M12244L2;
                        break;
                    }
                } else {
                    AbstractC1933p0 abstractC1933p4 = (AbstractC1933p0) arrayList3.get(i14);
                    if (!abstractC1933p4.m3103r() && abstractC1933p4.m3088c() == i10 && !abstractC1933p4.m3093h() && (c1925l0.f5642g || !abstractC1933p4.m3095j())) {
                        abstractC1933p4.m3086a(32);
                        abstractC1933p2 = abstractC1933p4;
                        break;
                    }
                    i14++;
                }
            }
            if (abstractC1933p2 == null) {
                abstractC1933p0Mo2902e = abstractC1933p2;
            } else {
                if (!abstractC1933p2.m3095j()) {
                    int i17 = abstractC1933p2.f5682c;
                    if (i17 < 0 || i17 >= recyclerView.f33590A0.mo2898a()) {
                        StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb3.append(abstractC1933p2);
                        throw new IndexOutOfBoundsException(AbstractC0168G.m531t(recyclerView, sb3));
                    }
                    if (c1925l0.f5642g || recyclerView.f33590A0.mo2900c(abstractC1933p2.f5682c) == abstractC1933p2.f5685f) {
                        AbstractC1893Q abstractC1893Q = recyclerView.f33590A0;
                        if (!abstractC1893Q.f5530b || abstractC1933p2.f5684e == abstractC1893Q.mo2899b(abstractC1933p2.f5682c)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                } else {
                    if (RecyclerView.f33580K1 && !c1925l0.f5642g) {
                        throw new IllegalStateException(AbstractC0168G.m531t(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z13 = c1925l0.f5642g;
                }
                if (z13) {
                    z6 = true;
                    abstractC1933p0Mo2902e = abstractC1933p2;
                } else {
                    abstractC1933p2.m3086a(4);
                    if (abstractC1933p2.m3096k()) {
                        recyclerView.removeDetachedView(abstractC1933p2.f5680a, false);
                        abstractC1933p2.f5693n.m3037l(abstractC1933p2);
                    } else if (abstractC1933p2.m3103r()) {
                        abstractC1933p2.f5689j &= -33;
                    }
                    m3034i(abstractC1933p2);
                    abstractC1933p0Mo2902e = null;
                }
            }
        }
        if (abstractC1933p0Mo2902e == null) {
            int iM2999g2 = recyclerView.f33648s0.m2999g(i10, 0);
            if (iM2999g2 < 0 || iM2999g2 >= recyclerView.f33590A0.mo2898a()) {
                StringBuilder sbM21e2 = AbstractC0010F.m21e("Inconsistency detected. Invalid item position ", i10, "(offset:", iM2999g2, ").state:");
                sbM21e2.append(c1925l0.m3082b());
                sbM21e2.append(recyclerView.m12255B());
                throw new IndexOutOfBoundsException(sbM21e2.toString());
            }
            int iMo2900c = recyclerView.f33590A0.mo2900c(iM2999g2);
            AbstractC1893Q abstractC1893Q2 = recyclerView.f33590A0;
            if (abstractC1893Q2.f5530b) {
                long jMo2899b2 = abstractC1893Q2.mo2899b(iM2999g2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        str = str3;
                        i11 = iMo2900c;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                AbstractC1933p0 abstractC1933p5 = (AbstractC1933p0) arrayList2.get(size6);
                                int i18 = size6;
                                if (abstractC1933p5.f5684e != jMo2899b2 || abstractC1933p5.m3091f()) {
                                    size6 = i18 - 1;
                                } else {
                                    if (i11 == abstractC1933p5.f5685f) {
                                        arrayList2.remove(i18);
                                        abstractC1933p1 = abstractC1933p5;
                                        break;
                                    }
                                    m3032g(i18);
                                }
                            }
                            abstractC1933p1 = null;
                            break;
                        }
                    }
                    abstractC1933p1 = (AbstractC1933p0) arrayList3.get(size5);
                    str = str3;
                    if (abstractC1933p1.f5684e == jMo2899b2 && !abstractC1933p1.m3103r()) {
                        if (iMo2900c == abstractC1933p1.f5685f) {
                            abstractC1933p1.m3086a(32);
                            if (abstractC1933p1.m3095j() && !c1925l0.f5642g) {
                                abstractC1933p1.f5689j = (abstractC1933p1.f5689j & (-15)) | 2;
                            }
                            i11 = iMo2900c;
                            break;
                        }
                        arrayList3.remove(size5);
                        View view2 = abstractC1933p1.f5680a;
                        recyclerView.removeDetachedView(view2, false);
                        AbstractC1933p0 abstractC1933p0M12244L3 = RecyclerView.m12244L(view2);
                        abstractC1933p0M12244L3.f5693n = null;
                        abstractC1933p0M12244L3.f5694o = false;
                        abstractC1933p0M12244L3.f5689j &= -33;
                        m3034i(abstractC1933p0M12244L3);
                    }
                    size5--;
                    iMo2900c = iMo2900c;
                    str3 = str;
                }
                if (abstractC1933p1 != null) {
                    abstractC1933p1.f5682c = iM2999g2;
                    abstractC1933p0Mo2902e = abstractC1933p1;
                    z6 = true;
                } else {
                    abstractC1933p0Mo2902e = abstractC1933p1;
                }
            } else {
                str = "RecyclerView";
                i11 = iMo2900c;
            }
            if (abstractC1933p0Mo2902e == null) {
                if (RecyclerView.f33581L1) {
                    str2 = str;
                    Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                } else {
                    str2 = str;
                }
                C1907c0 c1907c0 = (C1907c0) m3028c().f5579a.get(i11);
                if (c1907c0 == null) {
                    abstractC1933p0 = null;
                    break;
                }
                ArrayList arrayList5 = c1907c0.f5574a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            abstractC1933p0 = null;
                            break;
                        }
                        if (!((AbstractC1933p0) arrayList5.get(size7)).m3091f()) {
                            abstractC1933p0 = (AbstractC1933p0) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    abstractC1933p0 = null;
                    break;
                }
                if (abstractC1933p0 != null) {
                    abstractC1933p0.m3100o();
                    boolean z14 = RecyclerView.f33580K1;
                }
                abstractC1933p0Mo2902e = abstractC1933p0;
            } else {
                str2 = str;
            }
            if (abstractC1933p0Mo2902e == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j11 = this.f5592g.m3025a(i11).f5576c;
                    if (!(j11 == 0 || j11 + nanoTime < j10)) {
                        return null;
                    }
                }
                AbstractC1893Q abstractC1893Q3 = recyclerView.f33590A0;
                abstractC1893Q3.getClass();
                try {
                    int i19 = AbstractC20798j.f66061a;
                    Trace.beginSection("RV CreateView");
                    abstractC1933p0Mo2902e = abstractC1893Q3.mo2902e(recyclerView, i11);
                    View view3 = abstractC1933p0Mo2902e.f5680a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC1933p0Mo2902e.f5685f = i11;
                    Trace.endSection();
                    if (RecyclerView.f33586Q1 && (recyclerViewM12243G = RecyclerView.m12243G(view3)) != null) {
                        abstractC1933p0Mo2902e.f5681b = new WeakReference(recyclerViewM12243G);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C1907c0 c1907c0M3025a = this.f5592g.m3025a(i11);
                    long j12 = c1907c0M3025a.f5576c;
                    if (j12 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
                    }
                    c1907c0M3025a.f5576c = nanoTime2;
                    if (RecyclerView.f33581L1) {
                        Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } catch (Throwable th2) {
                    int i20 = AbstractC20798j.f66061a;
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        if (z6 && !c1925l0.f5642g && abstractC1933p0Mo2902e.m3090e(8192)) {
            abstractC1933p0Mo2902e.f5689j &= -8193;
            if (c1925l0.f5645j) {
                AbstractC1897V.m2909b(abstractC1933p0Mo2902e);
                AbstractC1897V abstractC1897V = recyclerView.f33625Z0;
                abstractC1933p0Mo2902e.m3089d();
                abstractC1897V.getClass();
                C0781s c0781s = new C0781s(2);
                c0781s.m1767c(abstractC1933p0Mo2902e);
                recyclerView.m12276Z(abstractC1933p0Mo2902e, c0781s);
            }
        }
        boolean z15 = c1925l0.f5642g;
        View view4 = abstractC1933p0Mo2902e.f5680a;
        if (!z15 || !abstractC1933p0Mo2902e.m3092g()) {
            if (abstractC1933p0Mo2902e.m3092g()) {
                if (((abstractC1933p0Mo2902e.f5689j & 2) != 0) || abstractC1933p0Mo2902e.m3093h()) {
                }
                z11 = true;
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                    c1901z = (C1901Z) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c1901z);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c1901z = (C1901Z) layoutParams;
                } else {
                    c1901z = (C1901Z) recyclerView.generateLayoutParams(layoutParams);
                    view4.setLayoutParams(c1901z);
                }
                c1901z.f5557a = abstractC1933p0Mo2902e;
                if (z6 || !z12) {
                    z11 = false;
                }
                c1901z.f5560d = z11;
                return abstractC1933p0Mo2902e;
            }
            if (RecyclerView.f33580K1 && abstractC1933p0Mo2902e.m3095j()) {
                StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb4.append(abstractC1933p0Mo2902e);
                throw new IllegalStateException(AbstractC0168G.m531t(recyclerView, sb4));
            }
            int iM2999g3 = recyclerView.f33648s0.m2999g(i10, 0);
            C0747b c0747b = null;
            abstractC1933p0Mo2902e.f5698s = null;
            abstractC1933p0Mo2902e.f5697r = recyclerView;
            int i21 = abstractC1933p0Mo2902e.f5685f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j13 = this.f5592g.m3025a(i21).f5577d;
                if (j13 != 0 && j13 + nanoTime3 >= j10) {
                    z12 = false;
                    z11 = true;
                }
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                    c1901z = (C1901Z) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c1901z);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c1901z = (C1901Z) recyclerView.generateLayoutParams(layoutParams);
                    view4.setLayoutParams(c1901z);
                } else {
                    c1901z = (C1901Z) layoutParams;
                }
                c1901z.f5557a = abstractC1933p0Mo2902e;
                if (z6) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                c1901z.f5560d = z11;
                return abstractC1933p0Mo2902e;
            }
            if (abstractC1933p0Mo2902e.m3097l()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC1893Q abstractC1893Q4 = recyclerView.f33590A0;
            abstractC1893Q4.getClass();
            boolean z16 = abstractC1933p0Mo2902e.f5698s == null;
            if (z16) {
                abstractC1933p0Mo2902e.f5682c = iM2999g3;
                if (abstractC1893Q4.f5530b) {
                    abstractC1933p0Mo2902e.f5684e = abstractC1893Q4.mo2899b(iM2999g3);
                }
                abstractC1933p0Mo2902e.f5689j = (abstractC1933p0Mo2902e.f5689j & (-520)) | 1;
                int i22 = AbstractC20798j.f66061a;
                Trace.beginSection("RV OnBindView");
            } else {
                recyclerView = recyclerView;
            }
            abstractC1933p0Mo2902e.f5698s = abstractC1893Q4;
            if (RecyclerView.f33580K1) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    if (view4.isAttachedToWindow() != abstractC1933p0Mo2902e.m3097l()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC1933p0Mo2902e.m3097l() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC1933p0Mo2902e);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC1933p0Mo2902e);
                    }
                }
            }
            abstractC1933p0Mo2902e.m3089d();
            abstractC1893Q4.mo2901d(abstractC1933p0Mo2902e, iM2999g3);
            if (z16) {
                ArrayList arrayList6 = abstractC1933p0Mo2902e.f5690k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                abstractC1933p0Mo2902e.f5689j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof C1901Z) {
                    ((C1901Z) layoutParams2).f5559c = true;
                }
                int i23 = AbstractC20798j.f66061a;
                Trace.endSection();
            }
            recyclerView = recyclerView;
            if (z10) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            C1907c0 c1907c0M3025a2 = this.f5592g.m3025a(abstractC1933p0Mo2902e.f5685f);
            long j14 = c1907c0M3025a2.f5577d;
            if (j14 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j14 / 4) * 3);
            }
            c1907c0M3025a2.f5577d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f33615P0;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = AbstractC0738T.f2096a;
                if (view4.getImportantForAccessibility() == 0) {
                    z11 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z11 = true;
                }
                C1937r0 c1937r0 = recyclerView.f33661y1;
                if (c1937r0 != null) {
                    C1935q0 c1935q0 = c1937r0.f5718e;
                    if (c1935q0 instanceof C1935q0) {
                        c1935q0.getClass();
                        View.AccessibilityDelegate accessibilityDelegateM1575c = AbstractC0738T.m1575c(view4);
                        if (accessibilityDelegateM1575c != null) {
                            c0747b = accessibilityDelegateM1575c instanceof C0745a ? ((C0745a) accessibilityDelegateM1575c).f2113a : new C0747b(accessibilityDelegateM1575c);
                        }
                        if (c0747b != null && c0747b != c1935q0) {
                            c1935q0.f5713e.put(view4, c0747b);
                        }
                    }
                    AbstractC0738T.m1584l(view4, c1935q0);
                }
            } else {
                z11 = true;
            }
            if (c1925l0.f5642g) {
                abstractC1933p0Mo2902e.f5686g = i10;
            }
            z12 = z11;
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
                c1901z = (C1901Z) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c1901z);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c1901z = (C1901Z) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(c1901z);
            } else {
                c1901z = (C1901Z) layoutParams;
            }
            c1901z.f5557a = abstractC1933p0Mo2902e;
            if (z6) {
                z11 = false;
            } else {
                z11 = false;
            }
            c1901z.f5560d = z11;
            return abstractC1933p0Mo2902e;
        }
        abstractC1933p0Mo2902e.f5686g = i10;
        z12 = false;
        z11 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
            c1901z = (C1901Z) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(c1901z);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            c1901z = (C1901Z) recyclerView.generateLayoutParams(layoutParams);
            view4.setLayoutParams(c1901z);
        } else {
            c1901z = (C1901Z) layoutParams;
        }
        c1901z.f5557a = abstractC1933p0Mo2902e;
        if (z6) {
            z11 = false;
        } else {
            z11 = false;
        }
        c1901z.f5560d = z11;
        return abstractC1933p0Mo2902e;
    }

    /* JADX INFO: renamed from: l */
    public final void m3037l(AbstractC1933p0 abstractC1933p0) {
        if (abstractC1933p0.f5694o) {
            this.f5587b.remove(abstractC1933p0);
        } else {
            this.f5586a.remove(abstractC1933p0);
        }
        abstractC1933p0.f5693n = null;
        abstractC1933p0.f5694o = false;
        abstractC1933p0.f5689j &= -33;
    }

    /* JADX INFO: renamed from: m */
    public final void m3038m() {
        AbstractC1900Y abstractC1900Y = this.f5593h.f33592B0;
        this.f5591f = this.f5590e + (abstractC1900Y != null ? abstractC1900Y.f5551j : 0);
        ArrayList arrayList = this.f5588c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5591f; size--) {
            m3032g(size);
        }
    }
}

package p084D4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;

/* JADX INFO: renamed from: D4.O */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1891O implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5526Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RecyclerView f5527Z;

    public /* synthetic */ RunnableC1891O(RecyclerView recyclerView, int i10) {
        this.f5526Y = i10;
        this.f5527Z = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f5527Z;
        switch (this.f5526Y) {
            case 0:
                if (recyclerView.f33606I0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f33602G0) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.f33611L0) {
                        recyclerView.m12295p();
                    } else {
                        recyclerView.f33610K0 = true;
                    }
                    break;
                }
                break;
            default:
                AbstractC1897V abstractC1897V = recyclerView.f33625Z0;
                if (abstractC1897V != null) {
                    C1934q c1934q = (C1934q) abstractC1897V;
                    ArrayList arrayList = c1934q.f5701h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1934q.f5703j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1934q.f5704k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1934q.f5702i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j10 = c1934q.f5535d;
                            if (zHasNext) {
                                AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) it.next();
                                View view = abstractC1933p0.f5680a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1934q.f5710q.add(abstractC1933p0);
                                viewPropertyAnimatorAnimate.setDuration(j10).alpha(0.0f).setListener(new C1924l(c1934q, abstractC1933p0, viewPropertyAnimatorAnimate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1934q.f5706m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1922k runnableC1922k = new RunnableC1922k(c1934q, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1922k.run();
                                    } else {
                                        View view2 = ((C1932p) arrayList5.get(0)).f5674a.f5680a;
                                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                                        view2.postOnAnimationDelayed(runnableC1922k, j10);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1934q.f5707n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1922k runnableC1922k2 = new RunnableC1922k(c1934q, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC1922k2.run();
                                    } else {
                                        View view3 = ((C1930o) arrayList6.get(0)).f5661a.f5680a;
                                        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                                        view3.postOnAnimationDelayed(runnableC1922k2, j10);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1934q.f5705l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1922k runnableC1922k3 = new RunnableC1922k(c1934q, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1922k3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j10 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c1934q.f5536e : 0L, zIsEmpty3 ? 0L : c1934q.f5537f) + j10;
                                        View view4 = ((AbstractC1933p0) arrayList7.get(0)).f5680a;
                                        WeakHashMap weakHashMap3 = AbstractC0738T.f2096a;
                                        view4.postOnAnimationDelayed(runnableC1922k3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f33659x1 = false;
                break;
        }
    }
}

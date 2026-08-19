package p084D4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: D4.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1922k implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5628Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f5629Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1934q f5630o0;

    public /* synthetic */ RunnableC1922k(C1934q c1934q, ArrayList arrayList, int i10) {
        this.f5628Y = i10;
        this.f5630o0 = c1934q;
        this.f5629Z = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5628Y) {
            case 0:
                ArrayList arrayList = this.f5629Z;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1934q c1934q = this.f5630o0;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1934q.f5706m.remove(arrayList);
                    } else {
                        C1932p c1932p = (C1932p) it.next();
                        AbstractC1933p0 abstractC1933p0 = c1932p.f5674a;
                        c1934q.getClass();
                        View view = abstractC1933p0.f5680a;
                        int i10 = c1932p.f5677d - c1932p.f5675b;
                        int i11 = c1932p.f5678e - c1932p.f5676c;
                        if (i10 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i11 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1934q.f5709p.add(abstractC1933p0);
                        viewPropertyAnimatorAnimate.setDuration(c1934q.f5536e).setListener(new C1926m(c1934q, abstractC1933p0, i10, view, i11, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f5629Z;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1934q c1934q2 = this.f5630o0;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1934q2.f5707n.remove(arrayList2);
                    } else {
                        C1930o c1930o = (C1930o) it2.next();
                        c1934q2.getClass();
                        AbstractC1933p0 abstractC1933p1 = c1930o.f5661a;
                        View view2 = abstractC1933p1 == null ? null : abstractC1933p1.f5680a;
                        AbstractC1933p0 abstractC1933p2 = c1930o.f5662b;
                        View view3 = abstractC1933p2 != null ? abstractC1933p2.f5680a : null;
                        ArrayList arrayList3 = c1934q2.f5711r;
                        long j10 = c1934q2.f5537f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j10);
                            arrayList3.add(c1930o.f5661a);
                            duration.translationX(c1930o.f5665e - c1930o.f5663c);
                            duration.translationY(c1930o.f5666f - c1930o.f5664d);
                            duration.alpha(0.0f).setListener(new C1928n(c1934q2, c1930o, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1930o.f5662b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j10).alpha(1.0f).setListener(new C1928n(c1934q2, c1930o, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it2 = it2;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = this.f5629Z;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1934q c1934q3 = this.f5630o0;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1934q3.f5705l.remove(arrayList4);
                    } else {
                        AbstractC1933p0 abstractC1933p3 = (AbstractC1933p0) it3.next();
                        c1934q3.getClass();
                        View view4 = abstractC1933p3.f5680a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1934q3.f5708o.add(abstractC1933p3);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1934q3.f5534c).setListener(new C1924l(c1934q3, abstractC1933p3, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}

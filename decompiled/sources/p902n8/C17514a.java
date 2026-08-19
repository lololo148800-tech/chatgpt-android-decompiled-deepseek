package p902n8;

import ac.C10539a;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import cc.C11696a;
import cc.C11700e;
import cc.InterfaceC11698c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p025An.C0644w;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p468T2.C7224p;
import p523V9.AbstractC7854B5;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p704dc.C13060a;
import p746fa.C13606o;
import p949pj.C18452Z;
import p949pj.C18454a0;
import p949pj.C18456b0;
import p949pj.C18458c0;
import p949pj.C18460d0;
import p949pj.C18462e0;
import p949pj.C18464f0;
import p949pj.C18472j0;
import p949pj.C18474k0;
import p949pj.C18476l0;
import p949pj.C18482o0;
import p949pj.EnumC18480n0;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17514a implements InterfaceC17524k {

    /* JADX INFO: renamed from: a */
    public double f56014a;

    /* JADX INFO: renamed from: b */
    public final Serializable f56015b;

    public C17514a(int i10) {
        switch (i10) {
            case 1:
                this.f56014a = 0.35d;
                this.f56015b = AbstractC9227W.m9800c(C18482o0.f58928Z);
                break;
            default:
                this.f56014a = Double.NaN;
                this.f56015b = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m19199d(C7224p c7224p, EnumC18480n0 enumC18480n0) {
        Bitmap bitmap = (Bitmap) ((C17314q) c7224p.f22916f).getValue();
        if (bitmap == null) {
            return AbstractC9233X.m9806b(new RuntimeException("Error converting bitmap"));
        }
        int iOrdinal = enumC18480n0.ordinal();
        if (iOrdinal == 0) {
            return new C18472j0(bitmap);
        }
        if (iOrdinal == 1) {
            return new C18474k0(bitmap);
        }
        if (iOrdinal == 2) {
            return new C18476l0(bitmap);
        }
        throw new C0644w();
    }

    @Override // p902n8.InterfaceC17524k
    /* JADX INFO: renamed from: a */
    public void mo19200a(InterfaceC17523j listener) {
        AbstractC16544l.m18094g(listener, "listener");
        synchronized (((LinkedHashMap) this.f56015b)) {
        }
    }

    @Override // p902n8.InterfaceC17524k
    /* JADX INFO: renamed from: b */
    public void mo19201b(double d10) {
        this.f56014a = d10;
        synchronized (((LinkedHashMap) this.f56015b)) {
            Iterator it = ((LinkedHashMap) this.f56015b).keySet().iterator();
            while (it.hasNext()) {
                m19204f((InterfaceC17523j) it.next(), d10);
            }
        }
    }

    @Override // p902n8.InterfaceC17524k
    /* JADX INFO: renamed from: c */
    public void mo19202c(InterfaceC17523j interfaceC17523j) {
        double d10 = this.f56014a;
        synchronized (((LinkedHashMap) this.f56015b)) {
            ((LinkedHashMap) this.f56015b).put(interfaceC17523j, C17522i.f56047e);
        }
        if (Double.isNaN(d10)) {
            return;
        }
        m19204f(interfaceC17523j, d10);
    }

    /* JADX INFO: renamed from: f */
    public void m19204f(InterfaceC17523j interfaceC17523j, double d10) {
        C17522i c17522i = (C17522i) ((LinkedHashMap) this.f56015b).get(interfaceC17523j);
        if (c17522i == null) {
            c17522i = C17522i.f56047e;
        }
        int i10 = c17522i.f56048a;
        int i11 = i10 + 1;
        C17522i c17522i2 = new C17522i(Math.min(d10, c17522i.f56049b), Math.max(d10, c17522i.f56050c), ((((double) i10) * c17522i.f56051d) + d10) / ((double) i11), i11);
        interfaceC17523j.mo14930a(c17522i2);
        synchronized (((LinkedHashMap) this.f56015b)) {
            ((LinkedHashMap) this.f56015b).put(interfaceC17523j, c17522i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m19203e(C7224p c7224p) throws InterruptedException {
        C10539a c10539aM7619a = c7224p.m7619a();
        int i10 = c10539aM7619a.f31259f;
        boolean zContains = false;
        int i11 = c10539aM7619a.f31258e;
        int i12 = c10539aM7619a.f31257d;
        Rect rect = (i10 == 90 || i10 == 270) ? new Rect(0, 0, i11, i12) : new Rect(0, 0, i12, i11);
        C13606o c13606oM12770k = ((C13060a) ((InterfaceC11698c) ((C17314q) this.f56015b).getValue())).m12770k(c10539aM7619a);
        AbstractC16544l.m18093f(c13606oM12770k, QzvfuIgrngtl.QnSgTvBbIe);
        try {
            AbstractC7854B5.m8113a(c13606oM12770k);
            List list = (List) c13606oM12770k.m15130i();
            if (list.isEmpty()) {
                return AbstractC9233X.m9806b(new C18464f0());
            }
            int i13 = 1;
            if (list.size() != 1) {
                return AbstractC9233X.m9806b(new C18462e0());
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Rect rect2 = ((C11696a) obj).f35480a;
                AbstractC16544l.m18093f(rect2, "getBoundingBox(...)");
                if (Math.max(rect2.width(), rect2.height()) <= ((double) Math.min(rect.width(), rect.height())) * 0.8d) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return AbstractC9233X.m9806b(new C18456b0());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Rect rect3 = ((C11696a) obj2).f35480a;
                AbstractC16544l.m18093f(rect3, "getBoundingBox(...)");
                if (Math.max(rect3.width(), rect3.height()) >= ((double) Math.min(rect.width(), rect.height())) * this.f56014a) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                return AbstractC9233X.m9806b(new C18458c0());
            }
            Object objM15130i = c13606oM12770k.m15130i();
            AbstractC16544l.m18093f(objM15130i, "getResult(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) objM15130i) {
                Rect rect4 = ((C11696a) obj3).f35480a;
                AbstractC16544l.m18093f(rect4, "getBoundingBox(...)");
                int iWidth = rect.width();
                int iHeight = rect.height();
                int i14 = iWidth / 2;
                int i15 = iHeight / 2;
                int iMin = Math.min(iWidth, iHeight) / 2;
                Rect rect5 = new Rect(0, 0, iWidth, iHeight);
                rect5.inset(25, 25);
                if (rect5.contains(rect4)) {
                    int iWidth2 = rect.width() - rect4.right;
                    if (iWidth2 < i13) {
                        iWidth2 = i13;
                    }
                    int i16 = rect4.left;
                    if (i16 < i13) {
                        i16 = i13;
                    }
                    if (((double) Math.abs(iWidth2 - i16)) / ((double) rect.width()) <= 0.3d && rect4.left > i14 - iMin && rect4.right < i14 + iMin && rect4.top > i15 - iMin && rect4.bottom < i15 + iMin) {
                        arrayList3.add(obj3);
                    }
                }
                i13 = 1;
            }
            if (arrayList3.isEmpty()) {
                return AbstractC9233X.m9806b(new C18454a0());
            }
            C11696a c11696a = (C11696a) arrayList3.get(0);
            float f10 = c11696a.f35486g;
            if (-10.0f >= f10 || f10 >= 10.0f) {
                if (f10 < -15.0f) {
                    return m19199d(c7224p, EnumC18480n0.f58926o0);
                }
                return 15.0f < f10 ? m19199d(c7224p, EnumC18480n0.f58925Z) : AbstractC9233X.m9806b(new C18460d0());
            }
            int iWidth3 = rect.width();
            int iHeight2 = rect.height();
            C11700e c11700e = (C11700e) c11696a.f35488i.get(6);
            if (c11700e != null) {
                double d10 = iWidth3 / 2;
                double dMin = (((double) Math.min(iWidth3, iHeight2)) * 0.4d) / ((double) 2);
                double d11 = iHeight2 / 2;
                Rect rect6 = new Rect((int) (d10 - dMin), (int) (d11 - dMin), (int) (d10 + dMin), (int) (d11 + dMin));
                PointF pointF = c11700e.f35495b;
                zContains = rect6.contains((int) pointF.x, (int) pointF.y);
            }
            return !zContains ? AbstractC9233X.m9806b(new C18454a0()) : m19199d(c7224p, EnumC18480n0.f58924Y);
        } catch (ExecutionException unused) {
            return AbstractC9233X.m9806b(new C18452Z());
        }
    }
}

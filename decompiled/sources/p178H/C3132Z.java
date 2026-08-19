package p178H;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p001A.C0072l;
import p001A.C0093v0;
import p001A.RunnableC0074m;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: H.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C3132Z implements InterfaceC3820W, InterfaceC3181y {

    /* JADX INFO: renamed from: Y */
    public final Object f9419Y;

    /* JADX INFO: renamed from: Z */
    public final C3131Y f9420Z;

    /* JADX INFO: renamed from: o0 */
    public int f9421o0;

    /* JADX INFO: renamed from: p0 */
    public final C0072l f9422p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f9423q0;

    /* JADX INFO: renamed from: r0 */
    public final C0093v0 f9424r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC3819V f9425s0;

    /* JADX INFO: renamed from: t0 */
    public Executor f9426t0;

    /* JADX INFO: renamed from: u0 */
    public final LongSparseArray f9427u0;

    /* JADX INFO: renamed from: v0 */
    public final LongSparseArray f9428v0;

    /* JADX INFO: renamed from: w0 */
    public int f9429w0;

    /* JADX INFO: renamed from: x0 */
    public final ArrayList f9430x0;

    /* JADX INFO: renamed from: y0 */
    public final ArrayList f9431y0;

    public C3132Z(int i10, int i11, int i12, int i13) {
        C0093v0 c0093v0 = new C0093v0(ImageReader.newInstance(i10, i11, i12, i13));
        this.f9419Y = new Object();
        this.f9420Z = new C3131Y(this, 0);
        this.f9421o0 = 0;
        this.f9422p0 = new C0072l(this, 26);
        this.f9423q0 = false;
        this.f9427u0 = new LongSparseArray();
        this.f9428v0 = new LongSparseArray();
        this.f9431y0 = new ArrayList();
        this.f9424r0 = c0093v0;
        this.f9429w0 = 0;
        this.f9430x0 = new ArrayList(mo350t());
    }

    @Override // p178H.InterfaceC3181y
    /* JADX INFO: renamed from: a */
    public final void mo3953a(AbstractC3182z abstractC3182z) {
        synchronized (this.f9419Y) {
            m3973b(abstractC3182z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3973b(AbstractC3182z abstractC3182z) {
        synchronized (this.f9419Y) {
            try {
                int iIndexOf = this.f9430x0.indexOf(abstractC3182z);
                if (iIndexOf >= 0) {
                    this.f9430x0.remove(iIndexOf);
                    int i10 = this.f9429w0;
                    if (iIndexOf <= i10) {
                        this.f9429w0 = i10 - 1;
                    }
                }
                this.f9431y0.remove(abstractC3182z);
                if (this.f9421o0 > 0) {
                    m3975d(this.f9424r0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3974c(C3152j0 c3152j0) {
        InterfaceC3819V interfaceC3819V;
        Executor executor;
        synchronized (this.f9419Y) {
            try {
                if (this.f9430x0.size() < mo350t()) {
                    c3152j0.m4027a(this);
                    this.f9430x0.add(c3152j0);
                    interfaceC3819V = this.f9425s0;
                    executor = this.f9426t0;
                } else {
                    AbstractC8072d6.m8486c("TAG", "Maximum image number reached.");
                    c3152j0.close();
                    interfaceC3819V = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC3819V != null) {
            if (executor != null) {
                executor.execute(new RunnableC0074m(this, 21, interfaceC3819V));
            } else {
                interfaceC3819V.mo256d(this);
            }
        }
    }

    @Override // p228J.InterfaceC3820W
    public final void close() {
        synchronized (this.f9419Y) {
            try {
                if (this.f9423q0) {
                    return;
                }
                Iterator it = new ArrayList(this.f9430x0).iterator();
                while (it.hasNext()) {
                    ((InterfaceC3127U) it.next()).close();
                }
                this.f9430x0.clear();
                this.f9424r0.close();
                this.f9423q0 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3975d(InterfaceC3820W interfaceC3820W) {
        InterfaceC3127U interfaceC3127UMo354x;
        synchronized (this.f9419Y) {
            try {
                if (this.f9423q0) {
                    return;
                }
                int size = this.f9428v0.size() + this.f9430x0.size();
                if (size >= interfaceC3820W.mo350t()) {
                    AbstractC8072d6.m8486c("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        interfaceC3127UMo354x = interfaceC3820W.mo354x();
                        if (interfaceC3127UMo354x != null) {
                            this.f9421o0--;
                            size++;
                            this.f9428v0.put(interfaceC3127UMo354x.mo3968k0().mo3966f(), interfaceC3127UMo354x);
                            m3976e();
                        }
                    } catch (IllegalStateException e10) {
                        String strM8491h = AbstractC8072d6.m8491h("MetadataImageReader");
                        if (AbstractC8072d6.m8490g(3, strM8491h)) {
                            Log.d(strM8491h, "Failed to acquire next image.", e10);
                        }
                        interfaceC3127UMo354x = null;
                    }
                    if (interfaceC3127UMo354x == null || this.f9421o0 <= 0) {
                        break;
                    }
                } while (size < interfaceC3820W.mo350t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3976e() {
        synchronized (this.f9419Y) {
            try {
                for (int size = this.f9427u0.size() - 1; size >= 0; size--) {
                    InterfaceC3125S interfaceC3125S = (InterfaceC3125S) this.f9427u0.valueAt(size);
                    long jMo3966f = interfaceC3125S.mo3966f();
                    InterfaceC3127U interfaceC3127U = (InterfaceC3127U) this.f9428v0.get(jMo3966f);
                    if (interfaceC3127U != null) {
                        this.f9428v0.remove(jMo3966f);
                        this.f9427u0.removeAt(size);
                        m3974c(new C3152j0(interfaceC3127U, null, interfaceC3125S));
                    }
                }
                m3977f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3977f() {
        synchronized (this.f9419Y) {
            try {
                if (this.f9428v0.size() != 0 && this.f9427u0.size() != 0) {
                    long jKeyAt = this.f9428v0.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f9427u0.keyAt(0);
                    AbstractC4941g.m5555N(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f9428v0.size() - 1; size >= 0; size--) {
                            if (this.f9428v0.keyAt(size) < jKeyAt2) {
                                ((InterfaceC3127U) this.f9428v0.valueAt(size)).close();
                                this.f9428v0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f9427u0.size() - 1; size2 >= 0; size2--) {
                            if (this.f9427u0.keyAt(size2) < jKeyAt) {
                                this.f9427u0.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3820W
    public final int getHeight() {
        int height;
        synchronized (this.f9419Y) {
            height = this.f9424r0.getHeight();
        }
        return height;
    }

    @Override // p228J.InterfaceC3820W
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f9419Y) {
            surface = this.f9424r0.getSurface();
        }
        return surface;
    }

    @Override // p228J.InterfaceC3820W
    public final int getWidth() {
        int width;
        synchronized (this.f9419Y) {
            width = this.f9424r0.getWidth();
        }
        return width;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: i */
    public final InterfaceC3127U mo342i() {
        synchronized (this.f9419Y) {
            try {
                if (this.f9430x0.isEmpty()) {
                    return null;
                }
                if (this.f9429w0 >= this.f9430x0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f9430x0.size() - 1; i10++) {
                    if (!this.f9431y0.contains(this.f9430x0.get(i10))) {
                        arrayList.add((InterfaceC3127U) this.f9430x0.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3127U) it.next()).close();
                }
                int size = this.f9430x0.size();
                ArrayList arrayList2 = this.f9430x0;
                this.f9429w0 = size;
                InterfaceC3127U interfaceC3127U = (InterfaceC3127U) arrayList2.get(size - 1);
                this.f9431y0.add(interfaceC3127U);
                return interfaceC3127U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: j */
    public final int mo343j() {
        int iMo343j;
        synchronized (this.f9419Y) {
            iMo343j = this.f9424r0.mo343j();
        }
        return iMo343j;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: k */
    public final void mo344k() {
        synchronized (this.f9419Y) {
            this.f9424r0.mo344k();
            this.f9425s0 = null;
            this.f9426t0 = null;
            this.f9421o0 = 0;
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: p */
    public final void mo347p(InterfaceC3819V interfaceC3819V, Executor executor) {
        synchronized (this.f9419Y) {
            interfaceC3819V.getClass();
            this.f9425s0 = interfaceC3819V;
            executor.getClass();
            this.f9426t0 = executor;
            this.f9424r0.mo347p(this.f9422p0, executor);
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: t */
    public final int mo350t() {
        int iMo350t;
        synchronized (this.f9419Y) {
            iMo350t = this.f9424r0.mo350t();
        }
        return iMo350t;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: x */
    public final InterfaceC3127U mo354x() {
        synchronized (this.f9419Y) {
            try {
                if (this.f9430x0.isEmpty()) {
                    return null;
                }
                if (this.f9429w0 >= this.f9430x0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f9430x0;
                int i10 = this.f9429w0;
                this.f9429w0 = i10 + 1;
                InterfaceC3127U interfaceC3127U = (InterfaceC3127U) arrayList.get(i10);
                this.f9431y0.add(interfaceC3127U);
                return interfaceC3127U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

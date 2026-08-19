package p178H;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import p720e6.C13288c;

/* JADX INFO: renamed from: H.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3182z implements InterfaceC3127U {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC3127U f9591Z;

    /* JADX INFO: renamed from: Y */
    public final Object f9590Y = new Object();

    /* JADX INFO: renamed from: o0 */
    public final HashSet f9592o0 = new HashSet();

    public AbstractC3182z(InterfaceC3127U interfaceC3127U) {
        this.f9591Z = interfaceC3127U;
    }

    /* JADX INFO: renamed from: a */
    public final void m4027a(InterfaceC3181y interfaceC3181y) {
        synchronized (this.f9590Y) {
            this.f9592o0.add(interfaceC3181y);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f9591Z.close();
        synchronized (this.f9590Y) {
            hashSet = new HashSet(this.f9592o0);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC3181y) it.next()).mo3953a(this);
        }
    }

    @Override // p178H.InterfaceC3127U
    public int getHeight() {
        return this.f9591Z.getHeight();
    }

    @Override // p178H.InterfaceC3127U
    public int getWidth() {
        return this.f9591Z.getWidth();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: k0 */
    public InterfaceC3125S mo3968k0() {
        return this.f9591Z.mo3968k0();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: t */
    public final int mo3969t() {
        return this.f9591Z.mo3969t();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: v */
    public final C13288c[] mo3970v() {
        return this.f9591Z.mo3970v();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: w0 */
    public final Image mo3971w0() {
        return this.f9591Z.mo3971w0();
    }
}

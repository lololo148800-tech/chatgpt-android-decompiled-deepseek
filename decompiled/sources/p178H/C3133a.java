package p178H;

import android.graphics.Matrix;
import android.media.Image;
import p228J.C3875z0;
import p720e6.C13288c;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3133a implements InterfaceC3127U {

    /* JADX INFO: renamed from: Y */
    public final Image f9432Y;

    /* JADX INFO: renamed from: Z */
    public final C13288c[] f9433Z;

    /* JADX INFO: renamed from: o0 */
    public final C3143f f9434o0;

    public C3133a(Image image) {
        this.f9432Y = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f9433Z = new C13288c[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f9433Z[i10] = new C13288c(planes[i10]);
            }
        } else {
            this.f9433Z = new C13288c[0];
        }
        this.f9434o0 = new C3143f(C3875z0.f11717b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f9432Y.close();
    }

    @Override // p178H.InterfaceC3127U
    public final int getHeight() {
        return this.f9432Y.getHeight();
    }

    @Override // p178H.InterfaceC3127U
    public final int getWidth() {
        return this.f9432Y.getWidth();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC3125S mo3968k0() {
        return this.f9434o0;
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: t */
    public final int mo3969t() {
        return this.f9432Y.getFormat();
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: v */
    public final C13288c[] mo3970v() {
        return this.f9433Z;
    }

    @Override // p178H.InterfaceC3127U
    /* JADX INFO: renamed from: w0 */
    public final Image mo3971w0() {
        return this.f9432Y;
    }
}

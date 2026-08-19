package p516V1;

import p692d0.AbstractC12978q;
import p692d0.C12960M;
import p714e0.AbstractC13253a;

/* JADX INFO: renamed from: V1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7738b {

    /* JADX INFO: renamed from: a */
    public static final float[] f24403a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile C12960M f24404b = new C12960M(0);

    /* JADX INFO: renamed from: c */
    public static final Object[] f24405c;

    static {
        Object[] objArr = new Object[0];
        f24405c = objArr;
        synchronized (objArr) {
            f24404b.m14654e((int) 115.0f, new C7739c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f24404b.m14654e((int) 130.0f, new C7739c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f24404b.m14654e((int) 150.0f, new C7739c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f24404b.m14654e((int) 180.0f, new C7739c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f24404b.m14654e((int) 200.0f, new C7739c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f24404b.m14653d(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC7737a m8002a(float f10) {
        float fM14653d;
        InterfaceC7737a c7739c;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        InterfaceC7737a interfaceC7737a = (InterfaceC7737a) f24404b.m14652c(i10);
        if (interfaceC7737a != null) {
            return interfaceC7737a;
        }
        C12960M c12960m = f24404b;
        if (c12960m.f41155Y) {
            AbstractC12978q.m14672a(c12960m);
        }
        int iM14848a = AbstractC13253a.m14848a(c12960m.f41158p0, i10, c12960m.f41156Z);
        if (iM14848a >= 0) {
            return (InterfaceC7737a) f24404b.m14656g(iM14848a);
        }
        int i11 = -(iM14848a + 1);
        int i12 = i11 - 1;
        if (i11 >= f24404b.m14655f()) {
            C7739c c7739c2 = new C7739c(new float[]{1.0f}, new float[]{f10});
            m8003b(f10, c7739c2);
            return c7739c2;
        }
        float[] fArr = f24403a;
        if (i12 < 0) {
            c7739c = new C7739c(fArr, fArr);
            fM14653d = 1.0f;
        } else {
            fM14653d = f24404b.m14653d(i12) / 100.0f;
            c7739c = (InterfaceC7737a) f24404b.m14656g(i12);
        }
        float fM14653d2 = f24404b.m14653d(i11) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fM14653d == fM14653d2 ? 0.0f : (f10 - fM14653d) / (fM14653d2 - fM14653d))) * 1.0f) + 0.0f;
        InterfaceC7737a interfaceC7737a2 = (InterfaceC7737a) f24404b.m14656g(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f11 = fArr[i13];
            float fMo7892b = c7739c.mo7892b(f11);
            fArr2[i13] = ((interfaceC7737a2.mo7892b(f11) - fMo7892b) * fMax) + fMo7892b;
        }
        C7739c c7739c3 = new C7739c(fArr, fArr2);
        m8003b(f10, c7739c3);
        return c7739c3;
    }

    /* JADX INFO: renamed from: b */
    public static void m8003b(float f10, C7739c c7739c) {
        synchronized (f24405c) {
            C12960M c12960mClone = f24404b.clone();
            c12960mClone.m14654e((int) (f10 * 100.0f), c7739c);
            f24404b = c12960mClone;
        }
    }
}

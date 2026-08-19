package p057C3;

import android.util.Base64;
import p083D3.C1870h;
import p1016t3.InterfaceC19772W;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: C3.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1571p implements InterfaceC10536i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4396Y;

    @Override // p644ab.InterfaceC10536i
    public final Object get() {
        switch (this.f4396Y) {
            case 0:
                return new C1564i();
            case 1:
                byte[] bArr = new byte[12];
                C1870h.f5381i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC19772W) objInvoke;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}

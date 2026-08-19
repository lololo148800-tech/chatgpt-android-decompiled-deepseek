package p080D0;

import android.media.MediaCodec;
import java.util.Comparator;
import p003A1.C0227a;
import p007A5.C0376k;
import p049Bm.InterfaceC1436k;
import p165G9.AbstractC3021g;
import p178H.C3142e0;
import p182H3.InterfaceC3225z;
import p228J.C3832e;

/* JADX INFO: renamed from: D0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1817m0 implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5232Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f5233Z;

    public /* synthetic */ C1817m0(Object obj, int i10) {
        this.f5232Y = i10;
        this.f5233Z = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5232Y) {
            case 0:
                return ((Number) ((C0227a) this.f5233Z).invoke(obj, obj2)).intValue();
            case 1:
                InterfaceC3225z interfaceC3225z = (InterfaceC3225z) this.f5233Z;
                return interfaceC3225z.mo254a(obj2) - interfaceC3225z.mo254a(obj);
            case 2:
                C3832e c3832e = (C3832e) obj2;
                ((C0376k) this.f5233Z).getClass();
                Class cls = ((C3832e) obj).f11597a.f11535j;
                int i10 = 1;
                int i11 = cls == MediaCodec.class ? 2 : cls == C3142e0.class ? 0 : 1;
                Class cls2 = c3832e.f11597a.f11535j;
                if (cls2 == MediaCodec.class) {
                    i10 = 2;
                } else if (cls2 == C3142e0.class) {
                    i10 = 0;
                }
                return i11 - i10;
            default:
                for (InterfaceC1436k interfaceC1436k : (InterfaceC1436k[]) this.f5233Z) {
                    int iM3873a = AbstractC3021g.m3873a((Comparable) interfaceC1436k.invoke(obj), (Comparable) interfaceC1436k.invoke(obj2));
                    if (iM3873a != 0) {
                        return iM3873a;
                    }
                }
                return 0;
        }
    }
}

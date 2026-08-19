package p281L3;

import android.media.Spatializer;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p110E4.C2307e;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: L3.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4917d implements InterfaceC10533f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4928o f16013Y;

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    @Override // p644ab.InterfaceC10533f
    public final boolean apply(Object obj) {
        boolean z6;
        C2307e c2307e;
        C2307e c2307e2;
        boolean z10 = false;
        byte b = 2;
        C4928o c4928o = this.f16013Y;
        C19788o c19788o = (C19788o) obj;
        synchronized (c4928o.f16086c) {
            try {
                if (!c4928o.f16089f.f16051v || c4928o.f16088e || c19788o.f62729A <= 2) {
                    z10 = true;
                } else {
                    String str = c19788o.f62752m;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                b = !str.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                                break;
                            case 187078296:
                                b = !str.equals("audio/ac3") ? (byte) -1 : (byte) 1;
                                break;
                            case 187078297:
                                if (!str.equals("audio/ac4")) {
                                    b = -1;
                                }
                                break;
                            case 1504578661:
                                b = !str.equals("audio/eac3") ? (byte) -1 : (byte) 3;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                z6 = true;
                                break;
                            default:
                                z6 = false;
                                break;
                        }
                    } else {
                        z6 = false;
                    }
                    if (z6 && (AbstractC20817s.f66106a < 32 || (c2307e2 = c4928o.f16090g) == null || !c2307e2.f7158Z)) {
                        z10 = true;
                    } else if (AbstractC20817s.f66106a >= 32 && (c2307e = c4928o.f16090g) != null && c2307e.f7158Z && ((Spatializer) c2307e.f7159o0).isAvailable() && ((Spatializer) c4928o.f16090g.f7159o0).isEnabled() && c4928o.f16090g.m3394d(c4928o.f16091h, c19788o)) {
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}

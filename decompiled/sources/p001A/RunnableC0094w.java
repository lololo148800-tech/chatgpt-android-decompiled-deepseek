package p001A;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p178H.C3142e0;
import p283L5.AbstractC4941g;
import p310M9.C5311e;

/* JADX INFO: renamed from: A.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0094w implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f406Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0018J f407Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f408o0;

    public /* synthetic */ RunnableC0094w(C0018J c0018j, ArrayList arrayList, int i10) {
        this.f406Y = i10;
        this.f407Z = c0018j;
        this.f408o0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5311e c5311e;
        switch (this.f406Y) {
            case 0:
                C0018J c0018j = this.f407Z;
                ArrayList<C0054c> arrayList = this.f408o0;
                c0018j.getClass();
                ArrayList arrayList2 = new ArrayList();
                boolean z6 = false;
                boolean z10 = false;
                for (C0054c c0054c : arrayList) {
                    if (c0018j.f90Y.m21931u(c0054c.f251a)) {
                        ((LinkedHashMap) c0018j.f90Y.f68345o0).remove(c0054c.f251a);
                        arrayList2.add(c0054c.f251a);
                        if (c0054c.f252b == C3142e0.class) {
                            z10 = true;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                c0018j.m126v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                if (z10) {
                    c0018j.f96s0.f374s0.f27e = null;
                }
                c0018j.m117m();
                if (c0018j.f90Y.m21928q().isEmpty()) {
                    c0018j.f96s0.f378w0.f232c = false;
                } else {
                    c0018j.m104N();
                }
                if (!c0018j.f90Y.m21927n().isEmpty()) {
                    c0018j.m103M();
                    c0018j.m96F();
                    if (c0018j.f89T0 == 9) {
                        c0018j.m94D();
                        return;
                    }
                    return;
                }
                c0018j.f96s0.m298b();
                c0018j.m96F();
                c0018j.f96s0.m309p(false);
                c0018j.f101x0 = c0018j.m92B();
                c0018j.m126v("Closing camera.", null);
                switch (AbstractC0010F.m24h(c0018j.f89T0)) {
                    case 3:
                        AbstractC4941g.m5559R(null, c0018j.f99v0 == null);
                        c0018j.m97G(3);
                        return;
                    case 4:
                    default:
                        c0018j.m126v("close() ignored due to being in state: ".concat(AbstractC0010F.m25i(c0018j.f89T0)), null);
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (c0018j.f97t0.m52a() || ((c5311e = (C5311e) c0018j.f88S0.f47967Z) != null && !((AtomicBoolean) c5311e.f17485o0).get())) {
                            z6 = true;
                        }
                        c0018j.f88S0.m16637k();
                        c0018j.m97G(5);
                        if (z6) {
                            AbstractC4941g.m5559R(null, c0018j.f102y0.isEmpty());
                            c0018j.m124t();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        c0018j.m97G(5);
                        c0018j.m123s();
                        return;
                }
            default:
                ArrayList arrayList3 = this.f408o0;
                C0018J c0018j2 = this.f407Z;
                C0088t c0088t = c0018j2.f96s0;
                try {
                    c0018j2.m100J(arrayList3);
                    return;
                } finally {
                    c0088t.m298b();
                }
        }
    }
}

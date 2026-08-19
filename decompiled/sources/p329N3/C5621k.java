package p329N3;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import fo.C13718o;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17316s;
import p057C3.C1567l;
import p1073w3.AbstractC20817s;
import p182H3.InterfaceC3210k;
import p658b5.C11232c;
import p749fd.C13628m;

/* JADX INFO: renamed from: N3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5621k implements Handler.Callback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18203Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f18204Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f18205o0;

    public C5621k(C13628m c13628m, Handler.Callback callback) {
        this.f18204Z = c13628m;
        this.f18205o0 = callback;
    }

    /* JADX INFO: renamed from: a */
    public void m6010a(long j10) {
        Surface surface;
        C5622l c5622l = (C5622l) this.f18205o0;
        if (this != c5622l.f18239v2 || c5622l.f9756W0 == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            c5622l.f9738J1 = true;
            return;
        }
        try {
            c5622l.m4114t0(j10);
            c5622l.m6024z0(c5622l.f18234q2);
            c5622l.f9742L1.f4315e++;
            C5625o c5625o = c5622l.f18214W1;
            boolean z6 = c5625o.f18254d != 3;
            c5625o.f18254d = 3;
            c5625o.f18261k.getClass();
            c5625o.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
            if (z6 && (surface = c5622l.f18222e2) != null) {
                C11232c c11232c = c5622l.f18211S1;
                Handler handler = (Handler) c11232c.f33996Y;
                if (handler != null) {
                    handler.post(new RunnableC5632v(c11232c, surface, SystemClock.elapsedRealtime(), 0));
                }
                c5622l.f18225h2 = true;
            }
            c5622l.mo4101b0(j10);
        } catch (C1567l e10) {
            c5622l.f9740K1 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        switch (this.f18203Y) {
            case 0:
                if (msg.what != 0) {
                    return false;
                }
                int i10 = msg.arg1;
                int i11 = msg.arg2;
                int i12 = AbstractC20817s.f66106a;
                m6010a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
                return true;
            default:
                AbstractC16544l.m18095h(msg, "msg");
                Object obj = msg.obj;
                if (!(obj instanceof IBinder)) {
                    return false;
                }
                if (msg.what == 116) {
                    if (obj == null) {
                        throw new C17316s("null cannot be cast to non-null type android.os.IBinder");
                    }
                    IBinder iBinder = (IBinder) obj;
                    C13628m c13628m = (C13628m) this.f18204Z;
                    Service service = (Service) ((Map) ((C13718o) c13628m.f43062Z).f43277d.getValue()).get(iBinder);
                    if (service != null) {
                        ((C13718o) c13628m.f43062Z).f43274a.put(iBinder, new WeakReference(service));
                    }
                }
                Handler.Callback callback = (Handler.Callback) this.f18205o0;
                if (callback != null) {
                    return callback.handleMessage(msg);
                }
                return false;
        }
    }

    public C5621k(C5622l c5622l, InterfaceC3210k interfaceC3210k) {
        this.f18205o0 = c5622l;
        Handler handlerM21411l = AbstractC20817s.m21411l(this);
        this.f18204Z = handlerM21411l;
        interfaceC3210k.mo4063l(this, handlerM21411l);
    }
}

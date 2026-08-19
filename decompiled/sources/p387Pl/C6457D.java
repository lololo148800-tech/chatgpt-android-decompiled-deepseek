package p387Pl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoTrack;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p197Hj.C3457c;
import p199Hl.C3472H;
import p199Hl.C3473I;
import p249Jl.SurfaceHolderCallbackC4482b;
import p273Kl.C4714D;
import p435Rl.AbstractC6932p;
import p435Rl.C6934r;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p583Xl.AbstractC9537d;
import p867l8.C16831c;

/* JADX INFO: renamed from: Pl.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6457D extends AbstractC6482b0 {

    /* JADX INFO: renamed from: k */
    public final boolean f20948k;

    /* JADX INFO: renamed from: l */
    public final C2925c f20949l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f20950m;

    /* JADX INFO: renamed from: n */
    public boolean f20951n;

    /* JADX INFO: renamed from: o */
    public C6460G f20952o;

    /* JADX INFO: renamed from: p */
    public final RtpReceiver f20953p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6457D(VideoTrack videoTrack, boolean z6, AbstractC0563B dispatcher, RtpReceiver receiver) {
        super("", videoTrack);
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(receiver, "receiver");
        this.f20948k = z6;
        this.f20949l = AbstractC0575H.m1174c(dispatcher.plus(AbstractC0575H.m1176e()));
        this.f20950m = new LinkedHashMap();
        this.f20952o = new C6460G(0, 0);
        this.f20953p = receiver;
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: a */
    public final void mo7038a() {
        super.mo7038a();
        AbstractC0575H.m1180i(this.f20949l, null);
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: f */
    public final void mo7039f() {
        AbstractC9537d.m10030a(new C3457c(this, 28));
        m7053e(false);
        synchronized (this.f20950m) {
            try {
                Iterator it = this.f20950m.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC6932p) it.next()).mo7314a();
                }
                this.f20950m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p387Pl.AbstractC6482b0
    /* JADX INFO: renamed from: g */
    public final void mo7040g(SurfaceHolderCallbackC4482b renderer) {
        AbstractC16544l.m18094g(renderer, "renderer");
        if (this.f20948k) {
            m7042j(renderer, new C6934r(renderer));
        } else {
            super.mo7040g(renderer);
        }
    }

    @Override // p387Pl.AbstractC6482b0
    /* JADX INFO: renamed from: i */
    public final void mo7041i(SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b) {
        AbstractC6932p abstractC6932p;
        AbstractC9537d.m10030a(new C4714D(this, 14, surfaceHolderCallbackC4482b));
        synchronized (this.f20950m) {
            abstractC6932p = (AbstractC6932p) this.f20950m.remove(surfaceHolderCallbackC4482b);
        }
        if (abstractC6932p != null) {
            abstractC6932p.mo7314a();
        }
        if (!this.f20948k || abstractC6932p == null) {
            return;
        }
        m7045m();
    }

    /* JADX INFO: renamed from: j */
    public final void m7042j(SurfaceHolderCallbackC4482b renderer, AbstractC6932p visibility) {
        AbstractC16544l.m18094g(renderer, "renderer");
        AbstractC16544l.m18094g(visibility, "visibility");
        super.mo7040g(renderer);
        if (this.f20948k) {
            synchronized (this.f20950m) {
                this.f20950m.put(renderer, visibility);
            }
            visibility.addObserver(new Observer() { // from class: Pl.B
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    C6457D this$0 = this.f20944a;
                    AbstractC16544l.m18094g(this$0, "this$0");
                    this$0.m7045m();
                }
            });
            m7045m();
            return;
        }
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18571j(new Object[0]);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7043k() {
        boolean z6;
        synchronized (this.f20950m) {
            try {
                Collection collectionValues = this.f20950m.values();
                z6 = false;
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((AbstractC6932p) it.next()).mo5400b()) {
                            z6 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: l */
    public final C6460G m7044l() {
        int iMax;
        int iMax2;
        synchronized (this.f20950m) {
            Iterator it = this.f20950m.values().iterator();
            iMax = 0;
            iMax2 = 0;
            while (it.hasNext()) {
                C6460G c6460gMo5401d = ((AbstractC6932p) it.next()).mo5401d();
                iMax = Math.max(iMax, c6460gMo5401d.f20962a);
                iMax2 = Math.max(iMax2, c6460gMo5401d.f20963b);
            }
        }
        return new C6460G(iMax, iMax2);
    }

    /* JADX INFO: renamed from: m */
    public final void m7045m() {
        boolean zM7043k;
        C6460G c6460gM7044l;
        synchronized (this.f20950m) {
            zM7043k = m7043k();
            c6460gM7044l = m7044l();
        }
        ArrayList arrayList = new ArrayList();
        if (zM7043k != this.f20951n) {
            this.f20951n = zM7043k;
            arrayList.add(new C3473I(this, zM7043k));
        }
        if (!c6460gM7044l.equals(this.f20952o)) {
            this.f20952o = c6460gM7044l;
            arrayList.add(new C3472H(this, c6460gM7044l));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC0575H.m1156D(this.f20949l, null, null, new C6456C(this, arrayList, null), 3);
    }
}

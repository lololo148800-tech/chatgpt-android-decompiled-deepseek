package p101Dl;

import android.media.AudioTrack;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p050Bn.C1451e;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8389a;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Dl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C2117r implements InterfaceC2112m {
    public static final C2116q Companion = new C2116q();

    /* JADX INFO: renamed from: a */
    public final C8389a f6475a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f6476b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f6477c;

    /* JADX INFO: renamed from: d */
    public AudioTrack f6478d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f6479e;

    public C2117r(C1451e dispatcher) {
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        C8389a c8389a = new C8389a(dispatcher);
        this.f6475a = c8389a;
        this.f6476b = AbstractC2124C.m3204c(Boolean.FALSE);
        this.f6477c = AbstractC2124C.m3204c(Boolean.TRUE);
        this.f6479e = new AtomicBoolean(false);
        AbstractC0575H.m1156D(c8389a, null, null, new C2115p(this, null), 3);
    }

    @Override // p101Dl.InterfaceC2112m
    /* JADX INFO: renamed from: a */
    public final void mo3184a() {
        Boolean bool = Boolean.TRUE;
        C2153Q0 c2153q0 = this.f6477c;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
    }

    @Override // p101Dl.InterfaceC2112m
    /* JADX INFO: renamed from: b */
    public final void mo3185b() {
        Boolean bool = Boolean.FALSE;
        C2153Q0 c2153q0 = this.f6477c;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
    }

    /* JADX INFO: renamed from: c */
    public final void m3186c() {
        AudioTrack audioTrack;
        if (this.f6479e.compareAndSet(true, false) && (audioTrack = this.f6478d) != null) {
            synchronized (audioTrack) {
                try {
                    if (audioTrack.getState() == 1) {
                        audioTrack.pause();
                    } else {
                        C8395g c8395g = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p101Dl.InterfaceC2112m
    public final void start() {
        Boolean bool = Boolean.TRUE;
        C2153Q0 c2153q0 = this.f6476b;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
    }

    @Override // p101Dl.InterfaceC2112m
    public final void stop() {
        Boolean bool = Boolean.FALSE;
        C2153Q0 c2153q0 = this.f6476b;
        c2153q0.getClass();
        c2153q0.m3251l(null, bool);
    }
}

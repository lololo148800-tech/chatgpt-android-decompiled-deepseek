package p993rj;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sj.C19661b;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C19054p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19024D f60715Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19054p(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60715Y = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19054p(this.f60715Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C19054p c19054p = (C19054p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c19054p.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19024D c19024d = this.f60715Y;
        Object value = c19024d.f60637v.getValue();
        C19050l c19050l = C19050l.f60712a;
        boolean zM18089b = AbstractC16544l.m18089b(value, c19050l);
        C17296C c17296c = C17296C.f55119a;
        if (zM18089b) {
            return c17296c;
        }
        C2153Q0 c2153q0 = c19024d.f60637v;
        c2153q0.getClass();
        c2153q0.m3251l(null, c19050l);
        c19024d.f60618c.getHolder().removeCallback(c19024d.f60640y);
        c19024d.f60615C.block(2000L);
        C19038S c19038s = c19024d.f60628m;
        c19038s.getClass();
        try {
            c19038s.m20294a().release();
        } catch (RuntimeException unused) {
        }
        try {
            c19038s.f60693h.stop();
        } catch (RuntimeException unused2) {
        } finally {
            c19038s.f60692g.delete();
        }
        c19024d.f60613A.close();
        C19031K c19031k = c19024d.f60631p;
        if (c19031k != null) {
            AbstractC0575H.m1180i(c19031k.f60664e, null);
        }
        c19024d.f60631p = null;
        CameraDevice cameraDevice = c19024d.f60629n;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        c19024d.f60629n = null;
        C19661b c19661b = c19024d.f60622g;
        c19661b.f62314a.unregisterListener(c19661b.f62319f);
        AbstractC0575H.m1180i(c19024d.f60624i, null);
        return c17296c;
    }
}

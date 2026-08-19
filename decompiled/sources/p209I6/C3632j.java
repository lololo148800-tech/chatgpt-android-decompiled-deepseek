package p209I6;

import android.hardware.camera2.CaptureResult;
import android.javax.sip.C10808o;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p228J.C3875z0;
import p228J.EnumC3848m;
import p228J.EnumC3850n;
import p228J.EnumC3852o;
import p228J.InterfaceC3854p;
import p253K.C4498i;

/* JADX INFO: renamed from: I6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3632j implements InterfaceC3647y, InterfaceC3854p {

    /* JADX INFO: renamed from: Y */
    public final long f11070Y;

    /* JADX INFO: renamed from: Z */
    public final Object f11071Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f11072o0;

    public C3632j(InterfaceC3854p interfaceC3854p, C3875z0 c3875z0, long j10) {
        this.f11071Z = interfaceC3854p;
        this.f11072o0 = c3875z0;
        this.f11070Y = j10;
    }

    @Override // p209I6.InterfaceC3647y
    /* JADX INFO: renamed from: b */
    public AbstractC3622B mo4344b(C3624b webSocketConnection, C10808o listener, InterfaceC0571F scope) {
        AbstractC16544l.m18094g(webSocketConnection, "webSocketConnection");
        AbstractC16544l.m18094g(listener, "listener");
        AbstractC16544l.m18094g(scope, "scope");
        return new C3635m(webSocketConnection, listener, this.f11070Y, (InterfaceC1436k) this.f11071Z, (EnumC3646x) this.f11072o0);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: c */
    public C3875z0 mo4345c() {
        return (C3875z0) this.f11072o0;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo4346e(C4498i c4498i) {
        AbstractC0168G.m518g(this, c4498i);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: f */
    public long mo4347f() {
        InterfaceC3854p interfaceC3854p = (InterfaceC3854p) this.f11071Z;
        if (interfaceC3854p != null) {
            return interfaceC3854p.mo4347f();
        }
        long j10 = this.f11070Y;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // p209I6.InterfaceC3647y
    public String getName() {
        return "graphql-ws";
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: l */
    public EnumC3852o mo4348l() {
        InterfaceC3854p interfaceC3854p = (InterfaceC3854p) this.f11071Z;
        return interfaceC3854p != null ? interfaceC3854p.mo4348l() : EnumC3852o.f11647Y;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: m */
    public int mo4349m() {
        InterfaceC3854p interfaceC3854p = (InterfaceC3854p) this.f11071Z;
        if (interfaceC3854p != null) {
            return interfaceC3854p.mo4349m();
        }
        return 1;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: q */
    public EnumC3848m mo4350q() {
        InterfaceC3854p interfaceC3854p = (InterfaceC3854p) this.f11071Z;
        return interfaceC3854p != null ? interfaceC3854p.mo4350q() : EnumC3848m.f11630Y;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: u */
    public /* synthetic */ CaptureResult mo4351u() {
        return null;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: w */
    public EnumC3850n mo4352w() {
        InterfaceC3854p interfaceC3854p = (InterfaceC3854p) this.f11071Z;
        return interfaceC3854p != null ? interfaceC3854p.mo4352w() : EnumC3850n.f11637Y;
    }

    public C3632j() {
        C3631i c3631i = new C3631i(1, null);
        EnumC3646x enumC3646x = EnumC3646x.f11129Y;
        this.f11070Y = 10000L;
        this.f11071Z = c3631i;
        this.f11072o0 = enumC3646x;
    }
}

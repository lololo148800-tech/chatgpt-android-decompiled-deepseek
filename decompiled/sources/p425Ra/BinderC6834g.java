package p425Ra;

import android.os.Bundle;
import android.os.Process;
import p003A1.AbstractC0168G;
import p333N9.AbstractBinderC5687h;
import p572Xa.C9427u;
import p572Xa.InterfaceC9426t;
import p582Xk.HXHG.TfazcFv;
import p746fa.C13599h;

/* JADX INFO: renamed from: Ra.g */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6834g extends AbstractBinderC5687h implements InterfaceC9426t {

    /* JADX INFO: renamed from: b */
    public final C13599h f21922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C6836i f21923c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f21924d;

    /* JADX INFO: renamed from: e */
    public final C9427u f21925e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C6836i f21926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6834g(C6836i c6836i, C13599h c13599h, byte b) {
        super(8);
        this.f21923c = c6836i;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f21922b = c13599h;
    }

    @Override // p572Xa.InterfaceC9426t
    /* JADX INFO: renamed from: c */
    public void mo7272c(Bundle bundle) {
        switch (this.f21924d) {
            case 0:
                m7274p(bundle);
                this.f21925e.m10000b("onRequestExpressIntegrityToken", new Object[0]);
                this.f21926f.f21931d.getClass();
                int i10 = bundle.getInt("error");
                C6828a c6828a = i10 != 0 ? new C6828a(i10, null) : null;
                C13599h c13599h = this.f21922b;
                if (c6828a != null) {
                    c13599h.m15115c(c6828a);
                    return;
                }
                bundle.getLong("request.token.sid");
                AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string == null) {
                    throw new NullPointerException("Null token");
                }
                c13599h.m15116d(new C6838k(string));
                return;
            default:
                m7274p(bundle);
                return;
        }
    }

    @Override // p572Xa.InterfaceC9426t
    /* JADX INFO: renamed from: h */
    public void mo7273h(Bundle bundle) {
        switch (this.f21924d) {
            case 1:
                m7275q(bundle);
                this.f21925e.m10000b("onWarmUpExpressIntegrityToken", new Object[0]);
                this.f21926f.f21931d.getClass();
                int i10 = bundle.getInt("error");
                C6828a c6828a = i10 != 0 ? new C6828a(i10, null) : null;
                C13599h c13599h = this.f21922b;
                if (c6828a == null) {
                    c13599h.m15116d(Long.valueOf(bundle.getLong("warm.up.sid")));
                } else {
                    c13599h.m15115c(c6828a);
                }
                break;
            default:
                m7275q(bundle);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7274p(Bundle bundle) {
        this.f21923c.f21932e.m9986c(this.f21922b);
    }

    /* JADX INFO: renamed from: q */
    public final void m7275q(Bundle bundle) {
        this.f21923c.f21932e.m9986c(this.f21922b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC6834g(C6836i c6836i, C13599h c13599h, int i10) {
        this(c6836i, c13599h, (byte) 0);
        this.f21924d = i10;
        switch (i10) {
            case 1:
                this.f21926f = c6836i;
                this(c6836i, c13599h, (byte) 0);
                this.f21925e = new C9427u("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                this.f21926f = c6836i;
                this.f21925e = new C9427u(TfazcFv.lPHNPGMGaemrcG);
                break;
        }
    }
}

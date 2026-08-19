package p635a1;

import p025An.AbstractC0575H;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.C21683b0;
import p1140z1.InterfaceC21704m;
import p153Fn.C2925c;
import p349O0.C5972Q;
import p523V9.AbstractC8111i5;
import p773h0.C14252G;

/* JADX INFO: renamed from: a1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10458p implements InterfaceC21704m {

    /* JADX INFO: renamed from: Z */
    public C2925c f30961Z;

    /* JADX INFO: renamed from: o0 */
    public int f30962o0;

    /* JADX INFO: renamed from: q0 */
    public AbstractC10458p f30964q0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC10458p f30965r0;

    /* JADX INFO: renamed from: s0 */
    public C21683b0 f30966s0;

    /* JADX INFO: renamed from: t0 */
    public AbstractC21678Y f30967t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f30968u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f30969v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f30970w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f30971x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f30972y0;

    /* JADX INFO: renamed from: Y */
    public AbstractC10458p f30960Y = this;

    /* JADX INFO: renamed from: p0 */
    public int f30963p0 = -1;

    /* JADX INFO: renamed from: A0 */
    public void mo10927A0() {
        if (this.f30972y0) {
            AbstractC8111i5.m8592c("node attached multiple times");
            throw null;
        }
        if (this.f30967t0 == null) {
            AbstractC8111i5.m8592c("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f30972y0 = true;
        this.f30970w0 = true;
    }

    /* JADX INFO: renamed from: B0 */
    public void mo10928B0() {
        if (!this.f30972y0) {
            AbstractC8111i5.m8592c("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f30970w0) {
            AbstractC8111i5.m8592c("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f30971x0) {
            AbstractC8111i5.m8592c("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f30972y0 = false;
        C2925c c2925c = this.f30961Z;
        if (c2925c != null) {
            AbstractC0575H.m1180i(c2925c, new C5972Q("The Modifier.Node was detached", 1));
            this.f30961Z = null;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void mo10930F0() {
        if (this.f30972y0) {
            mo10929E0();
        } else {
            AbstractC8111i5.m8592c("reset() called on an unattached node");
            throw null;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void mo10931G0() {
        if (!this.f30972y0) {
            AbstractC8111i5.m8592c("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f30970w0) {
            AbstractC8111i5.m8592c("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f30970w0 = false;
        mo438C0();
        this.f30971x0 = true;
    }

    /* JADX INFO: renamed from: H0 */
    public void mo10932H0() {
        if (!this.f30972y0) {
            AbstractC8111i5.m8592c("node detached multiple times");
            throw null;
        }
        if (this.f30967t0 == null) {
            AbstractC8111i5.m8592c("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f30971x0) {
            AbstractC8111i5.m8592c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f30971x0 = false;
        mo4226D0();
    }

    /* JADX INFO: renamed from: I0 */
    public void mo10933I0(AbstractC10458p abstractC10458p) {
        this.f30960Y = abstractC10458p;
    }

    /* JADX INFO: renamed from: J0 */
    public void mo10934J0(AbstractC21678Y abstractC21678Y) {
        this.f30967t0 = abstractC21678Y;
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC0571F m10935y0() {
        C2925c c2925c = this.f30961Z;
        if (c2925c != null) {
            return c2925c;
        }
        C2925c c2925cM1174c = AbstractC0575H.m1174c(AbstractC21690f.m22218w(this).getCoroutineContext().plus(new C0631p0((InterfaceC0627n0) AbstractC21690f.m22218w(this).getCoroutineContext().get(C0625m0.f1875Y))));
        this.f30961Z = c2925cM1174c;
        return c2925cM1174c;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean mo4774z0() {
        return !(this instanceof C14252G);
    }

    /* JADX INFO: renamed from: C0 */
    public void mo438C0() {
    }

    /* JADX INFO: renamed from: D0 */
    public void mo4226D0() {
    }

    /* JADX INFO: renamed from: E0 */
    public void mo10929E0() {
    }
}

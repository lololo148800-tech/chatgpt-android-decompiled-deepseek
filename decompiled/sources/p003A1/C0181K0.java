package p003A1;

import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: A1.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0181K0 extends AbstractC0231b {

    /* JADX INFO: renamed from: w0 */
    public final C6002f0 f680w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f681x0;

    public C0181K0(AbstractActivityC17375g abstractActivityC17375g) {
        super(abstractActivityC17375g, null, 0);
        this.f680w0 = C5997d.m6430Q(null, C5975S.f19448r0);
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: b */
    public final void mo564b(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(420213850);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) this.f680w0.getValue();
            if (interfaceC1439n == null) {
                c6021p.m6524S(358373017);
            } else {
                c6021p.m6524S(150107752);
                interfaceC1439n.invoke(c6021p, 0);
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0181K0.class.getName();
    }

    @Override // p003A1.AbstractC0231b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f681x0;
    }

    public final void setContent(InterfaceC1439n interfaceC1439n) {
        this.f681x0 = true;
        this.f680w0.setValue(interfaceC1439n);
        if (isAttachedToWindow()) {
            m733d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

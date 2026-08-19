package p772h;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0283r;

/* JADX INFO: renamed from: h.D */
/* JADX INFO: loaded from: classes.dex */
public final class C14213D implements InterfaceC11110s, InterfaceC14221c {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11105n f44635Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC14242x f44636Z;

    /* JADX INFO: renamed from: o0 */
    public C14214E f44637o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14215F f44638p0;

    public C14213D(C14215F c14215f, AbstractC11105n abstractC11105n, AbstractC14242x onBackPressedCallback) {
        AbstractC16544l.m18094g(onBackPressedCallback, "onBackPressedCallback");
        this.f44638p0 = c14215f;
        this.f44635Y = abstractC11105n;
        this.f44636Z = onBackPressedCallback;
        abstractC11105n.mo7806a(this);
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        if (enumC11103l != EnumC11103l.ON_START) {
            if (enumC11103l != EnumC11103l.ON_STOP) {
                if (enumC11103l == EnumC11103l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C14214E c14214e = this.f44637o0;
                if (c14214e != null) {
                    c14214e.cancel();
                    return;
                }
                return;
            }
        }
        C14215F c14215f = this.f44638p0;
        AbstractC14242x onBackPressedCallback = this.f44636Z;
        c14215f.getClass();
        AbstractC16544l.m18094g(onBackPressedCallback, "onBackPressedCallback");
        c14215f.f44642b.addLast(onBackPressedCallback);
        C14214E c14214e2 = new C14214E(c14215f, onBackPressedCallback);
        onBackPressedCallback.f44697b.add(c14214e2);
        c14215f.m15520e();
        onBackPressedCallback.f44698c = new C0283r(0, c14215f, C14215F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 9);
        this.f44637o0 = c14214e2;
    }

    @Override // p772h.InterfaceC14221c
    public final void cancel() {
        this.f44635Y.mo7808c(this);
        this.f44636Z.f44697b.remove(this);
        C14214E c14214e = this.f44637o0;
        if (c14214e != null) {
            c14214e.cancel();
        }
        this.f44637o0 = null;
    }
}

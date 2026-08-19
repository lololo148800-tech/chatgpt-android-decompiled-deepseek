package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import p002A0.C0122V;
import p049Bm.InterfaceC1439n;
import p349O0.C6029t;
import p349O0.InterfaceC6023q;
import p537W0.C8410b;

/* JADX INFO: renamed from: A1.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238c2 implements InterfaceC6023q, InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final AndroidComposeView f882Y;

    /* JADX INFO: renamed from: Z */
    public final C6029t f883Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f884o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC11105n f885p0;

    /* JADX INFO: renamed from: q0 */
    public C8410b f886q0 = AbstractC0175I0.f672a;

    public C0238c2(AndroidComposeView androidComposeView, C6029t c6029t) {
        this.f882Y = androidComposeView;
        this.f883Z = c6029t;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        if (enumC11103l == EnumC11103l.ON_DESTROY) {
            dispose();
        } else {
            if (enumC11103l != EnumC11103l.ON_CREATE || this.f884o0) {
                return;
            }
            m785a(this.f886q0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m785a(InterfaceC1439n interfaceC1439n) {
        this.f882Y.setOnViewTreeOwnersAvailable(new C0122V(this, 7, (C8410b) interfaceC1439n));
    }

    @Override // p349O0.InterfaceC6023q
    public final void dispose() {
        if (!this.f884o0) {
            this.f884o0 = true;
            this.f882Y.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC11105n abstractC11105n = this.f885p0;
            if (abstractC11105n != null) {
                abstractC11105n.mo7808c(this);
            }
        }
        this.f883Z.dispose();
    }
}

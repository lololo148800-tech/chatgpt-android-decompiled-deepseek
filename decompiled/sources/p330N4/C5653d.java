package p330N4;

import android.view.ViewGroup;
import p544W9.AbstractC8621d4;

/* JADX INFO: renamed from: N4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5653d extends AbstractC5674y {

    /* JADX INFO: renamed from: a */
    public boolean f18360a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f18361b;

    public C5653d(ViewGroup viewGroup) {
        this.f18361b = viewGroup;
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: a */
    public final void mo6066a() {
        AbstractC8621d4.m9271b(this.f18361b, false);
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: c */
    public final void mo6068c() {
        AbstractC8621d4.m9271b(this.f18361b, false);
        this.f18360a = true;
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: d */
    public final void mo6069d() {
        AbstractC8621d4.m9271b(this.f18361b, true);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        if (!this.f18360a) {
            AbstractC8621d4.m9271b(this.f18361b, false);
        }
        abstractC5673x.m6106w(this);
    }
}

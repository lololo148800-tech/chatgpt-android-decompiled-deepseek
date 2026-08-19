package p330N4;

import android.view.View;

/* JADX INFO: renamed from: N4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5660k extends AbstractC5674y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18380a;

    /* JADX INFO: renamed from: b */
    public Object f18381b;

    public /* synthetic */ C5660k() {
        this.f18380a = 2;
    }

    @Override // p330N4.AbstractC5674y, p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: b */
    public void mo6067b(AbstractC5673x abstractC5673x) {
        switch (this.f18380a) {
            case 2:
                C5637C c5637c = (C5637C) this.f18381b;
                if (!c5637c.f18312M0) {
                    c5637c.m6097G();
                    c5637c.f18312M0 = true;
                }
                break;
        }
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        switch (this.f18380a) {
            case 0:
                C5643I c5643i = AbstractC5642H.f18332a;
                c5643i.mo6077c((View) this.f18381b, 1.0f);
                c5643i.getClass();
                abstractC5673x.m6106w(this);
                break;
            case 1:
                ((AbstractC5673x) this.f18381b).mo6064y();
                abstractC5673x.m6106w(this);
                break;
            default:
                C5637C c5637c = (C5637C) this.f18381b;
                int i10 = c5637c.f18311L0 - 1;
                c5637c.f18311L0 = i10;
                if (i10 == 0) {
                    c5637c.f18312M0 = false;
                    c5637c.m6102l();
                }
                abstractC5673x.m6106w(this);
                break;
        }
    }

    public /* synthetic */ C5660k(Object obj, int i10) {
        this.f18380a = i10;
        this.f18381b = obj;
    }
}

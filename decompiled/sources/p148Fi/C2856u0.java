package p148Fi;

import gd.InterfaceC13849E;
import ni.C17627a;
import p044Bh.InterfaceC1301n;
import p071Ch.C1676g;
import p215Ic.C3688e;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p289Lc.C4994b;
import p317Mg.C5350a;
import p336Nc.C5706b;
import p364Oh.C6226E;
import p432Rh.C6889b;
import p811ih.C15000g;
import p948pi.C18418a;

/* JADX INFO: renamed from: Fi.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2856u0 implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8620a = 1;

    /* JADX INFO: renamed from: b */
    public final C4474e f8621b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4478i f8622c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f8623d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f8624e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4478i f8625f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4478i f8626g;

    public C2856u0(C4474e c4474e, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3, InterfaceC4478i interfaceC4478i4, InterfaceC4478i interfaceC4478i5) {
        this.f8621b = c4474e;
        this.f8622c = interfaceC4478i;
        this.f8623d = interfaceC4478i2;
        this.f8624e = interfaceC4478i3;
        this.f8625f = interfaceC4478i4;
        this.f8626g = interfaceC4478i5;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8620a) {
            case 0:
                return new C2854t0((C6889b) this.f8622c.get(), (C5350a) this.f8623d.get(), (InterfaceC1301n) this.f8624e.get(), (C1676g) this.f8625f.get(), (C18418a) this.f8621b.f14617a, (C6226E) this.f8626g.get());
            default:
                return new C3688e((C17627a) this.f8621b.f14617a, (InterfaceC13849E) this.f8622c.get(), (C15000g) this.f8623d.get(), (C5706b) this.f8624e.get(), (C4994b) this.f8625f.get(), (C1676g) this.f8626g.get());
        }
    }

    public C2856u0(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3, InterfaceC4478i interfaceC4478i4, C4474e c4474e, InterfaceC4478i interfaceC4478i5) {
        this.f8622c = interfaceC4478i;
        this.f8623d = interfaceC4478i2;
        this.f8624e = interfaceC4478i3;
        this.f8625f = interfaceC4478i4;
        this.f8621b = c4474e;
        this.f8626g = interfaceC4478i5;
    }
}

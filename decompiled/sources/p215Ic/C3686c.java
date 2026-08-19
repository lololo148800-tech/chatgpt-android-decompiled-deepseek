package p215Ic;

import ni.C17627a;
import ni.C17636j;
import ni.C17637k;
import ni.C17641o;
import ni.C17642p;
import p1043ui.C20291a;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p811ih.C15000g;
import p836jh.C16211c;
import p948pi.AbstractC18425h;
import p948pi.C18418a;
import p948pi.C18422e;
import vi.C20620b;
import vi.C20625g;
import vi.C20627i;

/* JADX INFO: renamed from: Ic.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3686c implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11183a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f11184b;

    /* JADX INFO: renamed from: c */
    public final C4474e f11185c;

    /* JADX INFO: renamed from: d */
    public final C4474e f11186d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f11187e;

    public /* synthetic */ C3686c(InterfaceC4478i interfaceC4478i, C4474e c4474e, C4474e c4474e2, InterfaceC4478i interfaceC4478i2, int i10) {
        this.f11183a = i10;
        this.f11184b = interfaceC4478i;
        this.f11185c = c4474e;
        this.f11186d = c4474e2;
        this.f11187e = interfaceC4478i2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f11183a) {
            case 0:
                return new C3685b((C17627a) this.f11185c.f14617a, (C15000g) this.f11184b.get(), (C16211c) this.f11187e.get(), (C18418a) this.f11186d.f14617a);
            case 1:
                return new C20620b((C20291a) this.f11184b.get(), (C17627a) this.f11185c.f14617a, (C18418a) this.f11186d.f14617a, (C17642p) this.f11187e.get());
            case 2:
                return new C20625g((C20291a) this.f11184b.get(), (C17636j) this.f11185c.f14617a, (AbstractC18425h) this.f11186d.f14617a, (C17637k) this.f11187e.get());
            default:
                return new C20627i((C20291a) this.f11184b.get(), (C17641o) this.f11185c.f14617a, (C18422e) this.f11186d.f14617a, (C17642p) this.f11187e.get());
        }
    }

    public C3686c(C4474e c4474e, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, C4474e c4474e2) {
        this.f11183a = 0;
        this.f11185c = c4474e;
        this.f11184b = interfaceC4478i;
        this.f11187e = interfaceC4478i2;
        this.f11186d = c4474e2;
    }
}

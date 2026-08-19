package p006A4;

import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import p1143z4.C21778h;
import p586Y0.C9566r;

/* JADX INFO: renamed from: A4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0352m implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f1220Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9566r f1221Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21778h f1222o0;

    public C0352m(boolean z6, C9566r c9566r, C21778h c21778h) {
        this.f1220Y = z6;
        this.f1221Z = c9566r;
        this.f1222o0 = c21778h;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        C21778h c21778h = this.f1222o0;
        boolean z6 = this.f1220Y;
        C9566r c9566r = this.f1221Z;
        if (z6 && !c9566r.contains(c21778h)) {
            c9566r.add(c21778h);
        }
        if (enumC11103l == EnumC11103l.ON_START && !c9566r.contains(c21778h)) {
            c9566r.add(c21778h);
        }
        if (enumC11103l == EnumC11103l.ON_STOP) {
            c9566r.remove(c21778h);
        }
    }
}

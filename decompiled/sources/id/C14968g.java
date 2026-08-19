package id;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import gd.C13993t2;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p201Hn.C3516e;
import p786hd.InterfaceC14444a;
import p948pi.C18418a;
import p948pi.C18422e;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: id.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14968g implements DefaultLifecycleObserver, InterfaceC18419b, InterfaceC14444a {

    /* JADX INFO: renamed from: Y */
    public final C18418a f46619Y;

    /* JADX INFO: renamed from: Z */
    public final C14971j f46620Z;

    /* JADX INFO: renamed from: o0 */
    public final C13993t2 f46621o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC14444a f46622p0;

    public C14968g(C18418a c18418a, C14971j c14971j, C13993t2 c13993t2, InterfaceC14444a interfaceC14444a) {
        this.f46619Y = c18418a;
        this.f46620Z = c14971j;
        this.f46621o0 = c13993t2;
        this.f46622p0 = interfaceC14444a;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C18422e c18422e = this.f46619Y.f58773a;
        C17296C c17296c = C17296C.f55119a;
        if (!c18422e.f58783b) {
            Object objM21029b = this.f46620Z.m21029b(C14962a.f46602o0, interfaceC18770c);
            if (objM21029b == EnumC19250a.f61036Y) {
                return objM21029b;
            }
        }
        return c17296c;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p786hd.InterfaceC14444a
    /* JADX INFO: renamed from: c */
    public final void mo15971c(InterfaceC1436k block) {
        AbstractC16544l.m18094g(block, "block");
        this.f46622p0.mo15971c(block);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }
}

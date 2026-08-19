package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC16544l;
import p183H4.C3231f;

/* JADX INFO: renamed from: androidx.lifecycle.T */
/* JADX INFO: loaded from: classes.dex */
public final class C11083T implements InterfaceC11110s, Closeable {

    /* JADX INFO: renamed from: Y */
    public final String f33423Y;

    /* JADX INFO: renamed from: Z */
    public final C11082S f33424Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f33425o0;

    public C11083T(String str, C11082S c11082s) {
        this.f33423Y = str;
        this.f33424Z = c11082s;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        if (enumC11103l == EnumC11103l.ON_DESTROY) {
            this.f33425o0 = false;
            interfaceC11112u.mo7809i().mo7808c(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12136a(C3231f registry, AbstractC11105n lifecycle) {
        AbstractC16544l.m18094g(registry, "registry");
        AbstractC16544l.m18094g(lifecycle, "lifecycle");
        if (this.f33425o0) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f33425o0 = true;
        lifecycle.mo7806a(this);
        registry.m4125f(this.f33423Y, this.f33424Z.f33415e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

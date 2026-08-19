package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public final class C11113v {

    /* JADX INFO: renamed from: a */
    public EnumC11104m f33486a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11110s f33487b;

    /* JADX INFO: renamed from: a */
    public final void m12163a(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        EnumC11104m enumC11104mM12162a = enumC11103l.m12162a();
        EnumC11104m state1 = this.f33486a;
        AbstractC16544l.m18094g(state1, "state1");
        if (enumC11104mM12162a.compareTo(state1) < 0) {
            state1 = enumC11104mM12162a;
        }
        this.f33486a = state1;
        this.f33487b.mo684E(interfaceC11112u, enumC11103l);
        this.f33486a = enumC11104mM12162a;
    }
}

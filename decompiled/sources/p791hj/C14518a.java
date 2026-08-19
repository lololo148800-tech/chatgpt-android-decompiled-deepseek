package p791hj;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0093v0;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;

/* JADX INFO: renamed from: hj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14518a implements InterfaceC3232g, InterfaceC11112u {

    /* JADX INFO: renamed from: Y */
    public final String f45751Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC11112u f45752Z;

    /* JADX INFO: renamed from: o0 */
    public final C0093v0 f45753o0 = new C0093v0(this);

    public C14518a(String str, InterfaceC11112u interfaceC11112u) {
        this.f45751Y = str;
        this.f45752Z = interfaceC11112u;
    }

    @Override // p183H4.InterfaceC3232g
    /* JADX INFO: renamed from: h */
    public final C3231f mo4127h() {
        C3231f c3231f = (C3231f) this.f45753o0.f405p0;
        AbstractC16544l.m18093f(c3231f, "controller.savedStateRegistry");
        return c3231f;
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f45752Z.mo7809i();
    }
}

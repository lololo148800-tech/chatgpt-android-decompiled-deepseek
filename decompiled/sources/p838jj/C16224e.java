package p838jj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p408Qj.C6742h;
import p909nm.C17689w;

/* JADX INFO: renamed from: jj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16224e implements InterfaceC16230k {

    /* JADX INFO: renamed from: a */
    public final C6742h f50338a;

    /* JADX INFO: renamed from: b */
    public final List f50339b;

    public C16224e(C6742h c6742h, List modals) {
        AbstractC16544l.m18094g(modals, "modals");
        this.f50338a = c6742h;
        this.f50339b = modals;
    }

    @Override // p838jj.InterfaceC16230k
    /* JADX INFO: renamed from: a */
    public final Object mo7185a() {
        return this.f50338a;
    }

    @Override // p838jj.InterfaceC16230k
    /* JADX INFO: renamed from: c */
    public final List mo7186c() {
        return this.f50339b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16224e)) {
            return false;
        }
        C16224e c16224e = (C16224e) obj;
        return AbstractC16544l.m18089b(this.f50338a, c16224e.f50338a) && AbstractC16544l.m18089b(this.f50339b, c16224e.f50339b);
    }

    public final int hashCode() {
        return this.f50339b.hashCode() + (this.f50338a.hashCode() * 31);
    }

    public final String toString() {
        return "AlertContainerScreen(beneathModals=" + this.f50338a + ", modals=" + this.f50339b + ')';
    }

    public /* synthetic */ C16224e(C6742h c6742h) {
        this(c6742h, C17689w.f56480Y);
    }
}

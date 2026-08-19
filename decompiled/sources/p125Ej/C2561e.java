package p125Ej;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1156zj.EnumC22128V0;
import p729ej.InterfaceC13427r;
import p949pj.C18438K;

/* JADX INFO: renamed from: Ej.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2561e implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final Context f7991b;

    /* JADX INFO: renamed from: c */
    public final C18438K f7992c;

    /* JADX INFO: renamed from: d */
    public final EnumC22128V0 f7993d;

    public C2561e(Context context, C18438K governmentIdFeed, EnumC22128V0 side) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(governmentIdFeed, "governmentIdFeed");
        AbstractC16544l.m18094g(side, "side");
        this.f7991b = context;
        this.f7992c = governmentIdFeed;
        this.f7993d = side;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return (otherWorker instanceof C2561e) && ((C2561e) otherWorker).f7993d == this.f7993d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2561e)) {
            return false;
        }
        C2561e c2561e = (C2561e) obj;
        return AbstractC16544l.m18089b(this.f7991b, c2561e.f7991b) && AbstractC16544l.m18089b(this.f7992c, c2561e.f7992c) && this.f7993d == c2561e.f7993d;
    }

    public final int hashCode() {
        return this.f7993d.hashCode() + ((this.f7992c.hashCode() + (this.f7991b.hashCode() * 31)) * 31);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return AbstractC2124C.m3215n(new C2219z0(new C2559c(new C2219z0(new C2560d(this, null)), null)));
    }

    public final String toString() {
        return "GovernmentIdHintWorker(context=" + this.f7991b + ", governmentIdFeed=" + this.f7992c + ", side=" + this.f7993d + Separators.RPAREN;
    }
}

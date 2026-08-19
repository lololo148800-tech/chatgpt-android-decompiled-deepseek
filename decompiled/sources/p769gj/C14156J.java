package p769gj;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: gj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C14156J extends AbstractC14158L {

    /* JADX INFO: renamed from: a */
    public final Object f44522a;

    /* JADX INFO: renamed from: b */
    public final C14183y f44523b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1439n f44524c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f44525d;

    public C14156J(Object showing, C14183y environment, InterfaceC1439n interfaceC1439n, InterfaceC1436k starter) {
        AbstractC16544l.m18094g(showing, "showing");
        AbstractC16544l.m18094g(environment, "environment");
        AbstractC16544l.m18094g(starter, "starter");
        this.f44522a = showing;
        this.f44523b = environment;
        this.f44524c = interfaceC1439n;
        this.f44525d = starter;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: a */
    public final C14183y mo15502a() {
        return this.f44523b;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: b */
    public final InterfaceC1439n mo15503b() {
        return this.f44524c;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: c */
    public final Object mo15504c() {
        return this.f44522a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14156J)) {
            return false;
        }
        C14156J c14156j = (C14156J) obj;
        return AbstractC16544l.m18089b(this.f44522a, c14156j.f44522a) && AbstractC16544l.m18089b(this.f44523b, c14156j.f44523b) && AbstractC16544l.m18089b(this.f44524c, c14156j.f44524c) && AbstractC16544l.m18089b(this.f44525d, c14156j.f44525d);
    }

    public final int hashCode() {
        return this.f44525d.hashCode() + ((this.f44524c.hashCode() + AbstractC20734X.m21250u(this.f44522a.hashCode() * 31, 31, this.f44523b.f44578a)) * 31);
    }

    public final String toString() {
        return "New(showing=" + this.f44522a + ", environment=" + this.f44523b + ", showRendering=" + this.f44524c + ", starter=" + this.f44525d + ')';
    }
}

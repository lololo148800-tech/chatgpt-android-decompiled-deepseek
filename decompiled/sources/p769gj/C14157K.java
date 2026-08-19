package p769gj;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: gj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C14157K extends AbstractC14158L {

    /* JADX INFO: renamed from: a */
    public final Object f44526a;

    /* JADX INFO: renamed from: b */
    public final C14183y f44527b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1439n f44528c;

    public C14157K(Object showing, C14183y environment, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(showing, "showing");
        AbstractC16544l.m18094g(environment, "environment");
        this.f44526a = showing;
        this.f44527b = environment;
        this.f44528c = interfaceC1439n;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: a */
    public final C14183y mo15502a() {
        return this.f44527b;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: b */
    public final InterfaceC1439n mo15503b() {
        return this.f44528c;
    }

    @Override // p769gj.AbstractC14158L
    /* JADX INFO: renamed from: c */
    public final Object mo15504c() {
        return this.f44526a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14157K)) {
            return false;
        }
        C14157K c14157k = (C14157K) obj;
        return AbstractC16544l.m18089b(this.f44526a, c14157k.f44526a) && AbstractC16544l.m18089b(this.f44527b, c14157k.f44527b) && AbstractC16544l.m18089b(this.f44528c, c14157k.f44528c);
    }

    public final int hashCode() {
        return this.f44528c.hashCode() + AbstractC20734X.m21250u(this.f44526a.hashCode() * 31, 31, this.f44527b.f44578a);
    }

    public final String toString() {
        return "Started(showing=" + this.f44526a + ", environment=" + this.f44527b + ", showRendering=" + this.f44528c + ')';
    }
}

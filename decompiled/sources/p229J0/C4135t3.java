package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import p1051v0.C20416d;

/* JADX INFO: renamed from: J0.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4135t3 {

    /* JADX INFO: renamed from: a */
    public final C20416d f13377a;

    /* JADX INFO: renamed from: b */
    public final C20416d f13378b;

    /* JADX INFO: renamed from: c */
    public final C20416d f13379c;

    /* JADX INFO: renamed from: d */
    public final C20416d f13380d;

    /* JADX INFO: renamed from: e */
    public final C20416d f13381e;

    public C4135t3() {
        C20416d c20416d = AbstractC4129s3.f13335a;
        C20416d c20416d2 = AbstractC4129s3.f13336b;
        C20416d c20416d3 = AbstractC4129s3.f13337c;
        C20416d c20416d4 = AbstractC4129s3.f13338d;
        C20416d c20416d5 = AbstractC4129s3.f13339e;
        this.f13377a = c20416d;
        this.f13378b = c20416d2;
        this.f13379c = c20416d3;
        this.f13380d = c20416d4;
        this.f13381e = c20416d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4135t3)) {
            return false;
        }
        C4135t3 c4135t3 = (C4135t3) obj;
        return AbstractC16544l.m18089b(this.f13377a, c4135t3.f13377a) && AbstractC16544l.m18089b(this.f13378b, c4135t3.f13378b) && AbstractC16544l.m18089b(this.f13379c, c4135t3.f13379c) && AbstractC16544l.m18089b(this.f13380d, c4135t3.f13380d) && AbstractC16544l.m18089b(this.f13381e, c4135t3.f13381e);
    }

    public final int hashCode() {
        return this.f13381e.hashCode() + ((this.f13380d.hashCode() + ((this.f13379c.hashCode() + ((this.f13378b.hashCode() + (this.f13377a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f13377a + ", small=" + this.f13378b + ", medium=" + this.f13379c + ", large=" + this.f13380d + ", extraLarge=" + this.f13381e + ')';
    }
}

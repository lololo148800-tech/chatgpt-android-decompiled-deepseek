package p1042uh;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p917o6.InterfaceC17873z;

/* JADX INFO: renamed from: uh.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20263a0 implements InterfaceC17873z {

    /* JADX INFO: renamed from: a */
    public final String f64084a;

    /* JADX INFO: renamed from: b */
    public final String f64085b;

    /* JADX INFO: renamed from: c */
    public final C20261Z f64086c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f64087d;

    /* JADX INFO: renamed from: e */
    public final String f64088e;

    public C20263a0(String id2, String legacyId, C20261Z c20261z, ArrayList arrayList, String str) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(legacyId, "legacyId");
        this.f64084a = id2;
        this.f64085b = legacyId;
        this.f64086c = c20261z;
        this.f64087d = arrayList;
        this.f64088e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20263a0)) {
            return false;
        }
        C20263a0 c20263a0 = (C20263a0) obj;
        return AbstractC16544l.m18089b(this.f64084a, c20263a0.f64084a) && AbstractC16544l.m18089b(this.f64085b, c20263a0.f64085b) && this.f64086c.equals(c20263a0.f64086c) && this.f64087d.equals(c20263a0.f64087d) && AbstractC16544l.m18089b(this.f64088e, c20263a0.f64088e);
    }

    public final int hashCode() {
        int iHashCode = (this.f64087d.hashCode() + ((this.f64086c.hashCode() + AbstractC0168G.m527p(this.f64084a.hashCode() * 31, 31, this.f64085b)) * 31)) * 31;
        String str = this.f64088e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}

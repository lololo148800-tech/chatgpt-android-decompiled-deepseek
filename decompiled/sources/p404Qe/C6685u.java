package p404Qe;

import kotlin.jvm.internal.AbstractC16544l;
import p968qi.C18737t;

/* JADX INFO: renamed from: Qe.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C6685u {

    /* JADX INFO: renamed from: a */
    public final String f21495a;

    /* JADX INFO: renamed from: b */
    public final C18737t f21496b;

    /* JADX INFO: renamed from: c */
    public final String f21497c;

    public C6685u(String str, C18737t model, String downloadUrl) {
        AbstractC16544l.m18094g(model, "model");
        AbstractC16544l.m18094g(downloadUrl, "downloadUrl");
        this.f21495a = str;
        this.f21496b = model;
        this.f21497c = downloadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6685u)) {
            return false;
        }
        C6685u c6685u = (C6685u) obj;
        return AbstractC16544l.m18089b(this.f21495a, c6685u.f21495a) && AbstractC16544l.m18089b(this.f21496b, c6685u.f21496b) && AbstractC16544l.m18089b(this.f21497c, c6685u.f21497c);
    }

    public final int hashCode() {
        return this.f21497c.hashCode() + ((this.f21496b.hashCode() + (this.f21495a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}

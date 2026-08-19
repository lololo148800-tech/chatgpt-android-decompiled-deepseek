package p359Oc;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8472E4;

/* JADX INFO: renamed from: Oc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6166b extends AbstractC8472E4 {

    /* JADX INFO: renamed from: a */
    public final String f20075a;

    public C6166b(String url) {
        AbstractC16544l.m18094g(url, "url");
        this.f20075a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6166b) && AbstractC16544l.m18089b(this.f20075a, ((C6166b) obj).f20075a);
    }

    public final int hashCode() {
        return this.f20075a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

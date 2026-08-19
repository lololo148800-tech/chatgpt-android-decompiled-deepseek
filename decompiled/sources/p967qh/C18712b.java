package p967qh;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: qh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18712b implements InterfaceC18717g {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f59546a;

    public C18712b(AbstractC21955Q1 abstractC21955Q1) {
        this.f59546a = abstractC21955Q1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18712b) && AbstractC16544l.m18089b(this.f59546a, ((C18712b) obj).f59546a);
    }

    public final int hashCode() {
        return this.f59546a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

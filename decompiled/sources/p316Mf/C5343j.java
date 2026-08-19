package p316Mf;

import kotlin.jvm.internal.AbstractC16544l;
import p926of.C18174k;

/* JADX INFO: renamed from: Mf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5343j implements InterfaceC5346m {

    /* JADX INFO: renamed from: a */
    public final C18174k f17562a;

    public C5343j(C18174k data) {
        AbstractC16544l.m18094g(data, "data");
        this.f17562a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5343j) && AbstractC16544l.m18089b(this.f17562a, ((C5343j) obj).f17562a);
    }

    public final int hashCode() {
        return this.f17562a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

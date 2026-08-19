package p316Mf;

import kotlin.jvm.internal.AbstractC16544l;
import p926of.C18174k;

/* JADX INFO: renamed from: Mf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5342i implements InterfaceC5346m {

    /* JADX INFO: renamed from: a */
    public final C18174k f17561a;

    public C5342i(C18174k data) {
        AbstractC16544l.m18094g(data, "data");
        this.f17561a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5342i) && AbstractC16544l.m18089b(this.f17561a, ((C5342i) obj).f17561a);
    }

    public final int hashCode() {
        return this.f17561a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

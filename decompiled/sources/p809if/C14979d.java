package p809if;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.EnumC21974X0;

/* JADX INFO: renamed from: if.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14979d implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC21974X0 f46637a;

    public C14979d(EnumC21974X0 feature) {
        AbstractC16544l.m18094g(feature, "feature");
        this.f46637a = feature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14979d) && this.f46637a == ((C14979d) obj).f46637a;
    }

    public final int hashCode() {
        return this.f46637a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

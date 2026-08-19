package ng;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ng.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17611b implements InterfaceC17612c {

    /* JADX INFO: renamed from: a */
    public final String f56368a;

    public C17611b(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f56368a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17611b) && AbstractC16544l.m18089b(this.f56368a, ((C17611b) obj).f56368a);
    }

    public final int hashCode() {
        return this.f56368a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

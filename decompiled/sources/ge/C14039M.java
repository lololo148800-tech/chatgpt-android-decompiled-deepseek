package ge;

import kotlin.jvm.internal.AbstractC16544l;
import p269Kh.C4688o;

/* JADX INFO: renamed from: ge.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C14039M implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final C4688o f44138a;

    public C14039M(C4688o model) {
        AbstractC16544l.m18094g(model, "model");
        this.f44138a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14039M) && AbstractC16544l.m18089b(this.f44138a, ((C14039M) obj).f44138a);
    }

    public final int hashCode() {
        return this.f44138a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

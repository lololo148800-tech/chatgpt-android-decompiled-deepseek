package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C14037L implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44127a;

    public C14037L(String str) {
        this.f44127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14037L) {
            return AbstractC16544l.m18089b(this.f44127a, ((C14037L) obj).f44127a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44127a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

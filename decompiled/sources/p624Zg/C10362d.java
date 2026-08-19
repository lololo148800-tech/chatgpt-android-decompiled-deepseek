package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10362d implements InterfaceC10364e {

    /* JADX INFO: renamed from: a */
    public final String f30712a;

    public C10362d(String str) {
        this.f30712a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10362d) {
            return AbstractC16544l.m18089b(this.f30712a, ((C10362d) obj).f30712a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30712a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2052a;

/* JADX INFO: renamed from: Zg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10356a implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final String f30701a;

    public C10356a(String str) {
        this.f30701a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10356a) {
            return AbstractC16544l.m18089b(this.f30701a, ((C10356a) obj).f30701a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30701a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

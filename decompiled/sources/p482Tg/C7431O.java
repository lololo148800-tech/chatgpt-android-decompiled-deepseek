package p482Tg;

import kotlin.jvm.internal.AbstractC16544l;
import mh.EnumC17264l;

/* JADX INFO: renamed from: Tg.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C7431O implements InterfaceC7436U {

    /* JADX INFO: renamed from: a */
    public final EnumC17264l f23515a;

    public C7431O(EnumC17264l value) {
        AbstractC16544l.m18094g(value, "value");
        this.f23515a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7431O) && this.f23515a == ((C7431O) obj).f23515a;
    }

    public final int hashCode() {
        return this.f23515a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

package p482Tg;

import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.EnumC1696a;

/* JADX INFO: renamed from: Tg.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7429M implements InterfaceC7436U {

    /* JADX INFO: renamed from: a */
    public final EnumC1696a f23513a;

    public C7429M(EnumC1696a value) {
        AbstractC16544l.m18094g(value, "value");
        this.f23513a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7429M) && this.f23513a == ((C7429M) obj).f23513a;
    }

    public final int hashCode() {
        return this.f23513a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C14114z implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44442a;

    /* JADX INFO: renamed from: b */
    public final EnumC14040M0 f44443b;

    public C14114z(String prompt, EnumC14040M0 enumC14040M0) {
        AbstractC16544l.m18094g(prompt, "prompt");
        this.f44442a = prompt;
        this.f44443b = enumC14040M0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14114z)) {
            return false;
        }
        C14114z c14114z = (C14114z) obj;
        return AbstractC16544l.m18089b(this.f44442a, c14114z.f44442a) && this.f44443b == c14114z.f44443b;
    }

    public final int hashCode() {
        return this.f44443b.hashCode() + (this.f44442a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}

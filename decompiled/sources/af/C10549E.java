package af;

import kotlin.jvm.internal.AbstractC16544l;
import p037B9.MeDP.MpoABj;

/* JADX INFO: renamed from: af.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C10549E implements InterfaceC10551G {

    /* JADX INFO: renamed from: a */
    public final String f31314a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10549E) && AbstractC16544l.m18089b(this.f31314a, ((C10549E) obj).f31314a);
    }

    public final int hashCode() {
        return this.f31314a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C10549E(String str) {
        AbstractC16544l.m18094g(str, MpoABj.qQJsheUpRwWcsZQ);
        this.f31314a = str;
    }
}

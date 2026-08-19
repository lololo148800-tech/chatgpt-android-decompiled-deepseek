package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7341a0;

/* JADX INFO: renamed from: Hf.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3375j1 implements InterfaceC3378k1 {

    /* JADX INFO: renamed from: a */
    public final C7341a0 f10305a;

    /* JADX INFO: renamed from: b */
    public final boolean f10306b;

    public C3375j1(C7341a0 content, boolean z6) {
        AbstractC16544l.m18094g(content, "content");
        this.f10305a = content;
        this.f10306b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3375j1)) {
            return false;
        }
        C3375j1 c3375j1 = (C3375j1) obj;
        return AbstractC16544l.m18089b(this.f10305a, c3375j1.f10305a) && this.f10306b == c3375j1.f10306b;
    }

    public final int hashCode() {
        return (this.f10305a.f23250c.hashCode() * 31) + (this.f10306b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}

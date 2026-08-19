package p350O1;

import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;

/* JADX INFO: renamed from: O1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C6050H {

    /* JADX INFO: renamed from: a */
    public final C3590f f19708a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6073v f19709b;

    public C6050H(C3590f c3590f, InterfaceC6073v interfaceC6073v) {
        this.f19708a = c3590f;
        this.f19709b = interfaceC6073v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6050H)) {
            return false;
        }
        C6050H c6050h = (C6050H) obj;
        return AbstractC16544l.m18089b(this.f19708a, c6050h.f19708a) && AbstractC16544l.m18089b(this.f19709b, c6050h.f19709b);
    }

    public final int hashCode() {
        return this.f19709b.hashCode() + (this.f19708a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f19708a) + ", offsetMapping=" + this.f19709b + ')';
    }
}

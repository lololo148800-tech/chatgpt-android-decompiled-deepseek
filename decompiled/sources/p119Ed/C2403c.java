package p119Ed;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ed.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2403c {
    public static final C2402b Companion = new C2402b();

    /* JADX INFO: renamed from: a */
    public final String f7469a;

    /* JADX INFO: renamed from: b */
    public final String f7470b;

    /* JADX INFO: renamed from: c */
    public final int f7471c;

    public C2403c(int i10, String messageId, String model) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(model, "model");
        this.f7469a = messageId;
        this.f7470b = model;
        this.f7471c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2403c)) {
            return false;
        }
        C2403c c2403c = (C2403c) obj;
        return AbstractC16544l.m18089b(this.f7469a, c2403c.f7469a) && AbstractC16544l.m18089b(this.f7470b, c2403c.f7470b) && this.f7471c == c2403c.f7471c;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(this.f7469a.hashCode() * 31, 31, this.f7470b) + this.f7471c;
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C2403c(String str, int i10, int i11, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C2401a.f7468a.getDescriptor());
            throw null;
        }
        this.f7469a = str;
        this.f7470b = str2;
        this.f7471c = i11;
    }
}

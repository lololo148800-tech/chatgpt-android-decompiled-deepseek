package p1144z5;

import p1075w5.AbstractC20832j;
import p1075w5.C20838p;
import p899n5.EnumC17488e;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21797a implements InterfaceC21801e {

    /* JADX INFO: renamed from: b */
    public final int f69155b;

    /* JADX INFO: renamed from: c */
    public final boolean f69156c = false;

    public C21797a(int i10) {
        this.f69155b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p1144z5.InterfaceC21801e
    /* JADX INFO: renamed from: a */
    public final InterfaceC21802f mo22287a(InterfaceC21803g interfaceC21803g, AbstractC20832j abstractC20832j) {
        if (abstractC20832j instanceof C20838p) {
            return ((C20838p) abstractC20832j).f66257c == EnumC17488e.f55951Y ? new C21800d(interfaceC21803g, abstractC20832j) : new C21798b(interfaceC21803g, abstractC20832j, this.f69155b, this.f69156c);
        }
        return new C21800d(interfaceC21803g, abstractC20832j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21797a) {
            C21797a c21797a = (C21797a) obj;
            if (this.f69155b == c21797a.f69155b && this.f69156c == c21797a.f69156c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69155b * 31) + (this.f69156c ? 1231 : 1237);
    }
}

package bf;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11380h {
    public static final C11379g Companion = new C11379g();

    /* JADX INFO: renamed from: a */
    public final String f34387a;

    /* JADX INFO: renamed from: b */
    public final String f34388b;

    public /* synthetic */ C11380h(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f34387a = null;
        } else {
            this.f34387a = str;
        }
        if ((i10 & 2) == 0) {
            this.f34388b = null;
        } else {
            this.f34388b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11380h)) {
            return false;
        }
        C11380h c11380h = (C11380h) obj;
        return AbstractC16544l.m18089b(this.f34387a, c11380h.f34387a) && AbstractC16544l.m18089b(this.f34388b, c11380h.f34388b);
    }

    public final int hashCode() {
        String str = this.f34387a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34388b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C11380h(String str, String str2) {
        this.f34387a = str;
        this.f34388b = str2;
    }

    public /* synthetic */ C11380h(String str, int i10) {
        this((i10 & 1) != 0 ? null : str, (String) null);
    }
}

package p071Ch;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ch.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1681l {
    public static final C1680k Companion = new C1680k();

    /* JADX INFO: renamed from: a */
    public final String f4761a;

    public C1681l() {
        this.f4761a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1681l) && AbstractC16544l.m18089b(this.f4761a, ((C1681l) obj).f4761a);
    }

    public final int hashCode() {
        String str = this.f4761a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C1681l(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f4761a = null;
        } else {
            this.f4761a = str;
        }
    }
}

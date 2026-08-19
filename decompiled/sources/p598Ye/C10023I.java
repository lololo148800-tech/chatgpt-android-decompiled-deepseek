package p598Ye;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10023I {
    public static final C10022H Companion = new C10022H();

    /* JADX INFO: renamed from: a */
    public final String f29718a;

    /* JADX INFO: renamed from: b */
    public final int f29719b;

    public /* synthetic */ C10023I(int i10, int i11, String str) {
        this.f29718a = (i10 & 1) == 0 ? null : str;
        if ((i10 & 2) == 0) {
            this.f29719b = 20;
        } else {
            this.f29719b = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10023I)) {
            return false;
        }
        C10023I c10023i = (C10023I) obj;
        return AbstractC16544l.m18089b(this.f29718a, c10023i.f29718a) && this.f29719b == c10023i.f29719b;
    }

    public final int hashCode() {
        String str = this.f29718a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f29719b;
    }

    public final String toString() {
        return "█";
    }

    public C10023I(String str) {
        this.f29718a = str;
        this.f29719b = 20;
    }
}

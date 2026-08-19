package p380Pd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Pd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6384a extends AbstractC6389f {

    /* JADX INFO: renamed from: b */
    public final String f20801b;

    /* JADX INFO: renamed from: c */
    public final boolean f20802c;

    public C6384a(String str, boolean z6) {
        this.f20801b = str;
        this.f20802c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6384a)) {
            return false;
        }
        C6384a c6384a = (C6384a) obj;
        return AbstractC16544l.m18089b(this.f20801b, c6384a.f20801b) && this.f20802c == c6384a.f20802c;
    }

    public final int hashCode() {
        String str = this.f20801b;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.f20802c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}

package p361Oe;

import kotlin.jvm.internal.AbstractC16544l;
import p216Id.InterfaceC3702j;

/* JADX INFO: renamed from: Oe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6174a {

    /* JADX INFO: renamed from: a */
    public final String f20113a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3702j f20114b;

    /* JADX INFO: renamed from: c */
    public final String f20115c;

    /* JADX INFO: renamed from: d */
    public final String f20116d;

    /* JADX INFO: renamed from: e */
    public final boolean f20117e;

    public C6174a(String str, InterfaceC3702j state, String str2, String str3, boolean z6) {
        AbstractC16544l.m18094g(state, "state");
        this.f20113a = str;
        this.f20114b = state;
        this.f20115c = str2;
        this.f20116d = str3;
        this.f20117e = z6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:25:0x0037  */
    /* JADX WARN: Code duplicated, block: B:35:0x004d  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6174a)) {
            return false;
        }
        C6174a c6174a = (C6174a) obj;
        String str = c6174a.f20113a;
        String str2 = this.f20113a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b || !AbstractC16544l.m18089b(this.f20114b, c6174a.f20114b)) {
            return false;
        }
        String str3 = this.f20115c;
        String str4 = c6174a.f20115c;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2) {
            return false;
        }
        String str5 = this.f20116d;
        String str6 = c6174a.f20116d;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3 && this.f20117e == c6174a.f20117e;
    }

    public final int hashCode() {
        String str = this.f20113a;
        int iHashCode = (this.f20114b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f20115c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20116d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f20117e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}

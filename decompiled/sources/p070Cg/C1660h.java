package p070Cg;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Cg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1660h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f4687a;

    /* JADX INFO: renamed from: b */
    public final String f4688b;

    /* JADX INFO: renamed from: c */
    public final Intent f4689c;

    public C1660h(String str, String str2, Intent intent) {
        this.f4687a = str;
        this.f4688b = str2;
        this.f4689c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660h)) {
            return false;
        }
        C1660h c1660h = (C1660h) obj;
        return AbstractC16544l.m18089b(this.f4687a, c1660h.f4687a) && AbstractC16544l.m18089b(this.f4688b, c1660h.f4688b) && AbstractC16544l.m18089b(this.f4689c, c1660h.f4689c);
    }

    public final int hashCode() {
        int iHashCode = this.f4687a.hashCode() * 31;
        String str = this.f4688b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.f4689c;
        return iHashCode2 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}

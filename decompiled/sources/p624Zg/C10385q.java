package p624Zg;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17690x;

/* JADX INFO: renamed from: Zg.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10385q {

    /* JADX INFO: renamed from: a */
    public final String f30781a;

    /* JADX INFO: renamed from: b */
    public final Uri f30782b;

    /* JADX INFO: renamed from: c */
    public final Map f30783c;

    public C10385q(String str, Uri uri, Map activeEntitlements) {
        AbstractC16544l.m18094g(activeEntitlements, "activeEntitlements");
        this.f30781a = str;
        this.f30782b = uri;
        this.f30783c = activeEntitlements;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10385q)) {
            return false;
        }
        C10385q c10385q = (C10385q) obj;
        String str = c10385q.f30781a;
        String str2 = this.f30781a;
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
        return zM18089b && AbstractC16544l.m18089b(this.f30782b, c10385q.f30782b) && AbstractC16544l.m18089b(this.f30783c, c10385q.f30783c);
    }

    public final int hashCode() {
        String str = this.f30781a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.f30782b;
        return this.f30783c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C10385q(String str, int i10) {
        this((i10 & 1) != 0 ? null : str, null, C17690x.f56481Y);
    }
}

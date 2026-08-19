package p640a6;

import android.gov.nist.core.Separators;
import p004A2.C0311b;

/* JADX INFO: renamed from: a6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10514i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31158a;

    /* JADX INFO: renamed from: b */
    public String f31159b;

    /* JADX INFO: renamed from: c */
    public String f31160c;

    public boolean equals(Object obj) {
        switch (this.f31158a) {
            case 0:
                if (!(obj instanceof C0311b)) {
                    return false;
                }
                C0311b c0311b = (C0311b) obj;
                Object obj2 = c0311b.f1082a;
                String str = this.f31159b;
                if (obj2 != str && !obj2.equals(str)) {
                    return false;
                }
                Object obj3 = c0311b.f1083b;
                String str2 = this.f31160c;
                return obj3 == str2 || obj3.equals(str2);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f31158a) {
            case 0:
                String str = this.f31159b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f31160c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f31158a) {
            case 0:
                return "Pair{" + ((Object) this.f31159b) + Separators.f31991SP + ((Object) this.f31160c) + "}";
            default:
                return super.toString();
        }
    }
}

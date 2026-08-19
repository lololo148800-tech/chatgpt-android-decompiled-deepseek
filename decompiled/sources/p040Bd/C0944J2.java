package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.J2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0944J2 {
    public static final C0938I2 Companion = new C0938I2();

    /* JADX INFO: renamed from: a */
    public final String f2708a;

    public C0944J2(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f2708a = null;
        } else {
            this.f2708a = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0944J2)) {
            return false;
        }
        String str = ((C0944J2) obj).f2708a;
        String str2 = this.f2708a;
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
        return zM18089b;
    }

    public final int hashCode() {
        String str = this.f2708a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}

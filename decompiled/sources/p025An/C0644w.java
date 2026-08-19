package p025An;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import p1027tp.C20048M;

/* JADX INFO: renamed from: An.w */
/* JADX INFO: loaded from: classes2.dex */
public class C0644w extends RuntimeException {
    public C0644w(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644w(String message, int i10) {
        super(message);
        switch (i10) {
            case 22:
                AbstractC16544l.m18094g(message, "message");
                super(message);
                break;
            default:
                AbstractC16544l.m18094g(message, "message");
                break;
        }
    }

    public C0644w(C20048M c20048m) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        C17327D c17327d = c20048m.f63525a;
        sb2.append(c17327d.f55176p0);
        sb2.append(Separators.f31991SP);
        sb2.append(c17327d.f55175o0);
        super(sb2.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644w(int i10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        switch (i10) {
            case 17:
                break;
            default:
                break;
        }
    }
}

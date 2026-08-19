package p623Zf;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import p229J0.EnumC3898D3;

/* JADX INFO: renamed from: Zf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C10314j extends AbstractC10316l {

    /* JADX INFO: renamed from: a */
    public final String f30624a;

    /* JADX INFO: renamed from: b */
    public final EnumC3898D3 f30625b;

    /* JADX INFO: renamed from: c */
    public final String f30626c;

    /* JADX INFO: renamed from: d */
    public final Intent f30627d;

    public C10314j(String message, EnumC3898D3 duration, String str, Intent intent) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(duration, "duration");
        this.f30624a = message;
        this.f30625b = duration;
        this.f30626c = str;
        this.f30627d = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10314j)) {
            return false;
        }
        C10314j c10314j = (C10314j) obj;
        return AbstractC16544l.m18089b(this.f30624a, c10314j.f30624a) && this.f30625b == c10314j.f30625b && AbstractC16544l.m18089b(this.f30626c, c10314j.f30626c) && AbstractC16544l.m18089b(this.f30627d, c10314j.f30627d);
    }

    public final int hashCode() {
        int iHashCode = (this.f30625b.hashCode() + (this.f30624a.hashCode() * 31)) * 31;
        String str = this.f30626c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.f30627d;
        return iHashCode2 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C10314j(String str, EnumC3898D3 enumC3898D3, int i10) {
        this(str, (i10 & 2) != 0 ? EnumC3898D3.f11877Y : enumC3898D3, null, null);
    }
}

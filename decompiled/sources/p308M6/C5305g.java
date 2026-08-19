package p308M6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: M6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5305g {

    /* JADX INFO: renamed from: a */
    public final Integer f17474a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f17475b;

    /* JADX INFO: renamed from: c */
    public final Integer f17476c;

    /* JADX INFO: renamed from: d */
    public final boolean f17477d;

    /* JADX INFO: renamed from: e */
    public final int f17478e;

    public C5305g(Integer num, Bitmap bitmap, Integer num2, boolean z6, int i10) {
        this.f17474a = num;
        this.f17475b = bitmap;
        this.f17476c = num2;
        this.f17477d = z6;
        this.f17478e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5305g)) {
            return false;
        }
        C5305g c5305g = (C5305g) obj;
        return AbstractC16544l.m18089b(this.f17474a, c5305g.f17474a) && AbstractC16544l.m18089b(this.f17475b, c5305g.f17475b) && AbstractC16544l.m18089b(this.f17476c, c5305g.f17476c) && this.f17477d == c5305g.f17477d && this.f17478e == c5305g.f17478e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public final int hashCode() {
        Integer num = this.f17474a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Bitmap bitmap = this.f17475b;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Integer num2 = this.f17476c;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z6 = this.f17477d;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return ((iHashCode3 + r6) * 31) + this.f17478e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextureParam(textureResourceId=");
        sb2.append(this.f17474a);
        sb2.append(", bitmap=");
        sb2.append(this.f17475b);
        sb2.append(", textureId=");
        sb2.append(this.f17476c);
        sb2.append(", needToRecycleWhenUploaded=");
        sb2.append(this.f17477d);
        sb2.append(", textureSlot=");
        return AbstractC10763a.m11056n(sb2, this.f17478e, Separators.RPAREN);
    }
}

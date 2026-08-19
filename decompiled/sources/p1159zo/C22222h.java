package p1159zo;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: zo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C22222h {

    /* JADX INFO: renamed from: a */
    public final boolean f70439a;

    /* JADX INFO: renamed from: b */
    public final Integer f70440b;

    /* JADX INFO: renamed from: c */
    public final boolean f70441c;

    /* JADX INFO: renamed from: d */
    public final Integer f70442d;

    /* JADX INFO: renamed from: e */
    public final boolean f70443e;

    /* JADX INFO: renamed from: f */
    public final boolean f70444f;

    public C22222h(boolean z6, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        this.f70439a = z6;
        this.f70440b = num;
        this.f70441c = z10;
        this.f70442d = num2;
        this.f70443e = z11;
        this.f70444f = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22222h)) {
            return false;
        }
        C22222h c22222h = (C22222h) obj;
        return this.f70439a == c22222h.f70439a && AbstractC16544l.m18089b(this.f70440b, c22222h.f70440b) && this.f70441c == c22222h.f70441c && AbstractC16544l.m18089b(this.f70442d, c22222h.f70442d) && this.f70443e == c22222h.f70443e && this.f70444f == c22222h.f70444f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z6 = this.f70439a;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        Integer num = this.f70440b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f70441c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (iHashCode + r10) * 31;
        Integer num2 = this.f70442d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.f70443e;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i12 = (iHashCode2 + r11) * 31;
        boolean z12 = this.f70444f;
        return i12 + (z12 ? 1 : z12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f70439a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f70440b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f70441c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f70442d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f70443e);
        sb2.append(", unknownValues=");
        return AbstractC3794B0.m4499x(sb2, this.f70444f, ')');
    }
}

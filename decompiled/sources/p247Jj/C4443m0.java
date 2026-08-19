package p247Jj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jj.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4443m0 implements InterfaceC4447o0 {

    /* JADX INFO: renamed from: a */
    public final String f14462a;

    /* JADX INFO: renamed from: b */
    public final String f14463b;

    /* JADX INFO: renamed from: c */
    public final String f14464c;

    /* JADX INFO: renamed from: d */
    public final EnumC4458u f14465d;

    /* JADX INFO: renamed from: e */
    public final Integer f14466e;

    /* JADX INFO: renamed from: f */
    public final boolean f14467f = false;

    public C4443m0(String str, String str2, String str3, EnumC4458u enumC4458u, Integer num) {
        this.f14462a = str;
        this.f14463b = str2;
        this.f14464c = str3;
        this.f14465d = enumC4458u;
        this.f14466e = num;
    }

    @Override // p247Jj.InterfaceC4447o0
    /* JADX INFO: renamed from: a */
    public final EnumC4458u mo5202a() {
        return this.f14465d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4443m0)) {
            return false;
        }
        C4443m0 c4443m0 = (C4443m0) obj;
        return AbstractC16544l.m18089b(this.f14462a, c4443m0.f14462a) && AbstractC16544l.m18089b(this.f14463b, c4443m0.f14463b) && AbstractC16544l.m18089b(this.f14464c, c4443m0.f14464c) && this.f14465d == c4443m0.f14465d && AbstractC16544l.m18089b(this.f14466e, c4443m0.f14466e) && this.f14467f == c4443m0.f14467f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    public final int hashCode() {
        int iHashCode = this.f14462a.hashCode() * 31;
        String str = this.f14463b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14464c;
        int iHashCode3 = (this.f14465d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.f14466e;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z6 = this.f14467f;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode4 + r6;
    }

    @Override // p247Jj.InterfaceC4447o0
    public final boolean isCancelled() {
        return this.f14467f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InquiryProps(inquiryId=");
        sb2.append(this.f14462a);
        sb2.append(", sessionToken=");
        sb2.append(this.f14463b);
        sb2.append(", environmentId=");
        sb2.append(this.f14464c);
        sb2.append(", environment=");
        sb2.append(this.f14465d);
        sb2.append(", theme=");
        sb2.append(this.f14466e);
        sb2.append(", isCancelled=");
        return AbstractC14376f.m15823B(sb2, this.f14467f, Separators.RPAREN);
    }
}

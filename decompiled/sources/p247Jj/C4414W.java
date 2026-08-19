package p247Jj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jj.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4414W extends AbstractC4433h0 {
    public static final Parcelable.Creator<C4414W> CREATOR = new C2566j(23);

    /* JADX INFO: renamed from: A0 */
    public final String f14318A0;

    /* JADX INFO: renamed from: B0 */
    public final StaticInquiryTemplate f14319B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f14320C0;

    /* JADX INFO: renamed from: u0 */
    public final String f14321u0;

    /* JADX INFO: renamed from: v0 */
    public final String f14322v0;

    /* JADX INFO: renamed from: w0 */
    public final String f14323w0;

    /* JADX INFO: renamed from: x0 */
    public final String f14324x0;

    /* JADX INFO: renamed from: y0 */
    public final String f14325y0;

    /* JADX INFO: renamed from: z0 */
    public final Map f14326z0;

    public C4414W(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, boolean z6) {
        this.f14321u0 = str;
        this.f14322v0 = str2;
        this.f14323w0 = str3;
        this.f14324x0 = str4;
        this.f14325y0 = str5;
        this.f14326z0 = map;
        this.f14318A0 = str6;
        this.f14319B0 = staticInquiryTemplate;
        this.f14320C0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4414W)) {
            return false;
        }
        C4414W c4414w = (C4414W) obj;
        return AbstractC16544l.m18089b(this.f14321u0, c4414w.f14321u0) && AbstractC16544l.m18089b(this.f14322v0, c4414w.f14322v0) && AbstractC16544l.m18089b(this.f14323w0, c4414w.f14323w0) && AbstractC16544l.m18089b(this.f14324x0, c4414w.f14324x0) && AbstractC16544l.m18089b(this.f14325y0, c4414w.f14325y0) && AbstractC16544l.m18089b(this.f14326z0, c4414w.f14326z0) && AbstractC16544l.m18089b(this.f14318A0, c4414w.f14318A0) && AbstractC16544l.m18089b(this.f14319B0, c4414w.f14319B0) && this.f14320C0 == c4414w.f14320C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    public final int hashCode() {
        String str = this.f14321u0;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14322v0;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14323w0;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14324x0;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14325y0;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.f14326z0;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.f14318A0;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StaticInquiryTemplate staticInquiryTemplate = this.f14319B0;
        int iHashCode8 = (iHashCode7 + (staticInquiryTemplate != null ? staticInquiryTemplate.hashCode() : 0)) * 31;
        boolean z6 = this.f14320C0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode8 + r6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateInquiryFromTemplate(templateId=");
        sb2.append(this.f14321u0);
        sb2.append(", templateVersion=");
        sb2.append(this.f14322v0);
        sb2.append(", accountId=");
        sb2.append(this.f14323w0);
        sb2.append(", environmentId=");
        sb2.append(this.f14324x0);
        sb2.append(", referenceId=");
        sb2.append(this.f14325y0);
        sb2.append(", fields=");
        sb2.append(this.f14326z0);
        sb2.append(", themeSetId=");
        sb2.append(this.f14318A0);
        sb2.append(", staticInquiryTemplate=");
        sb2.append(this.f14319B0);
        sb2.append(", shouldAutoFallback=");
        return AbstractC14376f.m15823B(sb2, this.f14320C0, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14321u0);
        out.writeString(this.f14322v0);
        out.writeString(this.f14323w0);
        out.writeString(this.f14324x0);
        out.writeString(this.f14325y0);
        Map map = this.f14326z0;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeParcelable((Parcelable) entry.getValue(), i10);
            }
        }
        out.writeString(this.f14318A0);
        out.writeParcelable(this.f14319B0, i10);
        out.writeInt(this.f14320C0 ? 1 : 0);
    }
}

package p508Uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Uj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C7696d implements Parcelable {
    public static final Parcelable.Creator<C7696d> CREATOR = new C7695c();

    /* JADX INFO: renamed from: Y */
    public final String f24238Y;

    /* JADX INFO: renamed from: Z */
    public final C7693a f24239Z;

    /* JADX INFO: renamed from: o0 */
    public final C7703k f24240o0;

    /* JADX INFO: renamed from: p0 */
    public final List f24241p0;

    /* JADX INFO: renamed from: q0 */
    public final Integer f24242q0;

    /* JADX INFO: renamed from: r0 */
    public final StepStyles.UiStepStyle f24243r0;

    public C7696d(String cardAccessNumber, C7693a mrzKey, C7703k passportNfcStrings, List list, Integer num, StepStyles.UiStepStyle uiStepStyle) {
        AbstractC16544l.m18094g(cardAccessNumber, "cardAccessNumber");
        AbstractC16544l.m18094g(mrzKey, "mrzKey");
        AbstractC16544l.m18094g(passportNfcStrings, "passportNfcStrings");
        this.f24238Y = cardAccessNumber;
        this.f24239Z = mrzKey;
        this.f24240o0 = passportNfcStrings;
        this.f24241p0 = list;
        this.f24242q0 = num;
        this.f24243r0 = uiStepStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7696d)) {
            return false;
        }
        C7696d c7696d = (C7696d) obj;
        return AbstractC16544l.m18089b(this.f24238Y, c7696d.f24238Y) && AbstractC16544l.m18089b(this.f24239Z, c7696d.f24239Z) && AbstractC16544l.m18089b(this.f24240o0, c7696d.f24240o0) && AbstractC16544l.m18089b(this.f24241p0, c7696d.f24241p0) && AbstractC16544l.m18089b(this.f24242q0, c7696d.f24242q0) && AbstractC16544l.m18089b(this.f24243r0, c7696d.f24243r0);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f24241p0, (this.f24240o0.hashCode() + ((this.f24239Z.hashCode() + (this.f24238Y.hashCode() * 31)) * 31)) * 31, 31);
        Integer num = this.f24242q0;
        int iHashCode = (iM15858x + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.f24243r0;
        return iHashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.f24238Y + ", mrzKey=" + this.f24239Z + ", passportNfcStrings=" + this.f24240o0 + ", enabledDataGroups=" + this.f24241p0 + ", theme=" + this.f24242q0 + ", styles=" + this.f24243r0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        int iIntValue;
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f24238Y);
        this.f24239Z.writeToParcel(out, i10);
        this.f24240o0.writeToParcel(out, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f24241p0, out);
        while (itM19536s.hasNext()) {
            out.writeString(((EnumC7694b) itM19536s.next()).name());
        }
        Integer num = this.f24242q0;
        if (num == null) {
            iIntValue = 0;
        } else {
            out.writeInt(1);
            iIntValue = num.intValue();
        }
        out.writeInt(iIntValue);
        out.writeParcelable(this.f24243r0, i10);
    }
}

package pk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18500e implements Parcelable {
    public static final Parcelable.Creator<C18500e> CREATOR = new C18499d();

    /* JADX INFO: renamed from: Y */
    public final List f58960Y;

    /* JADX INFO: renamed from: Z */
    public final StepStyles.UiStepStyle f58961Z;

    public C18500e(List list, StepStyles.UiStepStyle uiStepStyle) {
        this.f58960Y = list;
        this.f58961Z = uiStepStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18500e)) {
            return false;
        }
        C18500e c18500e = (C18500e) obj;
        return AbstractC16544l.m18089b(this.f58960Y, c18500e.f58960Y) && AbstractC16544l.m18089b(this.f58961Z, c18500e.f58961Z);
    }

    public final int hashCode() {
        List list = this.f58960Y;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.f58961Z;
        return iHashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "UiComponentScreen(components=" + this.f58960Y + ", styles=" + this.f58961Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        List list = this.f58960Y;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i10);
            }
        }
        out.writeParcelable(this.f58961Z, i10);
    }
}

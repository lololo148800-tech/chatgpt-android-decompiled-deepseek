package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import pk.InterfaceC18497b;

/* JADX INFO: renamed from: rk.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C19226v implements InterfaceC18497b {
    public static final Parcelable.Creator<C19226v> CREATOR = new C19222u();

    /* JADX INFO: renamed from: Y */
    public final List f60974Y;

    /* JADX INFO: renamed from: Z */
    public final StepStyles.UiStepStyle f60975Z;

    public C19226v(List list, StepStyles.UiStepStyle uiStepStyle) {
        this.f60974Y = list;
        this.f60975Z = uiStepStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19226v)) {
            return false;
        }
        C19226v c19226v = (C19226v) obj;
        return AbstractC16544l.m18089b(this.f60974Y, c19226v.f60974Y) && AbstractC16544l.m18089b(this.f60975Z, c19226v.f60975Z);
    }

    @Override // pk.InterfaceC18497b
    public final List getComponents() {
        return this.f60974Y;
    }

    @Override // pk.InterfaceC18497b
    public final StepStyles.UiStepStyle getStyles() {
        return this.f60975Z;
    }

    public final int hashCode() {
        List list = this.f60974Y;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.f60975Z;
        return iHashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "CtaCardPage(components=" + this.f60974Y + ", styles=" + this.f60975Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        List list = this.f60974Y;
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
        out.writeParcelable(this.f60975Z, i10);
    }
}

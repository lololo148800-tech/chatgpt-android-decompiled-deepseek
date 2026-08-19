package p1044uj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import pk.InterfaceC18497b;

/* JADX INFO: renamed from: uj.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20365u0 implements InterfaceC18497b {
    public static final Parcelable.Creator<C20365u0> CREATOR = new C20363t0();

    /* JADX INFO: renamed from: Y */
    public final ArrayList f64382Y;

    /* JADX INFO: renamed from: Z */
    public final StepStyles.UiStepStyle f64383Z;

    /* JADX INFO: renamed from: o0 */
    public final String f64384o0;

    /* JADX INFO: renamed from: p0 */
    public final String f64385p0;

    /* JADX INFO: renamed from: q0 */
    public final String f64386q0;

    /* JADX INFO: renamed from: r0 */
    public final String f64387r0;

    public C20365u0(ArrayList arrayList, StepStyles.UiStepStyle uiStepStyle, String str, String str2, String str3, String str4) {
        this.f64382Y = arrayList;
        this.f64383Z = uiStepStyle;
        this.f64384o0 = str;
        this.f64385p0 = str2;
        this.f64386q0 = str3;
        this.f64387r0 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pk.InterfaceC18497b
    public final List getComponents() {
        return this.f64382Y;
    }

    @Override // pk.InterfaceC18497b
    public final StepStyles.UiStepStyle getStyles() {
        return this.f64383Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        ArrayList arrayList = this.f64382Y;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i10);
            }
        }
        out.writeParcelable(this.f64383Z, i10);
        out.writeString(this.f64384o0);
        out.writeString(this.f64385p0);
        out.writeString(this.f64386q0);
        out.writeString(this.f64387r0);
    }
}

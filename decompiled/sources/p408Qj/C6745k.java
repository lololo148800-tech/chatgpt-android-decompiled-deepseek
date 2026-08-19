package p408Qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.anhfj;
import p263K9.C4576X;

/* JADX INFO: renamed from: Qj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6745k extends AbstractC6746l {
    public static final Parcelable.Creator<C6745k> CREATOR = new C4576X(12);

    /* JADX INFO: renamed from: Y */
    public final Parcelable f21650Y;

    /* JADX INFO: renamed from: Z */
    public final StepStyle f21651Z;

    /* JADX INFO: renamed from: o0 */
    public final String f21652o0;

    /* JADX INFO: renamed from: p0 */
    public final String f21653p0;

    /* JADX INFO: renamed from: q0 */
    public final String f21654q0;

    /* JADX INFO: renamed from: r0 */
    public final String f21655r0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f21650Y, i10);
        out.writeParcelable(this.f21651Z, i10);
        out.writeString(this.f21652o0);
        out.writeString(this.f21653p0);
        out.writeString(this.f21654q0);
        out.writeString(this.f21655r0);
    }

    public C6745k(Parcelable parcelable, StepStyle stepStyle, String str, String str2, String str3, String str4) {
        AbstractC16544l.m18094g(parcelable, anhfj.VyVl);
        this.f21650Y = parcelable;
        this.f21651Z = stepStyle;
        this.f21652o0 = str;
        this.f21653p0 = str2;
        this.f21654q0 = str3;
        this.f21655r0 = str4;
    }
}

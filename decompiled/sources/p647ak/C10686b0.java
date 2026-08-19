package p647ak;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p909nm.C17689w;

/* JADX INFO: renamed from: ak.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10686b0 extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10686b0> CREATOR = new C8343M(23);

    /* JADX INFO: renamed from: Y */
    public final AbstractC10712k0 f31736Y;

    public C10686b0(AbstractC10712k0 abstractC10712k0) {
        this.f31736Y = abstractC10712k0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31736Y;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return C17689w.f56480Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f31736Y, i10);
    }
}

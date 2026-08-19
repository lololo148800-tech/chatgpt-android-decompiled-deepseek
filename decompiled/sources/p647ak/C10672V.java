package p647ak;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;

/* JADX INFO: renamed from: ak.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10672V extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10672V> CREATOR = new C8343M(17);

    /* JADX INFO: renamed from: Y */
    public final AbstractC10712k0 f31682Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10723q f31683Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC10712k0 f31684o0;

    public C10672V(AbstractC10712k0 nextState, EnumC10723q completedPose, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(nextState, "nextState");
        AbstractC16544l.m18094g(completedPose, "completedPose");
        this.f31682Y = nextState;
        this.f31683Z = completedPose;
        this.f31684o0 = abstractC10712k0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31684o0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31682Y.mo11015j();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f31682Y, i10);
        out.writeString(this.f31683Z.name());
        out.writeParcelable(this.f31684o0, i10);
    }
}

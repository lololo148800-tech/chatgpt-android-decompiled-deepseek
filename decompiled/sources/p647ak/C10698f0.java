package p647ak;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10698f0 extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10698f0> CREATOR = new C8343M(27);

    /* JADX INFO: renamed from: Y */
    public final List f31793Y;

    /* JADX INFO: renamed from: Z */
    public final String f31794Z;

    /* JADX INFO: renamed from: o0 */
    public final C18428A f31795o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31796p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC10712k0 f31797q0;

    public C10698f0(long j10, AbstractC10712k0 abstractC10712k0, String str, List selfies, C18428A cameraProperties) {
        AbstractC16544l.m18094g(selfies, "selfies");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31793Y = selfies;
        this.f31794Z = str;
        this.f31795o0 = cameraProperties;
        this.f31796p0 = j10;
        this.f31797q0 = abstractC10712k0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31797q0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31793Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Iterator itM19536s = AbstractC17792x.m19536s(this.f31793Y, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        out.writeString(this.f31794Z);
        out.writeParcelable(this.f31795o0, i10);
        out.writeLong(this.f31796p0);
        out.writeParcelable(this.f31797q0, i10);
    }
}

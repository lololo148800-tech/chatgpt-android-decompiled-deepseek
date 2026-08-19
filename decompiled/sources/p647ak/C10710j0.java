package p647ak;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10710j0 extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10710j0> CREATOR = new C10707i0(0);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f31825Y;

    /* JADX INFO: renamed from: Z */
    public final String f31826Z;

    /* JADX INFO: renamed from: o0 */
    public final C18428A f31827o0;

    /* JADX INFO: renamed from: p0 */
    public final long f31828p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC10712k0 f31829q0;

    public C10710j0(ArrayList arrayList, String webRtcObjectId, C18428A cameraProperties, long j10, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(webRtcObjectId, "webRtcObjectId");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31825Y = arrayList;
        this.f31826Z = webRtcObjectId;
        this.f31827o0 = cameraProperties;
        this.f31828p0 = j10;
        this.f31829q0 = abstractC10712k0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31829q0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31825Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        ArrayList arrayList = this.f31825Y;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i10);
        }
        out.writeString(this.f31826Z);
        out.writeParcelable(this.f31827o0, i10);
        out.writeLong(this.f31828p0);
        out.writeParcelable(this.f31829q0, i10);
    }
}

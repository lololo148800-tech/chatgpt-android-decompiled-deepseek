package p647ak;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;
import p949pj.C18428A;

/* JADX INFO: renamed from: ak.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10680Z extends AbstractC10712k0 {
    public static final Parcelable.Creator<C10680Z> CREATOR = new C8343M(21);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f31717Y;

    /* JADX INFO: renamed from: Z */
    public final C18428A f31718Z;

    /* JADX INFO: renamed from: o0 */
    public final long f31719o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC10712k0 f31720p0;

    public C10680Z(ArrayList arrayList, C18428A cameraProperties, long j10, AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f31717Y = arrayList;
        this.f31718Z = cameraProperties;
        this.f31719o0 = j10;
        this.f31720p0 = abstractC10712k0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: i */
    public final AbstractC10712k0 mo11014i() {
        return this.f31720p0;
    }

    @Override // p647ak.AbstractC10712k0
    /* JADX INFO: renamed from: j */
    public final List mo11015j() {
        return this.f31717Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        ArrayList arrayList = this.f31717Y;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i10);
        }
        out.writeParcelable(this.f31718Z, i10);
        out.writeLong(this.f31719o0);
        out.writeParcelable(this.f31720p0, i10);
    }
}

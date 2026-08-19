package p718e4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: e4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13283d implements InterfaceC19752B {
    public static final Parcelable.Creator<C13283d> CREATOR = new C13280a(1);

    /* JADX INFO: renamed from: Y */
    public final ArrayList f41987Y;

    public C13283d(ArrayList arrayList) {
        this.f41987Y = arrayList;
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((C13282c) arrayList.get(0)).f41985Z;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((C13282c) arrayList.get(i10)).f41984Y < j10) {
                    z6 = true;
                    break;
                }
                j10 = ((C13282c) arrayList.get(i10)).f41985Z;
            }
        }
        AbstractC20800b.m21316d(!z6);
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void mo10752S(C19799z c19799z) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13283d.class != obj.getClass()) {
            return false;
        }
        return this.f41987Y.equals(((C13283d) obj).f41987Y);
    }

    public final int hashCode() {
        return this.f41987Y.hashCode();
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C19788o mo10753k() {
        return null;
    }

    @Override // p1016t3.InterfaceC19752B
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ byte[] mo10754r0() {
        return null;
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f41987Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f41987Y);
    }
}

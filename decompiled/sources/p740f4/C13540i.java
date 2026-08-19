package p740f4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p718e4.C13280a;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: f4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13540i extends AbstractC13533b {
    public static final Parcelable.Creator<C13540i> CREATOR = new C13280a(7);

    /* JADX INFO: renamed from: Y */
    public final List f42861Y;

    public C13540i(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C13539h(parcel));
        }
        this.f42861Y = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f42861Y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C13539h c13539h = (C13539h) list.get(i11);
            parcel.writeLong(c13539h.f42850a);
            parcel.writeByte(c13539h.f42851b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c13539h.f42852c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c13539h.f42853d ? (byte) 1 : (byte) 0);
            List list2 = c13539h.f42855f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                C13538g c13538g = (C13538g) list2.get(i12);
                parcel.writeInt(c13538g.f42848a);
                parcel.writeLong(c13538g.f42849b);
            }
            parcel.writeLong(c13539h.f42854e);
            parcel.writeByte(c13539h.f42856g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c13539h.f42857h);
            parcel.writeInt(c13539h.f42858i);
            parcel.writeInt(c13539h.f42859j);
            parcel.writeInt(c13539h.f42860k);
        }
    }

    public C13540i(ArrayList arrayList) {
        this.f42861Y = DesugarCollections.unmodifiableList(arrayList);
    }
}

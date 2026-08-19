package p740f4;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: f4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13539h {

    /* JADX INFO: renamed from: a */
    public final long f42850a;

    /* JADX INFO: renamed from: b */
    public final boolean f42851b;

    /* JADX INFO: renamed from: c */
    public final boolean f42852c;

    /* JADX INFO: renamed from: d */
    public final boolean f42853d;

    /* JADX INFO: renamed from: e */
    public final long f42854e;

    /* JADX INFO: renamed from: f */
    public final List f42855f;

    /* JADX INFO: renamed from: g */
    public final boolean f42856g;

    /* JADX INFO: renamed from: h */
    public final long f42857h;

    /* JADX INFO: renamed from: i */
    public final int f42858i;

    /* JADX INFO: renamed from: j */
    public final int f42859j;

    /* JADX INFO: renamed from: k */
    public final int f42860k;

    public C13539h(long j10, boolean z6, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i10, int i11, int i12) {
        this.f42850a = j10;
        this.f42851b = z6;
        this.f42852c = z10;
        this.f42853d = z11;
        this.f42855f = DesugarCollections.unmodifiableList(arrayList);
        this.f42854e = j11;
        this.f42856g = z12;
        this.f42857h = j12;
        this.f42858i = i10;
        this.f42859j = i11;
        this.f42860k = i12;
    }

    public C13539h(Parcel parcel) {
        this.f42850a = parcel.readLong();
        this.f42851b = parcel.readByte() == 1;
        this.f42852c = parcel.readByte() == 1;
        this.f42853d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C13538g(parcel.readInt(), parcel.readLong()));
        }
        this.f42855f = DesugarCollections.unmodifiableList(arrayList);
        this.f42854e = parcel.readLong();
        this.f42856g = parcel.readByte() == 1;
        this.f42857h = parcel.readLong();
        this.f42858i = parcel.readInt();
        this.f42859j = parcel.readInt();
        this.f42860k = parcel.readInt();
    }
}

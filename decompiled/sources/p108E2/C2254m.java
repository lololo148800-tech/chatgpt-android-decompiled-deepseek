package p108E2;

import android.os.Parcel;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: E2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2254m {

    /* JADX INFO: renamed from: a */
    public final byte[] f6899a;

    /* JADX INFO: renamed from: b */
    public final String f6900b;

    /* JADX INFO: renamed from: c */
    public final long f6901c;

    public C2254m(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.f6899a = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        AbstractC16544l.m18091d(string);
        this.f6900b = string;
        this.f6901c = parcel.readLong();
    }
}

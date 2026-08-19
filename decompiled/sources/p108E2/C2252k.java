package p108E2;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: E2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2252k {

    /* JADX INFO: renamed from: a */
    public final long[] f6892a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f6893b;

    /* JADX INFO: renamed from: c */
    public final boolean f6894c;

    /* JADX INFO: renamed from: d */
    public final int f6895d;

    public C2252k(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f6892a = jArr;
        this.f6893b = remoteViewsArr;
        this.f6894c = false;
        this.f6895d = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC17680n.m19335K(arrayList).size();
        if (size > 1) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(size, "View type count is set to 1, but the collection contains ", " different layout ids").toString());
        }
    }

    public C2252k(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        int i10 = parcel.readInt();
        long[] jArr = new long[i10];
        this.f6892a = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator CREATOR = RemoteViews.CREATOR;
        AbstractC16544l.m18093f(CREATOR, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[i10];
        parcel.readTypedArray(remoteViewsArr, CREATOR);
        for (int i11 = 0; i11 < i10; i11++) {
            if (remoteViewsArr[i11] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f6893b = remoteViewsArr;
        this.f6894c = parcel.readInt() == 1;
        this.f6895d = parcel.readInt();
    }
}

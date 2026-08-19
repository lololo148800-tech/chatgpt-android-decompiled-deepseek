package p672c3;

import android.widget.RemoteViews;
import java.util.ArrayList;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: c3.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11624p0 {

    /* JADX INFO: renamed from: d */
    public static final C11624p0 f35222d = new C11624p0(new long[0], new RemoteViews[0], 1);

    /* JADX INFO: renamed from: a */
    public final long[] f35223a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f35224b;

    /* JADX INFO: renamed from: c */
    public final int f35225c;

    public C11624p0(long[] jArr, RemoteViews[] remoteViewsArr, int i10) {
        this.f35223a = jArr;
        this.f35224b = remoteViewsArr;
        this.f35225c = i10;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC17680n.m19335K(arrayList).size();
        if (size <= this.f35225c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f35225c + ", but the collection contains " + size + " different layout ids").toString());
    }
}

package p083D3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bb.AbstractC11278C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p1073w3.InterfaceC20806h;
import p232J3.C4253y;
import p849k7.C16349b;
import p885m4.C17153c;
import p885m4.C17165o;

/* JADX INFO: renamed from: D3.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1867e implements InterfaceC20806h, InterfaceC20802d {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f5361Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f5362Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f5363o0;

    public /* synthetic */ C1867e(C1863a c1863a, int i10, long j10, long j11) {
        this.f5363o0 = c1863a;
        this.f5362Z = i10;
        this.f5361Y = j10;
    }

    @Override // p1073w3.InterfaceC20802d
    public void accept(Object obj) {
        C17153c c17153c = (C17153c) obj;
        C17165o c17165o = (C17165o) this.f5363o0;
        AbstractC20800b.m21321i(c17165o.f54846h);
        AbstractC11278C abstractC11278C = c17153c.f54820a;
        long j10 = c17153c.f54822c;
        C16349b c16349b = new C16349b(4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC11278C.size());
        Iterator<E> it = abstractC11278C.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c16349b.mo22421apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        C20811m c20811m = c17165o.f54841c;
        c20811m.getClass();
        c20811m.m21342D(bArrMarshall.length, bArrMarshall);
        c17165o.f54839a.mo4970c(bArrMarshall.length, c20811m);
        long j11 = c17153c.f54821b;
        long j12 = this.f5361Y;
        if (j11 == -9223372036854775807L) {
            AbstractC20800b.m21320h(c17165o.f54846h.f62757r == Long.MAX_VALUE);
        } else {
            long j13 = c17165o.f54846h.f62757r;
            j12 = j13 == Long.MAX_VALUE ? j12 + j11 : j11 + j13;
        }
        c17165o.f54839a.mo4968a(j12, this.f5362Z, bArrMarshall.length, 0, null);
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        C1873k c1873k = (C1873k) obj;
        c1873k.getClass();
        C1863a c1863a = (C1863a) this.f5363o0;
        C4253y c4253y = c1863a.f5350d;
        if (c4253y != null) {
            String strM2784d = c1873k.f5391b.m2784d(c1863a.f5348b, c4253y);
            HashMap map = c1873k.f5397h;
            Long l4 = (Long) map.get(strM2784d);
            HashMap map2 = c1873k.f5396g;
            Long l10 = (Long) map2.get(strM2784d);
            map.put(strM2784d, Long.valueOf((l4 == null ? 0L : l4.longValue()) + this.f5361Y));
            map2.put(strM2784d, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) this.f5362Z)));
        }
    }

    public /* synthetic */ C1867e(C17165o c17165o, long j10, int i10) {
        this.f5363o0 = c17165o;
        this.f5361Y = j10;
        this.f5362Z = i10;
    }
}

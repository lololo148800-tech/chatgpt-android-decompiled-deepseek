package p165G9;

import android.os.Parcel;
import p139F9.BinderC2679b;
import p139F9.InterfaceC2678a;
import p333N9.AbstractC5680a;
import p424R9.AbstractC6827a;

/* JADX INFO: renamed from: G9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3025k extends AbstractC5680a {
    /* JADX INFO: renamed from: s */
    public final InterfaceC2678a m3885s(BinderC2679b binderC2679b, String str, int i10) {
        Parcel parcelM6116m = m6116m();
        AbstractC6827a.m7270c(parcelM6116m, binderC2679b);
        parcelM6116m.writeString(str);
        parcelM6116m.writeInt(i10);
        Parcel parcelM6115l = m6115l(parcelM6116m, 2);
        InterfaceC2678a interfaceC2678aM3655p = BinderC2679b.m3655p(parcelM6115l.readStrongBinder());
        parcelM6115l.recycle();
        return interfaceC2678aM3655p;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC2678a m3886t(BinderC2679b binderC2679b, String str, int i10, BinderC2679b binderC2679b2) {
        Parcel parcelM6116m = m6116m();
        AbstractC6827a.m7270c(parcelM6116m, binderC2679b);
        parcelM6116m.writeString(str);
        parcelM6116m.writeInt(i10);
        AbstractC6827a.m7270c(parcelM6116m, binderC2679b2);
        Parcel parcelM6115l = m6115l(parcelM6116m, 8);
        InterfaceC2678a interfaceC2678aM3655p = BinderC2679b.m3655p(parcelM6115l.readStrongBinder());
        parcelM6115l.recycle();
        return interfaceC2678aM3655p;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC2678a m3887u(BinderC2679b binderC2679b, String str, int i10) {
        Parcel parcelM6116m = m6116m();
        AbstractC6827a.m7270c(parcelM6116m, binderC2679b);
        parcelM6116m.writeString(str);
        parcelM6116m.writeInt(i10);
        Parcel parcelM6115l = m6115l(parcelM6116m, 4);
        InterfaceC2678a interfaceC2678aM3655p = BinderC2679b.m3655p(parcelM6115l.readStrongBinder());
        parcelM6115l.recycle();
        return interfaceC2678aM3655p;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC2678a m3888v(BinderC2679b binderC2679b, String str, boolean z6, long j10) {
        Parcel parcelM6116m = m6116m();
        AbstractC6827a.m7270c(parcelM6116m, binderC2679b);
        parcelM6116m.writeString(str);
        parcelM6116m.writeInt(z6 ? 1 : 0);
        parcelM6116m.writeLong(j10);
        Parcel parcelM6115l = m6115l(parcelM6116m, 7);
        InterfaceC2678a interfaceC2678aM3655p = BinderC2679b.m3655p(parcelM6115l.readStrongBinder());
        parcelM6115l.recycle();
        return interfaceC2678aM3655p;
    }
}

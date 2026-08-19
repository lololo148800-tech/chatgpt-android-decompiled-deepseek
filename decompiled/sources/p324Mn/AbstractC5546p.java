package p324Mn;

import p463Sn.C7152e;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Mn.p */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7152e.class)
public abstract class AbstractC5546p {
    public static final C5537g Companion = new C5537g();

    /* JADX INFO: renamed from: a */
    public static final C5541k f17997a;

    /* JADX INFO: renamed from: b */
    public static final C5543m f17998b;

    static {
        new C5545o(1L).m5940b(1000).m5940b(1000).m5940b(1000).m5940b(60).m5940b(60);
        f17997a = new C5541k(1);
        long j10 = ((long) 1) * ((long) 7);
        int i10 = (int) j10;
        if (j10 != i10) {
            throw new ArithmeticException();
        }
        new C5541k(i10);
        new C5543m(1);
        long j11 = ((long) 1) * ((long) 3);
        int i11 = (int) j11;
        if (j11 != i11) {
            throw new ArithmeticException();
        }
        new C5543m(i11);
        long j12 = ((long) 1) * ((long) 12);
        int i12 = (int) j12;
        if (j12 != i12) {
            throw new ArithmeticException();
        }
        f17998b = new C5543m(i12);
        long j13 = ((long) i12) * ((long) 100);
        int i13 = (int) j13;
        if (j13 != i13) {
            throw new ArithmeticException();
        }
        new C5543m(i13);
    }

    /* JADX INFO: renamed from: a */
    public static String m5941a(int i10, String str) {
        if (i10 == 1) {
            return str;
        }
        return i10 + '-' + str;
    }
}

package p001A;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.ArrayList;
import p228J.C3838h;
import p228J.C3871x0;
import p228J.EnumC3873y0;

/* JADX INFO: renamed from: A.F */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0010F {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f46a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m17a(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static C3871x0 m18b(ArrayList arrayList, C3871x0 c3871x0) {
        arrayList.add(c3871x0);
        return new C3871x0();
    }

    /* JADX INFO: renamed from: c */
    public static String m19c(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    /* JADX INFO: renamed from: d */
    public static String m20d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: e */
    public static StringBuilder m21e(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    /* JADX INFO: renamed from: f */
    public static void m22f(int i10, EnumC3873y0 enumC3873y0, long j10, C3871x0 c3871x0) {
        c3871x0.m4594a(new C3838h(i10, enumC3873y0, j10));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m23g(int i10) {
        switch (i10) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return wNrQXvwLiB.nNrnYjbdqYI;
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m24h(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m25i(int i10) {
        switch (i10) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m26j(int i10) {
        switch (i10) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int[] m27k(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f46a, 0, iArr, 0, i10);
        return iArr;
    }
}

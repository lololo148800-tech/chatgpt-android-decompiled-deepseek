package p026Ao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p051Bo.AbstractC1456b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17685s;
import p909nm.C17676j;

/* JADX INFO: renamed from: Ao.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0668b {

    /* JADX INFO: renamed from: a */
    public static final C0674h f1946a = new C0674h();

    /* JADX INFO: renamed from: a */
    public static final boolean m1401a(byte[] a10, int i10, byte[] b, int i11, int i12) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C0656E m1402b(InterfaceC0661J interfaceC0661J) {
        AbstractC16544l.m18094g(interfaceC0661J, "<this>");
        return new C0656E(interfaceC0661J);
    }

    /* JADX INFO: renamed from: c */
    public static final C0657F m1403c(InterfaceC0663L interfaceC0663L) {
        AbstractC16544l.m18094g(interfaceC0663L, "<this>");
        return new C0657F(interfaceC0663L);
    }

    /* JADX INFO: renamed from: d */
    public static void m1404d(long j10, C0675i c0675i, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((C0678l) arrayList.get(i17)).mo1372d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0678l c0678l = (C0678l) arrayList.get(i11);
        C0678l c0678l2 = (C0678l) arrayList.get(i12 - 1);
        int i18 = -1;
        if (i16 == c0678l.mo1372d()) {
            int iIntValue = ((Number) arrayList2.get(i11)).intValue();
            int i19 = i11 + 1;
            C0678l c0678l3 = (C0678l) arrayList.get(i19);
            i13 = i19;
            i14 = iIntValue;
            c0678l = c0678l3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (c0678l.mo1376i(i16) == c0678l2.mo1376i(i16)) {
            int iMin = Math.min(c0678l.mo1372d(), c0678l2.mo1372d());
            int i20 = 0;
            for (int i21 = i16; i21 < iMin && c0678l.mo1376i(i21) == c0678l2.mo1376i(i21); i21++) {
                i20++;
            }
            long j11 = 4;
            long j12 = (c0675i.f1970Z / j11) + j10 + ((long) 2) + ((long) i20) + 1;
            c0675i.m1439i1(-i20);
            c0675i.m1439i1(i14);
            int i22 = i20 + i16;
            while (i16 < i22) {
                c0675i.m1439i1(c0678l.mo1376i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i22 != ((C0678l) arrayList.get(i13)).mo1372d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0675i.m1439i1(((Number) arrayList2.get(i13)).intValue());
                return;
            } else {
                C0675i c0675i2 = new C0675i();
                c0675i.m1439i1(((int) ((c0675i2.f1970Z / j11) + j12)) * (-1));
                m1404d(j12, c0675i2, i22, arrayList, i13, i12, arrayList2);
                c0675i.mo1339u(c0675i2);
                return;
            }
        }
        int i23 = 1;
        for (int i24 = i13 + 1; i24 < i12; i24++) {
            if (((C0678l) arrayList.get(i24 - 1)).mo1376i(i16) != ((C0678l) arrayList.get(i24)).mo1376i(i16)) {
                i23++;
            }
        }
        long j13 = 4;
        long j14 = (c0675i.f1970Z / j13) + j10 + ((long) 2) + ((long) (i23 * 2));
        c0675i.m1439i1(i23);
        c0675i.m1439i1(i14);
        for (int i25 = i13; i25 < i12; i25++) {
            int iMo1376i = ((C0678l) arrayList.get(i25)).mo1376i(i16);
            if (i25 == i13 || iMo1376i != ((C0678l) arrayList.get(i25 - 1)).mo1376i(i16)) {
                c0675i.m1439i1(iMo1376i & 255);
            }
        }
        C0675i c0675i3 = new C0675i();
        int i26 = i13;
        while (i26 < i12) {
            byte bMo1376i = ((C0678l) arrayList.get(i26)).mo1376i(i16);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i12) {
                    i15 = i12;
                    break;
                } else {
                    if (bMo1376i != ((C0678l) arrayList.get(i28)).mo1376i(i16)) {
                        i15 = i28;
                        break;
                    }
                    i28++;
                }
            }
            if (i27 == i15 && i16 + 1 == ((C0678l) arrayList.get(i26)).mo1372d()) {
                c0675i.m1439i1(((Number) arrayList2.get(i26)).intValue());
            } else {
                c0675i.m1439i1(((int) ((c0675i3.f1970Z / j13) + j14)) * i18);
                m1404d(j14, c0675i3, i16 + 1, arrayList, i26, i15, arrayList2);
            }
            c0675i3 = c0675i3;
            i26 = i15;
            i18 = -1;
        }
        c0675i.mo1339u(c0675i3);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1405e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("size=", j10, " offset=");
            sbM9894m.append(j11);
            sbM9894m.append(" byteCount=");
            sbM9894m.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbM9894m.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1406f(AssertionError assertionError) {
        Logger logger = AbstractC0652A.f1907a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC21322p.m21667A(message, "getsockname failed", false) : false;
    }

    /* JADX INFO: renamed from: g */
    public static C0653B m1407g(C0678l... c0678lArr) {
        if (c0678lArr.length == 0) {
            return new C0653B(new C0678l[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C17676j(c0678lArr, false));
        AbstractC17685s.m19391t(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(-1);
        }
        int length = c0678lArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList2.set(AbstractC17681o.m19379h(arrayList, c0678lArr[i11]), Integer.valueOf(i12));
            i11++;
            i12++;
        }
        if (((C0678l) arrayList.get(0)).mo1372d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            C0678l prefix = (C0678l) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                C0678l c0678l = (C0678l) arrayList.get(i15);
                c0678l.getClass();
                AbstractC16544l.m18094g(prefix, "prefix");
                if (!c0678l.mo1379m(0, prefix, prefix.mo1372d())) {
                    break;
                }
                if (c0678l.mo1372d() == prefix.mo1372d()) {
                    throw new IllegalArgumentException(("duplicate option: " + c0678l).toString());
                }
                if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                    arrayList.remove(i15);
                    arrayList2.remove(i15);
                } else {
                    i15++;
                }
            }
            i13 = i14;
        }
        C0675i c0675i = new C0675i();
        m1404d(0L, c0675i, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i16 = (int) (c0675i.f1970Z / ((long) 4));
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = c0675i.m1420N0();
        }
        Object[] objArrCopyOf = Arrays.copyOf(c0678lArr, c0678lArr.length);
        AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
        return new C0653B((C0678l[]) objArrCopyOf, iArr);
    }

    /* JADX INFO: renamed from: h */
    public static final int m1408h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* JADX INFO: renamed from: i */
    public static final C0670d m1409i(Socket socket) throws IOException {
        Logger logger = AbstractC0652A.f1907a;
        C0662K c0662k = new C0662K(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC16544l.m18093f(outputStream, "getOutputStream(...)");
        return new C0670d(c0662k, 0, new C0670d(outputStream, 1, c0662k));
    }

    /* JADX INFO: renamed from: j */
    public static final C0671e m1410j(InputStream inputStream) {
        Logger logger = AbstractC0652A.f1907a;
        AbstractC16544l.m18094g(inputStream, "<this>");
        return new C0671e(inputStream, new C0665N());
    }

    /* JADX INFO: renamed from: k */
    public static final C0671e m1411k(Socket socket) throws IOException {
        Logger logger = AbstractC0652A.f1907a;
        C0662K c0662k = new C0662K(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC16544l.m18093f(inputStream, "getInputStream(...)");
        return new C0671e(c0662k, new C0671e(inputStream, c0662k));
    }

    /* JADX INFO: renamed from: l */
    public static final String m1412l(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        char[] cArr = AbstractC1456b.f3826a;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        return AbstractC21329w.m21721h(cArr2, i11, 8);
    }
}

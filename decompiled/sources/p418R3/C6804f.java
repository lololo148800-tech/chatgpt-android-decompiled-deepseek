package p418R3;

import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.AbstractC11330w;
import bb.C11276A;
import bb.C11294T;
import java.util.Arrays;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: R3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6804f implements InterfaceC6799a {

    /* JADX INFO: renamed from: a */
    public final C11294T f21845a;

    /* JADX INFO: renamed from: b */
    public final int f21846b;

    public C6804f(int i10, C11294T c11294t) {
        this.f21846b = i10;
        this.f21845a = c11294t;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static C6804f m7238b(int i10, C20811m c20811m) {
        String str;
        String str2;
        InterfaceC6799a c6801c;
        int i11;
        int i12 = 4;
        AbstractC11320m.m12724c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i13 = c20811m.f66094c;
        int i14 = 0;
        int i15 = -2;
        int i16 = 0;
        while (c20811m.m21346a() > 8) {
            int iM21354i = c20811m.m21354i();
            int iM21354i2 = c20811m.f66093b + c20811m.m21354i();
            c20811m.m21343E(iM21354i2);
            if (iM21354i != 1414744396) {
                C6805g c6805g = null;
                switch (iM21354i) {
                    case 1718776947:
                        if (i15 == 2) {
                            c20811m.m21345G(i12);
                            int iM21354i3 = c20811m.m21354i();
                            int iM21354i4 = c20811m.m21354i();
                            c20811m.m21345G(i12);
                            int iM21354i5 = c20811m.m21354i();
                            switch (iM21354i5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC20734X.m21224A(iM21354i5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C19787n c19787n = new C19787n();
                                c19787n.f62720r = iM21354i3;
                                c19787n.f62721s = iM21354i4;
                                c19787n.f62714l = AbstractC19754D.m20711i(str2);
                                c6805g = new C6805g(new C19788o(c19787n));
                            }
                        } else if (i15 == 1) {
                            int iM21358m = c20811m.m21358m();
                            if (iM21358m == 1) {
                                str = "audio/raw";
                            } else if (iM21358m == 85) {
                                str = "audio/mpeg";
                            } else if (iM21358m == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iM21358m != 8192) {
                                str = iM21358m != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str == null) {
                                AbstractC20734X.m21224A(iM21358m, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int iM21358m2 = c20811m.m21358m();
                                int iM21354i6 = c20811m.m21354i();
                                c20811m.m21345G(6);
                                int iM21419t = AbstractC20817s.m21419t(c20811m.m21358m());
                                int iM21358m3 = c20811m.m21346a() > 0 ? c20811m.m21358m() : i14;
                                byte[] bArr = new byte[iM21358m3];
                                c20811m.m21350e(bArr, i14, iM21358m3);
                                C19787n c19787n2 = new C19787n();
                                c19787n2.f62714l = AbstractC19754D.m20711i(str);
                                c19787n2.f62728z = iM21358m2;
                                c19787n2.f62694A = iM21354i6;
                                if ("audio/raw".equals(str) && iM21419t != 0) {
                                    c19787n2.f62695B = iM21419t;
                                }
                                if ("audio/mp4a-latm".equals(str) && iM21358m3 > 0) {
                                    c19787n2.f62717o = AbstractC11278C.m12695y(bArr);
                                }
                                c6805g = new C6805g(new C19788o(c19787n2));
                            }
                        } else {
                            AbstractC20800b.m21332t("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC20817s.m21423x(i15));
                        }
                        c6801c = c6805g;
                        break;
                    case 1751742049:
                        int iM21354i7 = c20811m.m21354i();
                        c20811m.m21345G(8);
                        int iM21354i8 = c20811m.m21354i();
                        int iM21354i9 = c20811m.m21354i();
                        c20811m.m21345G(i12);
                        c20811m.m21354i();
                        c20811m.m21345G(12);
                        c6801c = new C6801c(iM21354i7, iM21354i8, iM21354i9);
                        break;
                    case 1752331379:
                        int iM21354i10 = c20811m.m21354i();
                        c20811m.m21345G(12);
                        c20811m.m21354i();
                        int iM21354i11 = c20811m.m21354i();
                        int iM21354i12 = c20811m.m21354i();
                        c20811m.m21345G(i12);
                        int iM21354i13 = c20811m.m21354i();
                        int iM21354i14 = c20811m.m21354i();
                        c20811m.m21345G(8);
                        c6801c = new C6802d(iM21354i10, iM21354i11, iM21354i12, iM21354i13, iM21354i14);
                        break;
                    case 1852994675:
                        c6801c = new C6806h(c20811m.m21363r(c20811m.m21346a(), AbstractC10531d.f31242c));
                        break;
                    default:
                        c6801c = c6805g;
                        break;
                }
            } else {
                c6801c = m7238b(c20811m.m21354i(), c20811m);
            }
            if (c6801c != null) {
                if (c6801c.getType() == 1752331379) {
                    int i17 = ((C6802d) c6801c).f21828a;
                    if (i17 == 1935960438) {
                        i15 = 2;
                    } else if (i17 != 1935963489) {
                        if (i17 != 1937012852) {
                            AbstractC20800b.m21332t("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i17));
                            i11 = -1;
                        } else {
                            i11 = 3;
                        }
                        i15 = i11;
                    } else {
                        i15 = 1;
                    }
                }
                int i18 = i16 + 1;
                if (objArrCopyOf.length < i18) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC11330w.m12760e(objArrCopyOf.length, i18));
                }
                objArrCopyOf[i16] = c6801c;
                i16 = i18;
            }
            c20811m.m21344F(iM21354i2);
            c20811m.m21343E(i13);
            i12 = 4;
            i14 = 0;
        }
        return new C6804f(i10, AbstractC11278C.m12689r(i16, objArrCopyOf));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6799a m7239a(Class cls) {
        C11276A c11276aListIterator = this.f21845a.listIterator(0);
        while (c11276aListIterator.hasNext()) {
            InterfaceC6799a interfaceC6799a = (InterfaceC6799a) c11276aListIterator.next();
            if (interfaceC6799a.getClass() == cls) {
                return interfaceC6799a;
            }
        }
        return null;
    }

    @Override // p418R3.InterfaceC6799a
    public final int getType() {
        return this.f21846b;
    }
}

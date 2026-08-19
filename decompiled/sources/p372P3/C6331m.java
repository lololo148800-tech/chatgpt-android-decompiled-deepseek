package p372P3;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1016t3.AbstractC19754D;
import p1055v4.C20427A;
import p1055v4.C20431b;
import p1055v4.C20453x;
import p1073w3.C20816r;
import p1074w4.C20821d;
import p117Eb.C2385o;
import p395Q3.C6570a;
import p418R3.C6800b;
import p443S3.C6992a;
import p469T3.C7235a;
import p494U3.C7554b;
import p518V3.C7750b;
import p523V9.AbstractC8190s4;
import p777h4.C14408d;
import p784hb.C14438g;
import p800i4.C14924d;
import p824j4.C16113i;
import p824j4.C16116l;
import p846k4.C16335d;
import p885m4.C17155e;
import p885m4.C17164n;

/* JADX INFO: renamed from: P3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6331m implements InterfaceC6336r {

    /* JADX INFO: renamed from: q0 */
    public static final int[] f20552q0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: r0 */
    public static final C15358g1 f20553r0 = new C15358g1(new C2385o(20));

    /* JADX INFO: renamed from: s0 */
    public static final C15358g1 f20554s0 = new C15358g1(new C2385o(21));

    /* JADX INFO: renamed from: Y */
    public C11294T f20555Y;

    /* JADX INFO: renamed from: p0 */
    public int f20558p0;

    /* JADX INFO: renamed from: o0 */
    public C17155e f20557o0 = new C17155e();

    /* JADX INFO: renamed from: Z */
    public boolean f20556Z = true;

    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: a */
    public final InterfaceC6336r mo6946a(C17155e c17155e) {
        synchronized (this) {
            this.f20557o0 = c17155e;
        }
        return this;
    }

    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: b */
    public final InterfaceC6336r mo6947b(boolean z6) {
        synchronized (this) {
            this.f20556Z = z6;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m6948c(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new C16335d(1));
                break;
            case 1:
                arrayList.add(new C16335d(2));
                break;
            case 2:
                arrayList.add(new C20431b());
                break;
            case 3:
                arrayList.add(new C6570a());
                break;
            case 4:
                InterfaceC6333o interfaceC6333oM16585m = f20553r0.m16585m(0);
                if (interfaceC6333oM16585m == null) {
                    arrayList.add(new C7554b());
                } else {
                    arrayList.add(interfaceC6333oM16585m);
                }
                break;
            case 5:
                arrayList.add(new C7750b());
                break;
            case 6:
                arrayList.add(new C14408d(this.f20557o0, this.f20556Z ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C14924d());
                break;
            case 8:
                arrayList.add(new C16113i(this.f20557o0, this.f20556Z ? 0 : 32));
                arrayList.add(new C16116l(this.f20557o0, this.f20556Z ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C16335d(0));
                break;
            case 10:
                arrayList.add(new C20453x());
                break;
            case 11:
                if (this.f20555Y == null) {
                    C11276A c11276a = AbstractC11278C.f34162Z;
                    this.f20555Y = C11294T.f34185q0;
                }
                arrayList.add(new C20427A(!this.f20556Z ? 1 : 0, this.f20557o0, new C20816r(0L), new C14438g(this.f20555Y)));
                break;
            case 12:
                arrayList.add(new C20821d());
                break;
            case 14:
                arrayList.add(new C7235a(this.f20558p0));
                break;
            case 15:
                InterfaceC6333o interfaceC6333oM16585m2 = f20554s0.m16585m(new Object[0]);
                if (interfaceC6333oM16585m2 != null) {
                    arrayList.add(interfaceC6333oM16585m2);
                }
                break;
            case 16:
                arrayList.add(new C6800b(!this.f20556Z ? 1 : 0, this.f20557o0));
                break;
            case 17:
                arrayList.add(new C7235a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new C6992a(2));
                break;
            case 19:
                arrayList.add(new C7235a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new C6992a(1));
                break;
            case 21:
                arrayList.add(new C6992a(0));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC6333o[] mo6949d(Uri uri, Map map) {
        InterfaceC6333o[] interfaceC6333oArr;
        int i10 = 14;
        synchronized (this) {
            try {
                int[] iArr = f20552q0;
                ArrayList arrayList = new ArrayList(21);
                List list = (List) map.get(SIPHeaderNames.CONTENT_TYPE);
                String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (str != null) {
                    String strM20711i = AbstractC19754D.m20711i(str);
                    strM20711i.getClass();
                    switch (strM20711i) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/eac3":
                            i10 = 0;
                            break;
                        case "video/mp2p":
                            i10 = 10;
                            break;
                        case "video/mp2t":
                            i10 = 11;
                            break;
                        case "video/webm":
                        case "audio/x-matroska":
                        case "application/webm":
                        case "audio/webm":
                        case "video/x-matroska":
                            i10 = 6;
                            break;
                        case "audio/amr-wb":
                        case "audio/amr":
                        case "audio/3gpp":
                            i10 = 3;
                            break;
                        case "image/avif":
                            i10 = 21;
                            break;
                        case "image/heic":
                        case "image/heif":
                            i10 = 20;
                            break;
                        case "image/jpeg":
                            break;
                        case "image/webp":
                            i10 = 18;
                            break;
                        case "application/mp4":
                        case "audio/mp4":
                        case "video/mp4":
                            i10 = 8;
                            break;
                        case "video/x-msvideo":
                            i10 = 16;
                            break;
                        case "text/vtt":
                            i10 = 13;
                            break;
                        case "image/bmp":
                            i10 = 19;
                            break;
                        case "image/png":
                            i10 = 17;
                            break;
                        case "video/x-flv":
                            i10 = 5;
                            break;
                        case "audio/ac4":
                            i10 = 1;
                            break;
                        case "audio/ogg":
                            i10 = 9;
                            break;
                        case "audio/wav":
                            i10 = 12;
                            break;
                        case "audio/flac":
                            i10 = 4;
                            break;
                        case "audio/midi":
                            i10 = 15;
                            break;
                        case "audio/mpeg":
                            i10 = 7;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    m6948c(i10, arrayList);
                }
                int iM8772c = AbstractC8190s4.m8772c(uri);
                if (iM8772c != -1 && iM8772c != i10) {
                    m6948c(iM8772c, arrayList);
                }
                for (int i11 = 0; i11 < 21; i11++) {
                    int i12 = iArr[i11];
                    if (i12 != i10 && i12 != iM8772c) {
                        m6948c(i12, arrayList);
                    }
                }
                interfaceC6333oArr = new InterfaceC6333o[arrayList.size()];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    InterfaceC6333o c17164n = (InterfaceC6333o) arrayList.get(i13);
                    if (this.f20556Z && !(c17164n.mo6855a() instanceof C16113i) && !(c17164n.mo6855a() instanceof C16116l) && !(c17164n.mo6855a() instanceof C20427A) && !(c17164n.mo6855a() instanceof C6800b) && !(c17164n.mo6855a() instanceof C14408d)) {
                        c17164n = new C17164n(c17164n, this.f20557o0);
                    }
                    interfaceC6333oArr[i13] = c17164n;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC6333oArr;
    }
}

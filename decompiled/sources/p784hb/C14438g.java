package p784hb;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Range;
import android.util.Size;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import bb.AbstractC11278C;
import fo.C13711h;
import io.sentry.InterfaceC15148O;
import io.sentry.ThreadFactoryC15522y;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.transport.C15490m;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import mo.AbstractC17329F;
import p003A1.AbstractC0168G;
import p013Ab.C0420b;
import p025An.AbstractC0593T;
import p025An.ExecutorC0592S;
import p030B2.C0742X;
import p049Bm.InterfaceC1436k;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1027tp.InterfaceC20067k;
import p1061vb.C20513d;
import p1073w3.C20811m;
import p1096x2.InterfaceC21106a;
import p109E3.RunnableC2301y;
import p1145z7.InterfaceC21805b;
import p117Eb.C2392v;
import p153Fn.AbstractC2935m;
import p155G.C2952d;
import p178H.C3123P;
import p178H.C3163p;
import p178H.InterfaceC3108A;
import p201Hn.C3516e;
import p228J.C3821X;
import p228J.C3853o0;
import p283L5.AbstractC4941g;
import p392Q0.C6546d;
import p523V9.AbstractC8154o0;
import p536W.C8406b;
import p571X9.AbstractC9233X;
import p588Y2.C9598B;
import p644ab.AbstractC10531d;
import p817j$.util.Optional;
import p895n1.AbstractC17421a;
import p895n1.C17428h;
import p895n1.C17429i;
import p895n1.C17430j;
import p895n1.C17431k;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17434n;
import p895n1.C17435o;
import p895n1.C17436p;
import p895n1.C17437q;
import p895n1.C17438r;
import p895n1.C17439s;
import p895n1.C17440t;
import p895n1.C17441u;
import p895n1.C17442v;
import p895n1.C17443w;
import p895n1.C17444x;
import p895n1.C17445y;
import p895n1.C17446z;
import p949pj.C18428A;
import p949pj.C18494y;
import p949pj.EnumC18493x;
import p949pj.EnumC18495z;
import p953q0.C18593n;
import p972qm.C18778k;
import p976r.InterfaceC18812j;
import p976r.MenuC18814l;
import p996rm.EnumC19250a;
import p999s.C19356i;
import sm.AbstractC19687c;
import tl.C20005e;

/* JADX INFO: renamed from: hb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C14438g implements InterfaceC14439h, InterfaceC15148O, InterfaceC18812j, InterfaceC20067k, InterfaceC21106a, InterfaceC21805b {

    /* JADX INFO: renamed from: Y */
    public Object f45414Y;

    public /* synthetic */ C14438g(Object obj) {
        this.f45414Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x028d  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:207:0x0403  */
    /* JADX WARN: Code duplicated, block: B:209:0x0410  */
    /* JADX WARN: Code duplicated, block: B:211:0x0417  */
    /* JADX WARN: Code duplicated, block: B:215:0x0424  */
    /* JADX WARN: Code duplicated, block: B:363:0x0438 A[ADDED_TO_REGION, EDGE_INSN: B:363:0x0438->B:219:0x0438 BREAK  A[LOOP:4: B:24:0x0053->B:365:0x0053], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x015c, code lost:
    
        r6 = 0;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m15960e(C14438g c14438g, String str) {
        int i10;
        int i11;
        char cCharAt;
        ArrayList arrayList;
        int i12;
        char c9;
        int i13;
        C14438g c14438g2;
        ArrayList arrayList2;
        char cCharAt2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j10;
        boolean z6;
        long j11;
        long jFloatToRawIntBits;
        long j12;
        long jFloatToRawIntBits2;
        long j13;
        long j14;
        long jFloatToRawIntBits3;
        int iFloatToRawIntBits;
        char c10;
        char cCharAt3;
        int i22;
        long j15;
        int iFloatToRawIntBits2;
        float fIntBitsToFloat;
        float[] fArr;
        C14438g c14438g3 = c14438g;
        ArrayList arrayList3 = new ArrayList();
        int length = str.length();
        int i23 = 0;
        while (true) {
            i10 = 32;
            if (i23 >= length || AbstractC16544l.m18096i(str.charAt(i23), 32) > 0) {
                break;
            }
            i23++;
        }
        while (length > i23 && AbstractC16544l.m18096i(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i24 = 0;
        while (i23 < length) {
            while (true) {
                i11 = i23 + 1;
                cCharAt = str.charAt(i23);
                int i25 = cCharAt | ' ';
                if ((i25 - 122) * (i25 - 97) <= 0 && i25 != 101) {
                    break;
                }
                if (i11 >= length) {
                    cCharAt = 0;
                    break;
                }
                i23 = i11;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i24 = 0;
                    while (true) {
                        if (i11 >= length || AbstractC16544l.m18096i(str.charAt(i11), i10) > 0) {
                            if (i11 != length) {
                                c9 = cCharAt;
                                char cCharAt4 = str.charAt(i11);
                                boolean z10 = cCharAt4 == '-';
                                if (z10) {
                                    i14 = i11 + 1;
                                    if (i14 == length) {
                                        j15 = ((long) i14) << i10;
                                        iFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        cCharAt2 = str.charAt(i14);
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j15 = ((long) i14) << i10;
                                            iFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        i11 = (int) (jFloatToRawIntBits >>> i13);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j11));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            c14438g2 = c14438g;
                                            i24 = i15;
                                        } else {
                                            c14438g2 = c14438g;
                                            fArr = (float[]) c14438g2.f45414Y;
                                            i24 = i15 + 1;
                                            fArr[i15] = fIntBitsToFloat;
                                            if (i24 >= fArr.length) {
                                                float[] fArr2 = new float[i24 * 2];
                                                c14438g2.f45414Y = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                        }
                                        while (i11 < i12 && str.charAt(i11) == ',') {
                                            i11++;
                                        }
                                        if (i11 < i12 || Float.isNaN(fIntBitsToFloat)) {
                                            break;
                                        }
                                        i10 = i13;
                                        length = i12;
                                        cCharAt = c9;
                                        arrayList3 = arrayList;
                                    }
                                } else {
                                    cCharAt2 = cCharAt4;
                                    i14 = i11;
                                }
                                int length2 = str.length();
                                int i26 = i14;
                                long j16 = 0;
                                while (i26 != length) {
                                    int i27 = cCharAt2 - '0';
                                    if (((char) i27) >= '\n') {
                                        break;
                                    }
                                    j16 = (j16 * 10) + ((long) i27);
                                    i26++;
                                    cCharAt2 = i26 < length2 ? str.charAt(i26) : (char) 0;
                                }
                                int i28 = i26 - i14;
                                if (i26 == length || cCharAt2 != '.') {
                                    i15 = i24;
                                    i16 = i26;
                                    i17 = i16;
                                    i18 = i28;
                                    i19 = 0;
                                } else {
                                    int i29 = i26 + 1;
                                    i17 = i29;
                                    while (true) {
                                        if (length - i17 < 4) {
                                            i15 = i24;
                                            i22 = i28;
                                            break;
                                        }
                                        i15 = i24;
                                        i22 = i28;
                                        long jCharAt = ((long) str.charAt(i17)) | (((long) str.charAt(i17 + 1)) << 16) | (((long) str.charAt(i17 + 2)) << 32) | (((long) str.charAt(i17 + 3)) << 48);
                                        long j17 = jCharAt - 13511005043687472L;
                                        int i30 = (((jCharAt + 19703549022044230L) | j17) & (-35747867511423104L)) != 0 ? -1 : (int) ((j17 * 281475406208040961L) >>> 48);
                                        if (i30 < 0) {
                                            break;
                                        }
                                        j16 = (j16 * 10000) + ((long) i30);
                                        i17 += 4;
                                        i24 = i15;
                                        i28 = i22;
                                    }
                                    if (i17 < length2) {
                                        char cCharAt5 = str.charAt(i17);
                                        while (i17 != length) {
                                            int i31 = cCharAt5 - '0';
                                            if (((char) i31) >= '\n') {
                                                break;
                                            }
                                            j16 = (j16 * 10) + ((long) i31);
                                            i17++;
                                            cCharAt5 = i17 < length2 ? str.charAt(i17) : (char) 0;
                                        }
                                        i19 = i29 - i17;
                                        i18 = i22 - i19;
                                        cCharAt2 = cCharAt5;
                                        i16 = i29;
                                    }
                                }
                                if (i18 == 0) {
                                    arrayList = arrayList3;
                                    j11 = 4294967295L;
                                    i12 = length;
                                    jFloatToRawIntBits = (((long) i17) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                    i13 = 32;
                                } else {
                                    if ((cCharAt2 | ' ') == 101) {
                                        i20 = i17 + 1;
                                        if (i20 < length2) {
                                            cCharAt3 = str.charAt(i20);
                                            c10 = '-';
                                        } else {
                                            c10 = '-';
                                            cCharAt3 = 0;
                                        }
                                        boolean z11 = cCharAt3 == c10;
                                        if (z11 || cCharAt3 == '+') {
                                            i20 = i17 + 2;
                                        }
                                        char cCharAt6 = str.charAt(i20);
                                        i21 = 0;
                                        while (true) {
                                            if (i20 == length) {
                                                arrayList = arrayList3;
                                                break;
                                            }
                                            int i32 = cCharAt6 - '0';
                                            arrayList = arrayList3;
                                            if (((char) i32) >= '\n') {
                                                break;
                                            }
                                            if (i21 < 1024) {
                                                i21 = (i21 * 10) + i32;
                                            }
                                            i20++;
                                            cCharAt6 = i20 < length2 ? str.charAt(i20) : (char) 0;
                                            arrayList3 = arrayList;
                                        }
                                        if (z11) {
                                            i21 = -i21;
                                        }
                                        i19 += i21;
                                    } else {
                                        arrayList = arrayList3;
                                        i20 = i17;
                                        i21 = 0;
                                    }
                                    int i33 = 19;
                                    if (i18 > 19) {
                                        char cCharAt7 = str.charAt(i14);
                                        int i34 = i14;
                                        while (i20 != length) {
                                            if (cCharAt7 != '0' && cCharAt7 != '.') {
                                                i33 = 19;
                                                break;
                                            }
                                            if (cCharAt7 == '0') {
                                                i18--;
                                            }
                                            i34++;
                                            cCharAt7 = i34 < length2 ? str.charAt(i34) : (char) 0;
                                            i33 = 19;
                                        }
                                        if (i18 > i33) {
                                            char cCharAt8 = str.charAt(i14);
                                            long j18 = 0;
                                            while (true) {
                                                i12 = length;
                                                if (i14 == i26 || Long.compare(j18 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                    break;
                                                }
                                                j18 = (j18 * 10) + ((long) (cCharAt8 - '0'));
                                                i14++;
                                                cCharAt8 = i14 < length2 ? str.charAt(i14) : (char) 0;
                                                length = i12;
                                            }
                                            if (Long.compare(j18 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i19 = (i26 - i14) + i21;
                                            } else {
                                                char cCharAt9 = str.charAt(i16);
                                                int i35 = i16;
                                                while (i35 != i17 && Long.compare(j18 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                    j18 = (j18 * 10) + ((long) (cCharAt9 - '0'));
                                                    i35++;
                                                    cCharAt9 = i35 < length2 ? str.charAt(i35) : (char) 0;
                                                }
                                                i19 = (i16 - i35) + i21;
                                            }
                                            j10 = j18;
                                            z6 = true;
                                        } else {
                                            i12 = length;
                                            j10 = j16;
                                            z6 = false;
                                        }
                                    } else {
                                        i12 = length;
                                        j10 = j16;
                                        z6 = false;
                                    }
                                    if (-10 <= i19 && i19 < 11 && !z6 && Long.compare(j10 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                        float f10 = j10;
                                        float[] fArr3 = AbstractC17421a.f55651a;
                                        float f11 = i19 < 0 ? f10 / fArr3[-i19] : f10 * fArr3[i19];
                                        if (z10) {
                                            f11 = -f11;
                                        }
                                        j12 = ((long) i20) << 32;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                                    } else if (j10 == 0) {
                                        j12 = ((long) i20) << 32;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(z10 ? -0.0f : 0.0f);
                                    } else if (-126 > i19 || i19 >= 128) {
                                        String strSubstring = str.substring(i11, i20);
                                        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i13 = 32;
                                        j11 = 4294967295L;
                                        jFloatToRawIntBits = (((long) i20) << 32) | (((long) Float.floatToRawIntBits(Float.parseFloat(strSubstring))) & 4294967295L);
                                    } else {
                                        long j19 = AbstractC17421a.f55652b[i19 + 325];
                                        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                                        long j20 = j10 << iNumberOfLeadingZeros;
                                        long j21 = j20 & 4294967295L;
                                        long j22 = j20 >>> 32;
                                        long j23 = j19 & 4294967295L;
                                        long j24 = j19 >>> 32;
                                        long j25 = j22 * j24;
                                        long j26 = j24 * j21;
                                        long j27 = j25 + ((((j22 * j23) + ((j21 * j23) >>> 32)) + (j26 & 4294967295L)) >>> 32) + (j26 >>> 32);
                                        int i36 = (int) (j27 >>> 63);
                                        long j28 = j27 >>> (i36 + 9);
                                        int i37 = iNumberOfLeadingZeros + (i36 ^ 1);
                                        long j29 = j27 & 511;
                                        if (j29 == 511 || (j29 == 0 && (j28 & 3) == 1)) {
                                            String strSubstring2 = str.substring(i11, i20);
                                            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            j12 = ((long) i20) << 32;
                                            jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(Float.parseFloat(strSubstring2))) & 4294967295L;
                                            jFloatToRawIntBits = j12 | jFloatToRawIntBits2;
                                            i13 = 32;
                                            j11 = 4294967295L;
                                        } else {
                                            long j30 = (j28 + 1) >>> 1;
                                            if (j30 >= 9007199254740992L) {
                                                i37--;
                                                j30 = 4503599627370496L;
                                            }
                                            long j31 = j30 & (-4503599627370497L);
                                            long j32 = ((((((long) i19) * 217706) >> 16) + ((long) 1024)) + ((long) 63)) - ((long) i37);
                                            if (j32 < 1 || j32 > 2046) {
                                                i13 = 32;
                                                j13 = 4294967295L;
                                                String strSubstring3 = str.substring(i11, i20);
                                                AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                                j14 = ((long) i20) << 32;
                                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                            } else {
                                                i13 = 32;
                                                j14 = ((long) i20) << 32;
                                                jFloatToRawIntBits3 = Float.floatToRawIntBits((float) Double.longBitsToDouble((j32 << 52) | j31 | (z10 ? Long.MIN_VALUE : 0L)));
                                                j13 = 4294967295L;
                                            }
                                            jFloatToRawIntBits = j14 | (jFloatToRawIntBits3 & j13);
                                            j11 = j13;
                                        }
                                    }
                                    jFloatToRawIntBits2 = ((long) iFloatToRawIntBits) & 4294967295L;
                                    jFloatToRawIntBits = j12 | jFloatToRawIntBits2;
                                    i13 = 32;
                                    j11 = 4294967295L;
                                }
                                i11 = (int) (jFloatToRawIntBits >>> i13);
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j11));
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    c14438g2 = c14438g;
                                    fArr = (float[]) c14438g2.f45414Y;
                                    i24 = i15 + 1;
                                    fArr[i15] = fIntBitsToFloat;
                                    if (i24 >= fArr.length) {
                                        float[] fArr4 = new float[i24 * 2];
                                        c14438g2.f45414Y = fArr4;
                                        System.arraycopy(fArr, 0, fArr4, 0, fArr.length);
                                    }
                                } else {
                                    c14438g2 = c14438g;
                                    i24 = i15;
                                }
                                while (i11 < i12) {
                                    i11++;
                                }
                                if (i11 < i12) {
                                    break;
                                }
                                break;
                                break;
                            }
                            c9 = cCharAt;
                            j15 = ((long) i11) << i10;
                            iFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                            arrayList = arrayList3;
                            i12 = length;
                            jFloatToRawIntBits = j15 | (((long) iFloatToRawIntBits2) & 4294967295L);
                            i13 = i10;
                            i15 = i24;
                            j11 = 4294967295L;
                            i11 = (int) (jFloatToRawIntBits >>> i13);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j11));
                            if (Float.isNaN(fIntBitsToFloat)) {
                                c14438g2 = c14438g;
                                fArr = (float[]) c14438g2.f45414Y;
                                i24 = i15 + 1;
                                fArr[i15] = fIntBitsToFloat;
                                if (i24 >= fArr.length) {
                                    float[] fArr5 = new float[i24 * 2];
                                    c14438g2.f45414Y = fArr5;
                                    System.arraycopy(fArr, 0, fArr5, 0, fArr.length);
                                }
                            } else {
                                c14438g2 = c14438g;
                                i24 = i15;
                            }
                            while (i11 < i12) {
                                i11++;
                            }
                            if (i11 < i12) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        i11++;
                    }
                } else {
                    arrayList = arrayList3;
                    i12 = length;
                    c9 = cCharAt;
                    i13 = i10;
                    c14438g2 = c14438g3;
                }
                i23 = i11;
                float[] fArr6 = (float[]) c14438g2.f45414Y;
                char c11 = c9;
                if (c11 == 'z' || c11 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(C17429i.f55733c);
                } else {
                    arrayList2 = arrayList;
                    int i38 = 2;
                    if (c11 == 'm') {
                        int i39 = i24 - 2;
                        if (i39 >= 0) {
                            arrayList2.add(new C17441u(fArr6[0], fArr6[1]));
                            while (i38 <= i39) {
                                arrayList2.add(new C17440t(fArr6[i38], fArr6[i38 + 1]));
                                i38 += 2;
                            }
                        }
                    } else {
                        if (c11 == 'M') {
                            int i40 = i24 - 2;
                            if (i40 >= 0) {
                                arrayList2.add(new C17433m(fArr6[0], fArr6[1]));
                                while (i38 <= i40) {
                                    arrayList2.add(new C17432l(fArr6[i38], fArr6[i38 + 1]));
                                    i38 += 2;
                                }
                            }
                        } else if (c11 == 'l') {
                            int i41 = i24 - 2;
                            for (int i42 = 0; i42 <= i41; i42 += 2) {
                                arrayList2.add(new C17440t(fArr6[i42], fArr6[i42 + 1]));
                            }
                        } else if (c11 == 'L') {
                            int i43 = i24 - 2;
                            for (int i44 = 0; i44 <= i43; i44 += 2) {
                                arrayList2.add(new C17432l(fArr6[i44], fArr6[i44 + 1]));
                            }
                        } else if (c11 == 'h') {
                            int i45 = i24 - 1;
                            for (int i46 = 0; i46 <= i45; i46++) {
                                arrayList2.add(new C17439s(fArr6[i46]));
                            }
                        } else if (c11 == 'H') {
                            int i47 = i24 - 1;
                            for (int i48 = 0; i48 <= i47; i48++) {
                                arrayList2.add(new C17431k(fArr6[i48]));
                            }
                        } else if (c11 == 'v') {
                            int i49 = i24 - 1;
                            for (int i50 = 0; i50 <= i49; i50++) {
                                arrayList2.add(new C17445y(fArr6[i50]));
                            }
                        } else if (c11 == 'V') {
                            int i51 = i24 - 1;
                            for (int i52 = 0; i52 <= i51; i52++) {
                                arrayList2.add(new C17446z(fArr6[i52]));
                            }
                        } else if (c11 == 'c') {
                            int i53 = i24 - 6;
                            for (int i54 = 0; i54 <= i53; i54 += 6) {
                                arrayList2.add(new C17438r(fArr6[i54], fArr6[i54 + 1], fArr6[i54 + 2], fArr6[i54 + 3], fArr6[i54 + 4], fArr6[i54 + 5]));
                            }
                        } else if (c11 == 'C') {
                            int i55 = i24 - 6;
                            for (int i56 = 0; i56 <= i55; i56 += 6) {
                                arrayList2.add(new C17430j(fArr6[i56], fArr6[i56 + 1], fArr6[i56 + 2], fArr6[i56 + 3], fArr6[i56 + 4], fArr6[i56 + 5]));
                            }
                        } else if (c11 == 's') {
                            int i57 = i24 - 4;
                            for (int i58 = 0; i58 <= i57; i58 += 4) {
                                arrayList2.add(new C17443w(fArr6[i58], fArr6[i58 + 1], fArr6[i58 + 2], fArr6[i58 + 3]));
                            }
                        } else if (c11 == 'S') {
                            int i59 = i24 - 4;
                            for (int i60 = 0; i60 <= i59; i60 += 4) {
                                arrayList2.add(new C17435o(fArr6[i60], fArr6[i60 + 1], fArr6[i60 + 2], fArr6[i60 + 3]));
                            }
                        } else if (c11 == 'q') {
                            int i61 = i24 - 4;
                            for (int i62 = 0; i62 <= i61; i62 += 4) {
                                arrayList2.add(new C17442v(fArr6[i62], fArr6[i62 + 1], fArr6[i62 + 2], fArr6[i62 + 3]));
                            }
                        } else if (c11 == 'Q') {
                            int i63 = i24 - 4;
                            for (int i64 = 0; i64 <= i63; i64 += 4) {
                                arrayList2.add(new C17434n(fArr6[i64], fArr6[i64 + 1], fArr6[i64 + 2], fArr6[i64 + 3]));
                            }
                        } else if (c11 == 't') {
                            int i65 = i24 - 2;
                            for (int i66 = 0; i66 <= i65; i66 += 2) {
                                arrayList2.add(new C17444x(fArr6[i66], fArr6[i66 + 1]));
                            }
                        } else if (c11 == 'T') {
                            int i67 = i24 - 2;
                            for (int i68 = 0; i68 <= i67; i68 += 2) {
                                arrayList2.add(new C17436p(fArr6[i68], fArr6[i68 + 1]));
                            }
                        } else if (c11 == 'a') {
                            int i69 = i24 - 7;
                            for (int i70 = 0; i70 <= i69; i70 += 7) {
                                arrayList2.add(new C17437q(fArr6[i70], fArr6[i70 + 1], fArr6[i70 + 2], Float.compare(fArr6[i70 + 3], 0.0f) != 0, Float.compare(fArr6[i70 + 4], 0.0f) != 0, fArr6[i70 + 5], fArr6[i70 + 6]));
                            }
                        } else {
                            if (c11 != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + c11);
                            }
                            int i71 = i24 - 7;
                            for (int i72 = 0; i72 <= i71; i72 += 7) {
                                arrayList2.add(new C17428h(fArr6[i72], fArr6[i72 + 1], fArr6[i72 + 2], Float.compare(fArr6[i72 + 3], 0.0f) != 0, Float.compare(fArr6[i72 + 4], 0.0f) != 0, fArr6[i72 + 5], fArr6[i72 + 6]));
                            }
                        }
                        c14438g3 = c14438g2;
                        arrayList3 = arrayList2;
                        length = i12;
                        i10 = i13;
                    }
                }
                c14438g3 = c14438g2;
                arrayList3 = arrayList2;
                length = i12;
                i10 = i13;
            } else {
                i23 = i11;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    public static C18428A m15961h(C8406b c8406b) {
        EnumC18495z enumC18495z;
        try {
            C3853o0 c3853o0 = c8406b.f26135o0.f18037C0;
            AbstractC16544l.m18093f(c3853o0, "getCameraInfo(...)");
            C2952d c2952dM3775a = C2952d.m3775a(c3853o0);
            AbstractC16544l.m18093f(c2952dM3775a, "from(...)");
            String str = c2952dM3775a.f8834a.f110a;
            AbstractC16544l.m18093f(str, "getCameraId(...)");
            Rect rect = (Rect) c2952dM3775a.m3776b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) c2952dM3775a.m3776b(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                enumC18495z = EnumC18495z.f58955Z;
            } else {
                enumC18495z = (num != null && num.intValue() == 0) ? EnumC18495z.f58954Y : EnumC18495z.f58956o0;
            }
            Range[] rangeArr = (Range[]) c2952dM3775a.m3776b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                C0742X c0742xM18098k = AbstractC16544l.m18098k(rangeArr);
                while (c0742xM18098k.hasNext()) {
                    Integer num2 = (Integer) ((Range) c0742xM18098k.next()).getUpper();
                    AbstractC16544l.m18091d(num2);
                    if (num2.intValue() > iIntValue) {
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new C18428A(str, enumC18495z, size, iIntValue);
        } catch (IllegalArgumentException unused) {
            return new C18428A();
        }
    }

    @Override // p1027tp.InterfaceC20067k
    /* JADX INFO: renamed from: a */
    public Object mo15962a(Object obj) {
        return Optional.ofNullable(((InterfaceC20067k) this.f45414Y).mo15962a((AbstractC17329F) obj));
    }

    @Override // p1145z7.InterfaceC21805b
    /* JADX INFO: renamed from: b */
    public void mo15963b(String str) {
        ((AtomicReference) this.f45414Y).set(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX INFO: renamed from: c */
    public List m15964c(C0420b c0420b) {
        String str;
        int i10;
        C20811m c20811m = new C20811m((byte[]) c0420b.f1383p0);
        ArrayList arrayList = (AbstractC11278C) this.f45414Y;
        while (c20811m.m21346a() > 0) {
            int iM21365t = c20811m.m21365t();
            int iM21365t2 = c20811m.f66093b + c20811m.m21365t();
            if (iM21365t == 134) {
                arrayList = new ArrayList();
                int iM21365t3 = c20811m.m21365t() & 31;
                for (int i11 = 0; i11 < iM21365t3; i11++) {
                    String strM21363r = c20811m.m21363r(3, AbstractC10531d.f31242c);
                    int iM21365t4 = c20811m.m21365t();
                    boolean z6 = (iM21365t4 & 128) != 0;
                    if (z6) {
                        i10 = iM21365t4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bM21365t = (byte) c20811m.m21365t();
                    c20811m.m21345G(1);
                    List listSingletonList = z6 ? Collections.singletonList((bM21365t & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C19787n c19787n = new C19787n();
                    c19787n.f62714l = AbstractC19754D.m20711i(str);
                    c19787n.f62706d = strM21363r;
                    c19787n.f62698E = i10;
                    c19787n.f62717o = listSingletonList;
                    arrayList.add(new C19788o(c19787n));
                }
            }
            c20811m.m21344F(iM21365t2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // p1096x2.InterfaceC21106a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f45414Y;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: d */
    public void mo15965d(long j10) {
        synchronized (((ScheduledExecutorService) this.f45414Y)) {
            if (!((ScheduledExecutorService) this.f45414Y).isShutdown()) {
                ((ScheduledExecutorService) this.f45414Y).shutdown();
                try {
                    if (!((ScheduledExecutorService) this.f45414Y).awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        ((ScheduledExecutorService) this.f45414Y).shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    ((ScheduledExecutorService) this.f45414Y).shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15966f(C20513d definition) {
        AbstractC16544l.m18094g(definition, "definition");
        AbstractC0168G.m507B(((C20005e) this.f45414Y).m20806a(definition));
    }

    /* JADX INFO: renamed from: g */
    public void m15967g(PreviewView previewView, EnumC18493x enumC18493x, InterfaceC3108A interfaceC3108A, InterfaceC1436k interfaceC1436k) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = enumC18493x == EnumC18493x.f58948Y ? 0 : 1;
        AbstractC4941g.m5559R("The specified lens facing is invalid.", i10 != -1);
        linkedHashSet.add(new C3821X(i10));
        previewView.post(new RunnableC2301y(previewView, interfaceC3108A, new C3163p(linkedHashSet), this, interfaceC1436k));
    }

    @Override // p1145z7.InterfaceC21805b
    public String getVersion() {
        Object obj = ((AtomicReference) this.f45414Y).get();
        AbstractC16544l.m18093f(obj, "value.get()");
        return (String) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m15968i(Context context, AbstractC19687c abstractC19687c) {
        C18494y c18494y;
        C3123P c3123p;
        if (abstractC19687c instanceof C18494y) {
            c18494y = (C18494y) abstractC19687c;
            int i10 = c18494y.f58953o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18494y.f58953o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18494y = new C18494y(this, abstractC19687c);
            }
        } else {
            c18494y = new C18494y(this, abstractC19687c);
        }
        Object objM20051a = c18494y.f58951Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18494y.f58953o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM20051a);
            c18494y.f58953o0 = 1;
            C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(c18494y));
            File file = new File(context.getCacheDir(), AbstractC0168G.m533v("persona_camera_", System.currentTimeMillis(), ".jpg"));
            C2392v c2392v = new C2392v(file, (ContentResolver) null, (Uri) null, (ContentValues) null);
            C13711h c13711h = (C13711h) this.f45414Y;
            if (c13711h != null && (c3123p = (C3123P) c13711h.f43260o0) != null) {
                C3516e c3516e = AbstractC0593T.f1824a;
                c3123p.m3959F(c2392v, new ExecutorC0592S(AbstractC2935m.f8797a.f3819q0), new C15384c(c18778k, 28, file));
            }
            objM20051a = c18778k.m20051a();
            if (objM20051a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM20051a);
        }
        return ((C17312o) objM20051a).f55139Y;
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: m */
    public boolean mo15969m() {
        boolean zIsShutdown;
        synchronized (((ScheduledExecutorService) this.f45414Y)) {
            zIsShutdown = ((ScheduledExecutorService) this.f45414Y).isShutdown();
        }
        return zIsShutdown;
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: p */
    public boolean mo10219p(MenuC18814l menuC18814l, MenuItem menuItem) {
        ((Toolbar) this.f45414Y).getClass();
        return false;
    }

    @Override // p1096x2.InterfaceC21106a
    /* JADX INFO: renamed from: q */
    public Cursor mo10561q(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f45414Y;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            AbstractC15256t.m16483u("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC15148O
    /* JADX INFO: renamed from: r */
    public Future mo15970r(Runnable runnable, long j10) {
        return ((ScheduledExecutorService) this.f45414Y).schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC15148O
    public Future submit(Runnable runnable) {
        return ((ScheduledExecutorService) this.f45414Y).submit(runnable);
    }

    @Override // p784hb.InterfaceC14439h
    /* JADX INFO: renamed from: t */
    public Object mo15959t() throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((InterfaceC14441j) this.f45414Y).mo3663A((Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: y */
    public void mo10224y(MenuC18814l menuC18814l) {
        Toolbar toolbar = (Toolbar) this.f45414Y;
        C19356i c19356i = toolbar.f32292o0.f32238H0;
        if (c19356i == null || !c19356i.m20460i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f32280U0.f43260o0).iterator();
            while (it.hasNext()) {
                ((C9598B) it.next()).f28890a.m11809s();
            }
        }
    }

    public C14438g(int i10) {
        switch (i10) {
            case 2:
                this.f45414Y = new C15490m();
                break;
            case 3:
                this.f45414Y = new C20005e();
                break;
            case 8:
                this.f45414Y = new C6546d(new C18593n[16]);
                break;
            default:
                this.f45414Y = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15522y(1));
                break;
        }
    }
}

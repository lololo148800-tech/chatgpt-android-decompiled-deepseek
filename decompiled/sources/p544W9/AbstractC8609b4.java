package p544W9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Rect;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lc.C16842b;
import lc.EnumC16841a;
import mc.AbstractC17223b;
import mc.AbstractC17224c;
import mc.C17222a;
import mc.C17226e;
import p001A.AbstractC0010F;
import p030B2.C0781s;
import p166Ga.C3029c;
import p310M9.C5311e;
import p666bl.C11500p;
import p785hc.C14443b;
import p785hc.EnumC14442a;
import p808ic.AbstractC14961e;
import p808ic.C14957a;
import p808ic.C14958b;
import p808ic.C14960d;
import p808ic.EnumC14959c;
import p826j6.C16137F;
import p833jc.C16190a;
import p833jc.C16191b;
import p882m1.clb.WGTYqNchEpHca;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: W9.b4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8609b4 {
    /* JADX INFO: renamed from: b */
    public abstract Rect m9261b();

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:342:0x0747  */
    /* JADX WARN: Code duplicated, block: B:612:0x08a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C14958b m9260a(String str, int i10, int i11, HashMap map) throws C14443b {
        int i12;
        EnumC16841a enumC16841a;
        C16842b c16842bM18573a;
        C14957a c14957a;
        C16842b c16842b;
        EnumC14959c enumC14959c;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[][] bArr;
        int i17;
        boolean z6;
        boolean z10;
        boolean z11;
        int i18;
        boolean z12;
        char c9;
        int[] iArr;
        ArrayList arrayList;
        C16191b c16191b;
        int i19;
        C16191b c16191b2;
        C16191b c16191b3;
        int[] iArr2;
        char c10;
        int i20;
        int i21;
        int i22 = i10;
        int i23 = 0;
        int i24 = 1;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i22 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i22 + 'x' + i11);
        }
        EnumC14442a enumC14442a = EnumC14442a.f45417Y;
        if (map.containsKey(enumC14442a)) {
            String string = map.get(enumC14442a).toString();
            if (string == null) {
                throw new NullPointerException("Name is null");
            }
            if (string.equals(TokenNames.f32014L)) {
                i12 = 1;
            } else if (string.equals(TokenNames.f32015M)) {
                i12 = 2;
            } else if (string.equals("Q")) {
                i12 = 3;
            } else {
                if (!string.equals("H")) {
                    throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
                }
                i12 = 4;
            }
        } else {
            i12 = 1;
        }
        EnumC14442a enumC14442a2 = EnumC14442a.f45419o0;
        int i25 = map.containsKey(enumC14442a2) ? Integer.parseInt(map.get(enumC14442a2).toString()) : 4;
        int[] iArr3 = AbstractC17223b.f54962a;
        EnumC14442a enumC14442a3 = EnumC14442a.f45423s0;
        boolean z13 = map.containsKey(enumC14442a3) && Boolean.parseBoolean(map.get(enumC14442a3).toString());
        EnumC14442a enumC14442a4 = EnumC14442a.f45422r0;
        boolean z14 = map.containsKey(enumC14442a4) && Boolean.parseBoolean(map.get(enumC14442a4).toString());
        EnumC14442a enumC14442a5 = EnumC14442a.f45418Z;
        boolean zContainsKey = map.containsKey(enumC14442a5);
        Object obj = AbstractC17223b.f54963b;
        Charset charsetForName = zContainsKey ? Charset.forName(map.get(enumC14442a5).toString()) : obj;
        EnumC16841a enumC16841a2 = EnumC16841a.BYTE;
        if (z14) {
            if (charsetForName.equals(obj)) {
                charsetForName = null;
            }
            C3029c c3029c = new C3029c(str, charsetForName, z13, i12);
            C16842b[] c16842bArr = {C3029c.m3902h(1), C3029c.m3902h(2), C3029c.m3902h(3)};
            C5311e[] c5311eArr = {c3029c.m3906g(c16842bArr[0]), c3029c.m3906g(c16842bArr[1]), c3029c.m3906g(c16842bArr[2])};
            int i26 = 0;
            int i27 = Integer.MAX_VALUE;
            int i28 = -1;
            for (int i29 = 3; i26 < i29; i29 = 3) {
                C5311e c5311e = c5311eArr[i26];
                int iM5864t = c5311e.m5864t((C16842b) c5311e.f17485o0);
                if (AbstractC17223b.m18956c(iM5864t, c16842bArr[i26], c3029c.f9117b) && iM5864t < i27) {
                    i28 = i26;
                    i27 = iM5864t;
                }
                i26++;
            }
            if (i28 < 0) {
                throw new C14443b("Data too big for any version");
            }
            C5311e c5311e2 = c5311eArr[i28];
            c14957a = new C14957a();
            for (C17226e c17226e : (ArrayList) c5311e2.f17484Z) {
                EnumC16841a enumC16841a3 = c17226e.f54974a;
                c14957a.m16123b(enumC16841a3.f54019Z, 4);
                int i30 = c17226e.f54977d;
                C5311e c5311e3 = c17226e.f54978e;
                if (i30 > 0) {
                    c14957a.m16123b(c17226e.m18964a(), enumC16841a3.m18572a((C16842b) c5311e3.f17485o0));
                }
                EnumC16841a enumC16841a4 = EnumC16841a.ECI;
                int i31 = c17226e.f54976c;
                if (enumC16841a3 == enumC16841a4) {
                    c14957a.m16123b(((EnumC14959c) EnumC14959c.f46592p0.get(((C14960d) ((C3029c) c5311e3.f17486p0).f9120e).f46597a[i31].charset().name())).f46594Y[0], 8);
                } else if (i30 > 0) {
                    String str2 = (String) ((C3029c) c5311e3.f17486p0).f9119d;
                    int i32 = c17226e.f54975b;
                    AbstractC17223b.m18954a(str2.substring(i32, i30 + i32), enumC16841a3, c14957a, ((C14960d) ((C3029c) c5311e3.f17486p0).f9120e).f46597a[i31].charset());
                }
            }
            c16842b = (C16842b) c5311e2.f17485o0;
        } else {
            if (!AbstractC14961e.f46600b.equals(charsetForName) || !AbstractC17223b.m18955b(str)) {
                int i33 = 0;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    if (i33 < str.length()) {
                        char cCharAt = str.charAt(i33);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z16 = true;
                        } else if ((cCharAt < '`' ? AbstractC17223b.f54962a[cCharAt] : -1) != -1) {
                            z15 = true;
                        }
                        i33++;
                    } else {
                        if (z15) {
                            enumC16841a = EnumC16841a.ALPHANUMERIC;
                            break;
                        }
                        if (z16) {
                            enumC16841a = EnumC16841a.NUMERIC;
                            break;
                        }
                    }
                    enumC16841a = enumC16841a2;
                    break;
                }
            }
            enumC16841a = EnumC16841a.KANJI;
            C14957a c14957a2 = new C14957a();
            if (enumC16841a == enumC16841a2 && zContainsKey && (enumC14959c = (EnumC14959c) EnumC14959c.f46592p0.get(charsetForName.name())) != null) {
                c14957a2.m16123b(7, 4);
                c14957a2.m16123b(enumC14959c.f46594Y[0], 8);
            }
            if (z13) {
                c14957a2.m16123b(5, 4);
            }
            c14957a2.m16123b(enumC16841a.f54019Z, 4);
            C14957a c14957a3 = new C14957a();
            AbstractC17223b.m18954a(str, enumC16841a, c14957a3, charsetForName);
            EnumC14442a enumC14442a6 = EnumC14442a.f45420p0;
            if (map.containsKey(enumC14442a6)) {
                C16842b c16842bM18573a2 = C16842b.m18573a(Integer.parseInt(map.get(enumC14442a6).toString()));
                if (!AbstractC17223b.m18956c(enumC16841a.m18572a(c16842bM18573a2) + c14957a2.f46586Z + c14957a3.f46586Z, c16842bM18573a2, i12)) {
                    throw new C14443b("Data too big for requested version");
                }
                c16842bM18573a = c16842bM18573a2;
            } else {
                int iM18572a = enumC16841a.m18572a(C16842b.m18573a(1)) + c14957a2.f46586Z + c14957a3.f46586Z;
                int i34 = 1;
                while (true) {
                    if (i34 > 40) {
                        throw new C14443b("Data too big");
                    }
                    C16842b c16842bM18573a3 = C16842b.m18573a(i34);
                    if (AbstractC17223b.m18956c(iM18572a, c16842bM18573a3, i12)) {
                        int iM18572a2 = enumC16841a.m18572a(c16842bM18573a3) + c14957a2.f46586Z + c14957a3.f46586Z;
                        int i35 = i24;
                        int i36 = 40;
                        while (true) {
                            if (i35 > i36) {
                                throw new C14443b("Data too big");
                            }
                            c16842bM18573a = C16842b.m18573a(i35);
                            if (AbstractC17223b.m18956c(iM18572a2, c16842bM18573a, i12)) {
                                break;
                            }
                            int i37 = i25;
                            int i38 = i24;
                            i35 += i38;
                            i24 = i38;
                            i25 = i37;
                            i23 = 0;
                            i36 = 40;
                            i22 = i22;
                        }
                    } else {
                        int i39 = i25;
                        int i40 = i24;
                        i34 += i40;
                        i24 = i40;
                        i22 = i22;
                        i25 = i39;
                        i23 = 0;
                    }
                }
            }
            C14957a c14957a4 = new C14957a();
            int i41 = c14957a2.f46586Z;
            c14957a4.m16124c(i41);
            for (int i42 = i23; i42 < i41; i42 += i24) {
                c14957a4.m16122a(c14957a2.m16125d(i42));
            }
            int iM16126e = enumC16841a == enumC16841a2 ? c14957a3.m16126e() : str.length();
            int iM18572a3 = enumC16841a.m18572a(c16842bM18573a);
            int i43 = i24 << iM18572a3;
            if (iM16126e >= i43) {
                throw new C14443b(iM16126e + " is bigger than " + (i43 - 1));
            }
            c14957a4.m16123b(iM16126e, iM18572a3);
            int i44 = c14957a3.f46586Z;
            c14957a4.m16124c(c14957a4.f46586Z + i44);
            for (int i45 = 0; i45 < i44; i45 += i24) {
                c14957a4.m16122a(c14957a3.m16125d(i45));
            }
            c14957a = c14957a4;
            c16842b = c16842bM18573a;
        }
        C16137F c16137f = c16842b.f54022b[AbstractC0010F.m24h(i12)];
        C0781s[] c0781sArr = (C0781s[]) c16137f.f50064o0;
        int length = c0781sArr.length;
        int i46 = 0;
        for (int i47 = 0; i47 < length; i47 += i24) {
            i46 += c0781sArr[i47].f2192b;
        }
        int i48 = i46 * c16137f.f50063Z;
        int i49 = c16842b.f54023c;
        int i50 = i49 - i48;
        int i51 = i50 * 8;
        if (c14957a.f46586Z > i51) {
            throw new C14443b(WGTYqNchEpHca.MfoO + c14957a.f46586Z + " > " + i51);
        }
        for (int i52 = 0; i52 < 4 && c14957a.f46586Z < i51; i52 += i24) {
            c14957a.m16122a(false);
        }
        boolean z17 = false;
        int i53 = c14957a.f46586Z & 7;
        if (i53 > 0) {
            while (i53 < 8) {
                c14957a.m16122a(z17);
                i53 += i24;
                z17 = false;
            }
        }
        int iM16126e2 = i50 - c14957a.m16126e();
        for (int i54 = 0; i54 < iM16126e2; i54 += i24) {
            c14957a.m16123b((i54 & 1) == 0 ? 236 : 17, 8);
        }
        if (c14957a.f46586Z != i51) {
            throw new C14443b("Bits size does not equal capacity");
        }
        C0781s[] c0781sArr2 = (C0781s[]) c16137f.f50064o0;
        int length2 = c0781sArr2.length;
        int i55 = 0;
        for (int i56 = 0; i56 < length2; i56 += i24) {
            i55 += c0781sArr2[i56].f2192b;
        }
        if (c14957a.m16126e() != i50) {
            throw new C14443b("Number of bits and data bytes does not match");
        }
        ArrayList arrayList2 = new ArrayList(i55);
        int i57 = 0;
        int i58 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i57 < i55) {
            int[] iArr4 = new int[i24];
            int[] iArr5 = new int[i24];
            if (i57 >= i55) {
                throw new C14443b("Block ID too large");
            }
            int i59 = i49 % i55;
            int i60 = i25;
            int i61 = i55 - i59;
            int i62 = i49 / i55;
            int i63 = i62 + 1;
            int i64 = i50 / i55;
            int i65 = i64 + 1;
            int i66 = i62 - i64;
            int i67 = i12;
            int i68 = i63 - i65;
            if (i66 != i68) {
                throw new C14443b("EC bytes mismatch");
            }
            if (i55 != i61 + i59) {
                throw new C14443b("RS blocks mismatch");
            }
            if (i49 != ((i65 + i68) * i59) + ((i64 + i66) * i61)) {
                throw new C14443b("Total bytes mismatch");
            }
            if (i57 < i61) {
                c9 = 0;
                iArr4[0] = i64;
                iArr5[0] = i66;
            } else {
                c9 = 0;
                iArr4[0] = i65;
                iArr5[0] = i68;
            }
            int i69 = iArr4[c9];
            byte[] bArr2 = new byte[i69];
            int i70 = i58 * 8;
            int i71 = 0;
            while (i71 < i69) {
                C16842b c16842b2 = c16842b;
                int i72 = i49;
                int i73 = i55;
                int i74 = 0;
                int i75 = 0;
                for (int i76 = 8; i75 < i76; i76 = 8) {
                    if (c14957a.m16125d(i70)) {
                        i21 = 1;
                        i74 |= 1 << (7 - i75);
                    } else {
                        i21 = 1;
                    }
                    i70 += i21;
                    i75 += i21;
                }
                bArr2[i71] = (byte) i74;
                i71++;
                i55 = i73;
                c16842b = c16842b2;
                i49 = i72;
            }
            C16842b c16842b3 = c16842b;
            int i77 = i49;
            int i78 = i55;
            int i79 = iArr5[0];
            int i80 = i69 + i79;
            int[] iArr6 = new int[i80];
            for (int i81 = 0; i81 < i69; i81++) {
                iArr6[i81] = bArr2[i81] & 255;
            }
            C16190a c16190a = C16190a.f50256g;
            ArrayList arrayList3 = new ArrayList();
            C14957a c14957a5 = c14957a;
            int i82 = i50;
            arrayList3.add(new C16191b(c16190a, new int[]{1}));
            if (i79 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int i83 = i80 - i79;
            if (i83 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            if (i79 >= arrayList3.size()) {
                C16191b c16191b4 = (C16191b) AbstractC17792x.m19532o(1, arrayList3);
                int size = arrayList3.size();
                while (size <= i79) {
                    int i84 = i58;
                    int[] iArr7 = {1, c16190a.f50257a[(size - 1) + c16190a.f50262f]};
                    if (iArr7[0] == 0) {
                        iArr2 = iArr4;
                        int i85 = 1;
                        while (i85 < 2 && iArr7[i85] == 0) {
                            i85++;
                        }
                        if (i85 == 2) {
                            iArr7 = new int[]{0};
                            c10 = 0;
                        } else {
                            int i86 = 2 - i85;
                            int[] iArr8 = new int[i86];
                            c10 = 0;
                            System.arraycopy(iArr7, i85, iArr8, 0, i86);
                            iArr7 = iArr8;
                        }
                    } else {
                        iArr2 = iArr4;
                        c10 = 0;
                    }
                    c16191b4.getClass();
                    C16190a c16190a2 = c16191b4.f50263a;
                    if (!c16190a2.equals(c16190a)) {
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                    if (c16191b4.m17802c() || iArr7[c10] == 0) {
                        i20 = 1;
                        c16191b4 = c16190a2.f50259c;
                    } else {
                        int[] iArr9 = c16191b4.f50264b;
                        int length3 = iArr9.length;
                        int length4 = iArr7.length;
                        int[] iArr10 = new int[(length3 + length4) - 1];
                        int i87 = 0;
                        while (i87 < length3) {
                            int i88 = length3;
                            int i89 = iArr9[i87];
                            int[] iArr11 = iArr9;
                            int i90 = 0;
                            while (i90 < length4) {
                                int i91 = i87 + i90;
                                iArr10[i91] = iArr10[i91] ^ c16190a2.m17799a(i89, iArr7[i90]);
                                i90++;
                                length4 = length4;
                            }
                            i87++;
                            length3 = i88;
                            iArr9 = iArr11;
                            length4 = length4;
                        }
                        i20 = 1;
                        c16191b4 = new C16191b(c16190a2, iArr10);
                    }
                    arrayList3.add(c16191b4);
                    size += i20;
                    iArr4 = iArr2;
                    i58 = i84;
                    arrayList2 = arrayList2;
                    iMax = iMax;
                    iMax2 = iMax2;
                }
                iArr = iArr4;
                arrayList = arrayList2;
            } else {
                iArr = iArr4;
                arrayList = arrayList2;
            }
            int i92 = i58;
            int i93 = iMax;
            int i94 = iMax2;
            C16191b c16191b5 = (C16191b) arrayList3.get(i79);
            int[] iArr12 = new int[i83];
            System.arraycopy(iArr6, 0, iArr12, 0, i83);
            if (i83 == 0) {
                throw new IllegalArgumentException();
            }
            if (i83 > 1 && iArr12[0] == 0) {
                int i95 = 1;
                while (i95 < i83 && iArr12[i95] == 0) {
                    i95++;
                }
                if (i95 == i83) {
                    iArr12 = new int[]{0};
                } else {
                    int i96 = i83 - i95;
                    int[] iArr13 = new int[i96];
                    System.arraycopy(iArr12, i95, iArr13, 0, i96);
                    iArr12 = iArr13;
                }
            }
            if (i79 < 0) {
                throw new IllegalArgumentException();
            }
            int length5 = iArr12.length;
            int[] iArr14 = new int[length5 + i79];
            for (int i97 = 0; i97 < length5; i97++) {
                iArr14[i97] = c16190a.m17799a(iArr12[i97], 1);
            }
            C16191b c16191b6 = new C16191b(c16190a, iArr14);
            if (!c16190a.equals(c16191b5.f50263a)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (c16191b5.m17802c()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            int iM17801b = c16191b5.m17801b();
            int[] iArr15 = c16191b5.f50264b;
            int i98 = iArr15[(iArr15.length - 1) - iM17801b];
            if (i98 == 0) {
                throw new ArithmeticException();
            }
            int i99 = c16190a.f50257a[(c16190a.f50260d - c16190a.f50258b[i98]) - 1];
            C16191b c16191b7 = c16190a.f50259c;
            C16191b c16191bM17800a = c16191b7;
            while (c16191b6.m17801b() >= c16191b5.m17801b() && !c16191b6.m17802c()) {
                int iM17801b2 = c16191b6.m17801b() - c16191b5.m17801b();
                int iM17801b3 = c16191b6.m17801b();
                int[] iArr16 = c16191b6.f50264b;
                int iM17799a = c16190a.m17799a(iArr16[(iArr16.length - 1) - iM17801b3], i99);
                if (iM17801b2 < 0) {
                    throw new IllegalArgumentException();
                }
                C16190a c16190a3 = c16191b5.f50263a;
                if (iM17799a == 0) {
                    c16191b2 = c16190a3.f50259c;
                    c16191b = c16191b7;
                    i19 = 1;
                } else {
                    int length6 = iArr15.length;
                    int[] iArr17 = new int[length6 + iM17801b2];
                    int i100 = 0;
                    while (i100 < length6) {
                        iArr17[i100] = c16190a3.m17799a(iArr15[i100], iM17799a);
                        i100++;
                        c16191b7 = c16191b7;
                    }
                    c16191b = c16191b7;
                    i19 = 1;
                    c16191b2 = new C16191b(c16190a3, iArr17);
                }
                if (iM17801b2 < 0) {
                    throw new IllegalArgumentException();
                }
                if (iM17799a == 0) {
                    c16191b3 = c16191b;
                } else {
                    int[] iArr18 = new int[iM17801b2 + i19];
                    iArr18[0] = iM17799a;
                    c16191b3 = new C16191b(c16190a, iArr18);
                }
                c16191bM17800a = c16191bM17800a.m17800a(c16191b3);
                c16191b6 = c16191b6.m17800a(c16191b2);
                c16191b5 = c16191b5;
                i99 = i99;
                c16191b7 = c16191b;
            }
            int[] iArr19 = new C16191b[]{c16191bM17800a, c16191b6}[1].f50264b;
            int length7 = i79 - iArr19.length;
            for (int i101 = 0; i101 < length7; i101++) {
                iArr6[i83 + i101] = 0;
            }
            System.arraycopy(iArr19, 0, iArr6, i83 + length7, iArr19.length);
            byte[] bArr3 = new byte[i79];
            for (int i102 = 0; i102 < i79; i102++) {
                bArr3[i102] = (byte) iArr6[i69 + i102];
            }
            C17222a c17222a = new C17222a(bArr2, bArr3);
            ArrayList arrayList4 = arrayList;
            arrayList4.add(c17222a);
            iMax2 = Math.max(i94, i69);
            iMax = Math.max(i93, i79);
            i58 = i92 + iArr[0];
            i57++;
            arrayList2 = arrayList4;
            i24 = 1;
            i55 = i78;
            i25 = i60;
            i12 = i67;
            c16842b = c16842b3;
            i49 = i77;
            c14957a = c14957a5;
            i50 = i82;
        }
        C16842b c16842b4 = c16842b;
        ArrayList arrayList5 = arrayList2;
        int i103 = i49;
        int i104 = iMax;
        int i105 = i12;
        int i106 = i25;
        int i107 = iMax2;
        if (i50 != i58) {
            throw new C14443b("Data bytes does not match offset");
        }
        C14957a c14957a6 = new C14957a();
        for (int i108 = 0; i108 < i107; i108++) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((C17222a) it.next()).f54960a;
                if (i108 < bArr4.length) {
                    c14957a6.m16123b(bArr4[i108], 8);
                }
            }
        }
        for (int i109 = 0; i109 < i104; i109++) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((C17222a) it2.next()).f54961b;
                if (i109 < bArr5.length) {
                    c14957a6.m16123b(bArr5[i109], 8);
                }
            }
        }
        if (i103 != c14957a6.m16126e()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i103, "Interleaving error: ", " and ");
            sbM11057o.append(c14957a6.m16126e());
            sbM11057o.append(" differ.");
            throw new C14443b(sbM11057o.toString());
        }
        int i110 = (c16842b4.f54021a * 4) + 17;
        C11500p c11500p = new C11500p(i110, i110, 3);
        EnumC14442a enumC14442a7 = EnumC14442a.f45421q0;
        if (map.containsKey(enumC14442a7)) {
            i13 = Integer.parseInt(map.get(enumC14442a7).toString());
            if (!(i13 >= 0 && i13 < 8)) {
                i13 = -1;
            }
        } else {
            i13 = -1;
        }
        int i111 = c11500p.f34808Z;
        int i112 = c11500p.f34809o0;
        if (i13 == -1) {
            int i113 = -1;
            int i114 = Integer.MAX_VALUE;
            int i115 = 0;
            while (i115 < 8) {
                int i116 = i105;
                AbstractC17224c.m18958b(c14957a6, i116, c16842b4, i115, c11500p);
                int i117 = 0;
                int iM18957a = AbstractC17224c.m18957a(c11500p, false) + AbstractC17224c.m18957a(c11500p, true);
                int i118 = 0;
                int i119 = 0;
                while (true) {
                    int i120 = i112 - 1;
                    bArr = (byte[][]) c11500p.f34810p0;
                    if (i118 >= i120) {
                        break;
                    }
                    byte[] bArr6 = bArr[i118];
                    int i121 = i113;
                    while (i117 < i111 - 1) {
                        byte b = bArr6[i117];
                        int i122 = i117 + 1;
                        C14957a c14957a7 = c14957a6;
                        if (b == bArr6[i122]) {
                            byte[] bArr7 = bArr[i118 + 1];
                            if (b == bArr7[i117] && b == bArr7[i122]) {
                                i119++;
                            }
                        }
                        i117 = i122;
                        c14957a6 = c14957a7;
                    }
                    i118++;
                    i113 = i121;
                    i117 = 0;
                }
                C14957a c14957a8 = c14957a6;
                int i123 = i113;
                int i124 = (i119 * 3) + iM18957a;
                int i125 = 0;
                for (int i126 = 0; i126 < i112; i126++) {
                    for (int i127 = 0; i127 < i111; i127 += i17) {
                        byte[] bArr8 = bArr[i126];
                        int i128 = i127 + 6;
                        if (i128 < i111 && bArr8[i127] == 1 && bArr8[i127 + 1] == 0 && bArr8[i127 + 2] == 1 && bArr8[i127 + 3] == 1 && bArr8[i127 + 4] == 1 && bArr8[i127 + 5] == 0 && bArr8[i128] == 1) {
                            int i129 = i127 - 4;
                            if (i129 < 0 || bArr8.length < i127) {
                                z11 = false;
                                break;
                            }
                            while (true) {
                                if (i129 >= i127) {
                                    z11 = true;
                                    break;
                                }
                                if (bArr8[i129] == 1) {
                                    z11 = false;
                                    break;
                                }
                                i129++;
                            }
                            if (z11) {
                                i18 = 1;
                            } else {
                                int i130 = i127 + 7;
                                int i131 = i127 + 11;
                                if (i130 < 0 || bArr8.length < i131) {
                                    i18 = 1;
                                } else {
                                    while (true) {
                                        if (i130 >= i131) {
                                            i18 = 1;
                                            z12 = true;
                                            break;
                                        }
                                        byte b10 = bArr8[i130];
                                        byte[] bArr9 = bArr8;
                                        i18 = 1;
                                        if (b10 != 1) {
                                            i130++;
                                            bArr8 = bArr9;
                                        }
                                    }
                                    if (z12) {
                                    }
                                }
                                z12 = false;
                                if (z12) {
                                }
                            }
                            i125 += i18;
                        }
                        int i132 = i126 + 6;
                        if (i132 < i112) {
                            i17 = 1;
                            if (bArr[i126][i127] != 1 || bArr[i126 + 1][i127] != 0 || bArr[i126 + 2][i127] != 1 || bArr[i126 + 3][i127] != 1) {
                                i17 = 1;
                            } else if (bArr[i126 + 4][i127] == 1 && bArr[i126 + 5][i127] == 0 && bArr[i132][i127] == 1) {
                                int i133 = i126 - 4;
                                if (i133 < 0 || bArr.length < i126) {
                                    z6 = false;
                                    break;
                                }
                                while (true) {
                                    if (i133 >= i126) {
                                        z6 = true;
                                        break;
                                    }
                                    if (bArr[i133][i127] == 1) {
                                        z6 = false;
                                        break;
                                    }
                                    i133++;
                                }
                                if (z6) {
                                    i17 = 1;
                                } else {
                                    int i134 = i126 + 7;
                                    int i135 = i126 + 11;
                                    if (i134 < 0 || bArr.length < i135) {
                                        i17 = 1;
                                    } else {
                                        while (true) {
                                            if (i134 >= i135) {
                                                i17 = 1;
                                                z10 = true;
                                                break;
                                            }
                                            i17 = 1;
                                            if (bArr[i134][i127] != 1) {
                                                i134++;
                                            }
                                        }
                                        if (z10) {
                                        }
                                    }
                                    z10 = false;
                                    if (z10) {
                                    }
                                }
                                i125 += i17;
                            }
                        } else {
                            i17 = 1;
                        }
                    }
                }
                int i136 = (i125 * 40) + i124;
                int i137 = 0;
                for (int i138 = 0; i138 < i112; i138++) {
                    byte[] bArr10 = bArr[i138];
                    for (int i139 = 0; i139 < i111; i139++) {
                        if (bArr10[i139] == 1) {
                            i137++;
                        }
                    }
                }
                int i140 = i112 * i111;
                int iAbs = (((Math.abs((i137 * 2) - i140) * 10) / i140) * 10) + i136;
                if (iAbs < i114) {
                    i114 = iAbs;
                    i113 = i115;
                } else {
                    i113 = i123;
                }
                i115++;
                i105 = i116;
                c14957a6 = c14957a8;
            }
            i14 = i105;
            i13 = i113;
        } else {
            i14 = i105;
        }
        AbstractC17224c.m18958b(c14957a6, i14, c16842b4, i13, c11500p);
        int i141 = i106 * 2;
        int i142 = i111 + i141;
        int i143 = i141 + i112;
        int iMax3 = Math.max(i10, i142);
        int iMax4 = Math.max(i11, i143);
        int iMin = Math.min(iMax3 / i142, iMax4 / i143);
        int i144 = (iMax3 - (i111 * iMin)) / 2;
        int i145 = (iMax4 - (i112 * iMin)) / 2;
        C14958b c14958b = new C14958b();
        if (iMax3 < 1 || iMax4 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        c14958b.f46587Y = iMax3;
        c14958b.f46588Z = iMax4;
        int i146 = (iMax3 + 31) / 32;
        c14958b.f46589o0 = i146;
        c14958b.f46590p0 = new int[i146 * iMax4];
        int i147 = 0;
        while (i147 < i112) {
            int i148 = i144;
            int i149 = 0;
            while (i149 < i111) {
                if (c11500p.m12897f(i149, i147) != 1) {
                    i15 = i111;
                    i16 = 1;
                } else {
                    if (i145 < 0 || i148 < 0) {
                        throw new IllegalArgumentException("Left and top must be nonnegative");
                    }
                    if (iMin < 1 || iMin < 1) {
                        throw new IllegalArgumentException("Height and width must be at least 1");
                    }
                    int i150 = i148 + iMin;
                    int i151 = i145 + iMin;
                    if (i151 > c14958b.f46588Z || i150 > c14958b.f46587Y) {
                        throw new IllegalArgumentException("The region must fit inside the matrix");
                    }
                    for (int i152 = i145; i152 < i151; i152++) {
                        int i153 = c14958b.f46589o0 * i152;
                        int i154 = i148;
                        while (i154 < i150) {
                            int i155 = (i154 / 32) + i153;
                            int i156 = i111;
                            int[] iArr20 = c14958b.f46590p0;
                            iArr20[i155] = iArr20[i155] | (1 << (i154 & 31));
                            i154++;
                            i111 = i156;
                        }
                    }
                    i15 = i111;
                    i16 = 1;
                }
                i149 += i16;
                i148 += iMin;
                i111 = i15;
            }
            i147++;
            i145 += iMin;
            i111 = i111;
        }
        return c14958b;
    }
}

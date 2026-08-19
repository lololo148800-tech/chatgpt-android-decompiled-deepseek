package p253K;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p051Bo.C1458d;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: K.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4498i {

    /* JADX INFO: renamed from: c */
    public static final Pattern f14670c = Pattern.compile(QzvfuIgrngtl.GIsmb);

    /* JADX INFO: renamed from: d */
    public static final Pattern f14671d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f14672e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: f */
    public static final ArrayList f14673f;

    /* JADX INFO: renamed from: a */
    public final ArrayList f14674a;

    /* JADX INFO: renamed from: b */
    public final ByteOrder f14675b;

    public C4498i(ByteOrder byteOrder) {
        C4496g c4496g = new C4496g(1);
        c4496g.f14668b = 0;
        this.f14674a = Collections.list(c4496g);
        this.f14675b = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    public static Pair m5233a(String str) {
        if (str.contains(Separators.COMMA)) {
            String[] strArrSplit = str.split(Separators.COMMA, -1);
            Pair pairM5233a = m5233a(strArrSplit[0]);
            if (((Integer) pairM5233a.first).intValue() == 2) {
                return pairM5233a;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairM5233a2 = m5233a(strArrSplit[i10]);
                int iIntValue = (((Integer) pairM5233a2.first).equals(pairM5233a.first) || ((Integer) pairM5233a2.second).equals(pairM5233a.first)) ? ((Integer) pairM5233a.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM5233a.second).intValue() == -1 || !(((Integer) pairM5233a2.first).equals(pairM5233a.second) || ((Integer) pairM5233a2.second).equals(pairM5233a.second))) ? -1 : ((Integer) pairM5233a.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM5233a = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM5233a = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM5233a;
        }
        if (!str.contains(Separators.SLASH)) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > 65535) {
                        return j10 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(Separators.SLASH, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX INFO: renamed from: b */
    public final void m5234b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        m5235c(str, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fa A[LOOP:9: B:99:0x02f7->B:101:0x02fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x0314  */
    /* JADX WARN: Code duplicated, block: B:106:0x0320 A[LOOP:10: B:104:0x031d->B:106:0x0320, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0343 A[LOOP:11: B:108:0x0341->B:109:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x035d  */
    /* JADX WARN: Code duplicated, block: B:112:0x037f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0390  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b A[LOOP:1: B:65:0x0188->B:67:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae A[LOOP:2: B:69:0x01ac->B:70:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9 A[LOOP:3: B:73:0x01d6->B:75:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x021d A[LOOP:4: B:77:0x021b->B:78:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x024c A[LOOP:5: B:83:0x0249->B:85:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0270 A[LOOP:6: B:87:0x026e->B:88:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0285  */
    /* JADX WARN: Code duplicated, block: B:93:0x0291 A[LOOP:7: B:91:0x028e->B:93:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x02cf A[LOOP:8: B:95:0x02cd->B:96:0x02cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x02ee  */
    /* JADX INFO: renamed from: c */
    public final void m5235c(String str, String str2, List list) {
        char c9;
        int i10;
        String str3;
        ByteOrder byteOrder;
        C4495f c4495f;
        String[] strArrSplit;
        int length;
        int[] iArr;
        int i11;
        ByteBuffer byteBufferWrap;
        int i12;
        String[] strArrSplit2;
        long[] jArr;
        int i13;
        int i14;
        String[] strArrSplit3;
        int length2;
        C1458d[] c1458dArr;
        int i15;
        ByteBuffer byteBufferWrap2;
        int i16;
        String[] strArrSplit4;
        int length3;
        int[] iArr2;
        int i17;
        ByteBuffer byteBufferWrap3;
        int i18;
        String[] strArrSplit5;
        int length4;
        C1458d[] c1458dArr2;
        int i19;
        int i20;
        ByteBuffer byteBufferWrap4;
        int i21;
        String[] strArrSplit6;
        int length5;
        double[] dArr;
        int i22;
        ByteBuffer byteBufferWrap5;
        int i23;
        String str4 = str;
        String strReplaceAll = str2;
        int i24 = 0;
        int i25 = 1;
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
            boolean zFind = f14671d.matcher(strReplaceAll).find();
            boolean zFind2 = f14672e.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                AbstractC8072d6.m8492i("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str4)) {
            str4 = "PhotographicSensitivity";
        }
        String str5 = str4;
        char c10 = 3;
        int i26 = 2;
        if (strReplaceAll != null && C4499j.f14678e.contains(str5)) {
            if (str5.equals("GPSTimeStamp")) {
                Matcher matcher = f14670c.matcher(strReplaceAll);
                if (!matcher.find()) {
                    AbstractC8072d6.m8492i("ExifData", "Invalid value for " + str5 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb2.append(Integer.parseInt(strGroup));
                sb2.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb2.append(Integer.parseInt(strGroup2));
                sb2.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb2.append(Integer.parseInt(strGroup3));
                sb2.append("/1");
                strReplaceAll = sb2.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e10) {
                    AbstractC8072d6.m8493j("ExifData", AbstractC10763a.m11055m("Invalid value for ", str5, " : ", strReplaceAll), e10);
                    return;
                }
            }
        }
        int i27 = 0;
        while (true) {
            C4501l[] c4501lArr = C4499j.f14676c;
            if (i27 >= 4) {
                return;
            }
            C4501l c4501l = (C4501l) ((HashMap) f14673f.get(i27)).get(str5);
            if (c4501l == null) {
                c9 = c10;
                i10 = i26;
            } else {
                if (strReplaceAll != null) {
                    Pair pairM5233a = m5233a(strReplaceAll);
                    int iIntValue = ((Integer) pairM5233a.first).intValue();
                    int i28 = -1;
                    int i29 = c4501l.f14690c;
                    if (i29 != iIntValue && i29 != ((Integer) pairM5233a.second).intValue()) {
                        int i30 = c4501l.f14691d;
                        if (i30 != -1 && (i30 == ((Integer) pairM5233a.first).intValue() || i30 == ((Integer) pairM5233a.second).intValue())) {
                            i29 = i30;
                        } else if (i29 == i25 || i29 == 7 || i29 == i26) {
                        }
                        str3 = Separators.SLASH;
                        byteOrder = this.f14675b;
                        switch (i29) {
                            case 1:
                                c9 = c10;
                                i10 = i26;
                                Map map = (Map) list.get(i27);
                                Charset charset = C4495f.f14661d;
                                i25 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i24 = 0;
                                    if (strReplaceAll.charAt(0) < '0') {
                                    }
                                    map.put(str5, c4495f);
                                } else {
                                    i24 = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(C4495f.f14661d);
                                c4495f = new C4495f(bytes, 1, bytes.length);
                                map.put(str5, c4495f);
                                break;
                            case 2:
                            case 7:
                                c9 = c10;
                                Map map2 = (Map) list.get(i27);
                                Charset charset2 = C4495f.f14661d;
                                byte[] bytes2 = strReplaceAll.concat("\u0000").getBytes(C4495f.f14661d);
                                i10 = 2;
                                map2.put(str5, new C4495f(bytes2, 2, bytes2.length));
                                i24 = 0;
                                i25 = 1;
                                break;
                            case 3:
                                strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                for (i11 = 0; i11 < strArrSplit.length; i11++) {
                                    iArr[i11] = Integer.parseInt(strArrSplit[i11]);
                                }
                                Map map3 = (Map) list.get(i27);
                                byteBufferWrap = ByteBuffer.wrap(new byte[C4495f.f14663f[3] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i12 = 0; i12 < length; i12++) {
                                    byteBufferWrap.putShort((short) iArr[i12]);
                                }
                                c9 = 3;
                                map3.put(str5, new C4495f(byteBufferWrap.array(), 3, length));
                                i24 = 0;
                                i25 = 1;
                                i10 = 2;
                                break;
                            case 4:
                                strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                jArr = new long[strArrSplit2.length];
                                for (i13 = 0; i13 < strArrSplit2.length; i13++) {
                                    jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                                }
                                ((Map) list.get(i27)).put(str5, C4495f.m5232b(jArr, byteOrder));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 5:
                                i14 = -1;
                                strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                length2 = strArrSplit3.length;
                                c1458dArr = new C1458d[length2];
                                i15 = 0;
                                while (i15 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i15].split(str3, i14);
                                    c1458dArr[i15] = new C1458d((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i15++;
                                    i14 = -1;
                                    str3 = str3;
                                }
                                Map map4 = (Map) list.get(i27);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[C4495f.f14663f[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                for (i16 = 0; i16 < length2; i16++) {
                                    C1458d c1458d = c1458dArr[i16];
                                    byteBufferWrap2.putInt((int) c1458d.f3833b);
                                    byteBufferWrap2.putInt((int) c1458d.f3834c);
                                }
                                map4.put(str5, new C4495f(byteBufferWrap2.array(), 5, length2));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 9:
                                strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                for (i17 = 0; i17 < strArrSplit4.length; i17++) {
                                    iArr2[i17] = Integer.parseInt(strArrSplit4[i17]);
                                }
                                Map map5 = (Map) list.get(i27);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[C4495f.f14663f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                for (i18 = 0; i18 < length3; i18++) {
                                    byteBufferWrap3.putInt(iArr2[i18]);
                                }
                                map5.put(str5, new C4495f(byteBufferWrap3.array(), 9, length3));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                length4 = strArrSplit5.length;
                                c1458dArr2 = new C1458d[length4];
                                i19 = i24;
                                while (i19 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i19].split(Separators.SLASH, i28);
                                    c1458dArr2[i19] = new C1458d((long) Double.parseDouble(strArrSplit8[i24]), (long) Double.parseDouble(strArrSplit8[i25]));
                                    i19++;
                                    i25 = 1;
                                    length4 = length4;
                                    i24 = 0;
                                    i28 = -1;
                                }
                                i20 = length4;
                                Map map6 = (Map) list.get(i27);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[C4495f.f14663f[10] * i20]);
                                byteBufferWrap4.order(byteOrder);
                                for (i21 = 0; i21 < i20; i21++) {
                                    C1458d c1458d2 = c1458dArr2[i21];
                                    byteBufferWrap4.putInt((int) c1458d2.f3833b);
                                    byteBufferWrap4.putInt((int) c1458d2.f3834c);
                                }
                                map6.put(str5, new C4495f(byteBufferWrap4.array(), 10, i20));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                for (i22 = i24; i22 < strArrSplit6.length; i22 += i25) {
                                    dArr[i22] = Double.parseDouble(strArrSplit6[i22]);
                                }
                                Map map7 = (Map) list.get(i27);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[C4495f.f14663f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i23 = i24;
                                while (i23 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i23]);
                                    i23 += i25;
                                    strReplaceAll = strReplaceAll;
                                }
                                map7.put(str5, new C4495f(byteBufferWrap5.array(), 12, length5));
                                strReplaceAll = strReplaceAll;
                                i10 = i26;
                                c9 = 3;
                                break;
                        }
                    } else {
                        str3 = Separators.SLASH;
                        byteOrder = this.f14675b;
                        switch (i29) {
                            case 1:
                                c9 = c10;
                                i10 = i26;
                                Map map8 = (Map) list.get(i27);
                                Charset charset3 = C4495f.f14661d;
                                i25 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i24 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        c4495f = new C4495f(new byte[]{(byte) (strReplaceAll.charAt(0) - '0')}, 1, 1);
                                    }
                                    map8.put(str5, c4495f);
                                } else {
                                    i24 = 0;
                                }
                                byte[] bytes3 = strReplaceAll.getBytes(C4495f.f14661d);
                                c4495f = new C4495f(bytes3, 1, bytes3.length);
                                map8.put(str5, c4495f);
                                break;
                            case 2:
                            case 7:
                                c9 = c10;
                                Map map9 = (Map) list.get(i27);
                                Charset charset4 = C4495f.f14661d;
                                byte[] bytes4 = strReplaceAll.concat("\u0000").getBytes(C4495f.f14661d);
                                i10 = 2;
                                map9.put(str5, new C4495f(bytes4, 2, bytes4.length));
                                i24 = 0;
                                i25 = 1;
                                break;
                            case 3:
                                strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                while (i11 < strArrSplit.length) {
                                    iArr[i11] = Integer.parseInt(strArrSplit[i11]);
                                }
                                Map map10 = (Map) list.get(i27);
                                byteBufferWrap = ByteBuffer.wrap(new byte[C4495f.f14663f[3] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i12 < length) {
                                    byteBufferWrap.putShort((short) iArr[i12]);
                                }
                                c9 = 3;
                                map10.put(str5, new C4495f(byteBufferWrap.array(), 3, length));
                                i24 = 0;
                                i25 = 1;
                                i10 = 2;
                                break;
                            case 4:
                                strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                jArr = new long[strArrSplit2.length];
                                while (i13 < strArrSplit2.length) {
                                    jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                                }
                                ((Map) list.get(i27)).put(str5, C4495f.m5232b(jArr, byteOrder));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 5:
                                i14 = -1;
                                strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                length2 = strArrSplit3.length;
                                c1458dArr = new C1458d[length2];
                                i15 = 0;
                                while (i15 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i15].split(str3, i14);
                                    c1458dArr[i15] = new C1458d((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i15++;
                                    i14 = -1;
                                    str3 = str3;
                                }
                                Map map11 = (Map) list.get(i27);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[C4495f.f14663f[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                while (i16 < length2) {
                                    C1458d c1458d3 = c1458dArr[i16];
                                    byteBufferWrap2.putInt((int) c1458d3.f3833b);
                                    byteBufferWrap2.putInt((int) c1458d3.f3834c);
                                }
                                map11.put(str5, new C4495f(byteBufferWrap2.array(), 5, length2));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 9:
                                strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                while (i17 < strArrSplit4.length) {
                                    iArr2[i17] = Integer.parseInt(strArrSplit4[i17]);
                                }
                                Map map12 = (Map) list.get(i27);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[C4495f.f14663f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                while (i18 < length3) {
                                    byteBufferWrap3.putInt(iArr2[i18]);
                                }
                                map12.put(str5, new C4495f(byteBufferWrap3.array(), 9, length3));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                length4 = strArrSplit5.length;
                                c1458dArr2 = new C1458d[length4];
                                i19 = i24;
                                while (i19 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i19].split(Separators.SLASH, i28);
                                    c1458dArr2[i19] = new C1458d((long) Double.parseDouble(strArrSplit10[i24]), (long) Double.parseDouble(strArrSplit10[i25]));
                                    i19++;
                                    i25 = 1;
                                    length4 = length4;
                                    i24 = 0;
                                    i28 = -1;
                                }
                                i20 = length4;
                                Map map13 = (Map) list.get(i27);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[C4495f.f14663f[10] * i20]);
                                byteBufferWrap4.order(byteOrder);
                                while (i21 < i20) {
                                    C1458d c1458d4 = c1458dArr2[i21];
                                    byteBufferWrap4.putInt((int) c1458d4.f3833b);
                                    byteBufferWrap4.putInt((int) c1458d4.f3834c);
                                }
                                map13.put(str5, new C4495f(byteBufferWrap4.array(), 10, i20));
                                i24 = 0;
                                i25 = 1;
                                c9 = 3;
                                i10 = 2;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                while (i22 < strArrSplit6.length) {
                                    dArr[i22] = Double.parseDouble(strArrSplit6[i22]);
                                }
                                Map map14 = (Map) list.get(i27);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[C4495f.f14663f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i23 = i24;
                                while (i23 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i23]);
                                    i23 += i25;
                                    strReplaceAll = strReplaceAll;
                                }
                                map14.put(str5, new C4495f(byteBufferWrap5.array(), 12, length5));
                                strReplaceAll = strReplaceAll;
                                i10 = i26;
                                c9 = 3;
                                break;
                        }
                    }
                } else {
                    ((Map) list.get(i27)).remove(str5);
                }
                c9 = c10;
                i10 = i26;
            }
            i27 += i25;
            c10 = c9;
            i26 = i10;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5236d(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 1;
        } else if (i10 == 90) {
            i11 = 6;
        } else if (i10 == 180) {
            i11 = 3;
        } else if (i10 != 270) {
            AbstractC8072d6.m8492i("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
            i11 = 0;
        } else {
            i11 = 8;
        }
        m5235c("Orientation", String.valueOf(i11), this.f14674a);
    }

    static {
        C4496g c4496g = new C4496g(0);
        c4496g.f14668b = 0;
        f14673f = Collections.list(c4496g);
    }
}

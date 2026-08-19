package p032B4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.util.Log;
import io.sentry.instrumentation.file.C15379d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p451Sb.C7102a;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: B4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0809d {

    /* JADX INFO: renamed from: a */
    public static final C7102a f2252a = new C7102a(2);

    /* JADX INFO: renamed from: b */
    public static final byte[] f2253b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f2254c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f2255d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f2256e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f2257f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f2258g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f2259h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f2260i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f2261j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m1848a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1849b(C0807b[] c0807bArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (C0807b c0807b : c0807bArr) {
            length += ((((c0807b.f2249g * 2) + 7) & (-8)) / 8) + (c0807b.f2247e * 2) + m1851d(c0807b.f2243a, c0807b.f2244b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0807b.f2248f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f2257f)) {
            int length2 = c0807bArr.length;
            while (i10 < length2) {
                C0807b c0807b2 = c0807bArr[i10];
                m1864q(byteArrayOutputStream, c0807b2, m1851d(c0807b2.f2243a, c0807b2.f2244b, bArr));
                m1863p(byteArrayOutputStream, c0807b2);
                i10++;
            }
        } else {
            for (C0807b c0807b3 : c0807bArr) {
                m1864q(byteArrayOutputStream, c0807b3, m1851d(c0807b3.f2243a, c0807b3.f2244b, bArr));
            }
            int length3 = c0807bArr.length;
            while (i10 < length3) {
                m1863p(byteArrayOutputStream, c0807bArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1850c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : fileArrListFiles) {
            z6 = m1850c(file2) && z6;
        }
        return z6;
    }

    /* JADX INFO: renamed from: d */
    public static String m1851d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f2259h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2258g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AbstractC9306j0.m9891j((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2, AbstractC9306j0.m9893l(str));
    }

    /* JADX INFO: renamed from: e */
    public static void m1852e(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(AbstractC8752z3.m9509d(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m1853f(int i10, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(AbstractC10763a.m11048f(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m1854g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM1860m = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM1860m += (int) m1860m(2, byteArrayInputStream);
            iArr[i11] = iM1860m;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m1855h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0807b[] m1856i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0807b[] c0807bArr) throws IOException {
        byte[] bArr3 = f2260i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2261j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1860m = (int) m1860m(2, fileInputStream);
            byte[] bArrM1855h = m1855h(fileInputStream, (int) m1860m(4, fileInputStream), (int) m1860m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1855h);
            try {
                C0807b[] c0807bArrM1858k = m1858k(byteArrayInputStream, bArr2, iM1860m, c0807bArr);
                byteArrayInputStream.close();
                return c0807bArrM1858k;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f2255d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1860m2 = (int) m1860m(1, fileInputStream);
        byte[] bArrM1855h2 = m1855h(fileInputStream, (int) m1860m(4, fileInputStream), (int) m1860m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1855h2);
        try {
            C0807b[] c0807bArrM1857j = m1857j(byteArrayInputStream2, iM1860m2, c0807bArr);
            byteArrayInputStream2.close();
            return c0807bArrM1857j;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C0807b[] m1857j(ByteArrayInputStream byteArrayInputStream, int i10, C0807b[] c0807bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0807b[0];
        }
        if (i10 != c0807bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM1860m = (int) m1860m(2, byteArrayInputStream);
            iArr[i11] = (int) m1860m(2, byteArrayInputStream);
            strArr[i11] = new String(m1853f(iM1860m, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C0807b c0807b = c0807bArr[i12];
            if (!c0807b.f2244b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c0807b.f2247e = i13;
            c0807b.f2250h = m1854g(byteArrayInputStream, i13);
        }
        return c0807bArr;
    }

    /* JADX INFO: renamed from: k */
    public static C0807b[] m1858k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, C0807b[] c0807bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0807b[0];
        }
        if (i10 != c0807bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m1860m(2, byteArrayInputStream);
            String str = new String(m1853f((int) m1860m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM1860m = m1860m(4, byteArrayInputStream);
            int iM1860m = (int) m1860m(2, byteArrayInputStream);
            C0807b c0807b = null;
            if (c0807bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < c0807bArr.length; i12++) {
                    if (c0807bArr[i12].f2244b.equals(strSubstring)) {
                        c0807b = c0807bArr[i12];
                        break;
                    }
                }
            }
            if (c0807b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0807b.f2246d = jM1860m;
            int[] iArrM1854g = m1854g(byteArrayInputStream, iM1860m);
            if (Arrays.equals(bArr, f2259h)) {
                c0807b.f2247e = iM1860m;
                c0807b.f2250h = iArrM1854g;
            }
        }
        return c0807bArr;
    }

    /* JADX INFO: renamed from: l */
    public static C0807b[] m1859l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f2256e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1860m = (int) m1860m(1, fileInputStream);
        byte[] bArrM1855h = m1855h(fileInputStream, (int) m1860m(4, fileInputStream), (int) m1860m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1855h);
        try {
            C0807b[] c0807bArrM1861n = m1861n(byteArrayInputStream, str, iM1860m);
            byteArrayInputStream.close();
            return c0807bArrM1861n;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m1860m(int i10, InputStream inputStream) throws IOException {
        byte[] bArrM1853f = m1853f(i10, inputStream);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrM1853f[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    /* JADX INFO: renamed from: n */
    public static C0807b[] m1861n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0807b[0];
        }
        C0807b[] c0807bArr = new C0807b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM1860m = (int) m1860m(2, byteArrayInputStream);
            int iM1860m2 = (int) m1860m(2, byteArrayInputStream);
            c0807bArr[i11] = new C0807b(str, new String(m1853f(iM1860m, byteArrayInputStream), StandardCharsets.UTF_8), m1860m(4, byteArrayInputStream), iM1860m2, (int) m1860m(4, byteArrayInputStream), (int) m1860m(4, byteArrayInputStream), new int[iM1860m2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C0807b c0807b = c0807bArr[i12];
            int iAvailable = byteArrayInputStream.available() - c0807b.f2248f;
            int iM1860m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0807b.f2251i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM1860m3 += (int) m1860m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM1860m3), 1);
                for (int iM1860m4 = (int) m1860m(2, byteArrayInputStream); iM1860m4 > 0; iM1860m4--) {
                    m1860m(2, byteArrayInputStream);
                    int iM1860m5 = (int) m1860m(1, byteArrayInputStream);
                    if (iM1860m5 != 6 && iM1860m5 != 7) {
                        while (iM1860m5 > 0) {
                            m1860m(1, byteArrayInputStream);
                            for (int iM1860m6 = (int) m1860m(1, byteArrayInputStream); iM1860m6 > 0; iM1860m6--) {
                                m1860m(2, byteArrayInputStream);
                            }
                            iM1860m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0807b.f2250h = m1854g(byteArrayInputStream, c0807b.f2247e);
            int i13 = c0807b.f2249g;
            BitSet bitSetValueOf = BitSet.valueOf(m1853f((((i13 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(i14) ? 2 : 0;
                if (bitSetValueOf.get(i14 + i13)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return c0807bArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1862o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0807b[] c0807bArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2255d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2256e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM1849b = m1849b(c0807bArr, bArr3);
                m1868u(byteArrayOutputStream, c0807bArr.length, 1);
                m1868u(byteArrayOutputStream, bArrM1849b.length, 4);
                byte[] bArrM1848a = m1848a(bArrM1849b);
                m1868u(byteArrayOutputStream, bArrM1848a.length, 4);
                byteArrayOutputStream.write(bArrM1848a);
                return true;
            }
            byte[] bArr4 = f2258g;
            if (Arrays.equals(bArr, bArr4)) {
                m1868u(byteArrayOutputStream, c0807bArr.length, 1);
                for (C0807b c0807b : c0807bArr) {
                    int size = c0807b.f2251i.size() * 4;
                    String strM1851d = m1851d(c0807b.f2243a, c0807b.f2244b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m1869v(byteArrayOutputStream, strM1851d.getBytes(charset).length);
                    m1869v(byteArrayOutputStream, c0807b.f2250h.length);
                    m1868u(byteArrayOutputStream, size, 4);
                    m1868u(byteArrayOutputStream, c0807b.f2245c, 4);
                    byteArrayOutputStream.write(strM1851d.getBytes(charset));
                    Iterator it = c0807b.f2251i.keySet().iterator();
                    while (it.hasNext()) {
                        m1869v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m1869v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : c0807b.f2250h) {
                        m1869v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2257f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM1849b2 = m1849b(c0807bArr, bArr5);
                m1868u(byteArrayOutputStream, c0807bArr.length, 1);
                m1868u(byteArrayOutputStream, bArrM1849b2.length, 4);
                byte[] bArrM1848a2 = m1848a(bArrM1849b2);
                m1868u(byteArrayOutputStream, bArrM1848a2.length, 4);
                byteArrayOutputStream.write(bArrM1848a2);
                return true;
            }
            byte[] bArr6 = f2259h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m1869v(byteArrayOutputStream, c0807bArr.length);
            for (C0807b c0807b2 : c0807bArr) {
                String strM1851d2 = m1851d(c0807b2.f2243a, c0807b2.f2244b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m1869v(byteArrayOutputStream, strM1851d2.getBytes(charset2).length);
                TreeMap treeMap = c0807b2.f2251i;
                m1869v(byteArrayOutputStream, treeMap.size());
                m1869v(byteArrayOutputStream, c0807b2.f2250h.length);
                m1868u(byteArrayOutputStream, c0807b2.f2245c, 4);
                byteArrayOutputStream.write(strM1851d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m1869v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : c0807b2.f2250h) {
                    m1869v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m1869v(byteArrayOutputStream2, c0807bArr.length);
            int i13 = 2;
            int i14 = 2;
            for (C0807b c0807b3 : c0807bArr) {
                m1868u(byteArrayOutputStream2, c0807b3.f2245c, 4);
                m1868u(byteArrayOutputStream2, c0807b3.f2246d, 4);
                m1868u(byteArrayOutputStream2, c0807b3.f2249g, 4);
                String strM1851d3 = m1851d(c0807b3.f2243a, c0807b3.f2244b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM1851d3.getBytes(charset3).length;
                m1869v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strM1851d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            C0815j c0815j = new C0815j(byteArray, false, 1);
            byteArrayOutputStream2.close();
            arrayList2.add(c0815j);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < c0807bArr.length) {
                try {
                    C0807b c0807b4 = c0807bArr[i15];
                    m1869v(byteArrayOutputStream3, i15);
                    m1869v(byteArrayOutputStream3, c0807b4.f2247e);
                    i16 = i16 + 4 + (c0807b4.f2247e * 2);
                    int[] iArr = c0807b4.f2250h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    while (i10 < length3) {
                        int i18 = iArr[i10];
                        m1869v(byteArrayOutputStream3, i18 - i17);
                        i10++;
                        i17 = i18;
                    }
                    i15++;
                    i10 = 0;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            C0815j c0815j2 = new C0815j(byteArray2, true, 3);
            byteArrayOutputStream3.close();
            arrayList2.add(c0815j2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < c0807bArr.length) {
                try {
                    C0807b c0807b5 = c0807bArr[i19];
                    Iterator it3 = c0807b5.f2251i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m1865r(byteArrayOutputStream5, iIntValue, c0807b5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m1866s(byteArrayOutputStream6, c0807b5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            m1869v(byteArrayOutputStream4, i19);
                            int length4 = byteArray3.length + i13 + byteArray4.length;
                            int i21 = i20 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m1868u(byteArrayOutputStream4, length4, 4);
                            m1869v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i20 = i21 + length4;
                            i19++;
                            arrayList3 = arrayList4;
                            i13 = 2;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i20 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            C0815j c0815j3 = new C0815j(byteArray5, true, 4);
            byteArrayOutputStream4.close();
            arrayList2.add(c0815j3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + ((long) (arrayList2.size() * 16));
            m1868u(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                C0815j c0815j4 = (C0815j) arrayList2.get(i22);
                int i23 = c0815j4.f2273a;
                if (i23 == 1) {
                    j10 = 0;
                } else if (i23 == 2) {
                    j10 = 1;
                } else if (i23 == 3) {
                    j10 = 2;
                } else if (i23 == 4) {
                    j10 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                m1868u(byteArrayOutputStream, j10, 4);
                m1868u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0815j4.f2274b;
                if (c0815j4.f2275c) {
                    long length5 = bArr7.length;
                    byte[] bArrM1848a3 = m1848a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM1848a3);
                    m1868u(byteArrayOutputStream, bArrM1848a3.length, 4);
                    m1868u(byteArrayOutputStream, length5, 4);
                    length = bArrM1848a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m1868u(byteArrayOutputStream, bArr7.length, 4);
                    m1868u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m1863p(ByteArrayOutputStream byteArrayOutputStream, C0807b c0807b) throws IOException {
        m1866s(byteArrayOutputStream, c0807b);
        int[] iArr = c0807b.f2250h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            m1869v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        int i13 = c0807b.f2249g;
        byte[] bArr = new byte[(((i13 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0807b.f2251i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i13;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: q */
    public static void m1864q(ByteArrayOutputStream byteArrayOutputStream, C0807b c0807b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m1869v(byteArrayOutputStream, str.getBytes(charset).length);
        m1869v(byteArrayOutputStream, c0807b.f2247e);
        m1868u(byteArrayOutputStream, c0807b.f2248f, 4);
        m1868u(byteArrayOutputStream, c0807b.f2245c, 4);
        m1868u(byteArrayOutputStream, c0807b.f2249g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: r */
    public static void m1865r(ByteArrayOutputStream byteArrayOutputStream, int i10, C0807b c0807b) throws IOException {
        int iBitCount = Integer.bitCount(i10 & (-2));
        int i11 = c0807b.f2249g;
        byte[] bArr = new byte[(((iBitCount * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0807b.f2251i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m1866s(ByteArrayOutputStream byteArrayOutputStream, C0807b c0807b) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : c0807b.f2251i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m1869v(byteArrayOutputStream, iIntValue - i10);
                m1869v(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01db  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0205 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #33 {all -> 0x0214, blocks: (B:142:0x01f9, B:144:0x0205, B:153:0x0217), top: B:306:0x01f9, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0217 A[Catch: all -> 0x0214, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x0214, blocks: (B:142:0x01f9, B:144:0x0205, B:153:0x0217), top: B:306:0x01f9, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0235  */
    /* JADX WARN: Code duplicated, block: B:169:0x0241  */
    /* JADX WARN: Code duplicated, block: B:170:0x0245  */
    /* JADX WARN: Code duplicated, block: B:179:0x026b A[Catch: all -> 0x02aa, TryCatch #7 {all -> 0x02aa, blocks: (B:177:0x0265, B:179:0x026b, B:180:0x026f, B:182:0x0275), top: B:276:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0275 A[Catch: all -> 0x02aa, TRY_LEAVE, TryCatch #7 {all -> 0x02aa, blocks: (B:177:0x0265, B:179:0x026b, B:180:0x026f, B:182:0x0275), top: B:276:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:255:0x0308  */
    /* JADX WARN: Code duplicated, block: B:260:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x0318  */
    /* JADX WARN: Code duplicated, block: B:276:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x027a A[EDGE_INSN: B:320:0x027a->B:184:0x027a BREAK  A[LOOP:0: B:180:0x026f->B:321:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b A[Catch: all -> 0x0132, IllegalStateException -> 0x0135, IOException -> 0x0150, TRY_LEAVE, TryCatch #41 {IOException -> 0x0150, IllegalStateException -> 0x0135, blocks: (B:53:0x0111, B:55:0x011b, B:65:0x0139, B:66:0x013e), top: B:313:0x0111, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[Catch: all -> 0x0132, IllegalStateException -> 0x0135, IOException -> 0x0150, TRY_ENTER, TryCatch #41 {IOException -> 0x0150, IllegalStateException -> 0x0135, blocks: (B:53:0x0111, B:55:0x011b, B:65:0x0139, B:66:0x013e), top: B:313:0x0111, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r8v0, types: [B4.c] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: t */
    public static void m1867t(Context context, Executor executor, InterfaceC0808c interfaceC0808c, boolean z6) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStreamM1844e;
        IOException iOException;
        int i10;
        C0807b[] c0807bArrM1859l;
        C0807b[] c0807bArr;
        C0806a c0806a;
        InterfaceC0808c interfaceC0808c2;
        C0807b[] c0807bArr2;
        byte[] bArr2;
        ?? r10;
        boolean z10;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        C15379d c15379dM9509d;
        Throwable th3;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i11;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i12;
        ?? r11;
        boolean z11;
        ?? r12 = interfaceC0808c;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            ?? r15 = 1;
            if (!z6) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(AbstractC8746y3.m9492c(file, new FileInputStream(file)));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z11 = j10 == packageInfo.lastUpdateTime;
                            if (z11) {
                                r12.mo1846i(null, 2);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC0814i.m1875c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0806a c0806a2 = new C0806a(assets, executor, interfaceC0808c, name, file2);
            byte[] bArr5 = (byte[]) c0806a2.f2238d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c0806a2.f2235a = true;
                            bArr = f2253b;
                            fileInputStreamM1844e = c0806a2.m1844e(assets, "dexopt/baseline.prof");
                            if (fileInputStreamM1844e != null) {
                                if (Arrays.equals(bArr, m1853f(4, fileInputStreamM1844e))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c0807bArrM1859l = m1859l(fileInputStreamM1844e, m1853f(4, fileInputStreamM1844e), (String) c0806a2.f2241g);
                                fileInputStreamM1844e.close();
                                c0806a2.f2242h = c0807bArrM1859l;
                            }
                            c0807bArr = (C0807b[]) c0806a2.f2242h;
                            if (c0807bArr == null) {
                                c0806a = c0806a2;
                            } else {
                                c0806a = c0806a2;
                            }
                            interfaceC0808c2 = (InterfaceC0808c) c0806a.f2237c;
                            c0807bArr2 = (C0807b[]) c0806a.f2242h;
                            if (c0807bArr2 != null) {
                                if (c0806a.f2235a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (m1862o(byteArrayOutputStream, bArr4, c0807bArr2)) {
                                    c0806a.f2239e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c0806a.f2242h = null;
                                } else {
                                    interfaceC0808c2.mo1846i(null, 5);
                                    c0806a.f2242h = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr2 = (byte[]) c0806a.f2239e;
                            if (bArr2 != null) {
                                if (c0806a.f2235a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                File file3 = (File) c0806a.f2240f;
                                c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file3), file3);
                                channel = c15379dM9509d.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i11 = byteArrayInputStream.read(bArr3);
                                            if (i11 > 0) {
                                                break;
                                                break;
                                            }
                                            c15379dM9509d.write(bArr3, 0, i11);
                                        }
                                        r15 = 1;
                                        c0806a.m1845f(null, 1);
                                        fileLockTryLock.close();
                                        channel.close();
                                        c15379dM9509d.close();
                                        byteArrayInputStream.close();
                                        c0806a.f2239e = null;
                                        c0806a.f2242h = null;
                                        z10 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z10 = false;
                            r15 = 1;
                            if (z10) {
                                m1852e(packageInfo, filesDir);
                            }
                        } else {
                            c0806a2.m1845f(null, 4);
                        }
                    } catch (IOException unused2) {
                        c0806a2.m1845f(null, 4);
                    }
                } else if (file2.canWrite()) {
                    c0806a2.f2235a = true;
                    bArr = f2253b;
                    try {
                        fileInputStreamM1844e = c0806a2.m1844e(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        r12.mo1846i(e10, 6);
                        fileInputStreamM1844e = null;
                    } catch (IOException e11) {
                        r12.mo1846i(e11, 7);
                        fileInputStreamM1844e = null;
                    }
                    try {
                        if (fileInputStreamM1844e != null) {
                            try {
                                if (Arrays.equals(bArr, m1853f(4, fileInputStreamM1844e))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c0807bArrM1859l = m1859l(fileInputStreamM1844e, m1853f(4, fileInputStreamM1844e), (String) c0806a2.f2241g);
                                try {
                                    fileInputStreamM1844e.close();
                                } catch (IOException e12) {
                                    r12.mo1846i(e12, 7);
                                }
                                c0806a2.f2242h = c0807bArrM1859l;
                            } catch (IOException e13) {
                                i10 = 7;
                                r12.mo1846i(e13, 7);
                                try {
                                    fileInputStreamM1844e.close();
                                } catch (IOException e14) {
                                    iOException = e14;
                                    r12.mo1846i(iOException, i10);
                                    c0807bArrM1859l = null;
                                    c0806a2.f2242h = c0807bArrM1859l;
                                    c0807bArr = (C0807b[]) c0806a2.f2242h;
                                    if (c0807bArr == null) {
                                        c0806a = c0806a2;
                                    } else {
                                        c0806a = c0806a2;
                                    }
                                    interfaceC0808c2 = (InterfaceC0808c) c0806a.f2237c;
                                    c0807bArr2 = (C0807b[]) c0806a.f2242h;
                                    if (c0807bArr2 != null) {
                                        if (c0806a.f2235a) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr);
                                                byteArrayOutputStream.write(bArr4);
                                                if (m1862o(byteArrayOutputStream, bArr4, c0807bArr2)) {
                                                    interfaceC0808c2.mo1846i(null, 5);
                                                    c0806a.f2242h = null;
                                                    byteArrayOutputStream.close();
                                                } else {
                                                    c0806a.f2239e = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    c0806a.f2242h = null;
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e15) {
                                            interfaceC0808c2.mo1846i(e15, 7);
                                        } catch (IllegalStateException e16) {
                                            interfaceC0808c2.mo1846i(e16, 8);
                                        }
                                    }
                                    bArr2 = (byte[]) c0806a.f2239e;
                                    if (bArr2 != null) {
                                        z10 = false;
                                        r15 = 1;
                                    } else {
                                        try {
                                            if (c0806a.f2235a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        try {
                                                            File file4 = (File) c0806a.f2240f;
                                                            c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file4), file4);
                                                            try {
                                                                try {
                                                                    channel = c15379dM9509d.getChannel();
                                                                    try {
                                                                        fileLockTryLock = channel.tryLock();
                                                                        try {
                                                                            try {
                                                                                if (fileLockTryLock != null) {
                                                                                    try {
                                                                                        if (fileLockTryLock.isValid()) {
                                                                                            bArr3 = new byte[512];
                                                                                            while (true) {
                                                                                                i11 = byteArrayInputStream.read(bArr3);
                                                                                                if (i11 > 0) {
                                                                                                    break;
                                                                                                } else {
                                                                                                    c15379dM9509d.write(bArr3, 0, i11);
                                                                                                }
                                                                                            }
                                                                                            r15 = 1;
                                                                                            c0806a.m1845f(null, 1);
                                                                                            fileLockTryLock.close();
                                                                                            channel.close();
                                                                                            c15379dM9509d.close();
                                                                                            byteArrayInputStream.close();
                                                                                            c0806a.f2239e = null;
                                                                                            c0806a.f2242h = null;
                                                                                            z10 = true;
                                                                                        }
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        Throwable th9 = th;
                                                                                        if (fileLockTryLock == null) {
                                                                                            throw th9;
                                                                                        }
                                                                                        try {
                                                                                            fileLockTryLock.close();
                                                                                            throw th9;
                                                                                        } catch (Throwable th10) {
                                                                                            th9.addSuppressed(th10);
                                                                                            throw th9;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                Throwable th12 = th;
                                                                                if (channel == null) {
                                                                                    throw th12;
                                                                                }
                                                                                try {
                                                                                    channel.close();
                                                                                    throw th12;
                                                                                } catch (Throwable th13) {
                                                                                    th12.addSuppressed(th13);
                                                                                    throw th12;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th14) {
                                                                            th = th14;
                                                                        }
                                                                    } catch (Throwable th15) {
                                                                        th = th15;
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                    th3 = th;
                                                                    try {
                                                                        c15379dM9509d.close();
                                                                        throw th3;
                                                                    } catch (Throwable th17) {
                                                                        th3.addSuppressed(th17);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                th3 = th;
                                                                c15379dM9509d.close();
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th19) {
                                                            th = th19;
                                                            th2 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th20) {
                                                                th2.addSuppressed(th20);
                                                                throw th2;
                                                            }
                                                        }
                                                    } catch (Throwable th21) {
                                                        th = th21;
                                                        th2 = th;
                                                        byteArrayInputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (FileNotFoundException e17) {
                                                    e = e17;
                                                    c0806a.m1845f(e, 6);
                                                    r10 = r12;
                                                    c0806a.f2239e = null;
                                                    c0806a.f2242h = null;
                                                    z10 = false;
                                                    r15 = r10;
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    c0806a.m1845f(e, 7);
                                                    r10 = r12;
                                                    c0806a.f2239e = null;
                                                    c0806a.f2242h = null;
                                                    z10 = false;
                                                    r15 = r10;
                                                }
                                            } catch (FileNotFoundException e19) {
                                                e = e19;
                                                r12 = 1;
                                                c0806a.m1845f(e, 6);
                                                r10 = r12;
                                                c0806a.f2239e = null;
                                                c0806a.f2242h = null;
                                                z10 = false;
                                                r15 = r10;
                                            } catch (IOException e20) {
                                                e = e20;
                                                r12 = 1;
                                                c0806a.m1845f(e, 7);
                                                r10 = r12;
                                                c0806a.f2239e = null;
                                                c0806a.f2242h = null;
                                                z10 = false;
                                                r15 = r10;
                                            }
                                        } catch (Throwable th22) {
                                            c0806a.f2239e = null;
                                            c0806a.f2242h = null;
                                            throw th22;
                                        }
                                    }
                                    if (z10) {
                                        m1852e(packageInfo, filesDir);
                                    }
                                    if (z10) {
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                    }
                                    AbstractC0814i.m1875c(context, r11);
                                }
                                c0807bArrM1859l = null;
                            } catch (IllegalStateException e21) {
                                try {
                                    r12.mo1846i(e21, 8);
                                    try {
                                        fileInputStreamM1844e.close();
                                    } catch (IOException e22) {
                                        iOException = e22;
                                        i10 = 7;
                                        r12.mo1846i(iOException, i10);
                                        c0807bArrM1859l = null;
                                        c0806a2.f2242h = c0807bArrM1859l;
                                        c0807bArr = (C0807b[]) c0806a2.f2242h;
                                        if (c0807bArr == null) {
                                            c0806a = c0806a2;
                                        } else {
                                            c0806a = c0806a2;
                                        }
                                        interfaceC0808c2 = (InterfaceC0808c) c0806a.f2237c;
                                        c0807bArr2 = (C0807b[]) c0806a.f2242h;
                                        if (c0807bArr2 != null) {
                                            if (c0806a.f2235a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (m1862o(byteArrayOutputStream, bArr4, c0807bArr2)) {
                                                interfaceC0808c2.mo1846i(null, 5);
                                                c0806a.f2242h = null;
                                                byteArrayOutputStream.close();
                                            } else {
                                                c0806a.f2239e = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c0806a.f2242h = null;
                                            }
                                        }
                                        bArr2 = (byte[]) c0806a.f2239e;
                                        if (bArr2 != null) {
                                            if (c0806a.f2235a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            File file5 = (File) c0806a.f2240f;
                                            c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file5), file5);
                                            channel = c15379dM9509d.getChannel();
                                            fileLockTryLock = channel.tryLock();
                                            if (fileLockTryLock != null) {
                                                if (fileLockTryLock.isValid()) {
                                                    bArr3 = new byte[512];
                                                    while (true) {
                                                        i11 = byteArrayInputStream.read(bArr3);
                                                        if (i11 > 0) {
                                                            break;
                                                            break;
                                                        }
                                                        c15379dM9509d.write(bArr3, 0, i11);
                                                    }
                                                    r15 = 1;
                                                    c0806a.m1845f(null, 1);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    c15379dM9509d.close();
                                                    byteArrayInputStream.close();
                                                    c0806a.f2239e = null;
                                                    c0806a.f2242h = null;
                                                    z10 = true;
                                                }
                                            }
                                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                        }
                                        z10 = false;
                                        r15 = 1;
                                        if (z10) {
                                            m1852e(packageInfo, filesDir);
                                        }
                                        if (z10) {
                                            r11 = 0;
                                        } else {
                                            r11 = 0;
                                        }
                                        AbstractC0814i.m1875c(context, r11);
                                    }
                                    c0807bArrM1859l = null;
                                } catch (Throwable th23) {
                                    th = th23;
                                    Throwable th24 = th;
                                    try {
                                        fileInputStreamM1844e.close();
                                        throw th24;
                                    } catch (IOException e23) {
                                        r12.mo1846i(e23, 7);
                                        throw th24;
                                    }
                                }
                            }
                        }
                        c0807bArr = (C0807b[]) c0806a2.f2242h;
                        if (c0807bArr == null && (i12 = Build.VERSION.SDK_INT) >= 24 && (i12 >= 31 || i12 == 24 || i12 == 25)) {
                            try {
                                FileInputStream fileInputStreamM1844e2 = c0806a2.m1844e(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM1844e2 != null) {
                                    try {
                                        if (!Arrays.equals(f2254c, m1853f(4, fileInputStreamM1844e2))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c0806a2.f2242h = m1856i(fileInputStreamM1844e2, m1853f(4, fileInputStreamM1844e2), bArr5, c0807bArr);
                                        fileInputStreamM1844e2.close();
                                        c0806a = c0806a2;
                                    } catch (Throwable th25) {
                                        try {
                                            fileInputStreamM1844e2.close();
                                            throw th25;
                                        } catch (Throwable th26) {
                                            th25.addSuppressed(th26);
                                            throw th25;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM1844e2 != null) {
                                        fileInputStreamM1844e2.close();
                                    }
                                    c0806a = null;
                                }
                            } catch (FileNotFoundException e24) {
                                r12.mo1846i(e24, 9);
                            } catch (IOException e25) {
                                r12.mo1846i(e25, 7);
                            } catch (IllegalStateException e26) {
                                c0806a2.f2242h = null;
                                r12.mo1846i(e26, 8);
                            }
                            if (c0806a == null) {
                                c0806a = c0806a2;
                            }
                        } else {
                            c0806a = c0806a2;
                        }
                        interfaceC0808c2 = (InterfaceC0808c) c0806a.f2237c;
                        c0807bArr2 = (C0807b[]) c0806a.f2242h;
                        if (c0807bArr2 != null && (bArr4 = (byte[]) c0806a.f2238d) != null) {
                            if (c0806a.f2235a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr4);
                            if (m1862o(byteArrayOutputStream, bArr4, c0807bArr2)) {
                                interfaceC0808c2.mo1846i(null, 5);
                                c0806a.f2242h = null;
                                byteArrayOutputStream.close();
                            } else {
                                c0806a.f2239e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c0806a.f2242h = null;
                            }
                        }
                        bArr2 = (byte[]) c0806a.f2239e;
                        if (bArr2 != null) {
                            if (c0806a.f2235a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            File file6 = (File) c0806a.f2240f;
                            c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file6), file6);
                            channel = c15379dM9509d.getChannel();
                            fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                if (fileLockTryLock.isValid()) {
                                    bArr3 = new byte[512];
                                    while (true) {
                                        i11 = byteArrayInputStream.read(bArr3);
                                        if (i11 > 0) {
                                            break;
                                            break;
                                        }
                                        c15379dM9509d.write(bArr3, 0, i11);
                                    }
                                    r15 = 1;
                                    c0806a.m1845f(null, 1);
                                    fileLockTryLock.close();
                                    channel.close();
                                    c15379dM9509d.close();
                                    byteArrayInputStream.close();
                                    c0806a.f2239e = null;
                                    c0806a.f2242h = null;
                                    z10 = true;
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        }
                        z10 = false;
                        r15 = 1;
                        if (z10) {
                            m1852e(packageInfo, filesDir);
                        }
                    } catch (Throwable th27) {
                        th = th27;
                    }
                } else {
                    c0806a2.m1845f(null, 4);
                }
                if (z10 || !z6) {
                    r11 = 0;
                } else {
                    r11 = r15;
                }
                AbstractC0814i.m1875c(context, r11);
            }
            c0806a2.m1845f(Integer.valueOf(Build.VERSION.SDK_INT), 3);
            z10 = false;
            if (z10) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            AbstractC0814i.m1875c(context, r11);
        } catch (PackageManager.NameNotFoundException e27) {
            r12.mo1846i(e27, 7);
            AbstractC0814i.m1875c(context, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1868u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m1869v(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        m1868u(byteArrayOutputStream, i10, 2);
    }
}

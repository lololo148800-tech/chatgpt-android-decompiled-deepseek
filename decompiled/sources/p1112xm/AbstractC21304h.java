package p1112xm;

import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0740V;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1091wn.C21021b;
import p1091wn.C21022c;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7934L5;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7950N5;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: xm.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21304h extends AbstractC7950N5 {
    /* JADX INFO: renamed from: c */
    public static boolean m21640c(File file) {
        AbstractC16544l.m18094g(file, "<this>");
        EnumC21303g enumC21303g = EnumC21303g.f67713Y;
        C21021b c21021b = new C21021b(new C21022c(file));
        while (true) {
            boolean z6 = true;
            while (c21021b.hasNext()) {
                File file2 = (File) c21021b.next();
                if (file2.delete() || !file2.exists()) {
                    if (z6) {
                    }
                }
                z6 = false;
            }
            return z6;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21641d(File file, Charset charset, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(charset, "charset");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC8746y3.m9492c(file, new FileInputStream(file)), charset));
        try {
            Iterator it = ((C21020a) AbstractC21031l.m21484h(new C0740V(bufferedReader, 6))).iterator();
            while (it.hasNext()) {
                interfaceC1436k.invoke(it.next());
            }
            AbstractC7942M5.m8232a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m21642e(File file) {
        AbstractC16544l.m18094g(file, "<this>");
        String name = file.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        return AbstractC21322p.m21703k0('.', name, "");
    }

    /* JADX INFO: renamed from: f */
    public static String m21643f(File file) {
        String name = file.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        return AbstractC21322p.m21707o0(name, name);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m21644g(File file) {
        C15378c c15378cM9492c = AbstractC8746y3.m9492c(file, new FileInputStream(file));
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyOf = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = c15378cM9492c.read(bArrCopyOf, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
                AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
            } else {
                int i14 = c15378cM9492c.read();
                if (i14 != -1) {
                    C21297a c21297a = new C21297a(8193);
                    c21297a.write(i14);
                    AbstractC7934L5.m8227a(c15378cM9492c, c21297a);
                    int size = c21297a.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM21638a = c21297a.m21638a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
                    AbstractC17678l.m19305l(bArrM21638a, i10, bArrCopyOf, 0, c21297a.size());
                }
            }
            AbstractC7942M5.m8232a(c15378cM9492c, null);
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15378cM9492c, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static File m21645h(File file, String str) {
        int length;
        File file2;
        int iM21678L;
        File file3 = new File(str);
        String path = file3.getPath();
        AbstractC16544l.m18093f(path, "getPath(...)");
        char c9 = File.separatorChar;
        int iM21678L2 = AbstractC21322p.m21678L(path, c9, 0, false, 4);
        if (iM21678L2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c9 || (iM21678L = AbstractC21322p.m21678L(path, c9, 2, false, 4)) < 0) {
                length = 1;
            } else {
                int iM21678L3 = AbstractC21322p.m21678L(path, c9, iM21678L + 1, false, 4);
                length = iM21678L3 >= 0 ? iM21678L3 + 1 : path.length();
            }
        } else if (iM21678L2 <= 0 || path.charAt(iM21678L2 - 1) != ':') {
            length = (iM21678L2 == -1 && AbstractC21322p.m21671E(path, ':')) ? path.length() : 0;
        } else {
            length = iM21678L2 + 1;
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        if ((string.length() == 0) || AbstractC21322p.m21671E(string, c9)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c9 + file3);
        }
        return file2;
    }

    /* JADX INFO: renamed from: i */
    public static void m21646i(File file, String text, Charset charset) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(charset, "charset");
        C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
        try {
            m21647j(c15379dM9509d, text, charset);
            AbstractC7942M5.m8232a(c15379dM9509d, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15379dM9509d, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m21647j(C15379d c15379d, String text, Charset charset) {
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            c15379d.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC16544l.m18091d(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC16544l.m18093f(byteBufferAllocate, "allocate(...)");
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC16544l.m18093f(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            c15379d.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i10 = i12;
        }
    }
}

package io.sentry;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import p658b5.C11241l;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: io.sentry.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C15454q implements InterfaceC15121F {

    /* JADX INFO: renamed from: b */
    public static final Charset f48272b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InterfaceC15151P f48273a;

    public C15454q(InterfaceC15151P interfaceC15151P) {
        this.f48273a = interfaceC15151P;
    }

    @Override // io.sentry.InterfaceC15121F
    /* JADX INFO: renamed from: a */
    public final C11241l mo16262a(BufferedInputStream bufferedInputStream) throws IOException {
        InterfaceC15151P interfaceC15151P = this.f48273a;
        Charset charset = f48272b;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                int i12 = bufferedInputStream.read(bArr);
                if (i12 <= 0) {
                    break;
                }
                for (int i13 = 0; i11 == -1 && i13 < i12; i13++) {
                    if (bArr[i13] == 10) {
                        i11 = i10 + i13;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i12);
                i10 += i12;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i11, charset));
        try {
            C15175X0 c15175x0 = (C15175X0) interfaceC15151P.mo16323c(stringReader, C15175X0.class);
            stringReader.close();
            if (c15175x0 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i14 = i11 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i15 = i14;
                while (true) {
                    if (i15 >= byteArray.length) {
                        i15 = -1;
                        break;
                    }
                    if (byteArray[i15] == 10) {
                        break;
                    }
                    i15++;
                }
                if (i15 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i14, i15 - i14, charset));
                try {
                    C15326c1 c15326c1 = (C15326c1) interfaceC15151P.mo16323c(stringReader2, C15326c1.class);
                    stringReader2.close();
                    if (c15326c1 == null || c15326c1.m16534a() <= 0) {
                        throw new IllegalArgumentException(suYVq.GQVqm + arrayList.size() + "' is null or empty.");
                    }
                    int iM16534a = c15326c1.m16534a() + i15;
                    int i16 = iM16534a + 1;
                    if (i16 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i16 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new C15321b1(c15326c1, Arrays.copyOfRange(byteArray, i15 + 1, i16)));
                    if (i16 == byteArray.length) {
                        break;
                    }
                    i14 = iM16534a + 2;
                    if (i14 == byteArray.length) {
                        if (byteArray[i16] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th4) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            C11241l c11241l = new C11241l(c15175x0, (Collection) arrayList);
            byteArrayOutputStream.close();
            return c11241l;
        } catch (Throwable th6) {
            try {
                stringReader.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}

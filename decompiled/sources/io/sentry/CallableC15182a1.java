package io.sentry;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.exception.C15352b;
import io.sentry.protocol.C15426F;
import io.sentry.util.AbstractC15496a;
import io.sentry.vendor.AbstractC15511a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import p544W9.AbstractC8459C3;

/* JADX INFO: renamed from: io.sentry.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC15182a1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47260a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f47261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC15151P f47262c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f47263d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f47264e;

    public /* synthetic */ CallableC15182a1(C15180a c15180a, long j10, InterfaceC15151P interfaceC15151P, InterfaceC15127H interfaceC15127H) {
        this.f47263d = c15180a;
        this.f47261b = j10;
        this.f47262c = interfaceC15151P;
        this.f47264e = interfaceC15127H;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws C15352b {
        Object obj = this.f47264e;
        long j10 = this.f47261b;
        Object obj2 = this.f47263d;
        InterfaceC15151P interfaceC15151P = this.f47262c;
        switch (this.f47260a) {
            case 0:
                C15180a c15180a = (C15180a) obj2;
                byte[] bArr = c15180a.f47254a;
                String str = c15180a.f47256c;
                if (bArr == null) {
                    C15426F c15426f = c15180a.f47255b;
                    if (c15426f != null) {
                        Charset charset = AbstractC15496a.f48415a;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, AbstractC15496a.f48415a));
                                try {
                                    interfaceC15151P.mo16326f(c15426f, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    bArr = byteArray;
                                    if (bArr != null) {
                                        long length = bArr.length;
                                        if (length > j10) {
                                            throw new C15352b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length), Long.valueOf(j10)));
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        bufferedWriter.close();
                                        break;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                try {
                                    byteArrayOutputStream.close();
                                    break;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            ((InterfaceC15127H) obj).mo16297h(EnumC15375i1.ERROR, "Could not serialize serializable", th6);
                            bArr = null;
                        }
                    }
                    throw new C15352b(AbstractC10763a.m11054l("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable or a path is set."));
                }
                long length2 = bArr.length;
                if (length2 > j10) {
                    throw new C15352b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length2), Long.valueOf(j10)));
                }
                return bArr;
            default:
                File file = (File) obj2;
                if (!file.exists()) {
                    throw new C15352b(AbstractC10763a.m11054l("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(AbstractC15511a.m16690a(AbstractC8459C3.m9079c(j10, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new C15352b("Profiling trace file is empty");
                    }
                    C15113C0 c15113c0 = (C15113C0) obj;
                    c15113c0.f47033N0 = str2;
                    try {
                        c15113c0.f47046x0 = (List) c15113c0.f47036Z.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C15321b1.f47862d));
                                try {
                                    interfaceC15151P.mo16326f(c15113c0, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    file.delete();
                                    return byteArray2;
                                } catch (Throwable th7) {
                                    try {
                                        bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th9) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th10) {
                                    th9.addSuppressed(th10);
                                }
                                throw th9;
                            }
                        } catch (Throwable th11) {
                            file.delete();
                            throw th11;
                        }
                    } catch (IOException e10) {
                        throw new C15352b("Failed to serialize profiling trace data\n" + e10.getMessage());
                    }
                } catch (UnsupportedEncodingException e11) {
                    throw new AssertionError(e11);
                }
        }
    }

    public /* synthetic */ CallableC15182a1(File file, long j10, C15113C0 c15113c0, InterfaceC15151P interfaceC15151P) {
        this.f47263d = file;
        this.f47261b = j10;
        this.f47264e = c15113c0;
        this.f47262c = interfaceC15151P;
    }
}

package io.sentry;

import io.sentry.clientreport.C15335c;
import io.sentry.protocol.C15421A;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p117Eb.CallableC2378h;
import p544W9.AbstractC8483G3;
import p658b5.C11234e;

/* JADX INFO: renamed from: io.sentry.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15321b1 {

    /* JADX INFO: renamed from: d */
    public static final Charset f47862d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C15326c1 f47863a;

    /* JADX INFO: renamed from: b */
    public final Callable f47864b;

    /* JADX INFO: renamed from: c */
    public byte[] f47865c;

    public C15321b1(C15326c1 c15326c1, byte[] bArr) {
        this.f47863a = c15326c1;
        this.f47865c = bArr;
        this.f47864b = null;
    }

    /* JADX INFO: renamed from: a */
    public static C15321b1 m16525a(InterfaceC15151P interfaceC15151P, C15335c c15335c) {
        AbstractC8483G3.m9133c(interfaceC15151P, "ISerializer is required.");
        C11234e c11234e = new C11234e(new CallableC2378h(interfaceC15151P, 5, c15335c));
        return new C15321b1(new C15326c1(EnumC15361h1.resolve(c15335c), new CallableC15177Y0(c11234e, 4), "application/json", (String) null, (String) null), new CallableC15177Y0(c11234e, 5));
    }

    /* JADX INFO: renamed from: b */
    public static C15321b1 m16526b(InterfaceC15151P interfaceC15151P, C15132I1 c15132i1) {
        AbstractC8483G3.m9133c(interfaceC15151P, "ISerializer is required.");
        AbstractC8483G3.m9133c(c15132i1, "Session is required.");
        C11234e c11234e = new C11234e(new CallableC2378h(interfaceC15151P, 3, c15132i1));
        return new C15321b1(new C15326c1(EnumC15361h1.Session, new CallableC15177Y0(c11234e, 7), "application/json", (String) null, (String) null), new CallableC15177Y0(c11234e, 9));
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m16527f(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f47862d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C15335c m16528c(InterfaceC15151P interfaceC15151P) throws IOException {
        C15326c1 c15326c1 = this.f47863a;
        if (c15326c1 == null || c15326c1.f47870o0 != EnumC15361h1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m16529d()), f47862d));
        try {
            C15335c c15335c = (C15335c) interfaceC15151P.mo16323c(bufferedReader, C15335c.class);
            bufferedReader.close();
            return c15335c;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m16529d() {
        Callable callable;
        if (this.f47865c == null && (callable = this.f47864b) != null) {
            this.f47865c = (byte[]) callable.call();
        }
        return this.f47865c;
    }

    /* JADX INFO: renamed from: e */
    public final C15421A m16530e(InterfaceC15151P interfaceC15151P) throws IOException {
        C15326c1 c15326c1 = this.f47863a;
        if (c15326c1 == null || c15326c1.f47870o0 != EnumC15361h1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m16529d()), f47862d));
        try {
            C15421A c15421a = (C15421A) interfaceC15151P.mo16323c(bufferedReader, C15421A.class);
            bufferedReader.close();
            return c15421a;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public C15321b1(C15326c1 c15326c1, Callable callable) {
        this.f47863a = c15326c1;
        this.f47864b = callable;
        this.f47865c = null;
    }
}

package p520V5;

import android.content.Context;
import android.util.Pair;
import io.sentry.hints.C15370i;
import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import p112E6.C2350i;
import p544W9.AbstractC8746y3;
import p594Y9.AbstractC9884f0;
import p640a6.C10512g;
import p720e6.C13287b;
import p720e6.C13288c;
import p720e6.EnumC13286a;
import p779h6.AbstractC14413b;

/* JADX INFO: renamed from: V5.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7782k implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f24597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24598c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f24599d;

    public /* synthetic */ CallableC7782k(Context context, String str, String str2, int i10) {
        this.f24596a = i10;
        this.f24597b = context;
        this.f24598c = str;
        this.f24599d = str2;
    }

    /* JADX INFO: Removed unreachable split cross block B:106:0x0127 */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [V5.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [V5.B] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [E6.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C7781j c7781j;
        ?? c7764b;
        C7781j c7781j2;
        Pair pair;
        C7764B c7764bM8048f;
        C13288c c13288c;
        switch (this.f24596a) {
            case 0:
                Context context = this.f24597b;
                String str = this.f24598c;
                String str2 = this.f24599d;
                C13288c c13288c2 = AbstractC9884f0.f29391a;
                C13288c c13288c3 = c13288c2;
                if (c13288c2 == null) {
                    synchronized (C13288c.class) {
                        try {
                            C13288c c13288c4 = AbstractC9884f0.f29391a;
                            c13288c = c13288c4;
                            if (c13288c4 == null) {
                                C13287b c13287bM10537b = AbstractC9884f0.m10537b(context);
                                new C15370i(24);
                                C13288c c13288c5 = new C13288c();
                                c13288c5.f42001Y = c13287bM10537b;
                                AbstractC9884f0.f29391a = c13288c5;
                                c13288c = c13288c5;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    c13288c3 = c13288c;
                }
                ?? r6 = 0;
                C2350i c2350i = null;
                if (str2 != null) {
                    try {
                        File fileM14903j = ((C13287b) c13288c3.f42001Y).m14903j(str);
                        if (fileM14903j == null) {
                            pair = null;
                        } else {
                            C15378c c15378cM9492c = AbstractC8746y3.m9492c(fileM14903j, new FileInputStream(fileM14903j));
                            EnumC13286a enumC13286a = fileM14903j.getAbsolutePath().endsWith(".zip") ? EnumC13286a.f41995o0 : fileM14903j.getAbsolutePath().endsWith(".gz") ? EnumC13286a.GZIP : EnumC13286a.JSON;
                            fileM14903j.getAbsolutePath();
                            AbstractC14413b.m15912a();
                            pair = new Pair(enumC13286a, c15378cM9492c);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        c7781j = null;
                    } else {
                        EnumC13286a enumC13286a2 = (EnumC13286a) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = enumC13286a2.ordinal();
                        if (iOrdinal == 1) {
                            c7764bM8048f = AbstractC7785n.m8048f(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            c7764bM8048f = AbstractC7785n.m8045c(inputStream, str2);
                        } else {
                            try {
                                c7764bM8048f = AbstractC7785n.m8045c(new GZIPInputStream(inputStream), str2);
                            } catch (IOException e10) {
                                c7764bM8048f = new C7764B(e10);
                            }
                        }
                        c7781j = c7764bM8048f.f24539a;
                        if (c7781j == null) {
                            c7781j = null;
                        }
                    }
                    break;
                } else {
                    c7781j = null;
                }
                if (c7781j == null) {
                    AbstractC14413b.m15912a();
                    AbstractC14413b.m15912a();
                    try {
                        try {
                            C2350i c2350iM16626l = C15370i.m16626l(str);
                            HttpURLConnection httpURLConnection = (HttpURLConnection) c2350iM16626l.f7297Z;
                            boolean z6 = false;
                            try {
                                try {
                                    z6 = httpURLConnection.getResponseCode() / 100 == 2;
                                } catch (IOException unused2) {
                                }
                                try {
                                    if (z6) {
                                        InputStream inputStream2 = httpURLConnection.getInputStream();
                                        String contentType = httpURLConnection.getContentType();
                                        String str3 = str2;
                                        C7764B c7764bM14914T = c13288c3.m14914T(context, str, inputStream2, contentType, str3);
                                        C7781j c7781j3 = c7764bM14914T.f24539a;
                                        AbstractC14413b.m15912a();
                                        c2350iM16626l.close();
                                        c7764b = c7764bM14914T;
                                        r6 = str3;
                                    } else {
                                        C7764B c7764b2 = new C7764B(new IllegalArgumentException(c2350iM16626l.m3435a()));
                                        c2350iM16626l.close();
                                        c7764b = c7764b2;
                                        r6 = httpURLConnection;
                                    }
                                } catch (IOException e11) {
                                    AbstractC14413b.m15914c("LottieFetchResult close failed ", e11);
                                    c7764b = c13288c3;
                                    r6 = httpURLConnection;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                c2350i = c2350iM16626l;
                                C7764B c7764b3 = new C7764B(e);
                                if (c2350i != null) {
                                    try {
                                        c2350i.close();
                                    } catch (IOException e13) {
                                        AbstractC14413b.m15914c("LottieFetchResult close failed ", e13);
                                    }
                                }
                                c7764b = c7764b3;
                                r6 = c2350i;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                r6 = c2350iM16626l;
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (IOException e14) {
                                        AbstractC14413b.m15914c("LottieFetchResult close failed ", e14);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                    break;
                } else {
                    c7764b = new C7764B(c7781j);
                }
                if (str2 != null && (c7781j2 = c7764b.f24539a) != null) {
                    C10512g.f31153b.f31154a.m3126k(str2, c7781j2);
                }
                return c7764b;
            default:
                return AbstractC7785n.m8044b(this.f24597b, this.f24598c, this.f24599d);
        }
    }
}

package io.sentry;

import io.sentry.cache.C15329c;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.protocol.C15447t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p544W9.AbstractC8656j3;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.B0 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15110B0 implements Runnable {

    /* JADX INFO: renamed from: Z */
    public static final Charset f47018Z = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f47019Y;

    public RunnableC15110B0(C15524y1 c15524y1) {
        this.f47019Y = c15524y1;
    }

    /* JADX INFO: renamed from: a */
    public final Date m16258a(File file) {
        C15524y1 c15524y1 = this.f47019Y;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f47018Z));
            try {
                String line = bufferedReader.readLine();
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM9342j = AbstractC8656j3.m9342j(line);
                bufferedReader.close();
                return dateM9342j;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, e11, QzvfuIgrngtl.BgIm, new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateM16258a;
        C15524y1 c15524y1 = this.f47019Y;
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath == null) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!c15524y1.isEnableAutoSessionTracking()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        InterfaceC15330d envelopeDiskCache = c15524y1.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C15329c) && !((C15329c) envelopeDiskCache).m16543p()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = C15329c.f47876s0;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC15151P serializer = c15524y1.getSerializer();
        if (file.exists()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f47018Z));
                try {
                    C15132I1 c15132i1 = (C15132I1) serializer.mo16323c(bufferedReader, C15132I1.class);
                    if (c15132i1 == null) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(c15524y1.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateM16258a = m16258a(file2);
                            if (!file2.delete()) {
                                c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            c15132i1.m16303c(EnumC15129H1.Crashed, null, true, null);
                        } else {
                            dateM16258a = null;
                        }
                        if (c15132i1.f47112z0 == null) {
                            c15132i1.m16302b(dateM16258a);
                        }
                        C15109B.f47017a.mo16237D(new C11241l((C15447t) null, c15524y1.getSdkVersion(), C15321b1.m16526b(serializer, c15132i1)), new C15516w());
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error processing previous session.", th4);
            }
            if (file.delete()) {
                return;
            }
            c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}

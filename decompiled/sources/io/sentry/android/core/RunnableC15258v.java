package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C15109B;
import io.sentry.C15180a;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.cache.C15212a;
import io.sentry.android.core.internal.threaddump.C15226a;
import io.sentry.android.core.internal.threaddump.C15227b;
import io.sentry.android.core.internal.threaddump.C15228c;
import io.sentry.cache.C15329c;
import io.sentry.cache.InterfaceC15330d;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15447t;
import io.sentry.transport.C15481d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p009A7.FlM.nkFZpTrMPpn;
import p030B2.AbstractC0719B0;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p658b5.C11242m;
import p690cp.C12910A;

/* JADX INFO: renamed from: io.sentry.android.core.v */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15258v implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final Context f47629Y;

    /* JADX INFO: renamed from: Z */
    public final SentryAndroidOptions f47630Z;

    /* JADX INFO: renamed from: o0 */
    public final long f47631o0;

    public RunnableC15258v(Context context, SentryAndroidOptions sentryAndroidOptions, C15481d c15481d) {
        this.f47629Y = context;
        this.f47630Z = sentryAndroidOptions;
        c15481d.getClass();
        this.f47631o0 = System.currentTimeMillis() - AnrV2Integration.f47293p0;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[Catch: all -> 0x0029, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0029, blocks: (B:6:0x0015, B:10:0x0024, B:26:0x004f, B:63:0x00e1, B:62:0x00de, B:58:0x00d8, B:8:0x001b, B:16:0x0030, B:25:0x004c, B:56:0x00d5, B:55:0x00d2), top: B:92:0x0015, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m16487a(ApplicationExitInfo applicationExitInfo, boolean z6) {
        C11242m c11242m;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.f47630Z;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z10 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    c11242m = new C11242m(EnumC15260x.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i10 = traceInputStream.read(bArr2, 0, 1024);
                            if (i10 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            }
                            if (traceInputStream != null) {
                                throw th;
                            }
                            try {
                                traceInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    C15226a c15226a = new C15226a();
                                    c15226a.f47504a = line;
                                    arrayList.add(c15226a);
                                }
                                ArrayList arrayListM16437d = new C15228c(sentryAndroidOptions, z10).m16437d(new C15227b(arrayList));
                                if (arrayListM16437d.isEmpty()) {
                                    c11242m = new C11242m(EnumC15260x.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    C11242m c11242m2 = new C11242m(EnumC15260x.DUMP, byteArray, arrayListM16437d);
                                    bufferedReader.close();
                                    c11242m = c11242m2;
                                }
                            } catch (Throwable th3) {
                                try {
                                    bufferedReader.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.WARNING, nkFZpTrMPpn.xuyOHfcCLHq, th5);
                            EnumC15260x enumC15260x = EnumC15260x.ERROR;
                            c11242m = new C11242m();
                            c11242m.f34018Y = enumC15260x;
                            c11242m.f34019Z = byteArray;
                            c11242m.f34020o0 = null;
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
                }
            } catch (Throwable th8) {
                if (traceInputStream != null) {
                    throw th8;
                }
                traceInputStream.close();
                throw th8;
            }
        } catch (Throwable th9) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to read ANR thread dump", th9);
            c11242m = new C11242m(EnumC15260x.NO_DUMP);
        }
        EnumC15260x enumC15260x2 = EnumC15260x.NO_DUMP;
        EnumC15260x enumC15260x3 = (EnumC15260x) c11242m.f34018Y;
        if (enumC15260x3 == enumC15260x2) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        C15259w c15259w = new C15259w(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z6, z10);
        C15516w c15516wM9087a = AbstractC8465D3.m9087a(c15259w);
        C15347d1 c15347d1 = new C15347d1();
        if (enumC15260x3 == EnumC15260x.ERROR) {
            C15438k c15438k = new C15438k();
            c15438k.f48165Y = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c15347d1.f47915C0 = c15438k;
        } else if (enumC15260x3 == EnumC15260x.DUMP) {
            c15347d1.f47917E0 = new C12910A((ArrayList) c11242m.f34020o0);
        }
        c15347d1.f47919G0 = EnumC15375i1.FATAL;
        c15347d1.f47914B0 = AbstractC8656j3.m9341i(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) c11242m.f34019Z) != null) {
            c15516wM9087a.f48470e = new C15180a("thread-dump.txt", "text/plain", bArr);
        }
        if (C15109B.f47017a.mo16239F(c15347d1, c15516wM9087a).equals(C15447t.f48216Z) || c15259w.mo16391d()) {
            return;
        }
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c15347d1.f47194Y);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:29:0x00b2->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        Iterator it;
        long timestamp;
        long j10;
        Iterator it2;
        ApplicationExitInfo applicationExitInfoM1508c;
        ApplicationExitInfo applicationExitInfoM1508c2;
        List historicalProcessExitReasons = ((ActivityManager) this.f47629Y.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        int size = historicalProcessExitReasons.size();
        SentryAndroidOptions sentryAndroidOptions = this.f47630Z;
        if (size == 0) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        InterfaceC15330d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C15329c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            C15329c c15329c = (C15329c) envelopeDiskCache;
            if (!c15329c.m16543p()) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                c15329c.f47881q0.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        int i10 = C15212a.f47459u0;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC8483G3.m9133c(cacheDirPath, "Cache dir path should be set for getting ANRs reported");
        File file = new File(cacheDirPath, "last_anr_report");
        ApplicationExitInfo applicationExitInfo = null;
        try {
            if (file.exists() && file.canRead()) {
                String strM9080d = AbstractC8459C3.m9080d(file);
                if (!strM9080d.equals("null")) {
                    lValueOf = Long.valueOf(Long.parseLong(strM9080d.trim()));
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    applicationExitInfoM1508c2 = AbstractC0719B0.m1508c(it.next());
                    if (applicationExitInfoM1508c2.getReason() == 6) {
                        arrayList.remove(applicationExitInfoM1508c2);
                        applicationExitInfo = applicationExitInfoM1508c2;
                        break;
                    }
                }
                if (applicationExitInfo == null) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                    return;
                }
                timestamp = applicationExitInfo.getTimestamp();
                j10 = this.f47631o0;
                if (timestamp < j10) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                    return;
                }
                if (lValueOf == null && applicationExitInfo.getTimestamp() <= lValueOf.longValue()) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                    return;
                }
                if (sentryAndroidOptions.isReportHistoricalAnrs()) {
                    Collections.reverse(arrayList);
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        applicationExitInfoM1508c = AbstractC0719B0.m1508c(it2.next());
                        if (applicationExitInfoM1508c.getReason() != 6) {
                            if (applicationExitInfoM1508c.getTimestamp() < j10) {
                                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "ANR happened too long ago %s.", applicationExitInfoM1508c);
                            } else if (lValueOf != null || applicationExitInfoM1508c.getTimestamp() > lValueOf.longValue()) {
                                m16487a(applicationExitInfoM1508c, false);
                            } else {
                                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "ANR has already been reported %s.", applicationExitInfoM1508c);
                            }
                        }
                    }
                }
                m16487a(applicationExitInfo, true);
            }
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Error reading last ANR marker", th2);
        }
        lValueOf = null;
        it = arrayList.iterator();
        while (it.hasNext()) {
            applicationExitInfoM1508c2 = AbstractC0719B0.m1508c(it.next());
            if (applicationExitInfoM1508c2.getReason() == 6) {
                arrayList.remove(applicationExitInfoM1508c2);
                applicationExitInfo = applicationExitInfoM1508c2;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
            return;
        }
        timestamp = applicationExitInfo.getTimestamp();
        j10 = this.f47631o0;
        if (timestamp < j10) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
            return;
        }
        if (lValueOf == null) {
        }
        if (sentryAndroidOptions.isReportHistoricalAnrs()) {
            Collections.reverse(arrayList);
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                applicationExitInfoM1508c = AbstractC0719B0.m1508c(it2.next());
                if (applicationExitInfoM1508c.getReason() != 6) {
                    if (applicationExitInfoM1508c.getTimestamp() < j10) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "ANR happened too long ago %s.", applicationExitInfoM1508c);
                    } else {
                        if (lValueOf != null) {
                        }
                        m16487a(applicationExitInfoM1508c, false);
                    }
                }
            }
        }
        m16487a(applicationExitInfo, true);
    }
}

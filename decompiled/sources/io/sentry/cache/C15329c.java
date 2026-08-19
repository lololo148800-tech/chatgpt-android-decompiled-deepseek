package io.sentry.cache;

import io.sentry.C15132I1;
import io.sentry.C15166U0;
import io.sentry.C15170V1;
import io.sentry.C15175X0;
import io.sentry.C15321b1;
import io.sentry.C15326c1;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15129H1;
import io.sentry.EnumC15361h1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15151P;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.hints.C15370i;
import io.sentry.hints.InterfaceC15362a;
import io.sentry.hints.InterfaceC15369h;
import io.sentry.util.C15498c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p001A.C0013G0;
import p239Ja.C4307j;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p658b5.C11241l;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: io.sentry.cache.c */
/* JADX INFO: loaded from: classes3.dex */
public class C15329c implements InterfaceC15330d {

    /* JADX INFO: renamed from: s0 */
    public static final Charset f47876s0 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f47877Y;

    /* JADX INFO: renamed from: Z */
    public final C15498c f47878Z = new C15498c(new C4307j(this, 29));

    /* JADX INFO: renamed from: o0 */
    public final File f47879o0;

    /* JADX INFO: renamed from: p0 */
    public final int f47880p0;

    /* JADX INFO: renamed from: q0 */
    public final CountDownLatch f47881q0;

    /* JADX INFO: renamed from: r0 */
    public final WeakHashMap f47882r0;

    public C15329c(C15524y1 c15524y1, String str, int i10) {
        AbstractC8483G3.m9133c(c15524y1, "SentryOptions is required.");
        this.f47877Y = c15524y1;
        this.f47879o0 = new File(str);
        this.f47880p0 = i10;
        this.f47882r0 = new WeakHashMap();
        this.f47881q0 = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: f */
    public final File[] m16538f() {
        File file = this.f47879o0;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new C15328b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f47877Y.getLogger().mo16298o(EnumC15375i1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    /* JADX INFO: renamed from: i */
    public final synchronized File m16539i(C11241l c11241l) {
        String str;
        try {
            if (this.f47882r0.containsKey(c11241l)) {
                str = (String) this.f47882r0.get(c11241l);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.f47882r0.put(c11241l, str2);
                str = str2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new File(this.f47879o0.getAbsolutePath(), str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C15524y1 c15524y1 = this.f47877Y;
        File[] fileArrM16538f = m16538f();
        ArrayList arrayList = new ArrayList(fileArrM16538f.length);
        for (File file : fileArrM16538f) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC15151P) this.f47878Z.m16684a()).mo16324d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e10);
            }
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final C11241l m16540j(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C11241l c11241lMo16324d = ((InterfaceC15151P) this.f47878Z.m16684a()).mo16324d(bufferedInputStream);
                bufferedInputStream.close();
                return c11241lMo16324d;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f47877Y.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final C15132I1 m16541m(C15321b1 c15321b1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c15321b1.m16529d()), f47876s0));
            try {
                C15132I1 c15132i1 = (C15132I1) ((InterfaceC15151P) this.f47878Z.m16684a()).mo16323c(bufferedReader, C15132I1.class);
                bufferedReader.close();
                return c15132i1;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f47877Y.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to deserialize the session.", th4);
            return null;
        }
    }

    @Override // io.sentry.cache.InterfaceC15330d
    /* JADX INFO: renamed from: n */
    public final void mo16542n(C11241l c11241l) {
        AbstractC8483G3.m9133c(c11241l, "Envelope is required.");
        File fileM16539i = m16539i(c11241l);
        boolean zExists = fileM16539i.exists();
        C15524y1 c15524y1 = this.f47877Y;
        if (!zExists) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Envelope was not cached: %s", fileM16539i.getAbsolutePath());
            return;
        }
        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Discarding envelope from cache: %s", fileM16539i.getAbsolutePath());
        if (fileM16539i.delete()) {
            return;
        }
        c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete envelope: %s", fileM16539i.getAbsolutePath());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0233 A[PHI: r5 r6 r9
      0x0233: PHI (r5v5 java.io.File[]) = 
      (r5v4 java.io.File[])
      (r5v4 java.io.File[])
      (r5v4 java.io.File[])
      (r5v4 java.io.File[])
      (r5v4 java.io.File[])
      (r5v4 java.io.File[])
      (r5v10 java.io.File[])
     binds: [B:10:0x0045, B:12:0x0053, B:25:0x008c, B:32:0x009f, B:35:0x00a5, B:37:0x00ab, B:312:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v31 int) = (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v34 int) binds: [B:10:0x0045, B:12:0x0053, B:25:0x008c, B:32:0x009f, B:35:0x00a5, B:37:0x00ab, B:312:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r9v18 java.io.File[]) = 
      (r9v17 java.io.File[])
      (r9v17 java.io.File[])
      (r9v17 java.io.File[])
      (r9v17 java.io.File[])
      (r9v17 java.io.File[])
      (r9v17 java.io.File[])
      (r9v20 java.io.File[])
     binds: [B:10:0x0045, B:12:0x0053, B:25:0x008c, B:32:0x009f, B:35:0x00a5, B:37:0x00ab, B:312:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.cache.InterfaceC15330d
    /* JADX INFO: renamed from: o */
    public void mo16422o(C11241l c11241l, C15516w c15516w) {
        Date dateM9341i;
        int i10;
        C15132I1 c15132i1M16541m;
        Boolean bool;
        int i11;
        C15498c c15498c;
        C15321b1 c15321b1M16526b;
        C15132I1 c15132i1M16541m2;
        int i12 = 0;
        int i13 = 1;
        AbstractC8483G3.m9133c(c11241l, "Envelope is required.");
        File[] fileArrM16538f = m16538f();
        int length = fileArrM16538f.length;
        int i14 = this.f47880p0;
        if (length >= i14) {
            C15524y1 c15524y1 = this.f47877Y;
            c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i15 = (length - i14) + 1;
            if (fileArrM16538f.length > 1) {
                Arrays.sort(fileArrM16538f, new C0013G0(16));
            }
            File[] fileArr = (File[]) Arrays.copyOfRange(fileArrM16538f, i15, length);
            int i16 = 0;
            while (i16 < i15) {
                File file = fileArrM16538f[i16];
                C11241l c11241lM16540j = m16540j(file);
                if (c11241lM16540j != null && ((Collection) c11241lM16540j.f34017Z).iterator().hasNext()) {
                    c15524y1.getClientReportRecorder().mo7940G(EnumC15337e.CACHE_OVERFLOW, c11241lM16540j);
                    Iterator it = ((Collection) c11241lM16540j.f34017Z).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c15132i1M16541m = null;
                            break;
                        }
                        C15321b1 c15321b1 = (C15321b1) it.next();
                        if ((c15321b1 == null ? i12 : c15321b1.f47863a.f47870o0.equals(EnumC15361h1.Session)) != 0) {
                            c15132i1M16541m = m16541m(c15321b1);
                            break;
                        }
                    }
                    if (c15132i1M16541m != null) {
                        if (((c15132i1M16541m.f47105s0.equals(EnumC15129H1.Ok) && c15132i1M16541m.f47103q0 != null) ? i13 : i12) == 0 || (bool = c15132i1M16541m.f47104r0) == null || !bool.booleanValue()) {
                            fileArrM16538f = fileArrM16538f;
                            i15 = i15;
                            fileArr = fileArr;
                            break;
                        }
                        int length2 = fileArr.length;
                        int i17 = i12;
                        while (true) {
                            if (i17 >= length2) {
                                fileArrM16538f = fileArrM16538f;
                                i15 = i15;
                                fileArr = fileArr;
                                break;
                            }
                            File file2 = fileArr[i17];
                            C11241l c11241lM16540j2 = m16540j(file2);
                            if (c11241lM16540j2 == null) {
                                fileArrM16538f = fileArrM16538f;
                                i15 = i15;
                                fileArr = fileArr;
                                c15132i1M16541m = c15132i1M16541m;
                                length2 = length2;
                                i11 = i13;
                            } else if (((Collection) c11241lM16540j2.f34017Z).iterator().hasNext()) {
                                Collection collection = (Collection) c11241lM16540j2.f34017Z;
                                Iterator it2 = collection.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    c15498c = this.f47878Z;
                                    if (!zHasNext) {
                                        fileArrM16538f = fileArrM16538f;
                                        i15 = i15;
                                        fileArr = fileArr;
                                        c15321b1M16526b = null;
                                        break;
                                    }
                                    fileArrM16538f = fileArrM16538f;
                                    C15321b1 c15321b2 = (C15321b1) it2.next();
                                    if ((c15321b2 == null ? false : c15321b2.f47863a.f47870o0.equals(EnumC15361h1.Session)) && (c15132i1M16541m2 = m16541m(c15321b2)) != null) {
                                        if (c15132i1M16541m2.f47105s0.equals(EnumC15129H1.Ok) && c15132i1M16541m2.f47103q0 != null) {
                                            Boolean bool2 = c15132i1M16541m2.f47104r0;
                                            UUID uuid = c15132i1M16541m.f47103q0;
                                            if (bool2 != null && bool2.booleanValue()) {
                                                c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Session %s has 2 times the init flag.", uuid);
                                                break;
                                            }
                                            if (uuid == null || !uuid.equals(c15132i1M16541m2.f47103q0)) {
                                                c15132i1M16541m = c15132i1M16541m;
                                                length2 = length2;
                                            } else {
                                                c15132i1M16541m2.f47104r0 = Boolean.TRUE;
                                                try {
                                                    c15321b1M16526b = C15321b1.m16526b((InterfaceC15151P) c15498c.m16684a(), c15132i1M16541m2);
                                                    try {
                                                        it2.remove();
                                                        break;
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, e, "Failed to create new envelope item for the session %s", uuid);
                                                        c15321b1M16526b = c15321b1M16526b;
                                                        break;
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    c15321b1M16526b = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c15321b1M16526b != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it3 = collection.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.add((C15321b1) it3.next());
                                    }
                                    arrayList.add(c15321b1M16526b);
                                    C11241l c11241l2 = new C11241l((C15175X0) c11241lM16540j2.f34016Y, (Collection) arrayList);
                                    long jLastModified = file2.lastModified();
                                    if (!file2.delete()) {
                                        c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                    }
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            ((InterfaceC15151P) c15498c.m16684a()).mo16322b(c11241l2, fileOutputStream);
                                            file2.setLastModified(jLastModified);
                                            fileOutputStream.close();
                                            break;
                                        } catch (Throwable th2) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th4) {
                                        c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                        break;
                                    }
                                }
                                i11 = 1;
                            } else {
                                i11 = i13;
                                fileArrM16538f = fileArrM16538f;
                                i15 = i15;
                                fileArr = fileArr;
                                c15132i1M16541m = c15132i1M16541m;
                                length2 = length2;
                            }
                            i17 += i11;
                            i13 = i11;
                            i15 = i15;
                            fileArrM16538f = fileArrM16538f;
                            fileArr = fileArr;
                            c15132i1M16541m = c15132i1M16541m;
                            length2 = length2;
                        }
                    } else {
                        fileArrM16538f = fileArrM16538f;
                        i15 = i15;
                        fileArr = fileArr;
                        break;
                    }
                } else {
                    fileArrM16538f = fileArrM16538f;
                    i15 = i15;
                    fileArr = fileArr;
                    break;
                }
                if (file.delete()) {
                    i10 = 1;
                } else {
                    i10 = 1;
                    c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
                i16 += i10;
                i13 = i10;
                i15 = i15;
                fileArrM16538f = fileArrM16538f;
                fileArr = fileArr;
                i12 = 0;
            }
        }
        File file3 = new File(this.f47879o0.getAbsolutePath(), "session.json");
        File file4 = new File(this.f47879o0.getAbsolutePath(), "previous_session.json");
        if (AbstractC8465D3.m9089c(c15516w, InterfaceC15369h.class) && !file3.delete()) {
            this.f47877Y.getLogger().mo16298o(EnumC15375i1.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (InterfaceC15362a.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
            Object objM9088b = AbstractC8465D3.m9088b(c15516w);
            if (objM9088b instanceof InterfaceC15362a) {
                File file5 = new File(this.f47879o0.getAbsolutePath(), "previous_session.json");
                boolean zExists = file5.exists();
                C15524y1 c15524y2 = this.f47877Y;
                if (zExists) {
                    InterfaceC15127H logger = c15524y2.getLogger();
                    EnumC15375i1 enumC15375i1 = EnumC15375i1.WARNING;
                    logger.mo16298o(enumC15375i1, "Previous session is not ended, we'd need to end it.", new Object[0]);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file5), f47876s0));
                        try {
                            C15132I1 c15132i1 = (C15132I1) ((InterfaceC15151P) this.f47878Z.m16684a()).mo16323c(bufferedReader, C15132I1.class);
                            if (c15132i1 != null) {
                                InterfaceC15362a interfaceC15362a = (InterfaceC15362a) objM9088b;
                                Long lMo16460b = interfaceC15362a.mo16460b();
                                if (lMo16460b != null) {
                                    dateM9341i = AbstractC8656j3.m9341i(lMo16460b.longValue());
                                    Date date = c15132i1.f47099Y;
                                    Date date2 = date == null ? null : (Date) date.clone();
                                    if (date2 == null || dateM9341i.before(date2)) {
                                        c15524y2.getLogger().mo16298o(enumC15375i1, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                    }
                                } else {
                                    dateM9341i = null;
                                }
                                c15132i1.m16303c(EnumC15129H1.Abnormal, null, true, interfaceC15362a.mo16462e());
                                c15132i1.m16302b(dateM9341i);
                                m16544q(file5, c15132i1);
                            }
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            try {
                                bufferedReader.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        c15524y2.getLogger().mo16297h(EnumC15375i1.ERROR, "Error processing previous session.", th7);
                    }
                } else {
                    c15524y2.getLogger().mo16298o(EnumC15375i1.DEBUG, "No previous session file to end.", new Object[0]);
                }
            }
        }
        if (C15370i.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
            if (file3.exists()) {
                this.f47877Y.getLogger().mo16298o(EnumC15375i1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file3), f47876s0));
                    try {
                        C15132I1 c15132i2 = (C15132I1) ((InterfaceC15151P) this.f47878Z.m16684a()).mo16323c(bufferedReader2, C15132I1.class);
                        if (c15132i2 != null) {
                            m16544q(file4, c15132i2);
                        }
                        bufferedReader2.close();
                    } catch (Throwable th8) {
                        try {
                            bufferedReader2.close();
                            throw th8;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                            throw th8;
                        }
                    }
                } catch (Throwable th10) {
                    this.f47877Y.getLogger().mo16297h(EnumC15375i1.ERROR, "Error processing session.", th10);
                }
            }
            Collection collection2 = (Collection) c11241l.f34017Z;
            boolean zHasNext2 = collection2.iterator().hasNext();
            C15524y1 c15524y3 = this.f47877Y;
            if (zHasNext2) {
                C15321b1 c15321b3 = (C15321b1) collection2.iterator().next();
                boolean zEquals = EnumC15361h1.Session.equals(c15321b3.f47863a.f47870o0);
                C15326c1 c15326c1 = c15321b3.f47863a;
                if (zEquals) {
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c15321b3.m16529d()), f47876s0));
                        try {
                            C15132I1 c15132i3 = (C15132I1) ((InterfaceC15151P) this.f47878Z.m16684a()).mo16323c(bufferedReader3, C15132I1.class);
                            if (c15132i3 == null) {
                                c15524y3.getLogger().mo16298o(EnumC15375i1.ERROR, "Item of type %s returned null by the parser.", c15326c1.f47870o0);
                            } else {
                                m16544q(file3, c15132i3);
                            }
                            bufferedReader3.close();
                        } catch (Throwable th11) {
                            try {
                                bufferedReader3.close();
                                throw th11;
                            } catch (Throwable th12) {
                                th11.addSuppressed(th12);
                                throw th11;
                            }
                        }
                    } catch (Throwable th13) {
                        c15524y3.getLogger().mo16297h(EnumC15375i1.ERROR, "Item failed to process.", th13);
                    }
                } else {
                    c15524y3.getLogger().mo16298o(EnumC15375i1.INFO, "Current envelope has a different envelope type %s", c15326c1.f47870o0);
                }
            } else {
                c15524y3.getLogger().mo16298o(EnumC15375i1.INFO, "Current envelope %s is empty", file3.getAbsolutePath());
            }
            if (!new File(this.f47877Y.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file6 = new File(this.f47877Y.getCacheDirPath(), "last_crash");
                if (file6.exists()) {
                    this.f47877Y.getLogger().mo16298o(EnumC15375i1.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file6.delete()) {
                        this.f47877Y.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete the crash marker file. %s.", file6.getAbsolutePath());
                    }
                }
            }
            C15166U0 c15166u0 = C15166U0.f47225c;
            synchronized (c15166u0.f47227b) {
                try {
                    if (!c15166u0.f47226a) {
                        c15166u0.f47226a = true;
                    }
                } catch (Throwable th14) {
                    throw th14;
                }
            }
            this.f47881q0.countDown();
        }
        File fileM16539i = m16539i(c11241l);
        if (fileM16539i.exists()) {
            this.f47877Y.getLogger().mo16298o(EnumC15375i1.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM16539i.getAbsolutePath());
            return;
        }
        InterfaceC15127H logger2 = this.f47877Y.getLogger();
        EnumC15375i1 enumC15375i2 = EnumC15375i1.DEBUG;
        logger2.mo16298o(enumC15375i2, "Adding Envelope to offline storage: %s", fileM16539i.getAbsolutePath());
        boolean zExists2 = fileM16539i.exists();
        C15524y1 c15524y4 = this.f47877Y;
        if (zExists2) {
            c15524y4.getLogger().mo16298o(enumC15375i2, "Overwriting envelope to offline storage: %s", fileM16539i.getAbsolutePath());
            if (!fileM16539i.delete()) {
                c15524y4.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete: %s", fileM16539i.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM16539i);
            try {
                ((InterfaceC15151P) this.f47878Z.m16684a()).mo16322b(c11241l, fileOutputStream2);
                fileOutputStream2.close();
                if (C15170V1.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                    C15524y1 c15524y5 = this.f47877Y;
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(c15524y5.getCacheDirPath(), "last_crash"));
                        try {
                            fileOutputStream3.write(AbstractC8656j3.m9344l(AbstractC8656j3.m9340h()).getBytes(f47876s0));
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                        } catch (Throwable th15) {
                            try {
                                fileOutputStream3.close();
                                throw th15;
                            } catch (Throwable th16) {
                                th15.addSuppressed(th16);
                                throw th15;
                            }
                        }
                    } catch (Throwable th17) {
                        c15524y5.getLogger().mo16297h(EnumC15375i1.ERROR, "Error writing the crash marker file to the disk", th17);
                    }
                }
            } catch (Throwable th18) {
                try {
                    fileOutputStream2.close();
                    throw th18;
                } catch (Throwable th19) {
                    th18.addSuppressed(th19);
                    throw th18;
                }
            }
        } catch (Throwable th20) {
            c15524y4.getLogger().mo16296g(EnumC15375i1.ERROR, th20, "Error writing Envelope %s to offline storage", fileM16539i.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16543p() {
        C15524y1 c15524y1 = this.f47877Y;
        try {
            return this.f47881q0.await(c15524y1.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m16544q(File file, C15132I1 c15132i1) {
        boolean zExists = file.exists();
        C15524y1 c15524y1 = this.f47877Y;
        UUID uuid = c15132i1.f47103q0;
        if (zExists) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f47876s0));
                try {
                    ((InterfaceC15151P) this.f47878Z.m16684a()).mo16326f(c15132i1, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th6, suYVq.YaGTVOpxD, uuid);
        }
    }
}

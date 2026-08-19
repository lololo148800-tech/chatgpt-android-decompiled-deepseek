package p178H;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p001A.C0067i0;
import p001A.C0090u;
import p030B2.AbstractC0761i;
import p1115y.C21350b;
import p158G3.C2988g;
import p228J.AbstractC3797D;
import p228J.C3795C;
import p228J.C3826b;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8447A3;
import p544W9.AbstractC8476F2;
import p610Z1.C10142i;

/* JADX INFO: renamed from: H.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3167r implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9514Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3169s f9515Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Executor f9516o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f9517p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f9518q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Context f9519r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C10142i f9520s0;

    public /* synthetic */ RunnableC3167r(C3169s c3169s, Context context, Executor executor, int i10, C10142i c10142i, long j10) {
        this.f9515Z = c3169s;
        this.f9519r0 = context;
        this.f9516o0 = executor;
        this.f9518q0 = i10;
        this.f9520s0 = c10142i;
        this.f9517p0 = j10;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010c A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x0161 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0174 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0178 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x019d A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #2 {all -> 0x00a5, blocks: (B:7:0x0044, B:9:0x004c, B:11:0x0078, B:13:0x0091, B:15:0x009c, B:24:0x00ae, B:26:0x00bd, B:28:0x00c3, B:29:0x00c9, B:31:0x00d4, B:32:0x00e0, B:33:0x00e1, B:34:0x00ed, B:35:0x00ee, B:36:0x00fa, B:37:0x00fb, B:39:0x010c, B:40:0x0113, B:44:0x011c, B:46:0x0151, B:47:0x0156, B:48:0x0161, B:49:0x0163, B:53:0x0168, B:55:0x016c, B:56:0x0174, B:58:0x0178, B:59:0x019d, B:61:0x01a1, B:62:0x01a6, B:67:0x01b3, B:51:0x0165, B:52:0x0167), top: B:72:0x0044, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0178, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        C2988g c2988g;
        C3146g0 c3146g0Mo3986b;
        switch (this.f9514Y) {
            case 0:
                C3169s c3169s = this.f9515Z;
                Context context = this.f9519r0;
                Executor executor = this.f9516o0;
                int i10 = this.f9518q0;
                C10142i c10142i = this.f9520s0;
                long j10 = this.f9517p0;
                c3169s.getClass();
                Trace.beginSection(AbstractC8447A3.m9053f("CX:initAndRetryRecursively"));
                Context contextM9110c = AbstractC8476F2.m9110c(context);
                try {
                    try {
                        if (c3169s.f9525c.m4003d() == null) {
                            throw new C3129W(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                        }
                        C3826b c3826b = new C3826b(c3169s.f9526d, c3169s.f9527e);
                        C3163p c3163pM4002a = c3169s.f9525c.m4002a();
                        c3169s.f9528f = new C0090u(contextM9110c, c3826b, c3163pM4002a, c3169s.f9525c.m4004o());
                        if (c3169s.f9525c.m4005t() == null) {
                            throw new C3129W(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                        }
                        C0090u c0090u = c3169s.f9528f;
                        c3169s.f9529g = C21350b.m21745a(contextM9110c, c0090u.f395e, new LinkedHashSet(c0090u.f396f));
                        if (c3169s.f9525c.m4006x() == null) {
                            throw new C3129W(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                        }
                        c3169s.f9530h = new C0067i0(contextM9110c);
                        if (executor instanceof ExecutorC3159n) {
                            ((ExecutorC3159n) executor).m3989a(c3169s.f9528f);
                        }
                        c3169s.f9523a.m16587q(c3169s.f9528f);
                        AbstractC3797D.m4502a(contextM9110c, c3169s.f9523a, c3163pM4002a);
                        if (i10 > 1 && AbstractC8447A3.m9051c()) {
                            AbstractC8447A3.m9052e(-1, "CX:CameraProvider-RetryStatus");
                        }
                        c3169s.m3998c();
                        c10142i.m10747a(null);
                        Trace.endSection();
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (C3129W e10) {
                    e = e10;
                    c2988g = new C2988g(j10, e);
                    c3146g0Mo3986b = c3169s.f9531i.mo3986b(c2988g);
                    if (AbstractC8447A3.m9051c()) {
                        AbstractC8447A3.m9052e(c2988g.f8970a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c3146g0Mo3986b.f9469b || i10 >= Integer.MAX_VALUE) {
                        synchronized (c3169s.f9524b) {
                            c3169s.f9533k = 3;
                            break;
                        }
                        if (c3146g0Mo3986b.f9470c) {
                            c3169s.m3998c();
                            c10142i.m10747a(null);
                        } else if (e instanceof C3795C) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C3795C) e).f11471Y;
                            AbstractC8072d6.m8488e("CameraX", str, e);
                            c10142i.m10748b(new C3129W(new C3165q(str)));
                        } else if (e instanceof C3129W) {
                            c10142i.m10748b(e);
                        } else {
                            c10142i.m10748b(new C3129W(e));
                        }
                    } else {
                        AbstractC8072d6.m8493j("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e);
                        Handler handler = c3169s.f9527e;
                        RunnableC3167r runnableC3167r = new RunnableC3167r(c3169s, executor, j10, i10, contextM9110c, c10142i);
                        long j11 = c3146g0Mo3986b.f9468a;
                        if (Build.VERSION.SDK_INT >= 28) {
                            AbstractC0761i.m1683o(handler, runnableC3167r, j11);
                        } else {
                            Message messageObtain = Message.obtain(handler, runnableC3167r);
                            messageObtain.obj = "retry_token";
                            handler.sendMessageDelayed(messageObtain, j11);
                        }
                    }
                } catch (C3795C e11) {
                    e = e11;
                    c2988g = new C2988g(j10, e);
                    c3146g0Mo3986b = c3169s.f9531i.mo3986b(c2988g);
                    if (AbstractC8447A3.m9051c()) {
                        AbstractC8447A3.m9052e(c2988g.f8970a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c3146g0Mo3986b.f9469b) {
                        synchronized (c3169s.f9524b) {
                            c3169s.f9533k = 3;
                            if (c3146g0Mo3986b.f9470c) {
                                c3169s.m3998c();
                                c10142i.m10747a(null);
                            } else if (e instanceof C3795C) {
                                String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C3795C) e).f11471Y;
                                AbstractC8072d6.m8488e("CameraX", str2, e);
                                c10142i.m10748b(new C3129W(new C3165q(str2)));
                            } else if (e instanceof C3129W) {
                                c10142i.m10748b(e);
                            } else {
                                c10142i.m10748b(new C3129W(e));
                            }
                        }
                    } else {
                        synchronized (c3169s.f9524b) {
                            c3169s.f9533k = 3;
                            if (c3146g0Mo3986b.f9470c) {
                                c3169s.m3998c();
                                c10142i.m10747a(null);
                            } else if (e instanceof C3795C) {
                                String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C3795C) e).f11471Y;
                                AbstractC8072d6.m8488e("CameraX", str3, e);
                                c10142i.m10748b(new C3129W(new C3165q(str3)));
                            } else if (e instanceof C3129W) {
                                c10142i.m10748b(e);
                            } else {
                                c10142i.m10748b(new C3129W(e));
                            }
                        }
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                    c2988g = new C2988g(j10, e);
                    c3146g0Mo3986b = c3169s.f9531i.mo3986b(c2988g);
                    if (AbstractC8447A3.m9051c()) {
                        AbstractC8447A3.m9052e(c2988g.f8970a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c3146g0Mo3986b.f9469b) {
                        synchronized (c3169s.f9524b) {
                            c3169s.f9533k = 3;
                            if (c3146g0Mo3986b.f9470c) {
                                c3169s.m3998c();
                                c10142i.m10747a(null);
                            } else if (e instanceof C3795C) {
                                String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C3795C) e).f11471Y;
                                AbstractC8072d6.m8488e("CameraX", str4, e);
                                c10142i.m10748b(new C3129W(new C3165q(str4)));
                            } else if (e instanceof C3129W) {
                                c10142i.m10748b(e);
                            } else {
                                c10142i.m10748b(new C3129W(e));
                            }
                        }
                    } else {
                        synchronized (c3169s.f9524b) {
                            c3169s.f9533k = 3;
                            if (c3146g0Mo3986b.f9470c) {
                                c3169s.m3998c();
                                c10142i.m10747a(null);
                            } else if (e instanceof C3795C) {
                                String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C3795C) e).f11471Y;
                                AbstractC8072d6.m8488e("CameraX", str5, e);
                                c10142i.m10748b(new C3129W(new C3165q(str5)));
                            } else if (e instanceof C3129W) {
                                c10142i.m10748b(e);
                            } else {
                                c10142i.m10748b(new C3129W(e));
                            }
                        }
                    }
                }
                break;
            default:
                int i11 = this.f9518q0 + 1;
                C10142i c10142i2 = this.f9520s0;
                C3169s c3169s2 = this.f9515Z;
                c3169s2.getClass();
                Context context2 = this.f9519r0;
                Executor executor2 = this.f9516o0;
                executor2.execute(new RunnableC3167r(c3169s2, context2, executor2, i11, c10142i2, this.f9517p0));
                return;
        }
    }

    public /* synthetic */ RunnableC3167r(C3169s c3169s, Executor executor, long j10, int i10, Context context, C10142i c10142i) {
        this.f9515Z = c3169s;
        this.f9516o0 = executor;
        this.f9517p0 = j10;
        this.f9518q0 = i10;
        this.f9519r0 = context;
        this.f9520s0 = c10142i;
    }
}

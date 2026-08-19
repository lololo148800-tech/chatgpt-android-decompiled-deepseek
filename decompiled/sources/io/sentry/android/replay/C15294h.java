package io.sentry.android.replay;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.Surface;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.protocol.C15447t;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p030B2.C0740V;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1091wn.InterfaceC21029j;
import p1112xm.AbstractC21304h;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p342Nj.C5808b;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: io.sentry.android.replay.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15294h implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f47772Y;

    /* JADX INFO: renamed from: Z */
    public final C15447t f47773Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicBoolean f47774o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f47775p0;

    /* JADX INFO: renamed from: q0 */
    public C5808b f47776q0;

    /* JADX INFO: renamed from: r0 */
    public final C17314q f47777r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f47778s0;

    /* JADX INFO: renamed from: t0 */
    public final LinkedHashMap f47779t0;

    /* JADX INFO: renamed from: u0 */
    public final C17314q f47780u0;

    public C15294h(C15524y1 options, C15447t replayId) {
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(replayId, "replayId");
        this.f47772Y = options;
        this.f47773Z = replayId;
        this.f47774o0 = new AtomicBoolean(false);
        this.f47775p0 = new Object();
        this.f47777r0 = AbstractC9227W.m9800c(new C15291g(this, 1));
        this.f47778s0 = new ArrayList();
        this.f47779t0 = new LinkedHashMap();
        this.f47780u0 = AbstractC9227W.m9800c(new C15291g(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m16516a(File file) {
        C15524y1 c15524y1 = this.f47772Y;
        try {
            if (file.delete()) {
                return;
            }
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47775p0) {
            try {
                C5808b c5808b = this.f47776q0;
                if (c5808b != null) {
                    c5808b.m6198b();
                }
                this.f47776q0 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47774o0.set(true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX INFO: renamed from: e */
    public final boolean m16517e(C15295i c15295i) {
        Canvas canvasLockHardwareCanvas;
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(c15295i.f47781a.getAbsolutePath());
            synchronized (this.f47775p0) {
                C5808b c5808b = this.f47776q0;
                if (c5808b != null) {
                    AbstractC16544l.m18093f(bitmap, "bitmap");
                    String MANUFACTURER = Build.MANUFACTURER;
                    AbstractC16544l.m18093f(MANUFACTURER, "MANUFACTURER");
                    if (AbstractC21322p.m21667A(MANUFACTURER, "xiaomi", true)) {
                        Surface surface = (Surface) c5808b.f18965u0;
                        if (surface != null) {
                            canvasLockHardwareCanvas = surface.lockCanvas(null);
                        } else {
                            canvasLockHardwareCanvas = null;
                        }
                    } else {
                        Surface surface2 = (Surface) c5808b.f18965u0;
                        if (surface2 != null) {
                            canvasLockHardwareCanvas = surface2.lockHardwareCanvas();
                        } else {
                            canvasLockHardwareCanvas = null;
                        }
                    }
                    if (canvasLockHardwareCanvas != null) {
                        canvasLockHardwareCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    Surface surface3 = (Surface) c5808b.f18965u0;
                    if (surface3 != null) {
                        surface3.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    }
                    c5808b.m6197a(false);
                }
            }
            bitmap.recycle();
            return true;
        } catch (Throwable th2) {
            this.f47772Y.getLogger().mo16297h(EnumC15375i1.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final File m16518k() {
        return (File) this.f47777r0.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m16519m(String str, String str2) {
        File file;
        if (this.f47774o0.get()) {
            return;
        }
        if (this.f47779t0.isEmpty() && (file = (File) this.f47780u0.getValue()) != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C21307a.f67720a), 8192);
            try {
                InterfaceC21029j interfaceC21029jM21484h = AbstractC21031l.m21484h(new C0740V(bufferedReader, 6));
                LinkedHashMap linkedHashMap = this.f47779t0;
                Iterator it = ((C21020a) interfaceC21029jM21484h).iterator();
                while (it.hasNext()) {
                    List listM21697e0 = AbstractC21322p.m21697e0((String) it.next(), new String[]{Separators.EQUALS}, 2, 2);
                    linkedHashMap.put((String) listM21697e0.get(0), (String) listM21697e0.get(1));
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
        if (str2 == null) {
            this.f47779t0.remove(str);
        } else {
            this.f47779t0.put(str, str2);
        }
        File file2 = (File) this.f47780u0.getValue();
        if (file2 != null) {
            Set setEntrySet = this.f47779t0.entrySet();
            AbstractC16544l.m18093f(setEntrySet, "ongoingSegment.entries");
            AbstractC21304h.m21646i(file2, AbstractC17680n.m19349Y(setEntrySet, Separators.RETURN, null, null, 0, null, C15268b.f47683o0, 30), C21307a.f67720a);
        }
    }
}

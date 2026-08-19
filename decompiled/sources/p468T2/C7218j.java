package p468T2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1061vb.C20513d;
import p283L5.AbstractC4941g;
import p310M9.C5311e;
import p493U2.C7552b;
import p658b5.C11234e;
import p658b5.C11238i;
import p692d0.C12967f;

/* JADX INFO: renamed from: T2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7218j {

    /* JADX INFO: renamed from: j */
    public static final Object f22894j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C7218j f22895k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f22896a;

    /* JADX INFO: renamed from: b */
    public final C12967f f22897b;

    /* JADX INFO: renamed from: c */
    public volatile int f22898c;

    /* JADX INFO: renamed from: d */
    public final Handler f22899d;

    /* JADX INFO: renamed from: e */
    public final C7214f f22900e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7217i f22901f;

    /* JADX INFO: renamed from: g */
    public final C20513d f22902g;

    /* JADX INFO: renamed from: h */
    public final int f22903h;

    /* JADX INFO: renamed from: i */
    public final C7212d f22904i;

    public C7218j(C7226r c7226r) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f22896a = reentrantReadWriteLock;
        this.f22898c = 3;
        InterfaceC7217i interfaceC7217i = (InterfaceC7217i) c7226r.f5518b;
        this.f22901f = interfaceC7217i;
        int i10 = c7226r.f5517a;
        this.f22903h = i10;
        this.f22904i = (C7212d) c7226r.f5519c;
        this.f22899d = new Handler(Looper.getMainLooper());
        this.f22897b = new C12967f(0);
        this.f22902g = new C20513d();
        C7214f c7214f = new C7214f(this);
        this.f22900e = c7214f;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f22898c = 0;
            } catch (Throwable th2) {
                this.f22896a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m7611b() == 0) {
            try {
                interfaceC7217i.mo7608x(new C7213e(c7214f));
            } catch (Throwable th3) {
                m7613e(th3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C7218j m7609a() {
        C7218j c7218j;
        synchronized (f22894j) {
            c7218j = f22895k;
            AbstractC4941g.m5559R("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", c7218j != null);
        }
        return c7218j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7610c() {
        return f22895k != null;
    }

    /* JADX INFO: renamed from: b */
    public final int m7611b() {
        this.f22896a.readLock().lock();
        try {
            return this.f22898c;
        } finally {
            this.f22896a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7612d() {
        AbstractC4941g.m5559R("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f22903h == 1);
        if (m7611b() == 1) {
            return;
        }
        this.f22896a.writeLock().lock();
        try {
            if (this.f22898c == 0) {
                this.f22896a.writeLock().unlock();
                return;
            }
            this.f22898c = 0;
            this.f22896a.writeLock().unlock();
            C7214f c7214f = this.f22900e;
            C7218j c7218j = (C7218j) c7214f.f22889b;
            try {
                c7218j.f22901f.mo7608x(new C7213e(c7214f));
            } catch (Throwable th2) {
                c7218j.m7613e(th2);
            }
        } catch (Throwable th3) {
            this.f22896a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7613e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f22896a.writeLock().lock();
        try {
            this.f22898c = 2;
            arrayList.addAll(this.f22897b);
            this.f22897b.clear();
            this.f22896a.writeLock().unlock();
            this.f22899d.post(new RunnableC7216h(arrayList, this.f22898c, th2));
        } catch (Throwable th3) {
            this.f22896a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m7614f(int i10, int i11, int i12, CharSequence charSequence) {
        C7231w[] c7231wArr;
        AbstractC4941g.m5559R("Not initialized yet", m7611b() == 1);
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC4941g.m5554M("start should be <= than end", i10 <= i11);
        C7208A c7208a = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC4941g.m5554M("start should be < than charSequence length", i10 <= charSequence.length());
        AbstractC4941g.m5554M("end should be < than charSequence length", i11 <= charSequence.length());
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z6 = i12 == 1;
        C5311e c5311e = (C5311e) this.f22900e.f22888a;
        c5311e.getClass();
        boolean z10 = charSequence instanceof C7229u;
        if (z10) {
            ((C7229u) charSequence).m7626a();
        }
        if (z10) {
            c7208a = new C7208A((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c7208a = new C7208A((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, C7231w.class) <= i11) {
                    c7208a = new C7208A();
                    c7208a.f22881Y = false;
                    c7208a.f22882Z = new SpannableString(charSequence);
                }
            } finally {
                if (z10) {
                    ((C7229u) charSequence).m7627b();
                }
            }
        }
        if (c7208a != null && (c7231wArr = (C7231w[]) c7208a.f22882Z.getSpans(i10, i11, C7231w.class)) != null && c7231wArr.length > 0) {
            for (C7231w c7231w : c7231wArr) {
                int spanStart = c7208a.f22882Z.getSpanStart(c7231w);
                int spanEnd = c7208a.f22882Z.getSpanEnd(c7231w);
                if (spanStart != i11) {
                    c7208a.removeSpan(c7231w);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i13 = i10;
        int i14 = i11;
        if (i13 != i14 && i13 < charSequence.length()) {
            C7208A c7208a2 = (C7208A) c5311e.m5869y(charSequence, i13, i14, Integer.MAX_VALUE, z6, new C11234e(c7208a, 14, (C20513d) c5311e.f17484Z));
            if (c7208a2 != null) {
                return c7208a2.f22882Z;
            }
            if (!z10) {
                return charSequence;
            }
        } else if (!z10) {
            return charSequence;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: g */
    public final void m7615g(AbstractC7215g abstractC7215g) {
        AbstractC4941g.m5558Q(abstractC7215g, "initCallback cannot be null");
        this.f22896a.writeLock().lock();
        try {
            if (this.f22898c == 1 || this.f22898c == 2) {
                this.f22899d.post(new RunnableC7216h(Arrays.asList(abstractC7215g), this.f22898c, (Throwable) null));
            } else {
                this.f22897b.add(abstractC7215g);
            }
        } finally {
            this.f22896a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7616h(EditorInfo editorInfo) {
        if (m7611b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C7214f c7214f = this.f22900e;
        c7214f.getClass();
        Bundle bundle = editorInfo.extras;
        C7552b c7552b = (C7552b) ((C11238i) c7214f.f22890c).f34008Y;
        int iM1537a = c7552b.m1537a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM1537a != 0 ? ((ByteBuffer) c7552b.f2088p0).getInt(iM1537a + c7552b.f2085Y) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((C7218j) c7214f.f22889b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

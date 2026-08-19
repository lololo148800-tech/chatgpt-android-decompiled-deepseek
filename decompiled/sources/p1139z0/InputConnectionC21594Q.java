package p1139z0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.InterfaceC0161D1;
import p080D0.C1837w0;
import p1039ud.C20198o;
import p1071w0.C20750g0;
import p204I1.C3581L;
import p350O1.C6043A;
import p350O1.C6045C;
import p350O1.C6052a;
import p350O1.C6058g;
import p350O1.C6059h;
import p350O1.C6062k;
import p350O1.C6064m;
import p350O1.C6076y;
import p350O1.C6077z;
import p350O1.InterfaceC6060i;
import p544W9.AbstractC8448A4;
import p604Yk.C10077b;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: z0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC21594Q implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C10077b f68390a;

    /* JADX INFO: renamed from: b */
    public final boolean f68391b;

    /* JADX INFO: renamed from: c */
    public final C20750g0 f68392c;

    /* JADX INFO: renamed from: d */
    public final C1837w0 f68393d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0161D1 f68394e;

    /* JADX INFO: renamed from: f */
    public int f68395f;

    /* JADX INFO: renamed from: g */
    public C6045C f68396g;

    /* JADX INFO: renamed from: h */
    public int f68397h;

    /* JADX INFO: renamed from: i */
    public boolean f68398i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f68399j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f68400k = true;

    public InputConnectionC21594Q(C6045C c6045c, C10077b c10077b, boolean z6, C20750g0 c20750g0, C1837w0 c1837w0, InterfaceC0161D1 interfaceC0161D1) {
        this.f68390a = c10077b;
        this.f68391b = z6;
        this.f68392c = c20750g0;
        this.f68393d = c1837w0;
        this.f68394e = interfaceC0161D1;
        this.f68396g = c6045c;
    }

    /* JADX INFO: renamed from: a */
    public final void m21940a(InterfaceC6060i interfaceC6060i) {
        this.f68395f++;
        try {
            this.f68399j.add(interfaceC6060i);
        } finally {
            m21941b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final boolean m21941b() {
        int i10 = this.f68395f - 1;
        this.f68395f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f68399j;
            if (!arrayList.isEmpty()) {
                ((C21591N) this.f68390a.f29833Z).f68374c.invoke(AbstractC17680n.m19323D0(arrayList));
                arrayList.clear();
            }
        }
        return this.f68395f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        this.f68395f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m21942c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z6 = this.f68400k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f68399j.clear();
        this.f68395f = 0;
        this.f68400k = false;
        C21591N c21591n = (C21591N) this.f68390a.f29833Z;
        int size = c21591n.f68381j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = c21591n.f68381j;
            if (AbstractC16544l.m18089b(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.f68400k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z6 = this.f68400k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f68400k;
        return z6 ? this.f68391b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z6 = this.f68400k;
        if (z6) {
            m21940a(new C6052a(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        m21940a(new C6058g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        m21940a(new C6059h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m21941b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        m21940a(new C6062k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        C6045C c6045c = this.f68396g;
        return TextUtils.getCapsMode(c6045c.f19682a.f10934Y, C3581L.m4270f(c6045c.f19683b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z6 = (i10 & 1) != 0;
        this.f68398i = z6;
        if (z6) {
            this.f68397h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC21627m.m21960h(this.f68396g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (C3581L.m4267c(this.f68396g.f19683b)) {
            return null;
        }
        return AbstractC8448A4.m9057b(this.f68396g).f10934Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC8448A4.m9058c(this.f68396g, i10).f10934Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC8448A4.m9059d(this.f68396g, i10).f10934Y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z6 = this.f68400k;
        if (z6) {
            z6 = false;
            switch (i10) {
                case R.id.selectAll:
                    m21940a(new C6043A(0, this.f68396g.f19682a.f10934Y.length()));
                    break;
                case R.id.cut:
                    m21942c(277);
                    break;
                case R.id.copy:
                    m21942c(278);
                    break;
                case R.id.paste:
                    m21942c(279);
                    break;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z6 = this.f68400k;
        if (z6) {
            z6 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        AbstractC15256t.m16482t("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((C21591N) this.f68390a.f29833Z).f68375d.invoke(new C6064m(i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C21633p c21633p = C21633p.f68533a;
            C20198o c20198o = new C20198o(this, 14);
            c21633p.m21980a(this.f68392c, this.f68393d, handwritingGesture, this.f68394e, executor, intConsumer, c20198o);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f68400k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C21633p.f68533a.m21981b(this.f68392c, this.f68393d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12 = this.f68400k;
        if (!z12) {
            return z12;
        }
        boolean z13 = false;
        boolean z14 = (i10 & 1) != 0;
        boolean z15 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z6 = (i10 & 16) != 0;
            z10 = (i10 & 8) != 0;
            boolean z16 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z13 = true;
            }
            if (z6 || z10 || z16 || z13) {
                z11 = z13;
                z13 = z16;
            } else if (i11 >= 34) {
                z11 = true;
                z13 = true;
                z6 = true;
                z10 = true;
            } else {
                z6 = true;
                z10 = true;
                z11 = z13;
                z13 = true;
            }
        } else {
            z6 = true;
            z10 = true;
            z11 = false;
        }
        C21588K c21588k = ((C21591N) this.f68390a.f29833Z).f68384m;
        synchronized (c21588k.f68355c) {
            try {
                c21588k.f68358f = z6;
                c21588k.f68359g = z10;
                c21588k.f68360h = z13;
                c21588k.f68361i = z11;
                if (z14) {
                    c21588k.f68357e = true;
                    if (c21588k.f68362j != null) {
                        c21588k.m21936a();
                    }
                }
                c21588k.f68356d = z15;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mm.i] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((C21591N) this.f68390a.f29833Z).f68382k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z6 = this.f68400k;
        if (z6) {
            m21940a(new C6076y(i10, i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z6 = this.f68400k;
        if (z6) {
            m21940a(new C6077z(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z6 = this.f68400k;
        if (!z6) {
            return z6;
        }
        m21940a(new C6043A(i10, i11));
        return true;
    }
}

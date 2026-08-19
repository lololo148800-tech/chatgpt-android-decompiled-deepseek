package p1139z0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.EnumC0573G;
import p049Bm.InterfaceC1436k;
import p082D2.AbstractC1857d;
import p1068vo.C20659i;
import p1113xn.AbstractC21322p;
import p1116y0.C21353b;
import p1116y0.C21358g;
import p204I1.C3581L;
import p350O1.C6064m;
import p392Q0.C6546d;
import p588Y2.C9642z;
import p817j$.util.Objects;
import p870le.C16863U;
import p999s.C19341c1;

/* JADX INFO: renamed from: z0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC21601Y implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C19341c1 f68413a;

    /* JADX INFO: renamed from: b */
    public int f68414b;

    /* JADX INFO: renamed from: c */
    public final C6546d f68415c = new C6546d(new InterfaceC1436k[16]);

    /* JADX INFO: renamed from: d */
    public final InputConnection f68416d;

    public InputConnectionC21601Y(C19341c1 c19341c1, EditorInfo editorInfo) {
        this.f68413a = c19341c1;
        this.f68416d = AbstractC1857d.m2737a(new C21600X(this, false), editorInfo, new C9642z(this, 27));
    }

    /* JADX INFO: renamed from: a */
    public final void m21944a(InterfaceC1436k interfaceC1436k) {
        this.f68414b++;
        try {
            this.f68415c.m7099c(interfaceC1436k);
        } finally {
            m21945b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21945b() {
        int i10 = this.f68414b - 1;
        this.f68414b = i10;
        if (i10 == 0) {
            C6546d c6546d = this.f68415c;
            if (c6546d.m7109n()) {
                C21599W c21599w = new C21599W(this, 0);
                C21358g c21358g = ((C21582E0) this.f68413a.f61254Y).f68337a;
                c21358g.f67827b.f68325b.m20988c();
                c21599w.invoke(c21358g.f67827b);
                C21358g.m21749a(c21358g, false, 1);
                c6546d.m7104i();
            }
        }
        return this.f68414b > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f68414b++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C21353b m21946c() {
        return ((C21582E0) this.f68413a.f61254Y).m21881c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f68415c.m7104i();
        this.f68414b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return C21629n.f68523a.m21979a(this.f68416d, inputContentInfo, i10, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        Objects.toString(charSequence);
        m21944a(new C21597U(i10, 0, charSequence));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m21947d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        m21944a(new C21598V(i10, i11, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        m21944a(new C21598V(i10, i11, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m21945b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        m21944a(C21603a.f68422r0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(m21946c(), C3581L.m4270f(m21946c().f67818Z), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        Objects.toString(extractedTextRequest);
        C21353b c21353bM21946c = m21946c();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c21353bM21946c;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c21353bM21946c.f67817Y.length();
        extractedText.partialStartOffset = -1;
        long j10 = c21353bM21946c.f67818Z;
        extractedText.selectionStart = C3581L.m4270f(j10);
        extractedText.selectionEnd = C3581L.m4269e(j10);
        extractedText.flags = !AbstractC21322p.m21668B(c21353bM21946c, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (C3581L.m4267c(m21946c().f67818Z)) {
            return null;
        }
        C21353b c21353bM21946c = m21946c();
        return c21353bM21946c.f67817Y.subSequence(C3581L.m4270f(c21353bM21946c.f67818Z), C3581L.m4269e(c21353bM21946c.f67818Z)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        C21353b c21353bM21946c = m21946c();
        int iM4269e = C3581L.m4269e(c21353bM21946c.f67818Z);
        int iM4269e2 = C3581L.m4269e(c21353bM21946c.f67818Z) + i10;
        CharSequence charSequence = c21353bM21946c.f67817Y;
        return charSequence.subSequence(iM4269e, Math.min(iM4269e2, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        C21353b c21353bM21946c = m21946c();
        return c21353bM21946c.f67817Y.subSequence(Math.max(0, C3581L.m4270f(c21353bM21946c.f67818Z) - i10), C3581L.m4270f(c21353bM21946c.f67818Z)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        switch (i10) {
            case R.id.selectAll:
                m21944a(new C21599W(this, 1));
                break;
            case R.id.cut:
                m21947d(277);
                break;
            case R.id.copy:
                m21947d(278);
                break;
            case R.id.paste:
                m21947d(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
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
                    i11 = 1;
                    break;
            }
        } else {
            i11 = 1;
        }
        C16863U c16863u = (C16863U) this.f68413a.f61256o0;
        if (c16863u != null) {
            c16863u.invoke(new C6064m(i11));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        C21635q.f68538a.m21982a(this.f68413a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.f68416d.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return C21635q.f68538a.m21983b(this.f68413a, previewableHandwritingGesture, cancellationSignal);
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
        CursorAnchorInfo cursorAnchorInfoM21997a;
        C21651y c21651y = (C21651y) this.f68413a.f61258q0;
        boolean z12 = false;
        boolean z13 = (i10 & 1) != 0;
        boolean z14 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z6 = (i10 & 16) != 0;
            z10 = (i10 & 8) != 0;
            boolean z15 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z12 = true;
            }
            if (z6 || z10 || z15 || z12) {
                z11 = z12;
                z12 = z15;
            } else if (i11 >= 34) {
                z11 = true;
                z12 = true;
                z6 = true;
                z10 = true;
            } else {
                z6 = true;
                z10 = true;
                z11 = z12;
                z12 = true;
            }
        } else {
            z6 = true;
            z10 = true;
            z11 = false;
        }
        c21651y.f68612f = z6;
        c21651y.f68613g = z10;
        c21651y.f68614h = z12;
        c21651y.f68615i = z11;
        if (z13 && (cursorAnchorInfoM21997a = c21651y.m21997a()) != null) {
            C20659i c20659i = c21651y.f68609c;
            c20659i.m21208b().updateCursorAnchorInfo((View) c20659i.f65541a, cursorAnchorInfoM21997a);
        }
        if (z14) {
            C0564B0 c0564b0 = c21651y.f68611e;
            if (c0564b0 == null || !c0564b0.mo1274a()) {
                c21651y.f68611e = AbstractC0575H.m1156D(c21651y.f68610d, null, EnumC0573G.f1793p0, new C21649x(c21651y, null), 1);
            }
        } else {
            C0564B0 c0564b1 = c21651y.f68611e;
            if (c0564b1 != null) {
                c0564b1.mo1275e(null);
            }
            c21651y.f68611e = null;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        ((C20659i) this.f68413a.f61255Z).mo21209c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        m21944a(new C21598V(i10, i11, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        Objects.toString(charSequence);
        m21944a(new C21597U(i10, 1, charSequence));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        m21944a(new C21598V(i10, i11, 3));
        return true;
    }
}

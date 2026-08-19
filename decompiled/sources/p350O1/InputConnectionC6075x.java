package p350O1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19506i;
import p204I1.C3581L;
import p544W9.AbstractC8448A4;
import p544W9.AbstractC8753z4;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: O1.x */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC6075x implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C19506i f19767a;

    /* JADX INFO: renamed from: b */
    public final boolean f19768b;

    /* JADX INFO: renamed from: c */
    public int f19769c;

    /* JADX INFO: renamed from: d */
    public C6045C f19770d;

    /* JADX INFO: renamed from: e */
    public int f19771e;

    /* JADX INFO: renamed from: f */
    public boolean f19772f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f19773g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f19774h = true;

    public InputConnectionC6075x(C6045C c6045c, C19506i c19506i, boolean z6) {
        this.f19767a = c19506i;
        this.f19768b = z6;
        this.f19770d = c6045c;
    }

    /* JADX INFO: renamed from: a */
    public final void m6646a(InterfaceC6060i interfaceC6060i) {
        this.f19769c++;
        try {
            this.f19773g.add(interfaceC6060i);
        } finally {
            m6647b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final boolean m6647b() {
        int i10 = this.f19769c - 1;
        this.f19769c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f19773g;
            if (!arrayList.isEmpty()) {
                ((C6048F) this.f19767a.f61960Z).f19696e.invoke(AbstractC17680n.m19323D0(arrayList));
                arrayList.clear();
            }
        }
        return this.f19769c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        this.f19769c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6648c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z6 = this.f19774h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f19773g.clear();
        this.f19769c = 0;
        this.f19774h = false;
        C6048F c6048f = (C6048F) this.f19767a.f61960Z;
        int size = c6048f.f19700i.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = c6048f.f19700i;
            if (AbstractC16544l.m18089b(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.f19774h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z6 = this.f19774h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f19774h;
        return z6 ? this.f19768b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z6 = this.f19774h;
        if (z6) {
            m6646a(new C6052a(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        m6646a(new C6058g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        m6646a(new C6059h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m6647b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        m6646a(new C6062k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        C6045C c6045c = this.f19770d;
        return TextUtils.getCapsMode(c6045c.f19682a.f10934Y, C3581L.m4270f(c6045c.f19683b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z6 = (i10 & 1) != 0;
        this.f19772f = z6;
        if (z6) {
            this.f19771e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC8753z4.m9518f(this.f19770d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (C3581L.m4267c(this.f19770d.f19683b)) {
            return null;
        }
        return AbstractC8448A4.m9057b(this.f19770d).f10934Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return AbstractC8448A4.m9058c(this.f19770d, i10).f10934Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return AbstractC8448A4.m9059d(this.f19770d, i10).f10934Y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z6 = this.f19774h;
        if (z6) {
            z6 = false;
            switch (i10) {
                case R.id.selectAll:
                    m6646a(new C6043A(0, this.f19770d.f19682a.f10934Y.length()));
                    break;
                case R.id.cut:
                    m6648c(277);
                    break;
                case R.id.copy:
                    m6648c(278);
                    break;
                case R.id.paste:
                    m6648c(279);
                    break;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z6 = this.f19774h;
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
            ((C6048F) this.f19767a.f61960Z).f19697f.invoke(new C6064m(i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f19774h;
        if (z6) {
            return true;
        }
        return z6;
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
        boolean z12 = this.f19774h;
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
        C6056e c6056e = ((C6048F) this.f19767a.f61960Z).f19703l;
        synchronized (c6056e.f19723c) {
            try {
                c6056e.f19726f = z6;
                c6056e.f19727g = z10;
                c6056e.f19728h = z13;
                c6056e.f19729i = z11;
                if (z14) {
                    c6056e.f19725e = true;
                    if (c6056e.f19730j != null) {
                        c6056e.m6626a();
                    }
                }
                c6056e.f19724d = z15;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mm.i] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((C6048F) this.f19767a.f61960Z).f19701j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z6 = this.f19774h;
        if (z6) {
            m6646a(new C6076y(i10, i11));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z6 = this.f19774h;
        if (z6) {
            m6646a(new C6077z(String.valueOf(charSequence), i10));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z6 = this.f19774h;
        if (!z6) {
            return z6;
        }
        m6646a(new C6043A(i10, i11));
        return true;
    }
}

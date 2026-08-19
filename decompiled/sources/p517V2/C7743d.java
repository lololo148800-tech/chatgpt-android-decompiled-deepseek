package p517V2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p1061vb.C20513d;
import p310M9.C5311e;

/* JADX INFO: renamed from: V2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7743d implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f24415a;

    /* JADX INFO: renamed from: b */
    public final C20513d f24416b;

    public C7743d(KeyListener keyListener) {
        C20513d c20513d = new C20513d();
        this.f24415a = keyListener;
        this.f24416b = c20513d;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f24415a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f24415a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zM5845q;
        boolean z6;
        this.f24416b.getClass();
        if (i10 != 67) {
            zM5845q = i10 != 112 ? false : C5311e.m5845q(editable, keyEvent, true);
        } else {
            zM5845q = C5311e.m5845q(editable, keyEvent, false);
        }
        if (zM5845q) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f24415a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f24415a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f24415a.onKeyUp(view, editable, i10, keyEvent);
    }
}

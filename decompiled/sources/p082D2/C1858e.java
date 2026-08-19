package p082D2;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p720e6.C13287b;

/* JADX INFO: renamed from: D2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1858e extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1860g f5344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858e(InputConnection inputConnection, InterfaceC1860g interfaceC1860g) {
        super(inputConnection, false);
        this.f5344a = interfaceC1860g;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        C13287b c13287b = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c13287b = new C13287b(new C1861h(inputContentInfo), 5);
        }
        if (this.f5344a.mo257e(c13287b, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}

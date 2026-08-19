package p517V2;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import p468T2.AbstractC7215g;

/* JADX INFO: renamed from: V2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7746g extends AbstractC7215g {

    /* JADX INFO: renamed from: a */
    public final WeakReference f24421a;

    public C7746g(EditText editText) {
        this.f24421a = new WeakReference(editText);
    }

    @Override // p468T2.AbstractC7215g
    /* JADX INFO: renamed from: b */
    public final void mo7123b() {
        C7747h.m8008a((EditText) this.f24421a.get(), 1);
    }
}

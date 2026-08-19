package p330N4;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: renamed from: N4.O */
/* JADX INFO: loaded from: classes.dex */
public final class C5649O {

    /* JADX INFO: renamed from: a */
    public final WindowId f18357a;

    public C5649O(ViewGroup viewGroup) {
        this.f18357a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5649O) && ((C5649O) obj).f18357a.equals(this.f18357a);
    }

    public final int hashCode() {
        return this.f18357a.hashCode();
    }
}

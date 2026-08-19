package p978r1;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18856b {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f60081a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18856b) {
            return AbstractC16544l.m18089b(this.f60081a, ((C18856b) obj).f60081a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60081a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f60081a + ')';
    }
}

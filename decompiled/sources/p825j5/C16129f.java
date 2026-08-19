package p825j5;

import android.util.LruCache;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: j5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16129f extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z6, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        InterfaceC16130g oldValue = (InterfaceC16130g) obj2;
        AbstractC16544l.m18094g(oldValue, "oldValue");
        if (z6) {
            oldValue.close();
        }
    }
}

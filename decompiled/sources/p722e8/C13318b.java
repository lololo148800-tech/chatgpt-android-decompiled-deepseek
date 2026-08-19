package p722e8;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: e8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13318b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C13318b f42211Y = new C13318b(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        WeakReference it = (WeakReference) obj;
        AbstractC16544l.m18094g(it, "it");
        return Boolean.valueOf(it.get() == null);
    }
}

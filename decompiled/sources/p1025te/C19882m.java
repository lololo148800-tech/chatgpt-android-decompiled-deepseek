package p1025te;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: te.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19882m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C19882m f63028Y = new C19882m(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Map.Entry it = (Map.Entry) obj;
        AbstractC16544l.m18094g(it, "it");
        return it.getKey();
    }
}

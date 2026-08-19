package p728ei;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ei.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13405a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C13405a f42466Y = new C13405a(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        List it = (List) obj;
        AbstractC16544l.m18094g(it, "it");
        return Boolean.valueOf(!it.isEmpty());
    }
}

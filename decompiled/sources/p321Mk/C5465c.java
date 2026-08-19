package p321Mk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1440o;

/* JADX INFO: renamed from: Mk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5465c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C5465c f17848Y = new C5465c(3);

    /* JADX WARN: Type inference failed for: r4v2, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C5464b item = (C5464b) obj3;
        AbstractC16544l.m18094g(item, "item");
        return new C17309l(Integer.valueOf(iIntValue), item.f17844a.invoke(Integer.valueOf(iIntValue2)));
    }
}

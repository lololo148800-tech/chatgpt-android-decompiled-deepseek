package p020Ai;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21891A;
import p1155zi.C22050r;

/* JADX INFO: renamed from: Ai.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0514c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C0514c f1652Y = new C0514c(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C21891A it = (C21891A) obj;
        AbstractC16544l.m18094g(it, "it");
        String strM22322a = it.m22322a();
        return strM22322a == null ? "null" : C22050r.m22347a(strM22322a);
    }
}

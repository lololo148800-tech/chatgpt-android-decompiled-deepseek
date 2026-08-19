package p487Tm;

import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Tm.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7513c extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C7513c f23834Y = new C7513c(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Member p10 = (Member) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return Boolean.valueOf(p10.isSynthetic());
    }
}

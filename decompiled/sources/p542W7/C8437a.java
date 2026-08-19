package p542W7;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p1021t8.C19812c;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: W7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8437a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C8437a f26261Y = new C8437a(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC13823a sdkCore = (InterfaceC13823a) obj;
        Set tracingHeaderTypes = (Set) obj2;
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        AbstractC16544l.m18094g(tracingHeaderTypes, "tracingHeaderTypes");
        C19812c c19812c = new C19812c(sdkCore);
        c19812c.f62853c = tracingHeaderTypes;
        return c19812c.m20768a();
    }
}

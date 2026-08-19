package p877ln;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ln.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C17076h implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C17076h f54567Y = new C17076h();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ProtoBuf.Type it = (ProtoBuf.Type) obj;
        AbstractC16544l.m18094g(it, "it");
        return Integer.valueOf(it.getArgumentCount());
    }
}

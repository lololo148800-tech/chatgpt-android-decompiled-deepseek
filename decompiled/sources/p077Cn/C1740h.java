package p077Cn;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.AbstractC16541i;
import p049Bm.InterfaceC1440o;

/* JADX INFO: renamed from: Cn.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1740h extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C1740h f4977Y = new C1740h(3, C1743k.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1743k c1743k = (C1743k) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C1743k.f4984p0;
        c1743k.getClass();
        if (obj3 == AbstractC1745m.f5008l) {
            obj3 = new C1748p(c1743k.m2555x());
        }
        return new C1750r(obj3);
    }
}

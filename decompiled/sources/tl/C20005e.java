package tl;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p1061vb.C20513d;
import p909nm.C17690x;

/* JADX INFO: renamed from: tl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20005e {
    private volatile /* synthetic */ Object current = C17690x.f56481Y;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C20005e.class, Object.class, "current");
    }

    /* JADX INFO: renamed from: a */
    public final Object m20806a(C20513d key) {
        AbstractC16544l.m18094g(key, "key");
        return ((Map) this.current).get(key);
    }
}

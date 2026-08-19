package p266Kc;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p728ei.C13406b;

/* JADX INFO: renamed from: Kc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4636e {

    /* JADX INFO: renamed from: a */
    public final C17629c f15090a;

    /* JADX INFO: renamed from: b */
    public final Set f15091b;

    /* JADX INFO: renamed from: c */
    public final Set f15092c;

    /* JADX INFO: renamed from: d */
    public final C13406b f15093d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f15094e;

    public C4636e(C17629c scope, Set initializers, Set priorityInitializers, C13406b foregroundDetector) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(initializers, "initializers");
        AbstractC16544l.m18094g(priorityInitializers, "priorityInitializers");
        AbstractC16544l.m18094g(foregroundDetector, "foregroundDetector");
        this.f15090a = scope;
        this.f15091b = initializers;
        this.f15092c = priorityInitializers;
        this.f15093d = foregroundDetector;
        this.f15094e = new AtomicBoolean(false);
    }
}
